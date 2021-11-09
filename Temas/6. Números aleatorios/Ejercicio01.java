/* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados). */
public class Ejercicio01 {
  public static void main(String[] args) {
    int tirada;
    int suma = 0;

    for (int i = 0; i < 3; i++) {
      tirada = (int) (Math.random() * 6) + 1;
      System.out.printf("Dado %d: %d\n", i + 1, tirada);
      suma += tirada;
    }

    System.out.println("La suma total es: " + suma);
  }
}
