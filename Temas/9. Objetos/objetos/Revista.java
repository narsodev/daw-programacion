package objetos;

public class Revista extends Publicacion {
  int numero;

  public Revista(String ISBN, String titulo, int anio, int numero) {
    super(ISBN, titulo, anio);
    this.numero = numero;
  }

  public String toString() {
    return super.toString() + ", número: " + this.numero;
  }
}
