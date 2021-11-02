public class Ejercicio06 {
  public static void main(String[] args) {
    int altura;

    System.out.print("Introduzca la altura: ");
    altura = Integer.parseInt(System.console().readLine());

    System.out.println();

    for (int i = 1; i <= altura; i++) {
      for (int j = 0; j < i; j++) System.out.print(i);
      System.out.println();
    }

    System.out.println();

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j <= i; j++) System.out.print(altura - i);
      System.out.println();
    }

    System.out.println();

    for (int i = 1; i <= altura; i++) {
      for (int j = 1; j <= i; j++) System.out.print(j);
      System.out.println();
    }
  }
}
