/* Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto. */
public class Ejercicio06 {
  public static void main(String[] args) {
    int numGenerado, numIntroducido;
    int oportunidades = 5;
    boolean victoria;

    numGenerado = (int) (Math.random() * 101);

    do {
      System.out.print("¿Qué número cree que es? ");
      numIntroducido = Integer.parseInt(System.console().readLine());
      
      oportunidades--;

      victoria = numGenerado == numIntroducido;
      if (!victoria && oportunidades > 0) {
        System.out.printf(
          "Has fallado! Te quedan %d oportunidades.\nTu número es %s que el número generado.\n",
          oportunidades, numGenerado > numIntroducido ? "menor" : "mayor"
        ); 
      }
    } while (oportunidades > 0 && !victoria);

    System.out.printf("Has %s, el número generado era el %d.\n", victoria ? "ganado" : "perdido", numGenerado);
  }  
}
