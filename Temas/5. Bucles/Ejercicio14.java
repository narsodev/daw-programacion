/* Escribe un programa que pida una base y un exponente
(entero positivo) y que calcule la potencia. */
import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int base, exponente;
    int resultado = 1;

    System.out.print("Base: ");
    base = s.nextInt();

    System.out.print("Exponente: ");
    exponente = s.nextInt();

    s.close();

    for (int i = 0; i < exponente; i++) {
      resultado *= base;
    }

    System.out.println("Resultado: " + resultado);
  }  
}
