package Esercitazione4;

/**
 * Creare una classe "ContoCorrente" che consenta di esegure 3 operazioni:
 * 
 * -->PRELEVARE -->VERSARE -->CALCOLARE GLI INTERESSI
 * 
 * @author Alessandro Finazzi
 *
 */
public class ContoCorrente {

	private static long num;
	private static String proprietario;
	private double importo;

	// COSTRUTTORE
	public ContoCorrente(long num, String proprietario, double importo) {

		this.num = num;
		this.proprietario = proprietario;
		this.importo = importo;

	}

	public ContoCorrente(long num, String proprietario) { // conto corrente senza i soldi

		this(num, proprietario, 0);
	}

	/**
	 * Prelevo l'importo dal conto
	 * 
	 * @param a
	 */
	public void preleva(double a) {

		if(this.importo > a)
			this.importo = importo - a;
	}
	

	
	/**
	 * Verso un importo sul conto
	 * 
	 * @param a
	 */
	public void versa(double a) {

		this.importo = this.importo + a;
	}
	

	public double calcolaInteresse() {

		double interesse = (this.importo / 100) * 0.0001;

		return interesse;
	}

	/**
	 * Metodi get
	 */

	public static long getNum() {
		return num;
	}

	public static String getProprietario() {
		return proprietario;
	}

	public double getImporto() {
		return importo;
	}

	public static void main(String[] args) {

		ContoCorrente conto = new ContoCorrente(12345, "Finazzi", 200);
		
		conto.versa(100);
		conto.preleva(20);
		
		System.out.println(conto.calcolaInteresse());
		System.out.println(conto.getImporto());
	
	}

}
