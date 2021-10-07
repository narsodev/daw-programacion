/* Escribe un programa que nos diga el horóscopo
a partir del día y el mes de nacimiento. */
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int dia, mes;

    System.out.print("Introduzca el día: ");
    dia = s.nextInt();

    System.out.print("Introduzca el mes: ");
    mes = s.nextInt();

    s.close();

    if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12) System.out.println("Los datos introducidos son inválidos.");
    else {
      if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) System.out.println("Tu horóscopo es " + "Aries");
      else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) System.out.println("Tu horóscopo es " + "Tauro");
      else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) System.out.println("Tu horóscopo es " + "Géminis");
      else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) System.out.println("Tu horóscopo es " + "Cáncer");
      else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) System.out.println("Tu horóscopo es " + "Leo");
      else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) System.out.println("Tu horóscopo es " + "Virgo");
      else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) System.out.println("Tu horóscopo es " + "Libra");
      else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) System.out.println("Tu horóscopo es " + "Escorpio");
      else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) System.out.println("Tu horóscopo es " + "Sagitario");
      else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) System.out.println("Tu horóscopo es " + "Capricornio");
      else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) System.out.println("Tu horóscopo es " + "Acuario");
      else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) System.out.println("Tu horóscopo es " + "Piscis");
      else System.out.println("Los datos introducidos son inválidos.");
    }
  }
}
