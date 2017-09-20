/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 13.09.2017
  * @author 
  */

public class MathMethoden {
  public MathMethoden(){
    
  }
  
  public double Addition(double a, double b){
    double ergebnis = a+b ;
    return ergebnis;
  }
  
  public double Substraktion(double a, double b){
    double ergebnis = a-b ;
    return ergebnis;
  }
  
  public double  Multiplikation(double a, double b){
    double ergebnis = a*b ;
    return ergebnis;
  }
  
  public double Division(double a, double b){
    double ergebnis = a/b ;
    return ergebnis;
  } 
  
  public double Potenz (double e, double a)
  {
    double ergebnis = Math.pow(a, e); 
    return ergebnis;
  }
  
  public double Sinus (double x) {
    double ergebnis = Math.sin(x);
    return ergebnis;
  }
  
  public double Cosinus (double x) {
    double ergebnis = Math.cos(x);
    return ergebnis;
  }
  
  public double Tangens (double x) {
    double ergebnis = Math.tan(x);
    return ergebnis;
  }
  
  
  public double Fakultät(int a){
    int ergebnis = a; 
    for (int i= 1;i<a;i++ ) {
      ergebnis*=i;
    } // end of for
    return ergebnis;
  }  
  
  public double Produktfunktion (int o, int u){
    int ergebnis = u*o; 
    for (int i= u+1;i<o;i++ ) {
      ergebnis*=i;
    } // end of for
    return ergebnis;
  }
  
  public double Integration(double u, double o, String f){
    double ergebnis = 0;
    double streifen  = 100000;
    double breite = (o - u)/streifen;
    double stelle = u; 
    while ( stelle < o) {
      ergebnis = ergebnis + (breite * parser.parsen(f.replaceAll("x", Double.toString(stelle)))));
      System.out.println(ergebnis);                                         
      stelle = stelle + breite;
      System.out.println(stelle);   
    } // end of for
    return ergebnis;
  }
  
  public static void main(String[] args){
    System.out.println(new MathMethoden().Integration(0,5,"50 * x"));
  }
  
} // end of class MathMethoden
