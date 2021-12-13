public class Ejercicio03 {
  public static void main(String[] args) {
    int num;

    System.out.println("Este programa codifica números enteros en MORSE.");
    
    do {
      System.out.print("Introduzca un valor entero a codificar (>=0): ");
      num = Integer.parseInt(System.console().readLine());

      String morse = "";

      if (num >= 0) {
        int i = num;
          do {
          int cifra = i % 10;
    
          String morseCifra = "-----";
    
          for (int j = 1; j <= cifra; j++) {
            if (j < 6) morseCifra = "." + morseCifra;
            else morseCifra = "-" + morseCifra;
          }
    
          morse = morseCifra.substring(0, 5) + " " + morse;

          i /= 10;
        } while (i > 0);
        
        System.out.println(morse);
      }

    } while (num >= 0);

  }
}
