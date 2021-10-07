/* Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora. */
import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double horas;

    System.out.println("Introduzca las horas trabajadas esta semana:");
    horas = s.nextDouble();

    System.out.printf("Esta semana cobrará %.2f euros.", (horas * 12));

    s.close();
  }
}
