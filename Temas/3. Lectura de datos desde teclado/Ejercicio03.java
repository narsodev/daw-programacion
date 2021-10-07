/* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado. */
import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double pesetas;
  
    System.out.print("Pesetas a convertir: ");
    pesetas = s.nextDouble();

    System.out.printf("%.2f pesetas = %.2f euros", pesetas, ((double) pesetas * 0.006)); 
    
    s.close();
  }
}
