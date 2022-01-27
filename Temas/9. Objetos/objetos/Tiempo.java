package objetos;

public class Tiempo {
  private int segundos;

  public Tiempo (int horas, int minutos, int segundos) {
    this.segundos = horas * 3600 + minutos * 60 + segundos;
  }

  public void suma (Tiempo objTiempo) {
    this.segundos += objTiempo.segundos;
  }

  public void resta (Tiempo objTiempo) {
    this.segundos -= objTiempo.segundos;
  }

  public String toString () {
    int segundos = this.segundos;

    int horas = segundos / 3600;
    segundos -= horas * 3600;

    int minutos = segundos / 60;
    segundos -= minutos * 60;

    return horas + "h " + minutos + "m " + segundos + "s";
  }
}
