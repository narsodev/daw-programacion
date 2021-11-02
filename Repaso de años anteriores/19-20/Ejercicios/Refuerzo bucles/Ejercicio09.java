public class Ejercicio09 {
  public static void main(String[] args) {
    int num;
    int cantidadNumeros = 0;

    do {
      System.out.print("Introduzca un número entero (0 para salir): ");
      num = Integer.parseInt(System.console().readLine());

      if (num != 0) System.out.printf("El cuadrado de %d es %d\n", num, (num * num));
      cantidadNumeros++;
    } while (num != 0 && cantidadNumeros < 4);
  }
}
