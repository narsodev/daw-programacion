/* Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte. */
import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args) {
    int PASSWORD = 0000;
    Scanner s = new Scanner(System.in);
    int entrada;

    System.out.print("Combinación: ");
    entrada = s.nextInt();

    while (entrada != PASSWORD) {
      System.out.println("Lo siento, esa no es la combinación");
      System.out.print("Combinación: ");
      entrada = s.nextInt();
    }

    s.close();

    System.out.println("La caja fuerte se ha abierto satisfactoriamente");
  }  
}
