/* Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado. */
import java.util.Scanner;

public class Ejercicio27 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;
    int nMultiplos = 0;
    int suma = 0;

    System.out.print("Introduzca el número: ");
    num = s.nextInt();

    s.close();

    for (int i = 1; i <= num; i++) {
      if (i % 3 == 0) {
        System.out.println("Múltiplo: " + i);
        suma += i;
        nMultiplos++;
      }
    }

    System.out.printf("Existen: %d múltiplos\n", nMultiplos);
    System.out.println("La suma de los múltiplos es: " + suma);
  }  
}
