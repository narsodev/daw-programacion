public class EjercicioExtra_GenerarMenu {
  public static String generarComidaAleatoria (String[][] menu, String[] comidas, int index, int posicion) {
    String comidaAleatoria;
    boolean repetido = false;

    do {
      comidaAleatoria = comidas[(int) (Math.random() * 3)];

      if (index > 0) repetido = comidaAleatoria.equals(menu[index - 1][posicion]);
      if (index == 6) repetido = repetido || comidaAleatoria.equals(menu[0][posicion]);
      
    } while (repetido);

    return comidaAleatoria;
  }

  public static void main(String[] args) {
    String[] DIAS = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
    String[] ALMUERZOS = { "A", "B", "C" };
    String[] CENAS = { "X", "Y", "Z" };

    String[][] menu = new String[7][2];

    for (int i = 0; i < 7; i++) {
      String almuerzo = generarComidaAleatoria(menu, ALMUERZOS, i, 0);
      String cena = generarComidaAleatoria(menu, CENAS, i, 1);

      menu[i][0] = almuerzo;
      menu[i][1] = cena;
    }

    for (int i = 0; i < 7; i++) {
      System.out.printf("%s: %s %s\n", DIAS[i], menu[i][0], menu[i][1]);
    }
  }
}
