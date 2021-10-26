/* Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error.
Ejemplo:
Por favor, introduzca la altura de la X: 5
*   *
 * *
  *
 * *
*   *
*/
public class Ejercicio35 {
  public static void main(String[] args) {
    int altura;
    int nEspacios;
    
    System.out.print("Introduzca la altura (debe ser impar y mayor o igual a 3): ");
    altura = Integer.parseInt(System.console().readLine());

    if (altura >= 3 && altura % 2 != 0) {
      nEspacios = altura - 2;
  
      for (int i = 0; i <= altura / 2; i++) {
        for (int j = 0; j < i; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
        if (i < altura / 2) {
          for (int j = 0; j < nEspacios; j++) {
            System.out.print(" ");
          }
          System.out.print("*");
          nEspacios -= 2;
        }
        System.out.println();
      }
  
      for (int i = altura / 2; i > 0; i--) {
        for (int j = 1; j < i; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
  
        for (int j = i; j < altura - i; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      }
    } else {
      System.out.println("Error. La altura introducida es inválida.");
    }
  
  }
}
