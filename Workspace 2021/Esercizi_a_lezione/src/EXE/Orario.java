package EXE;
/**
 * Rappresenta gli orari in ore e minuti
 * 
 * @author Alessandro Finazzi
 *
 */
public class Orario implements Comparable<Orario> {

	// CAMPI
	private int ora; // compreso tra 0 e 23
	private int minuti; // compreso tra 0 e 59
	private static final int MIN_PER_ORA = 60;
	
	private static String sep = ":";

	// COSTRUTTORI
	public Orario(int h, int m) {
		minuti = m % MIN_PER_ORA;
		ora = (m / MIN_PER_ORA + h) % 24;
	}

	/**
	 * Una stringa: "hh:mm"
	 * 
	 * @param args
	 */
	public Orario(String s) {
		/*
		 * String[] data = s.split(s); minuti = Integer.parseInt(data[0]); ora =
		 * Integer.parseInt(data[1]);
		 */
		this(Integer.parseInt(s.split(":")[0]), Integer.parseInt(s.split(":")[1]));
	}

	// METODI
	public String toString() {
		return ora + ":" + (minuti < 10 ? "0" : "") + minuti;
	}
	
	
	public static void setSet(char c) {
		sep = Character.toString(c);
	}

	/**
	 * Restituisce 0 se this è uguale a o > 0 se this > o < o se this < o
	 * 
	 * @param o
	 * @return
	 */
	public int compareTo(Orario o) {

		if (this.ora == o.ora) {
			if (this.minuti < o.minuti) {
				return 0;
			} else if (this.minuti < o.minuti) {
				return -1;
			} else {
				return 1;
			}
		} else if (this.ora < o.ora) {
			return -1;
		} else {
			return 1;
		}
		/**
		 * si potrebbe migliorare usando il "-"
		 * ad esempio facendo return this.ora - o.ora
		 */
	}

	public static void main(String[] args) {
		Orario o = new Orario(0, 100);
	}
}
