/* Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado. */
public class Ejercicio12 {
  public static void main(String[] args) {
    int numFinal;

    System.out.print("Introduzca el número: ");
    numFinal = Integer.parseInt(System.console().readLine());

    if (numFinal > 0) System.out.println(0);

    if (numFinal > 1) {
      int num1 = 0;
      int num2 = 1;

      for (int i = 1; i < numFinal; i++) {
        int suma = num1 + num2;
        System.out.println(suma);
        num2 = num1;
        num1 = suma;
      }
    }
  }
}
