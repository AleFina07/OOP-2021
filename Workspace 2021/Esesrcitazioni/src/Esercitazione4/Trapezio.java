package Esercitazione4;

/**
 * Definisci una classe Trapezio (T) con i seguenti attributi: base maggiore (B)
 * base minore (b) e altezza (h). Definire i metodi per il calcolo dell’area e
 * del perimetro del trapezio. Scrivere un metodo main per testare il programma
 * con alcuni trapezi d’esempio.
 * 
 * @author Alessandro Finazzi
 *
 */
public class Trapezio {

	private double baseMin;
	private double baseMaggiore;
	private double altezza;

	public Trapezio(double baseMin, double baseMaggiore, double altezza) {
		super();
		this.baseMin = baseMin;
		this.baseMaggiore = baseMaggiore;
		this.altezza = altezza;
	}

	/**
	 * Calcolo della bse del parallelogramma
	 * 
	 * @return
	 */
	public double getBase() {

		double base = (Math.sqrt((this.diagMax * this.diagMax) - (getAltezza() * getAltezza()))
				+ Math.sqrt((this.diagMin * this.diagMin) - (getAltezza() * getAltezza()))) / 2;
		return base;
	}

	/**
	 * Calcolo del piccolo segmento per trovare il lato successivamente
	 * 
	 * @return
	 */
	public double getBasePiccola() {

		double b = (Math.sqrt((this.diagMax * this.diagMax) - (getAltezza() * getAltezza()))
				- Math.sqrt((this.diagMin * this.diagMin) - (getAltezza() * getAltezza()))) / 2;
		return b;
	}

	/**
	 * Calcolo il lato
	 * 
	 * @return
	 */
	public double getLato() {

		double lato = Math.sqrt((getAltezza() * getAltezza()) + (getBasePiccola() * getBasePiccola()));
		return lato;
	}

	/**
	 * Calcolo del perimetro del parallelogramma
	 * 
	 * @return
	 */
	public double getPerimetro() {

		double perimetro = (getBase() * 2) + (getLato() * 2);
		return perimetro;
	}

	public double getArea() {
		double area = (getBase() * getAltezza());
		return area;
	}

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Parallelogramma p = new Parallelogramma(3, 3, Math.PI / 4);

		if (p.getLato() == p.getBase())
			System.out.println("Hai inserito un rombo");

		System.out.println(p.getBase());
		System.out.println(p.getAltezza());
		System.out.println(p.getLato());
		System.out.println(p.getArea());
		System.out.println(p.getPerimetro());

	}
}
