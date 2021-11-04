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
public class Ejercicio54 {
  public static void main(String[] args) {
    int altura;

    System.out.print("Introduzca la altura de la figura: ");
    altura = Integer.parseInt(System.console().readLine());

    for (int i = 0; i < altura; i++) {
      for (int j = altura; j > i; j--) System.out.print(i == 0 || j == altura || j == i + 1 ? "*" : " ");
      System.out.println();
    }
  }
}
