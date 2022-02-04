import paquetes.Conversor;

public class Ejercicio18 {
  public static void main(String[] args) {
    long decimal;

    System.out.println("Conversor de decimal a binario:");

    System.out.print("Decimal: ");
    decimal = Long.parseLong(System.console().readLine());

    System.out.println(Conversor.decimalABinario(decimal));
  }
}
