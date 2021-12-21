// Escribe un programa que pase de binario a decimal.
import paquetes.Conversor;

public class Ejercicio17 {
  public static void main(String[] args) {
    String binario;

    System.out.print("Binario: ");
    binario = System.console().readLine();

    System.out.println(Conversor.binarioADecimal(binario));
  }
}
