/* Realiza un programa que pida un número por teclado y
que luego muestre ese número al revés. */
import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;
    int numAlReves = 0;
    int nCifras = 0;
    int cifra;

    System.out.print("Introduzca el número: ");
    num = s.nextInt();

    s.close();

    for (int i = num; i > 0; i /= 10) {
      nCifras++;
    }

    for (int i = nCifras - 1; i >= 0; i--) {
      cifra = num / (int) Math.pow(10, i);
      numAlReves += cifra * (int) Math.pow(10, nCifras - i - 1);
      num -= cifra * (int) Math.pow(10, i);
    }

    System.out.println(numAlReves);
  }  
}
