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
    return(a+b);
  }
  
  public double Substraktion(double a, double b){
    return(a-b);
  }
  
  public double  Multiplikation(double a, double b){
    return(a*b);
  }
  
  public double Division(double a, double b){
    return(a/b);
  } 
  
  public double Potenz (double e, double a)
  {
    return (Math.pow(a, e));
  }
  
  public double Fakultät(int a){
    int r = a; 
    for (int i= 1;i<a;i++ ) {
      r*=i;
    } // end of for
    return r;
  }  
  
  public double Produktfunktion (int o, int u){
    int r = u*o; 
    for (int i= u+1;i<o;i++ ) {
      r*=i;
    } // end of for
    return r;
  }
  
  public double Sinus (double x) {
    return (Math.sin(x));
  }
  
  public double Cosinus (double x) {
    return (Math.cos(x));
  }
  
  public double Tangens (double x) {
    return (Math.tan(x));
  }
  
  public double Integration(double u, double o, String f){
    double ergebnis = 0;
    double streifen  = 100000;
    double breite = (o - u)/streifen;
    double stelle = u; 
    while ( stelle < o) {
      ergebnis = ergebnis +(breite * (Double.parseDouble(f.replaceAll("x", Double.toString(stelle)))));
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
