/* Una empresa de cartelería nos ha encargado un programa para realizar uno de
sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
durante el 2018, han recibido muchos pedidos del cartel que muestra el número
155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
usuario se le pedirán dos datos, la altura del cartel y el número de espacios
que habrá entre los números. La altura mínima es 5. La anchura de los números
siempre es la misma. La parte superior de los cincos también es siempre igual.
La parte inferior del 5 sí que varía en función de la altura.
  Ejemplo 1:
    Introduzca la altura (5 como mínimo): 5 Introduzca el número de
    espacios entre los números (1 como mínimo): 2
    * **** ****
    * *    *
    * **** ****
    *    *    *
    * **** ****
  Ejemplo 2:
    Bucles 75
    Introduzca la altura (5 como mínimo): 7 Introduzca el número de
    espacios entre los números (1 como mínimo): 3
    * **** ****
    * *    *
    * **** ****
    *    *    *
    *    *    *
    *    *    *
    * **** ****
  Ejemplo 3:
    Introduzca la altura (5 como mínimo): 6 Introduzca el número de
    espacios entre los números (1 como mínimo): 1
    * **** ****
    * *    *
    * **** ****
    *    *    *
    *    *    *
    * **** ****
*/
import java.util.Scanner;

public class Ejercicio50 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura, numeroEspacios;

    System.out.print("Introduzca la altura (5 como mínimo): ");
    altura = s.nextInt();

    System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
    numeroEspacios = s.nextInt();

    s.close();

    for (int i = 0; i < 3; i++) {
      System.out.print("*");
      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < numeroEspacios; k++) System.out.print(" ");
        for (int k = 0; k < 4; k++) System.out.print(i == 1 && k > 0 ? " " : "*");
      }
      System.out.println();
    }

    for (int i = 0; i < altura - 4; i++) {
      System.out.print("*");

      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < numeroEspacios + 3; k++) System.out.print(" ");
        System.out.print("*");
      }

      System.out.println();
    }

    System.out.print("*");

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < numeroEspacios; j++) System.out.print(" ");
      for (int j = 0; j < 4; j++) System.out.print("*");
    }

    System.out.println();
  }  
}
