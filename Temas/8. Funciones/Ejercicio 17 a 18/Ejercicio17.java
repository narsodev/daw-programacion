import paquetes.Conversor;

public class Ejercicio17 {
  public static void main(String[] args) {
    String binario;

    System.out.println("Conversor de binario a decimal:");

    System.out.print("Binario: ");
    binario = System.console().readLine();

    System.out.println(Conversor.binarioADecimal(binario));
  }
}
