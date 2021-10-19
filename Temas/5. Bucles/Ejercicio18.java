/* Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7. */
import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num1, num2, aux;

    System.out.print("Número 1: ");
    num1 = s.nextInt();

    System.out.print("Número 2: ");
    num2 = s.nextInt();

    s.close();

    if (num1 == num2) System.out.println("Los números son iguales.");
    else {
      if (num1 > num2) {
        aux = num1;
        num1 = num2;
        num2 = aux;
      }

      for (int i = num1; i <= num2; i += 7) System.out.println(i);
    }

  }  
}
