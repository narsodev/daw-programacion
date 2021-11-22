public class EjercicioExtra_OrdenarArrayMenorAMayor {
  public static void main(String[] args) {
    int[] nums = new int[10];

    for (int i = 0; i < 10; i++) {
      int num = (int) (Math.random() * 21);
      System.out.printf("%d ", num);
      nums[i] = num;
    }

    for (int i = 0; i < 10; i++) {
      int num = nums[i];
      int posicionMinimo = i;

      for (int j = i + 1; j < 10; j++) {
        if (nums[j] < nums[posicionMinimo]) posicionMinimo = j;
      }

      nums[i] = nums[posicionMinimo];
      nums[posicionMinimo] = num;
    }

    System.out.println();
    for (int i = 0; i < 10; i++) {
      System.out.printf("%d ", nums[i]);
    }
  }
}
