/* Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
*/
import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el número del día de la semana: ");
    int dia = s.nextInt();

    switch (dia) {
      case 1, 3:
        System.out.println("Asignatura: Lenguajes de marcas.");
        break;
      case 2, 4:
        System.out.println("Asignatura: Entornos de desarrollo.");
        break;
      case 5:
        System.out.println("Asignatura: Formación y orientación laboral.");
        break;
      default:
        System.out.println("Día no válido.");
    }
    s.close();
    
  }
}
