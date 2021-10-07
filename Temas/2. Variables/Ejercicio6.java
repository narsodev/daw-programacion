/* Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable. */
public class Ejercicio6 {
  public static void main(String[] args) {
    double base = 1000;

    System.out.printf("El total de la factura a partir de la base %.2f es %.2f euros\n", base, (base * 1.21));
  }
}
