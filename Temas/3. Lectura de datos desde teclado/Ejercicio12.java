/* Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.*/
import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    double nota1, notaDeseada, nota2;
    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca la nota del primer examen:");
    nota1 = s.nextDouble();

    System.out.println("Introduzca la nota deseada:");
    notaDeseada = s.nextDouble();

    // notaDeseada = nota1 * 40% + nota2 * 60%
    // nota2 = (notaDeseada - nota1 * 40%) / 60%
    nota2 = (notaDeseada - nota1 * 0.4) / 0.6;

    System.out.printf("Para conseguir esa nota, tu nota del segundo examen deberá ser: %.2f", nota2);
  
    s.close();
  }
}
