/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 13.09.2017
 * @author
 */

public class MathMethoden {
	private Parser p;

	public MathMethoden(Parser p) {
		this.p = p;
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

	public double Fakultät(int a) {
		int ergebnis = a;
		for (int i = 1; i < a; i++) {
			ergebnis *= i;
		} // end of for
		return ergebnis;
	}

	public int Produktfunktion(double o, double u, String f) {
		f = f.replace("X", "x");
		int ergebnis = (int) (u * o);
		for (int i = (int) (u + 1); i < o; i++) {
			ergebnis *= p.parsen(f.replaceAll("x", Integer.toString(i)));
		} 
		return ergebnis;
	}

	public double Integration(double u, double o, String f) {
		f = f.replace("X", "x");
		double ergebnis = 0;
		double streifen = 1000;
		double breite = (o - u) / streifen;
		double stelle = u;
		while (stelle < o) {
			ergebnis = ergebnis + breite * p.parsen(f.replaceAll("x", Double.toString(stelle)));
			System.out.println(ergebnis);
			stelle = stelle + breite;
			System.out.println(stelle);
		} // end of for
		return ergebnis;
	}

}
