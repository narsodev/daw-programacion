/* Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado. */
public class Ejercicio09 {
  public static void main(String[] args) {
    int contador = 0;
    int numGenerado;

    do {
      numGenerado = (int) (Math.random() * 100) + 1;
      if (numGenerado % 2 == 0) {
        System.out.print(numGenerado + " ");
        contador++; 
      }
    } while (numGenerado != 24);

    System.out.printf("\nSe han generado %d números para llegar al 24.\n", contador);
  }
}
