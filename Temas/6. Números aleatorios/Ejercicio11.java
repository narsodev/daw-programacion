/* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc. */
public class Ejercicio11 {
  public static void main(String[] args) {
    int nota;
    int suspensos = 0;
    int suficientes = 0;
    int bienes = 0;
    int notables = 0;
    int sobresalientes = 0;

    for (int i = 1; i <= 20; i++) {
      nota = (int) (Math.random() * 11);
      System.out.printf("Nota %d: %d\n", i, nota);

      if (nota < 5) suspensos++;
      else if (nota == 5) suficientes++;
      else if (nota == 6) bienes++;
      else if (nota < 9) notables++;
      else sobresalientes++;
    }

    System.out.println();

    System.out.println("Número de suspensos: " + suspensos);
    System.out.println("Número de suficientes: " + suficientes);
    System.out.println("Número de bienes: " + bienes);
    System.out.println("Número de notables: " + notables);
    System.out.println("Número de sobresalientes: " + sobresalientes);
  }  
}
