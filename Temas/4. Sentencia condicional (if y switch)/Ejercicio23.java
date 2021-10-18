/* Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,
reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
muestran los valores correctos, aunque los números no estén tabulados.
*/
import java.util.Scanner;

public class Ejercicio23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String tipoIVA, codigo;
    double baseImp, valorIVA, precioConIVA, total;
    double valorPromo = 0;
    int IVA = 0;

    System.out.print("Introduzca la base imponible: ");
    baseImp = Double.parseDouble(s.nextLine());

    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    tipoIVA = s.nextLine();

    switch (tipoIVA) {
      case "general":
        IVA = 21;
        break;
      case "reducido":
        IVA = 10;
        break;
      case "superreducido":
        IVA = 4;
        break;
      default:
        System.out.println("IVA no válido.");
        break;
    }

    valorIVA = baseImp * IVA * 0.01;
    precioConIVA = baseImp + valorIVA;

    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    codigo = s.nextLine();
    s.close();

    switch (codigo) {
      case "nopro":
        valorPromo = 0;
        break;
      case "mitad":
        valorPromo = precioConIVA / -2;
        break;
      case "meno5":
        valorPromo = -5;
        break;
      case "5porc":
        valorPromo = precioConIVA * -5 * 0.01;
        break;
      default:
        System.out.println("Código no válido.");
        break;
    }

    total = precioConIVA + valorPromo;

    System.out.printf("Base imponible: %.2f\n", baseImp);
    System.out.printf("IVA (%d%%): %.2f\n", IVA, valorIVA);
    System.out.printf("Precio con IVA: %.2f\n", precioConIVA);
    System.out.printf("Cód. promo (%s): %.2f\n", codigo, valorPromo);
    System.out.printf("TOTAL: %.2f\n", total);
  }
}
