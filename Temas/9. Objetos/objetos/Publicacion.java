package objetos;

public abstract class Publicacion {
  private String ISBN;
  private String titulo;
  private int anio;

  public Publicacion (String ISBN, String titulo, int anio) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.anio = anio;
  }

  public String toString () {
    return "ISBN: " + this.ISBN + ", título: " + this.titulo + ", año de publicación: " + this.anio;
  }
}
