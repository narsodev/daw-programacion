/* Realice un programa que presente por pantalla una lista
de números enteros en orden decreciente. El
programa pedirá el valor más alto, el valor más bajo y
el salto que habrá entre número y número.
  Ejemplo:
    Introduzca el número más alto: 86
    Introduzca el número más bajo: 68
    Introduzca el salto: 4
    86-82-78-74-70
*/
import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int alto, bajo, salto;

    System.out.print("Introduzca el número más alto: ");
    alto = s.nextInt();

    System.out.print("Introduzca el número más bajo: ");
    bajo = s.nextInt();

    System.out.print("Introduzca el salto: ");
    salto = s.nextInt();

    s.close();

    for (int i = alto; i >= bajo; i -= salto) System.out.print(i + " ");
    System.out.println();
  }
}
