/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.09.2017
  * @author 
  */

package de.taschenrechner.java;

public class Parser {

	public Parser() {

	}

	private static String nextOperation(String input) {
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

	private static int nextOperationIndex(String input) {
		int index = input.length();
		if (nextOperation(input).equals("mal")) {
			index = input.indexOf('*');
		} else if (nextOperation(input).equals("geteilt")) {
			index = input.indexOf('/');
		}

		return index;
	}

	private String punktRechnen(String rechnung) {
		String ergebnis = "0";

		System.out.println(nextOperation(rechnung));
		if (nextOperation(rechnung).equals("mal")) {
			int i1 = rechnung.indexOf('*');
			System.out.println(i1);
			int i2 = nextOperationIndex(rechnung.substring(i1 + 1)) + i1 + 1;

			System.out.println(i2);
			double doubleErgebnis = Double.parseDouble(rechnung.substring(0, i1))
					* Double.parseDouble(rechnung.substring(i1 + 1, i2));
			System.out.println("Rechnung: " + rechnung.substring(0, i1) + "*" + rechnung.substring(i1 + 1, i2));
			ergebnis = Double.toString(doubleErgebnis) + rechnung.substring(i2, rechnung.length());
			System.out.println("Ergebnis: " + ergebnis);
			punktRechnen(ergebnis);
		} else if (nextOperation(rechnung).equals("geteilt")) {
			int i1 = rechnung.indexOf('/');
			System.out.println(i1);
			int i2 = nextOperationIndex(rechnung.substring(i1 + 1)) + i1 + 1;
			System.out.println(i2);
			double doubleErgebnis = Double.parseDouble(rechnung.substring(0, i1))
					/ Double.parseDouble(rechnung.substring(i1 + 1, i2));
			System.out.println("Rechnung: " + rechnung.substring(0, i1) + "/" + rechnung.substring(i1 + 1, i2));
			ergebnis = Double.toString(doubleErgebnis) + rechnung.substring(i2, rechnung.length());
			System.out.println("Ergebnis: " + ergebnis);    //wird beim letzten Durchlauf richtig ausgegeben
			punktRechnen(ergebnis);
		} else {
			ergebnis = rechnung;
		}
		return ergebnis;
	}

	public static void main(String[] args) {
		String str = "1+2*(3+4)";
		Parser p = new Parser();
		// System.out.println(p.verarbeiten(p.vorbereiten(str), 0,
		// str.length()+2));
		System.out.println(p.punktRechnen("100*10/100*2"));      //obwohl es davor richtig ausgegeben wurde wird
                                                           //der um die erste Rechnung gekürzte String ausgegeben

	}

} // end of class Parser
