/* Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.*/
public class Ejercicio05 {
  public static void main(String[] args) {
    int[] nums = new int[10];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < 10; i++) {
      System.out.print((i + 1) + ": ");
      int num = Integer.parseInt(System.console().readLine());
      nums[i] = num;
      if (num > max) max = num;
      if (num < min) min = num;
    }
    System.out.println();
    for (int num: nums) System.out.printf("%d%s%s\n", num, num == max ? "\tmáximo" : "", num == min ? "\tmínimo" : "");
  }
}