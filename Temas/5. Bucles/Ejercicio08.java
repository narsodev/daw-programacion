// Muestra la tabla de multiplicar de un número introducido por teclado
import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;

    System.out.print("Introduzca el número del que quiera mostrar su tabla de multiplicar: ");
    num = s.nextInt();

    s.close();

    for (int i = 0; i <= 10; i++) {
      System.out.printf("%d x %d = %d\n", num, i, (num * i));
    }
  }  
}
