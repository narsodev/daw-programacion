/* Modifica el programa anterior añadiendo colores.
Puedes mostrar cada asignatura de un color diferente.*/
public class Ejercicio5 {
  public static void main(String[] args) {
    String colorBorde = "\u001b[37m";
    String LM = "\u001b[33mLM";
    String PROG = "\u001b[31mPROG";
    String BBDD = "\u001b[32mBBDD";
    String ED = "\u001b[36mED";
    String SI = "\u001b[34mSI";
    String FOL = "\u001b[35mFOL";

              System.out.printf("%13s ┏━━━━━━┳━━━━━━┳━━━━━━┳━━━━━━┳━━━━━━┓\n", "");
              System.out.printf("%13s ┃ %-4s ┃ %-4s ┃ %-4s ┃ %-4s ┃ %-4s ┃\n", "", "L", "M", "X", "J", "V");
    System.out.println("┏━━━━━━━━━━━━━╋━━━━━━╇━━━━━━╇━━━━━━╇━━━━━━╇━━━━━━┫");
     System.out.printf("┃ %s ┃ %-9s%s │ %-9s%s │ %-9s%s │ %-9s%s │ %-9s%s ┃\n", "08:15-09:15", LM, colorBorde, ED, colorBorde, LM, colorBorde, ED, colorBorde, FOL, colorBorde);
    System.out.println("┣━━━━━━━━━━━━━╉──────┼──────┼──────┼──────┼──────┨");
     System.out.printf("┃ %-5s ┃ %-9s%s │ %-9s%s │ %-9s%s │ %-9s%s │ %-9s%s ┃\n", "09:15-10:15", LM, colorBorde, BBDD, colorBorde, LM, colorBorde, ED, colorBorde, FOL, colorBorde);
    System.out.println("┣━━━━━━━━━━━━━╉──────┼──────┼──────┼──────┼──────┨");
     System.out.printf("┃ %-5s ┃ %-9s%s │ %-9s%s │ %-9s%s │ %-9s%s │ %-9s%s ┃\n", "10:15-11:15", PROG, colorBorde, BBDD, colorBorde, PROG, colorBorde, PROG, colorBorde, FOL, colorBorde);
    System.out.println("┣━━━━━━━━━━━━━╉──────┼──────┼──────┼──────┼──────┨");
     System.out.printf("┃ %-5s ┃ %-4s │ %-4s │ %-4s │ %-4s │ %-4s ┃\n", "11:15-11:45", "R", "R", "R", "R", "R");
    System.out.println("┣━━━━━━━━━━━━━╉──────┼──────┼──────┼──────┼──────┨");
     System.out.printf("┃ %-5s ┃ %-9s%s │ %-9s%s │ %-9s%s │ %-9s%s │ %-9s%s ┃\n", "11:45-12:45", PROG, colorBorde, PROG, colorBorde, PROG, colorBorde, PROG, colorBorde, SI, colorBorde);
    System.out.println("┣━━━━━━━━━━━━━╉──────┼──────┼──────┼──────┼──────┨");
     System.out.printf("┃ %-5s ┃ %-9s%s │ %-9s%s │ %-9s%s │ %-9s%s │ %-9s%s ┃\n", "12:45-13:45", BBDD, colorBorde, PROG, colorBorde, BBDD, colorBorde, SI, colorBorde, SI, colorBorde);
    System.out.println("┣━━━━━━━━━━━━━╉──────┼──────┼──────┼──────┼──────┨");
     System.out.printf("┃ %-5s ┃ %-9s%s │ %-9s%s │ %-9s%s │ %-9s%s │ %-9s%s ┃\n", "13:45-14:45", BBDD, colorBorde, SI, colorBorde, BBDD, colorBorde, SI, colorBorde, SI, colorBorde);
    System.out.println("┗━━━━━━━━━━━━━┻━━━━━━┷━━━━━━┷━━━━━━┷━━━━━━┷━━━━━━┛");
  }
}
