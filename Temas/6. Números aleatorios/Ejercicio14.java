/* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir. */
public class Ejercicio14 {
  public static void main(String[] args) {
    int maximo = 101;
    int minimo = 0;
    int numGenerado;
    int oportunidades = 5;
    boolean victoria;

    System.out.println("Piense un número entre 0 y 100 y trataré de adivinarlo.");
    System.out.println();
    
    do {
      numGenerado = (int) (Math.random() * (maximo - minimo)) + minimo;
      System.out.printf("Déjame pensar... ¿Es el número %d? (s/n) ", numGenerado);
      
      oportunidades--;
      victoria = System.console().readLine().equals("s");

      if (!victoria && oportunidades > 0) {
        System.out.printf("¿Tu número es mayor o menor? "); 
        if (System.console().readLine().equals("mayor")) minimo = numGenerado;
        else maximo = numGenerado;
        System.out.printf("Me quedan %d oportunidades.\n", oportunidades);
      }
    } while (oportunidades > 0 && !victoria);

    System.out.printf("He %s.\n", victoria ? "ganado" : "perdido", numGenerado);
  }
}
