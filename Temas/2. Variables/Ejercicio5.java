/* Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable. */
public class Ejercicio5 {
  public static void main(String[] args) {
    double pesetas = 100;
    System.out.printf("%.2f pesetas = %.2f euros", pesetas, (pesetas * 0.006));
  }
}

