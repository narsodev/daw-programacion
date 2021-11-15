public class Ejercicio23 {
  public static void main(String[] args) {
    String cara;

    for (int i = 0; i < 5; i++) {
      switch ((int) (Math.random() * 6)) {
        case 0:
          cara = "As";
          break;
        case 1:
          cara = "K";
          break;
        case 2:
          cara = "Q";
          break;
        case 3:
          cara = "J";
          break;
        case 4:
          cara = "7";
          break;
        case 5:
          cara = "8";
          break;
        default:
          cara = "";
          break;
      }
      System.out.print(cara + " ");
    }
  }
}
