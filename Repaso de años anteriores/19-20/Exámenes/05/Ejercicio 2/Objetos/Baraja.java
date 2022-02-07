package Objetos;

public class Baraja {
  private static final char[] PALOS = new char[] {
    'P',
    'D',
    'C',
    'T'
  };

  private static final String[] VALORES = new String[] {
    "A",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7",
    "8",
    "9",
    "10",
    "J",
    "Q",
    "K"
  };

  private Carta[] baraja;


  public Baraja() {
    baraja = new Carta[4 * 13];

    for (int indexPalo = 0; indexPalo < 4; indexPalo++) {
      for (int indexValor = 0; indexValor < 13; indexValor++) {
        baraja[13 * indexPalo + indexValor] = new Carta(PALOS[indexPalo], VALORES[indexValor]);
      }
    }
  }

  public String toString() {
    String string = "";

    for (int i = 1; i <= baraja.length; i++) {
      string += baraja[i - 1];
      if (i % 13 == 0 || i == baraja.length) string += "\n";
    }

    return string;
  }

  public void barajar () {
    for (int i = 0; i < this.baraja.length; i++) {
      int posicion = (int) (Math.random() * this.baraja.length);

      Carta aux = baraja[i];
      baraja[i] = baraja[posicion];
      baraja[posicion] = aux;
    }
  }

  public Carta dameCarta () {
    int barajaSize = this.baraja.length;

    Carta[] nuevaBaraja = new Carta[barajaSize - 1];

    for (int i = 0; i < barajaSize - 1; i++) {
      nuevaBaraja[i] = this.baraja[i];
    }

    this.baraja = nuevaBaraja;

    return baraja[barajaSize - 2];
  }

  public int tamanio () {
    return this.baraja.length;
  }

  public Carta miraCarta (int posicion) {
    return this.baraja[posicion  - 1];
  }
}
