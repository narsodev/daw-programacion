package Objetos;

import java.text.DecimalFormat;

public class Complejo {
  private static final DecimalFormat formateador = new DecimalFormat("0.0#"); 
  private float numReal;
  private float numImaginario;

  public Complejo (float numReal, float numImaginario) {
    this.numReal = numReal;
    this.numImaginario = numImaginario;
  }

  public String toString () {
    boolean imaginarioNegativo = this.numImaginario < 0;

    return String.format("%s %s %si",
      formateador.format(this.numReal),
      imaginarioNegativo ? "-" : "+",
      formateador.format(imaginarioNegativo ? this.numImaginario * -1 : this.numImaginario));
  }

  public Complejo suma (Complejo complejoASumar) {
    return new Complejo(
      this.numReal + complejoASumar.numReal,
      this.numImaginario + complejoASumar.numImaginario
    );
  }

  public Complejo multiplica (float escalar) {
    return new Complejo(
      this.numReal * escalar,
      this.numImaginario * escalar
    );
  }

  public Complejo multiplica (Complejo complejoAMultiplicar) {
    return new Complejo(
      this.numReal * complejoAMultiplicar.numReal - this.numImaginario * complejoAMultiplicar.numImaginario,
      this.numReal * complejoAMultiplicar.numImaginario - this.numImaginario * complejoAMultiplicar.numReal
    );
  }
}
