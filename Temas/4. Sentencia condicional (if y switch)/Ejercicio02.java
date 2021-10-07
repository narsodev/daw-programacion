/* Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado */
import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la hora: ");
    int hora = s.nextInt();

    if (hora >= 6 && hora < 12) {
      System.out.println("Buenos días.");
    } else if (hora >= 12 && hora < 21) {
      System.out.println("Buenas tardes.");
    } else System.out.println("Buenas noches.");

    s.close();
  }
}
