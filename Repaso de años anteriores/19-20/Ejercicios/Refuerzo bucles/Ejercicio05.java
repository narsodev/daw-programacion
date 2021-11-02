public class Ejercicio05 {
  public static void main(String[] args) {
    int num;

    System.out.print("Introduzca un número: ");
    num = Integer.parseInt(System.console().readLine());

    System.out.println(

    );
    for (int i = 1; i <= num; i++) {
      for (int j = 0; j < i; j++) System.out.print(" ");
      System.out.println(i);
    }

    System.out.println();

    for (int i = 1; i <= num; i++) {
      for (int j = 0; j < i; j++) System.out.print(" ");
      for (int j = 1; j <= i; j++) System.out.print(j);
      System.out.println();
    }

    System.out.println();

    for (int i = 1; i <= num; i++) {
      for (int j = 0; j < i; j++) System.out.print(" ");
      for (int j = 0; j < i; j++) System.out.print(num - j);
      System.out.println();
    }
  }
}
