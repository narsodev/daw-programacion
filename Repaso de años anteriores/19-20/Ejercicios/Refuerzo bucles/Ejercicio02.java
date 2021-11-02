/* Realice un programa que presente por pantalla una lista
de números enteros consecutivos en orden creciente.
El programa pedirá la cantidad de números que se van a
mostrar y a partir de qué número.
  Ejemplo:
    Introduzca la cantidad de números: 7
    Introduzca el primer número: 19
    19-20-21-22-23-24-25
*/
public class Ejercicio02 {
  public static void main(String[] args) {
    int inicio, cantidad;

    System.out.print("Introduzca la cantidad de números: ");
    cantidad = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el primer número: ");
    inicio = Integer.parseInt(System.console().readLine());

    for (int i = inicio; i < cantidad + inicio; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
