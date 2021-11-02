public class Ejercicio11 {
  public static void main(String[] args) {
    String entrada;
    String resultado = "";
    boolean salir = false;

    do {
      System.out.print("Introduzca una palabra (acaba con “salir”): ");
      entrada = System.console().readLine();

      salir = entrada.equals("salir");

      if (!salir) resultado = entrada + " " + resultado;
      
    } while (!salir);

    System.out.println(resultado);
  }
}
