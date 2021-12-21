// Escribe un programa que pase de decimal a binario.
import paquetes.Conversor;

public class Ejercicio18 {
  public static void main(String[] args) {
    int decimal;

    System.out.print("Decimal: ");
    decimal = Integer.parseInt(System.console().readLine());

    System.out.println(Conversor.decimalABinario(decimal));
  }
}
