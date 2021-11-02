/* Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error.
  Ejemplo 1:
    Por favor, introduzca la anchura del rectángulo (como mínimo 2): 4
    Ahora introduzca la altura (como mínimo 2): 1
    Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altur\
    a es 2.
  Ejemplo 2:
    Por favor, introduzca la anchura del rectángulo (como mínimo 2): 6
    Ahora introduzca la altura (como mínimo 2): 4
    * * * * * *
    *         *
    *         *
    * * * * * *
*/
import java.util.Scanner;

public class Ejercicio46 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int anchura, altura;
    boolean error = true;

    do {
      System.out.print("Introduzca la anchura del rectángulo (como mínimo 2): ");
      anchura = s.nextInt();
      
      System.out.print("Introduzca la altura (como mínimo 2): ");
      altura = s.nextInt();

      error = anchura < 2 || altura < 2;

      if (error) {
        System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
      }

    } while (error);

    for (int i = 0; i < anchura; i++) System.out.print("* ");
    System.out.println();
    
    for (int i = 0; i < altura - 2; i++) {
      System.out.print("*");
      for (int j = 0; j < anchura - 2; j++) System.out.print("  ");
      System.out.print(" *");
      System.out.println();
    }
    
    for (int i = 0; i < anchura; i++) System.out.print("* ");

    s.close();
  }
}
