/* Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.

Ejemplo 1:
  Introduzca la altura de la U: 5
  *     *
  *     *
  *     *
  *     *
   * * *
*/
import java.util.Scanner;

public class Ejercicio33 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura;

    System.out.print("Introduzca la altura de la U: ");
    altura = s.nextInt();
    s.close();

    for (int i = 1; i <= altura; i++) {
      if (i != altura) System.out.print("*");

      if (i != altura) {
        for (int j = 1; j < (altura - 2) * 2; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
      } else {
        for (int j = 1; j <= altura - 2; j++) {
          System.out.print(" *");
        }
      }
      System.out.println();
    }
  }
}
