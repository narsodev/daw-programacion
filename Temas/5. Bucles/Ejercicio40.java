/* Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error.
Ejemplo:
Por favor, introduzca la altura del rombo: 5
  *
 * *
*   *
 * *
  *
*/
public class Ejercicio40 {
  public static void main(String[] args) {
    int altura;

    System.out.print("Por favor, introduzca la altura del rombo: ");
    altura = Integer.parseInt(System.console().readLine());

    for (int i = 0; i <= altura / 2; i++) {
      for (int j = 0; j < altura / 2 - i; j++) {
        System.out.print(" ");
      }
      System.out.print("*");

      if (i != 0) {
        for (int j = 1; j < 2 * i; j++) System.out.print(" ");
        System.out.print("*");
      }

      System.out.println();
    }

    for (int i = 1; i <= altura / 2; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.print("*");

      if (i != altura / 2) {
        for (int j = 2; j < altura - i * 2; j++) System.out.print(" ");
        System.out.print("*");
      }
      
      System.out.println();
    }
  }
}
