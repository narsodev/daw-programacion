/* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado. */
import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char caracter;
    int altura;

    System.out.print("Introduzca el carácter: ");
    caracter = s.nextLine().charAt(0);

    System.out.print("Introduzca la altura: ");
    altura = s.nextInt();

    s.close();

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura - i; j++) System.out.print(" ");
      for (int k = 0; k <= i; k++) System.out.print(caracter + " ");

      System.out.println();
    }
  }
}
