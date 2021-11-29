/* Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda. */
public class Ejercicio09 {
  public static void main(String[] args) {
    int[] nums = new int[8];

    for (int i = 0; i < 8; i++) {
      System.out.printf("%d: ", i + 1);
      nums[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println();
    for (int i = 0; i < 8; i++) {
      int num = nums[i];
      System.out.printf("%d: %d %s\n", i + 1, num, num % 2 == 0 ? "par" : "impar");
    }
  }  
}
