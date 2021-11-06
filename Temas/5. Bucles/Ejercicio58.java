/* Realiza un programa que calcule la media de los dígitos que contiene un número
entero introducido por teclado.
  Ejemplo 1:
  Introduzca un número: 609831
  La media de sus dígitos es 4.5
*/
public class Ejercicio58 {
  public static void main(String[] args) {
    int numero;
    double media = 0;
    int nCifras = 0;

    System.out.print("Introduzca un número: ");
    numero = Integer.parseInt(System.console().readLine());

    do {
      media += numero % 10;
      numero /= 10;
      nCifras++;
    } while (numero > 0);

    media /= nCifras;

    System.out.println("La media de sus dígitos es " + media);
  }
}
