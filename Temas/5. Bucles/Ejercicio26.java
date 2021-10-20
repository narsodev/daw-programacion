/* Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido. */
import java.util.Scanner;

public class Ejercicio26 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num, digito, cifra;
    int nCifras = 0;

    System.out.print("Introduzca el número: ");
    num = s.nextInt();

    System.out.print("Introduzca el dígito: ");
    digito = s.nextInt();

    s.close();

    for (int i = num; i > 0; i /= 10) {
      nCifras++;
    }

    for (int i = nCifras - 1; i >= 0; i--) {
      int base = (int) Math.pow(10, i);

      cifra = num / base;
      num -= cifra * base;

      if (cifra == digito) System.out.println("Cifra: " + (nCifras - i));
    }
  }  
}
