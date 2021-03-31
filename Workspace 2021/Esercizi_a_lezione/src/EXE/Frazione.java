package EXE;

public class Frazione {

	private long num;
	private long den;

	// COSTRUTTORI
	public Frazione(long den, long num) {
		System.out.println("Sto creando la frazione");
		this.num = num;
		this.den = den;

	}

	public Frazione(long num) {
		this(num, 1); // equivale a chiamare il costruttore
	} // Frazione(num, 1)

	public Frazione() { // senza paramentri
		this(0);
	}

	public Frazione per(Frazione a) {
		long nuovoNum = a.num * this.num;
		long nuovoDen = a.den * this.den;

		Frazione per = new Frazione(nuovoNum, nuovoDen);

		return per;
	}

	public Frazione piu(Frazione a) {
		long n = this.num * a.den + this.den * a.den;
		long d = this.den * a.den;
		return new Frazione(n, d);

		/**
		 * Semplifico Trovo il massimo comune divisore tra n e d
		 */
	}

	static public long mcd(long a, long b) {
		long resto;
		do {
			resto = a % b;
			a = b;
			b = resto;
		} while (resto != 0);
		return a;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj instanceof Frazione) {
			Frazione f = (Frazione) obj;
			return this.num == f.num && this.den == f.den;
		}
		return false;
	}

	/**
	 * Qui sono più libero dal metodo standard
	 * @param f
	 * @return
	 */
	public boolean equals(Frazione f) {
		// primo tipo di soluzione
		/*
		 * if(this.num == f.num && this.den == f.den) 
		 * 		return true; 
		 * else 
		 * 		return false;
		 */
		
		// altra alternativa
		/*
		 * return this.num == f.num && this.den == f.den ? true : false;
		 */
		
		//meglio ancora
		return this.num == f.num && this.den == f.den;

	}

	public String toString() {
		return num + "/" + den;
	}

	public static void main(String[] args) {

		System.out.println(mcd(6,3));
		
	}

}
