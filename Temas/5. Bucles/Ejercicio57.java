/* Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
  Ejemplo 1:
    Introduzca la altura de la figura: 8
    ********
     *     *
      *    *
       *   *
        *  *
         * *
          **
           *
*/
public class Ejercicio57 {
  public static void main(String[] args) {
    int altura;

    System.out.print("Introduzca la altura: ");
    altura = Integer.parseInt(System.console().readLine());

    /* for (int i = 0; i < altura; i++) System.out.print("*");
    System.out.println();

    for (int i = 1; i < altura; i++) {
      for (int j = 0; j < i; j++) System.out.print(" ");
      System.out.print("*");

      for (int j = 0; j < altura - i - 2; j++) System.out.print(" ");

      if (i != altura - 1) System.out.print("*");

      System.out.println();
    } */

    for (int i = altura; i > 0; i--) {
      for (int j = 0; j < altura; j++) {
        System.out.print(i == altura || j == altura - 1 || j == altura - i ? "*" : " ");
      }
      System.out.println();
    }
  }
}
