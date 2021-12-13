public class Ejercicio02 {
  public static void main(String[] args) {
    long numero;
    long suma = 1;

    System.out.println("Este programa calcula CENTROS NUMÉRICOS.");

    boolean error;
    do {
      System.out.print("Indique hasta qué numero desea procesar (>1): ");
      numero = Long.parseLong(System.console().readLine());

      error = numero <= 1;
      if (error) System.out.print("Incorrecto. ");
    } while (error);

    if (numero < 8) {
      System.out.println("No se han encontrado centros numéricos entre 1 y " + numero);
    } else {
      for (int i = 2; i <= numero; i++) {
        long sumaUltimos = 0;

        long j = i + 1;
        while (j <= numero && sumaUltimos < suma) sumaUltimos += j++;

        if (suma == sumaUltimos) System.out.printf("Centro numérico: %d. Grupos: (1-%d) (%d-%d). Suma: %d\n", i, i - 1, i + 1, j - 1, suma);
        suma += i;
      } 
    }
  }
}
