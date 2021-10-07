/* Realiza un conversor de euros a pesetas.
La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable. */
public class Ejercicio4 {
  public static void main(String[] args) {
    double euros = 100;
    System.out.printf("%.2f euros = %.2f pesetas", euros, (euros * 166.386));
  }
}
