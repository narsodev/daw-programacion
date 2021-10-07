/* Escriba un programa que sea capaz de memorizar 5 frases,
introducidas cada una de ellas por teclado.

El programa sólo puede utilizar una variable de tipo String.

El programa debe solicitar cada una de las 5 frases, y debe
presentarlas tras la introducción de la quinta frase. 
*/
import java.util.Scanner;

public class EjercicioExtra01_Guardar5frasesConUnaVariable {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String entrada;
    
    System.out.print("Frase 1: ");
    entrada = s.nextLine();
    System.out.print("Frase 2: ");
    entrada += "\n" + s.nextLine();
    System.out.print("Frase 3: ");
    entrada += "\n" + s.nextLine();
    System.out.print("Frase 4: ");
    entrada += "\n" + s.nextLine();
    System.out.print("Frase 5: ");
    entrada += "\n" + s.nextLine();

    s.close();

    Scanner sEntrada = new Scanner(entrada);

    System.out.println();
    System.out.println("Has introducido las siguientes frases: ");
    System.out.println("Frase 1: " + sEntrada.nextLine());
    System.out.println("Frase 2: " + sEntrada.nextLine());
    System.out.println("Frase 3: " + sEntrada.nextLine());
    System.out.println("Frase 4: " + sEntrada.nextLine());
    System.out.println("Frase 5: " + sEntrada.nextLine());

    sEntrada.close();
  }
}
