package Esercitazione4;

/**
 * Definisci una classe Parallelogramma (P) con i seguenti attributi: 
 * -->diagonale maggiore (D) 
 * -->diagonale minore (d)
 * -->angolo (p) che si forma con il lato.
 * 
 * Deve essere possibile calcolare:
 * -->i lati
 * -->l'area
 * -->perimetro del parallelogramma. 
 * 
 * Scrivere un metodo main per testare il
 * programma con alcuni parallelogrammi d’esempio
 * 
 * @author Alessandro Finazzi
 *
 */
public class Parallelogramma {

	
	private double diagMin;
	private double diagMax;
	private double angolo; // formato dalla diagonale maggiore

	public Parallelogramma(double diagMin, double diagMax, double angolo) {

		this.diagMin = diagMin;
		this.diagMax = diagMax;
		this.angolo = angolo;
		// è l'angolo formato tra la base e il lato
	}

	/**
	 * Calcolo dell'altezza del parallelogramma
	 * 
	 * @return
	 */
	public double getAltezza() {
		double altezza = Math.sin(this.angolo) * this.diagMax;
		return altezza;

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

		/**
		 * Per le potenze --> Math.pow(numero, potenza)
		 */
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

	// GETTER AND SETTER
	public double getDiagMax() {
		return diagMax;
	}

	public void setDiagMax(double diagMax) {
		this.diagMax = diagMax;
	}

	public double getDiagMin() {
		return diagMin;
	}

	public void setDiagMin(double diagMin) {
		this.diagMin = diagMin;
	}

	public double getAngolo() {
		return angolo;
	}

	public void setAngolo(double angolo) {
		this.angolo = angolo;
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
