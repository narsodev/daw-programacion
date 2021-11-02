public class Ejercicio08 {
  public static void main(String[] args) {
    int num;

    do {
      System.out.print("Introduzca un número entero (0 para salir): ");
      num = Integer.parseInt(System.console().readLine());

      if (num != 0) System.out.printf("El cuadrado de %d es %d\n", num, (num * num));
    } while (num != 0);
  }
}
