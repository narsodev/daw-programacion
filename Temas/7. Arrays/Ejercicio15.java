/* Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca
siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
programa se ilustra a continuación:
  Ejemplo:
    ┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
    │Mesa nº  │ 1  │  2 │  3 │  4 │  5 │  6 │  7 │  8 │  9 │ 10 │
    ├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
    │Ocupación│ 3  │  2 │  0 │  2 │  4 │  1 │  0 │  2 │  1 │  1 │
    └─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
    ¿Cuántos son? (Introduzca -1 para salir del programa): 2
    Por favor, siéntense en la mesa número 3.

    ┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
    │Mesa nº │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ 10 │
    ├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
    │Ocupación│ 3 │ 2 │ 2 │ 2 │ 4 │ 1 │ 0 │ 2 │ 1 │ 1 │
    └─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
    ¿Cuántos son? (Introduzca -1 para salir del programa): -1
    Gracias. Hasta pronto.
*/
public class Ejercicio15 {
  public static void main(String[] args) {
    int[] mesas = new int[10];
    int numeroPersonas;
    boolean salir;

    for (int i = 0; i < 10; i++) mesas[i] = (int) (Math.random() * 5);

    do {
      System.out.print("Mesas:     ");
      for (int i = 1; i <= 10; i++) System.out.print(i + " ");

      System.out.println();

      System.out.print("Ocupación: ");
      for (int mesa: mesas) System.out.print(mesa + " ");

      System.out.print("\n\n");

      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      numeroPersonas = Integer.parseInt(System.console().readLine());

      salir = numeroPersonas == -1;

      if (numeroPersonas > 4) {
        System.out.printf("Lo siento, no admitimos grupos de %d, haga grupos de 4 personas como máximo e intente de nuevo.\n", numeroPersonas);
      } else if (!salir) {
        int mesaDisponible = -1;
        
        int i = 0;
        do {
          if (mesas[i] == 0) mesaDisponible = i + 1;
          else i++;
        } while (mesaDisponible == -1 && i < 10);

        if (mesaDisponible == -1) {
          i = 0;
          do {
            if (mesas[i] + numeroPersonas <= 4) {
              mesaDisponible = i + 1;
              System.out.print("Tendrán que compartir mesa. ");
            } else i++;
          } while (mesaDisponible == -1 && i < 10);
        }

        if (mesaDisponible != -1) {
          System.out.printf("Por favor, siéntense en la mesa número %d.\n", mesaDisponible);
          mesas[i] += numeroPersonas;
        } else System.out.println("Lo siento, en estos momentos no queda sitio.");
      }
    } while (!salir);

    System.out.println("Gracias. Hasta pronto.");
  }
}
