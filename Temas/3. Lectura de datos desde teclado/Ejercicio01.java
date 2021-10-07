/* Realiza un programa que pida dos números y
que luego muestre el resultado
de su multiplicación. */
import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double num1, num2;

    System.out.print("Introduce el número 1: ");
    num1 = s.nextDouble();
    
    System.out.print("Introduce el número 2: ");
    num2 = s.nextDouble();
    
    // TODO: preguntar si importa que se meta el numero con coma o punto
    System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, (num1 + num2));

    s.close();
  }
}