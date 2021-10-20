/* Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura: 
   1
  121
 12321
1234321
*/
import java.util.Scanner;

public class Ejercicio24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n;

    System.out.print("Introduzca el número: ");
    n = s.nextInt();

    s.close();

    int k;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= n - i; j++) System.out.print(" "); 
      for (k = 1; k <= i; k++) System.out.print(k);
      for (int h = k; h >= 1; h--) System.out.print(h);
      System.out.println();
    }
  }
}
