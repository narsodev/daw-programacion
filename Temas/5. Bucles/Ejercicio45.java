/* Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos.
  Ejemplo:
    Por favor, introduzca un número entero positivo: 406783
    Introduzca la posición dentro del número: 3
    Introduzca el nuevo dígito: 1
    El número resultante es 401783
*/
import java.util.Scanner;

public class Ejercicio45 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long num;
    int posicion, digito;
    int nCifras = 0;
    int base, aux;

    System.out.print("Por favor, introduzca un número entero positivo: ");
    num = s.nextLong();

    System.out.print("Introduzca la posición dentro del número: ");
    posicion = s.nextInt();

    System.out.print("Introduzca el nuevo dígito: ");
    digito = s.nextInt();

    s.close();

    for (long i = num; i > 0; i /= 10) nCifras++;

    base = (int) Math.pow(10, nCifras - posicion);
    aux = (int) (num / base % 10);
    num = num + base * (digito - aux);

    System.out.println("El número resultante es " + num);
  }
}
