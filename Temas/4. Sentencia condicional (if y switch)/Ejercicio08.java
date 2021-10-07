/* Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente). */
import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    double nota1, nota2, nota3, notaMedia;
    String boletin;

    System.out.print("Nota 1: ");
    nota1 = s.nextDouble();
    
    System.out.print("Nota 2: ");
    nota2 = s.nextDouble();

    System.out.print("Nota 3: ");
    nota3 = s.nextDouble();

    s.close();

    notaMedia = (nota1 + nota2 + nota3) / 3;
  
    if (notaMedia < 5) boletin = "insuficiente";
    else if (notaMedia < 6) boletin = "suficiente";
    else if (notaMedia < 7) boletin = "bien";
    else if (notaMedia < 9) boletin = "notable";
    else boletin = "sobresaliente";
    
    System.out.printf("La nota del boletín es: %s.", boletin);
  }
}
