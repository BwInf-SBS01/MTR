/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 13.09.2017
 * @author
 */

public class MathMethoden {
  private Parser parser;
  
  public MathMethoden(Parser p) {
    this.parser = p;
  }
  
  public double Addition(double a, double b) {
    double ergebnis = a + b;
    return ergebnis;
  }
  
  public double Subtraktion(double a, double b) {
    double ergebnis = a - b;
    return ergebnis;
  }
  
  public double Multiplikation(double a, double b) {
    double ergebnis = a * b;
    return ergebnis;
  }
  
  public double Division(double a, double b) {
    double ergebnis = a / b;
    return ergebnis;
  }
  
  public double Potenz(double a, double e) {
    double ergebnis = Math.pow(a, e);
    return ergebnis;
  }
  
  public double Sinus(double x) {
    double ergebnis = Math.sin(x);
    return ergebnis;
  }
  
  public double Cosinus(double x) {
    double ergebnis = Math.cos(x);
    return ergebnis;
  }
  
  public double Tangens(double x) {
    double ergebnis = Math.tan(x);
    return ergebnis;
  }
  
  public double Fakultaet(int a) {
    int ergebnis = a;
    for (int i = 1; i < a; i++) {
      ergebnis *= i;
    } // end of for
    return ergebnis;
  }
  
  public double Produktfunktion(double u, double o, String f) {
    f = f.replace("X", "x");
    if(u>o) {
    	throw new TRE("Argumentfehler: Obergrenze keiner als Untergrenze!");
    }
    double ergebnis = 1;
    for (int i = (int) u; i <= o; i++) {
      ergebnis *= parser.parsen(f.replaceAll("x", Integer.toString(i)));
    } 
    return ergebnis;
  }
  
  public double Integration(double u, double o, String f) {
    f = f.replace("X", "x");
    if(u>o) {
    	throw new TRE("Argumentfehler: Obergrenze keiner als Untergrenze!");
    }
    double ergebnis = 0;
    double streifen = 100000;
    double breite = (o - u) / streifen;
    double stelle = u;
    while (stelle < o) {
      ergebnis = ergebnis + breite * parser.parsen(f.replaceAll("x", Double.toString(stelle)));
      System.out.println(ergebnis);
      stelle = stelle + breite;
      System.out.println(stelle);
    } // end of for
    return ergebnis;
  }
  
}
