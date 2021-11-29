/* Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.
  Ejemplo:
    Array original:
    ┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐
    │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │
    ├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤
    │casa │azul │verde │orden │morado │bombilla│bici │rosa │
    └────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘
    Array resultado:
    ┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐
    │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │
    ├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤
    │azul │verde │morado │rosa │casa │orden │bombilla│bici │
    └────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘
*/
public class Ejercicio14 {
  public static void main(String[] args) {
    final String[] colores = {
      "verde",
      "rojo",
      "azul",
      "amarillo",
      "naranja",
      "rosa",
      "negro",
      "blanco",
      "morado"
    };

    String[] palabras = new String[8];
    String[] palabrasOrdenadas = new String[8];
    int numColores = 0;

    for (int i = 0; i < 8; i++) {
      System.out.printf("Palabra %d: ", i);
      String entrada = System.console().readLine();
      palabras[i] = entrada;

      boolean esColor = false;
      int j = 0;
      do {
        String color = colores[j];
        esColor = entrada.equals(color);
        j++;
      } while (!esColor && j < 8);

      if (esColor) {
        palabrasOrdenadas[numColores] = entrada;
        numColores++;
      } else palabrasOrdenadas[7 - (i - numColores)] = entrada;
    }

    System.out.println("\nArray original:");
    for (int i = 0; i < 8; i++) System.out.printf("%d: %s\n", i, palabras[i]);

    System.out.println("\nArray resultado:");
    for (int i = 0; i < 8; i++) System.out.printf("%d: %s\n", i, palabrasOrdenadas[i]);
  }
}
