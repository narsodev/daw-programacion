public class Ejercicio12 {
  public static void main(String[] args) {
    String entrada;
    String resultado = "";
    boolean salir = false;
    int nEntradas = 0;

    do {
      System.out.print("Introduzca una palabra (acaba con “salir”): ");
      entrada = System.console().readLine();

      salir = entrada.equals("salir");

      if (!salir) resultado = entrada + " " + resultado;
      
      nEntradas++;
    } while (!salir && nEntradas < 4);

    System.out.println(resultado);
  }
}
