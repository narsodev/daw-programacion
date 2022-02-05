import Objetos.FichaDomino;

public class Ejercicio15 {
  public static void main(String[] args) {
    FichaDomino[] fichas = new FichaDomino[8];
    int ladoAnterior = (int) (Math.random() * 7);

    for (int i = 0; i < fichas.length; i++) {
      int ladoActual = (int) (Math.random() * 7);
      FichaDomino fichaActual = new FichaDomino(ladoAnterior, ladoActual);
      fichas[i] = fichaActual;
      ladoAnterior = ladoActual;
    }

    for (FichaDomino ficha: fichas) System.out.print(ficha);
  }
}
