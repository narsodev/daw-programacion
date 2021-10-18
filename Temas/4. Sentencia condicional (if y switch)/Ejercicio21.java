/* Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto,la nota será un 5; en caso contrario, se mantiene
la nota media anterior. */
import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double nota;

    System.out.print("Nota del primer examen: ");
    nota = s.nextDouble();
    System.out.print("Nota del segundo examen: ");
    nota = (nota + s.nextDouble()) / 2;

    if (nota <= 5) {
      String notaRecu;
      s.nextLine();
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto / no apto): ");
      notaRecu = s.nextLine();

      if (notaRecu.equals("apto")) nota = 5;
    }
    s.close();

    System.out.printf("Tu nota media del trimestre es: %.2f", nota);
    
  }
}
