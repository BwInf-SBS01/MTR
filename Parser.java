/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.09.2017
  * @author Niklas
  */

package de.taschenrechner.java;

public class Parser {

	public Parser() {

	}

	public String parsen(String eingabe) {
		eingabe = "(" + eingabe + ")";
		System.out.println("Die Aufgabe: " + eingabe);
		String ergebnis = verarbeiten(eingabe);
		return ergebnis;
	}

	public String verarbeiten(String eingabe) {

		for (int i = 0; i < eingabe.length(); i++) {
			if (eingabe.charAt(i) == '(') {
				System.out.println("(");
				eingabe = eingabe.substring(0, i) + verarbeiten(eingabe.substring(i + 1));
				System.out.println("Gekürzt: " + eingabe);
			} else if (eingabe.charAt(i) == ')') {
				System.out.println(')');
				double doubleErgebnis = Double.parseDouble(strichRechnen(eingabe.substring(0, i)));
				eingabe = Double.toString(doubleErgebnis) + eingabe.substring(i + 1);
				break;
			}
		}

		return eingabe;
	}

	private static String strichRechnen(String rechnung) {
		System.out.println("StrichRechnen: " + rechnung);
		if (nextOperationStrich(rechnung).equals("add")) {
			System.out.println("+");
			int i1 = rechnung.indexOf('+');
			int i2 = nextOperationIndexStrich(rechnung.substring(i1 + 1)) + i1 + 1;

			double doubleErgebnis = Double.parseDouble(punktRechnen(rechnung.substring(0, i1)))
					+ Double.parseDouble(punktRechnen(rechnung.substring(i1 + 1, i2)));
			rechnung = Double.toString(doubleErgebnis) + rechnung.substring(i2);
			System.out.println("Additionsergebnis: " + rechnung);
			rechnung = strichRechnen(rechnung);
		} else if (nextOperationStrich(rechnung).equals("sub")) {
			System.out.println("-");
			int i1 = rechnung.substring(1).indexOf('-') + 1;
			int i2 = nextOperationIndexStrich(rechnung.substring(i1 + 1)) + i1 + 1;

			double doubleErgebnis = Double.parseDouble(punktRechnen(rechnung.substring(0, i1)))
					- Double.parseDouble(punktRechnen(rechnung.substring(i1 + 1, i2)));
			rechnung = Double.toString(doubleErgebnis) + rechnung.substring(i2);
			System.out.println("Subtraktionsergebnis: " + rechnung);
			rechnung = strichRechnen(rechnung);
		} else {
			rechnung = punktRechnen(rechnung);
		}
		return rechnung;
	}

	private static String punktRechnen(String rechnung) {
		System.out.println("PunktRechnen: " + rechnung);
		if (nextOperationPunkt(rechnung).equals("mal")) {
			int i1 = rechnung.indexOf('*');
			int i2 = nextOperationIndexPunkt(rechnung.substring(i1 + 1)) + i1 + 1;

			double doubleErgebnis = Double.parseDouble(rechnung.substring(0, i1))
					* Double.parseDouble(rechnung.substring(i1 + 1, i2));

			rechnung = Double.toString(doubleErgebnis) + rechnung.substring(i2, rechnung.length());
			rechnung = punktRechnen(rechnung);
		} else if (nextOperationPunkt(rechnung).equals("geteilt")) {
			int i1 = rechnung.indexOf('/');
			int i2 = nextOperationIndexPunkt(rechnung.substring(i1 + 1)) + i1 + 1;

			double doubleErgebnis = Double.parseDouble(rechnung.substring(0, i1))
					/ Double.parseDouble(rechnung.substring(i1 + 1, i2));

			rechnung = Double.toString(doubleErgebnis) + rechnung.substring(i2, rechnung.length());
			rechnung = punktRechnen(rechnung);
		} else if (nextOperationPunkt(rechnung).equals("sin")) {
			int i1 = rechnung.indexOf('n') + 1;
			int i2 = nextOperationIndexPunkt(rechnung.substring(i1)) + i1 + 1;

			System.out.println("sin von" + i1 + "bis" + i2);

		} else if (nextOperationPunkt(rechnung).equals("cos")) {

		} else if (nextOperationPunkt(rechnung).equals("tan")) {

		}
		return rechnung;
	}
	
	private String integral(String von, String bis, String eingabe) {
		String ergebnis = "";
//		ergebnis = Mathintegral(von, bis, eingabe);      Anh Trung?
		return ergebnis;
	}

	// ---------------------------------------------------------------------------
	public static void main(String[] args) {
		Parser p = new Parser();

		System.out.println(p.parsen("21-8*(5+2)+110"));

	}
	// ---------------------------------------------------------------------------

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

	private static String nextOperationPunkt(String input) {
		String operation = "";
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == '*') {
				operation = "mal";
				break;
			} else if (input.charAt(i) == '/') {
				operation = "geteilt";
				break;
			} else if (input.charAt(i) == 's') {
				operation = "sin";
				break;
			} else if (input.charAt(i) == 'c') {
				operation = "cos";
				break;
			} else if (input.charAt(i) == 't') {
				operation = "tan";
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

}
