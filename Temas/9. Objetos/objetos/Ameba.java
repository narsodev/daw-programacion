package objetos;

public class Ameba {
  private int peso;

  public Ameba () {
    this.peso = 3;
  }

  public void come (int pesoParticula) {
    this.peso += pesoParticula - 1;
  }

  public void come (Ameba amebaComida) {
    this.peso += amebaComida.peso - 1;
    amebaComida.peso = 0;
  }

  public String toString() {
    return "Soy una ameba y peso " + this.peso + " microgramos";
  }
}
