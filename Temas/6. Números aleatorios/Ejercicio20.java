/* Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
  Ejemplo:
    Por favor, indique la capacidad de la cuba en litros: 3
    *    *
    *====*
    *====*
    ******
La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
*/
public class Ejercicio20 {
  public static void main(String[] args) {
    int capacidad;
    int litros;

    System.out.print("Introduzca la cantidad de agua de la cuba: ");
    capacidad = Integer.parseInt(System.console().readLine());

    litros = (int) (Math.random() * (capacidad + 1));

    for (int i = capacidad; i > 0; i--) {
      System.out.print("*");
      if (litros >= i) System.out.print("====");
      else System.out.print("    ");
      System.out.println("*");
    }
    System.out.println("******");
  }
}
