/* Realice un programa que presente por pantalla una lista de
números enteros consecutivos en orden creciente,
desde el 0 en adelante. El programa pedirá la cantidad de
números que se van a mostrar.
  Ejemplo:
    Introduzca la cantidad de números: 7
    1-2-3-4-5-6-7
*/

public class Ejercicio01 {
  public static void main(String[] args) {
    int cantidad;

    System.out.print("Introduzca la cantidad de números: ");
    cantidad = Integer.parseInt(System.console().readLine());

    for (int i = 1; i <= cantidad; i++) System.out.print(i + " ");
  }
}
