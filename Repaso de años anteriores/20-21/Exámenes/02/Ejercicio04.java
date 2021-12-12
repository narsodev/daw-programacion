public class Ejercicio04 {
  public static void main(String[] args) {
    int longitud;
    boolean error;

    do {
      System.out.print("Introduzca la longitud total del puente (un número mayor que 6): ");
      longitud = Integer.parseInt(System.console().readLine());

      error = longitud < 7;
      if (error) System.out.println("El dato introducido es incorrecto.");
    } while (error);

    for (int i = 0; i < longitud - 2; i++) {
      System.out.print(i >= 2 && (int) (Math.random() * 3) == 0 ? "&" : " ");
    }
    System.out.println();
    for (int i = 0; i < longitud - 2; i++) {
      System.out.print(i >= 2 ? "*" : " ");
    }

    System.out.println();
    for (int i = 0; i < longitud; i++) {
      System.out.print(i == 1 || i == longitud - 2 ? "*" : " ");
    }
    System.out.println();
    for (int i = 0; i < longitud; i++) {
      System.out.print(i == 0 || i == longitud - 1 ? "*" : " ");
    }
  }
}
