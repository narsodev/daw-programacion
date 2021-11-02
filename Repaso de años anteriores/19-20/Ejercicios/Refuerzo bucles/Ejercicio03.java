/* Realice un programa que presente por pantalla una lista
de números enteros en orden creciente. Los números
no serán consecutivos, sino que irán saltando según se le
indique al programa. El programa pedirá la cantidad
de números que se van a mostrar, a partir de qué
número se inicia la lista y el “salto” entre los números.
  Ejemplo:
    Introduzca la cantidad de números: 7
    Introduzca el primer número: 18
    Introduzca el salto: 3
    18-21-24-27-30-33-36
*/

public class Ejercicio03 {
  public static void main(String[] args) {
    int inicio, cantidad, salto;

    System.out.print("Introduzca la cantidad de números: ");
    cantidad = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el primer número: ");
    inicio = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el salto: ");
    salto = Integer.parseInt(System.console().readLine());

    for (int i = 0; i < cantidad; i++) {
      System.out.print((i * salto + inicio) + " ");
    }
  }
}
