/* Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.
Ejemplo 1:
  Por favor, introduzca un número entero positivo: 94026782
  Dígitos pares: 4 0 2 6 8 2
  Suma de los dígitos pares: 22
*/
import java.util.Scanner;

public class Ejercicio32 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long num;
    int suma = 0;
    int cifra = 0;
    int nCifras = 0;

    System.out.print("Introduzca un numero entero positivo: ");
    num = s.nextLong();

    for (long i = num; i > 0; i /= 10) {
      nCifras++;
    }

    System.out.print("Dígitos pares: ");
    
    for (int i = nCifras - 1; i >= 0; i--) {
      long base = (long) Math.pow(10, i);

      cifra = (int) (num / base);
      num -= cifra * base;

      if (cifra % 2 == 0 && cifra != 0) {
        System.out.print(cifra + " ");
        suma += cifra;
      }
    }
    
    System.out.println("\nSuma de los dígitos pares: " + suma);

    s.close();
  }  
}
