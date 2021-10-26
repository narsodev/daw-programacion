/* Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
Ejemplo:
  Por favor, introduzca la altura del reloj de arena: 5
  *****
   ***
    *
   ***
  *****
*/
public class Ejercicio38 {
  public static void main(String[] args) {
    int altura;

    System.out.print("Introduzca la altura del reloj de arena (impar y mayor o igual que 3): ");
    altura = Integer.parseInt(System.console().readLine());

    if (altura % 2 != 0 && altura >= 3) {
      for (int i = 0; i <= altura / 2; i++) {
        for (int j = 0; j < i; j++) System.out.print(" ");
        for (int j = 2 * i; j < altura; j++) System.out.print("*");
        System.out.println();
      }
      for (int i = altura / 2 - 1; i >= 0; i--) {
        for (int j = 0; j < i; j++) System.out.print(" ");
        for (int j = 2 * i; j < altura; j++) System.out.print("*");
        System.out.println();
      }
    } else System.out.println("La altura introducida es inválida.");
  }
}
