package Objetos;

public class Carta {
  private char palo;
  private String valor;

  public Carta (char palo, String valor) {
    this.palo = palo;
    this.valor = valor;
  }

  public String toString () {
    return String.format("[%s,%s]", this.palo, this.valor);
  }

  public String dameValor () {
    return this.valor;
  }

  public char damePalo () {
    return this.palo;
  }
}