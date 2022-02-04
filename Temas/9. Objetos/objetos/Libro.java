package objetos;

public class Libro extends Publicacion implements Prestable {
  boolean prestado;

  public Libro(String ISBN, String titulo, int anio) {
    super(ISBN, titulo, anio);
    this.prestado = false;
  }

  @Override
  public void presta () {
    if (this.prestado) System.out.println("Error. Este libro ya está prestado.");
    else this.prestado = true;
  }

  @Override
  public void devuelve () {
    if (!this.prestado) System.out.println("Error. Este libro no está prestado.");
    else this.prestado = false;
  }

  @Override
  public boolean estaPrestado () {
    return this.prestado;
  }

  public String toString() {
    return super.toString() + ", número: (" + (this.prestado ? "" : "no ") + "prestado)";
  }
}
