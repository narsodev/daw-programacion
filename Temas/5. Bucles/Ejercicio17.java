/* Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo). */
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int entrada;
    int total = 0;

    System.out.print("Introduzca un número positivo: ");
    entrada = s.nextInt();

    s.close();

    if (entrada < 0) System.out.println("El número introducido es negativo");
    else {
      for (int i = entrada; i <= entrada + 100; i++) total += i;

      System.out.println("El total es: " + total);
    }
  }
}
