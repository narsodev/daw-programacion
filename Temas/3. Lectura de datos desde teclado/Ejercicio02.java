/* Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado */
import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double euros;

    System.out.print("Euros a convertir: ");
    euros = s.nextDouble();
    System.out.printf("%.2f euros = %.2f pesetas", euros, (euros * 166.386));

    s.close();
  }
}
