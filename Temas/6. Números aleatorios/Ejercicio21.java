/* Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.
  Ejemplo:
    2 céntimos - cara
    20 céntimos - cruz
    50 céntimos - cruz
    1 euro - cruz
    2 euros - cara
*/
public class Ejercicio21 {
  public static void main(String[] args) {
    int numTipoMoneda;
    int moneda1 = 10;
    int moneda2 = 10;
    int moneda3 = 10;
    int moneda4 = 10;
    String moneda, caraCruz;
    boolean repetir;

    for (int i = 0; i < 5; i++) {
      repetir = false;
      do {
        numTipoMoneda = (int) (Math.random() * 8);
        repetir = 
          numTipoMoneda == moneda1 ||
          numTipoMoneda == moneda2 ||
          numTipoMoneda == moneda3 ||
          numTipoMoneda == moneda4;
      } while (repetir);

      if (i == 0) moneda1 = numTipoMoneda;
      if (i == 1) moneda2 = numTipoMoneda;
      if (i == 2) moneda3 = numTipoMoneda;
      if (i == 3) moneda4 = numTipoMoneda;

      switch (numTipoMoneda) {
        case 0:
          moneda = "1 céntimo";
          break;
        case 1:
          moneda = "2 céntimos";
          break;
        case 2:
          moneda = "5 céntimos";
          break;
        case 3:
          moneda = "10 céntimos";
          break;
        case 4:
          moneda = "20 céntimos";
          break;
        case 5:
          moneda = "50 céntimos";
          break;
        case 6:
          moneda = "1 euro";
          break;
        case 7:
          moneda = "2 euros";
          break;
        default:
         moneda = "";
         break;
      }

      caraCruz = ((int) (Math.random() * 2)) == 0 ? "cara" : "cruz";

      System.out.printf("%s - %s\n", moneda, caraCruz);
    }
  }
}
