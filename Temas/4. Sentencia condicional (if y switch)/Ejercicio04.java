/* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora. */

import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int sueldo = 0;
    
    System.out.print("Introduce el número de horas: ");
    int horas = s.nextInt();

    if (horas > 40) {
      sueldo += (horas - 40) * 16;
      horas = 40;
    }

    sueldo += horas * 12;

    System.out.printf("Tu sueldo será: %s€.", sueldo);

    s.close();
  }
}
