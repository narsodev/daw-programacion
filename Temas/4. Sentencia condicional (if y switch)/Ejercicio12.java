/* Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
en las diferentes asignaturas del curso. */
import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    int puntos = 0;
    int entrada;
    Scanner s = new Scanner(System.in);
    System.out.println();

    System.out.println("01. Es una etiqueta HTML:");
    System.out.println("   1. <int>");
    System.out.println("   2. <text>");
    System.out.println("   3. <div>");
    System.out.print("Tu opción: ");
    entrada = s.nextInt();
    if (entrada == 3) puntos += 1;
    System.out.println();

    System.out.println("02. ¿Qué etiqueta CSS establece el color de fondo de un elemento HTML?");
    System.out.println("   1. background-color");
    System.out.println("   2. color");
    System.out.println("   3. fill");
    System.out.print("Tu opción: ");
    entrada = s.nextInt();
    if (entrada == 1) puntos += 1;
    System.out.println();

    System.out.println("03. ¿Qué tipo de organización de ficheros utilizan las bases de datos relacionales?");
    System.out.println("   1. Organización secuencial");
    System.out.println("   2. Organización directa");
    System.out.println("   3. Organización secuencial indexada");
    System.out.print("Tu opción: ");
    entrada = s.nextInt();
    if (entrada == 3) puntos += 1;
    System.out.println();

    System.out.println("04. En java, ¿es necesario especificar el tipo de variable cuando esta se inicializa?:");
    System.out.println("   1. No");
    System.out.println("   2. Sí");
    System.out.println("   3. Da lo mismo");
    System.out.print("Tu opción: ");
    entrada = s.nextInt();
    if (entrada == 2) puntos += 1;
    System.out.println();

    System.out.println("05. ¿Cómo se llama la arquitectura que usan los CPU actuales?");
    System.out.println("   1. Harvard");
    System.out.println("   2. Von Neumann");
    System.out.println("   3. Arquitectura propia de Intel y AMD");
    System.out.print("Tu opción: ");
    entrada = s.nextInt();
    if (entrada == 2) puntos += 1;
    System.out.println();

    System.out.println("06. ¿Con qué otro nombre se les conoce a las funciones de aleatorización?");
    System.out.println("   1. Funciones de tipo puntero");
    System.out.println("   2. Funciones recursivas");
    System.out.println("   3. Funciones hash");
    System.out.print("Tu opción: ");
    entrada = s.nextInt();
    if (entrada == 3) puntos += 1;
    System.out.println();

    System.out.println("07. ¿Cuál de los siguientes no es un gestor de bases de datos relacionales?");
    System.out.println("   1. MongoDB");
    System.out.println("   2. MySQL");
    System.out.println("   3. OracleDB");
    System.out.print("Tu opción: ");
    entrada = s.nextInt();
    if (entrada == 1) puntos += 1;
    System.out.println();

    System.out.println("08. Nombre del primer procesador Intel:");
    System.out.println("   1. Intel 4004");
    System.out.println("   2. Intel i1-1000");
    System.out.println("   3. Intel 4000");
    System.out.print("Tu opción: ");
    entrada = s.nextInt();
    if (entrada == 1) puntos += 1;
    System.out.println();

    System.out.println("09. ¿Dónde fue usado el primer procesador Intel?");
    System.out.println("   1. En el Apple Lisa");
    System.out.println("   2. En el primer ordenador de IBM");
    System.out.println("   3. En una calculadora de la marca Busicomp");
    System.out.print("Tu opción: ");
    entrada = s.nextInt();
    if (entrada == 3) puntos += 1;
    System.out.println();

    System.out.println("10. ¿Qué etiqueta HTML se usa para crear un párrafo?");
    System.out.println("   1. <text>");
    System.out.println("   2. <p>");
    System.out.println("   3. <paragraph>");
    System.out.print("Tu opción: ");
    entrada = s.nextInt();
    if (entrada == 2) puntos += 1;
    System.out.println();

    System.out.printf("Calificación obtenida: %d/10", puntos);

    s.close();
  }
}
