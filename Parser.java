/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.09.2017
  * @author Niklas
  */

public class Parser {
  
  public Parser() {
    
  }
  
  private static String strichRechnen(String rechnung) {
    
    if (nextOperationStrich(rechnung).equals("add")) {
      int i1 = rechnung.indexOf('+');
      int i2 = nextOperationIndexStrich(rechnung.substring(i1 + 1)) + i1 + 1;
      
      double doubleErgebnis = Double.parseDouble(punktRechnen(rechnung.substring(0, i1))) + Double.parseDouble(punktRechnen(rechnung.substring(i1+1, i2)));
      System.out.println("Rechnung: " + rechnung.substring(0, i1) + " + " + rechnung.substring(i1 + 1, i2));
      rechnung = Double.toString(doubleErgebnis) + rechnung.substring(i2);
      System.out.println(rechnung);
      rechnung = strichRechnen(rechnung);
    } else if(nextOperationStrich(rechnung).equals("sub")) {
      int i1 = rechnung.indexOf('-');
      int i2 = nextOperationIndexStrich(rechnung.substring(i1 + 1)) + i1 + 1;
      
      double doubleErgebnis = Double.parseDouble(punktRechnen(rechnung.substring(0, i1))) - Double.parseDouble(punktRechnen(rechnung.substring(i1+1, i2)));
      System.out.println("Rechnung: " + rechnung.substring(0, i1) + " - " + rechnung.substring(i1 + 1, i2));
      rechnung = Double.toString(doubleErgebnis) + rechnung.substring(i2);
      System.out.println(rechnung);
      rechnung = strichRechnen(rechnung);
    }
    return rechnung;
  }  
  
  
  
  private static String punktRechnen(String rechnung) {
    
    if (nextOperationPunkt(rechnung).equals("mal")) {
      int i1 = rechnung.indexOf('*');
      int i2 = nextOperationIndexPunkt(rechnung.substring(i1 + 1)) + i1 + 1;
      
      
      double doubleErgebnis = Double.parseDouble(rechnung.substring(0, i1)) * Double.parseDouble(rechnung.substring(i1 + 1, i2));
      System.out.println("Rechnung: " + rechnung.substring(0, i1) + " * " + rechnung.substring(i1 + 1, i2));
      rechnung = Double.toString(doubleErgebnis) + rechnung.substring(i2, rechnung.length());
      System.out.println(rechnung);
      rechnung = punktRechnen(rechnung);
      
    } else if (nextOperationPunkt(rechnung).equals("geteilt")) {
      int i1 = rechnung.indexOf('/');
      
      int i2 = nextOperationIndexPunkt(rechnung.substring(i1 + 1)) + i1 + 1;
      
      double doubleErgebnis = Double.parseDouble(rechnung.substring(0, i1))
      / Double.parseDouble(rechnung.substring(i1 + 1, i2));
      System.out.println("Rechnung: " + rechnung.substring(0, i1) + " / " + rechnung.substring(i1 + 1, i2));
      rechnung = Double.toString(doubleErgebnis) + rechnung.substring(i2, rechnung.length());
      System.out.println(rechnung);
      rechnung = punktRechnen(rechnung);
    }   
    return rechnung;
  }
  
  private static String nextOperationStrich(String input) {
    String operation = "";
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '+') {
        operation = "add";
        break;
      } else if (input.charAt(i) == '-') {
        operation = "sub";
        break;
      }
    }
    return operation;
  }
  
  private static int nextOperationIndexStrich(String input) {
    int index = input.length();
    if (nextOperationStrich(input).equals("add")) {
      index = input.indexOf('+');
    } else if (nextOperationStrich(input).equals("sub")) {
      index = input.indexOf('-');
    }
    
    return index;
  }  
  private static String nextOperationPunkt(String input) {
    String operation = "";
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '*') {
        operation = "mal";
        break;
      } else if (input.charAt(i) == '/') {
        operation = "geteilt";
        break;
      }
    }
    return operation;
  }
  
  private static int nextOperationIndexPunkt(String input) {
    int index = input.length();
    if (nextOperationPunkt(input).equals("mal")) {
      index = input.indexOf('*');
    } else if (nextOperationPunkt(input).equals("geteilt")) {
      index = input.indexOf('/');
    }
    
    return index;
  }
  
  
  public static void main(String[] args) {
    String str = "1+2*(3+4)";
    Parser p = new Parser();
    System.out.println(strichRechnen("3+5*6-7/3"));
    
  }
  
}
