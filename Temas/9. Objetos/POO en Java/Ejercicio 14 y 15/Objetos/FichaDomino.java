package Objetos;

public class FichaDomino {
  private int lado1;
  private int lado2;

  public FichaDomino (int lado1, int lado2) {
    if (lado1 < 0 || lado1 > 6 || lado2 < 0 || lado2 > 6) throw new Error("Valor no válido");
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  public void voltea () {
    int aux = this.lado1;
    this.lado1 = this.lado2;
    this.lado2 = aux;
  }

  public boolean encaja (FichaDomino fichaEncajar) {
    return 
      this.lado1 == fichaEncajar.lado1 || this.lado1 == fichaEncajar.lado2 ||
      this.lado2 == fichaEncajar.lado1 || this.lado2 == fichaEncajar.lado2;
  }

  public String toString () {
    String lado1 = this.lado1 != 0 ? String.valueOf(this.lado1) : " ";
    String lado2 = this.lado2 != 0 ? String.valueOf(this.lado2) : " ";

    return String.format("[%s|%s]", lado1, lado2);
  }
}
