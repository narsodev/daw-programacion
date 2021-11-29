public class Ejercicio07 {
  public static void main(String[] args) {
    int[] nums = new int[100];
    int primerValor, segundoValor;

    for (int i = 0; i < 100; i++) {
      int num = (int) (Math.random() * 21);
      nums[i] = num;
      System.out.printf("%d: %d\n", i + 1, num);
    }

    System.out.print("\nIntroduzca el primer valor: ");
    primerValor = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el segundo valor: ");
    segundoValor = Integer.parseInt(System.console().readLine());

    System.out.println("Su array cambiado es:");
    for (int i = 0; i < 100; i++) {
      System.out.printf((i + 1) + ": ");

      int num = nums[i];

      if (num == primerValor) {
        num = segundoValor;
        nums[i] = segundoValor;
        System.out.printf("\"%d\"\n", num);
      } else System.out.println(num);
    }
  }
}
