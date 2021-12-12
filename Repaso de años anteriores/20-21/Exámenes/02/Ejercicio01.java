public class Ejercicio01 {
  public static void main(String[] args) {
    String entrada = "b-3";
    int fila = Integer.parseInt(String.valueOf(entrada.charAt(2)));
    int columna = (int) entrada.charAt(0);

    for (int i = fila + 2; i >= fila - 2; i--) {
      int columnaDisponible;
      int columnaDisponible2;

      if (i >= 1 && i <= 8 && i != fila) {
        if (i == fila - 2 || i == fila + 2) {
          columnaDisponible = columna - 1;
          columnaDisponible2 = columna + 1;
        } else {
          columnaDisponible = columna - 2;
          columnaDisponible2 = columna + 2;
        }

        if (columnaDisponible >= (int) 'a' && columnaDisponible <= (int) 'h'){
          System.out.printf("%s-%d ", (char) columnaDisponible, i);
        }
        if (columnaDisponible2 >= (int) 'a' && columnaDisponible2 <= (int) 'h'){
          System.out.printf("%s-%d ", (char) columnaDisponible2, i);
        }
      }

    }
  }
}
