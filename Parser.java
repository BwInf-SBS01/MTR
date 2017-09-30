public class Parser {

	public static MathMethoden mathe;

	public Parser() {
		mathe = new MathMethoden(this);
	}

	public double parsen(String eingabe) {
		eingabe = "(" + eingabe + ")";
		System.out.println("Die Aufgabe: " + eingabe);
		double ergebnis = Double.parseDouble(verarbeiten(eingabe));
		return ergebnis;
	}

	public static String verarbeiten(String eingabe) {
		for (int i = 0; i < eingabe.length(); i++) {
			if (eingabe.charAt(i) == '(') {
				if (!(i == 0) && Character.isDigit(eingabe.charAt(i - 1))) {
					System.out.println("digit");
					eingabe = eingabe.substring(0, i) + "*" + eingabe.substring(i, eingabe.length());
					System.out.println(eingabe);
				}
				System.out.println("(");
				eingabe = eingabe.substring(0, i) + verarbeiten(eingabe.substring(i + 1));
				System.out.println("Gekürzt: " + eingabe);
			} else if (eingabe.charAt(i) == ')') {
				System.out.println(')');
				double doubleErgebnis = Double.parseDouble(strichRechnen(eingabe.substring(0, i)));
				if (i < eingabe.length() - 1 && Character.isDigit(eingabe.charAt(i + 1))) {
					System.out.println("Digit");
					eingabe = eingabe.substring(0, i + 1) + "*" + eingabe.substring(i + 1, eingabe.length());
				}
				eingabe = Double.toString(doubleErgebnis) + eingabe.substring(i + 1);
				break;
			}
		}

		return eingabe;
	}

	private static String strichRechnen(String rechnung) {
	    System.out.println("StrichRechnen: " + rechnung);
	    if (nextOperationStrich(rechnung).equals("add")) {
	      int i1 = rechnung.indexOf('+');
	      System.out.println("+" + " an Stelle: " + i1);
	      rechnung = spezRechnen(rechnung.substring(0, i1)) + rechnung.substring(i1);
	      System.out.println("Neue Rechnung: " + rechnung);
	      i1 = rechnung.indexOf('+');
	      
	      int i2 = nextOperationIndexStrich(rechnung.substring(i1 + 1)) + i1 + 1;
	      System.out.println("Nächstes Rechenzeichen an Stelle: " + i2);
	      rechnung = rechnung.substring(0, i1+1) + spezRechnen(rechnung.substring(i1+1, i2)) + rechnung.substring(i2);
	      System.out.println("Neue Rechnung: " + rechnung);
	      i2 = nextOperationIndexStrich(rechnung.substring(i1 + 1)) + i1 + 1;
	      
	      System.out.println("Nächstes Rechenzeichen an Stelle: " + i2);
	      
	      System.out.println("Addition der Indizes: " + i1 + " + " + i2 + " Aufg: " + rechnung);
	      double doubleErgebnis = mathe.Addition(Double.parseDouble(punktRechnen(rechnung.substring(0, i1))), Double.parseDouble(punktRechnen(rechnung.substring(i1 + 1, i2))));
	      
	      rechnung = Double.toString(doubleErgebnis) + rechnung.substring(i2);
	      System.out.println("Additionsergebnis: " + rechnung);
	      rechnung = strichRechnen(rechnung);
	    } else if (nextOperationStrich(rechnung).equals("sub")) {
	      int i1 = rechnung.substring(1).indexOf('-') + 1;
	      System.out.println("-" + " an Stelle: " + i1);
	      rechnung = spezRechnen(rechnung.substring(0, i1)) + rechnung.substring(i1);
	      System.out.println("Neue Rechnung: " + rechnung);
	      i1 = rechnung.substring(1).indexOf('-') + 1;
	      
	      int i2 = nextOperationIndexStrich(rechnung.substring(i1 + 1)) + i1 + 1;
	      System.out.println("Nächstes Rechenzeichen an Stelle: " + i2);
	      rechnung = rechnung.substring(0, i1+1) + spezRechnen(rechnung.substring(i1+1, i2)) + rechnung.substring(i2);
	      System.out.println("Neue Rechnung: " + rechnung);
	      i2 = nextOperationIndexStrich(rechnung.substring(i1 + 1)) + i1 + 1;
	      
	      System.out.println("Nächstes Rechenzeichen an Stelle: " + i2);
	      
	      System.out.println("Subtraktion der Indizes: " + i1 + " + " + i2 + " Aufg: " + rechnung);
	      double doubleErgebnis = mathe.Subtraktion(Double.parseDouble(punktRechnen(rechnung.substring(0, i1))),
	      Double.parseDouble(punktRechnen(rechnung.substring(i1 + 1, i2))));
	      
	      rechnung = Double.toString(doubleErgebnis) + rechnung.substring(i2);
	      System.out.println("Subtraktionsergebnis: " + rechnung);
	      rechnung = strichRechnen(rechnung);
	    } else {
	      rechnung = spezRechnen(rechnung);
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
				if (i == 0) {
					continue;
				}
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

	private static String spezRechnen(String rechnung) {
		System.out.println("spezRechnen: " + rechnung);
		for (int i = 0; i < rechnung.length(); i++) {
			if (i >= 2) {
				if (rechnung.substring(i - 2, i + 1).equals("sin")) {
					int i2 = nextOperationIndexPunkt(rechnung);
					double doubleErgebnis = mathe.Sinus(Double.parseDouble(rechnung.substring(i + 1, i2)));
					rechnung = rechnung.substring(0, i - 2) + Double.toString(doubleErgebnis) + rechnung.substring(i2);
				} else if (rechnung.substring(i - 2, i + 1).equals("cos")) {
					int i2 = nextOperationIndexPunkt(rechnung);
					double doubleErgebnis = mathe.Cosinus(Double.parseDouble(rechnung.substring(i + 1, i2)));
					rechnung = rechnung.substring(0, i - 2) + Double.toString(doubleErgebnis) + rechnung.substring(i2);
				} else if (rechnung.substring(i - 2, i + 1).equals("tan")) {
					int i2 = nextOperationIndexPunkt(rechnung);
					double doubleErgebnis = mathe.Tangens(Double.parseDouble(rechnung.substring(i + 1, i2)));
					rechnung = rechnung.substring(0, i - 2) + Double.toString(doubleErgebnis) + rechnung.substring(i2);
				}
			}
			if (rechnung.charAt(i) == '^') {
				int i0 = lastOperationIndexPunkt(rechnung.substring(0, i)) + 1;
				int i1 = rechnung.indexOf('^');
				int i2 = nextOperationIndexPunkt(rechnung.substring(i1 + 1)) + i1 + 1;
				System.out.println("Potenz: " + rechnung.substring(i0, i1) + "^^" + rechnung.substring(i1 + 1, i2));
				double doubleErgebnis = mathe.Potenz(Double.parseDouble(rechnung.substring(i0, i1)),
						Double.parseDouble(rechnung.substring(i1 + 1, i2)));
				rechnung = rechnung.substring(0, i0) + Double.toString(doubleErgebnis) + rechnung.substring(i2, rechnung.length());
				System.out.println("Ergebnis der Potenz: " + rechnung);
			}
			if(rechnung.charAt(i) == '!') {
				int i0 = lastOperationIndexPunkt(rechnung.substring(0, i)) + 1;
				int i1 = rechnung.indexOf('!');
				System.out.println('!' + "an Stelle " + i1);
				double doubleErgebnis = mathe.Fakultät(Integer.parseInt(rechnung.substring(i0, i1)));
				rechnung = rechnung.substring(0, i0) + Double.toString(doubleErgebnis) + rechnung.substring(i1 + 1);
			}
		}

		return rechnung;
	}

	private static String punktRechnen(String rechnung) {
		System.out.println("PunktRechnen: " + rechnung);
		if (nextOperationPunkt(rechnung).equals("mult")) {
			int i1 = rechnung.indexOf('*');
			int i2 = nextOperationIndexPunkt(rechnung.substring(i1 + 1)) + i1 + 1;
			System.out.println('*' + "an Stelle " + i1);
			
			double doubleErgebnis = mathe.Multiplikation(Double.parseDouble(rechnung.substring(0, i1)),
					Double.parseDouble(rechnung.substring(i1 + 1, i2)));

			rechnung = Double.toString(doubleErgebnis) + rechnung.substring(i2, rechnung.length());
			rechnung = punktRechnen(rechnung);
		} else if (nextOperationPunkt(rechnung).equals("div")) {
			int i1 = rechnung.indexOf('/');
			int i2 = nextOperationIndexPunkt(rechnung.substring(i1 + 1)) + i1 + 1;
			System.out.println('/' + "an Stelle " + i1);

			double doubleErgebnis = mathe.Division(Double.parseDouble(rechnung.substring(0, i1)),
					Double.parseDouble(rechnung.substring(i1 + 1, i2)));

			rechnung = Double.toString(doubleErgebnis) + rechnung.substring(i2, rechnung.length());
			rechnung = punktRechnen(rechnung);
		}
		return rechnung;
	}

	private static String nextOperationPunkt(String input) {
		String operation = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '*') {
				operation = "mult";
				break;
			} else if (input.charAt(i) == '/') {
				operation = "div";
				break;
			}
		}
		return operation;
	}

	private static int nextOperationIndexPunkt(String input) {
		int index = input.length();
		if (nextOperationPunkt(input).equals("mult")) {
			index = input.indexOf('*');
		} else if (nextOperationPunkt(input).equals("div")) {
			index = input.indexOf('/');
		}
		return index;
	}
	
	private static int lastOperationIndexPunkt(String input) {
		int index = -1;
		for(int i = input.length()-1; i >= 0; i--) {
			if(input.charAt(i) == '*') {
				index = input.lastIndexOf('*');
				break;
			} else if(input.charAt(i) == '/') {
				index = input.lastIndexOf('/');
				break;
			}
		}
		return index;
	}

	public String integral(String von, String bis, String eingabe) {
		String ergebnis = "";
		double a = parsen(von);
		double z = parsen(bis);
		ergebnis = mathe.Integration(a, z, eingabe) + "";
		return ergebnis;
	}

	public String produktfunktion(String von, String bis, String eingabe) {
		String ergebnis = "";
		double a = parsen(von);
		double z = parsen(bis);
		ergebnis = mathe.Produktfunktion(a, z, eingabe) + "";
		return ergebnis;
	}

	// ---------------------------------------------------------------------------
	public static void main(String[] args) {
		Parser p = new Parser();

		System.out.println(p.parsen("10+20+30*2-10^2"));

	}
	// ---------------------------------------------------------------------------

}
