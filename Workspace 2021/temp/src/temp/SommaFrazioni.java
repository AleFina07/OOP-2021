package temp;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class SommaFrazioni {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		Frazione f1 = null;
		Frazione f2;
		Frazione f3;
		Frazione somma;
		
		/**
		 * Domandare all'utente f1
		 * Domandare numeratore e denominatore
		 */
	
		int n1 = in.readInt("Inserisci num di f1");
		int d1 = in.readInt("Inserisci den di f1");
		
		f1 = new Frazione(n1, d1);
		
		/**
		 * Domando f2
		 */
		
		f2 = new Frazione(in.readInt("Inserisci num di f2"), in.readInt("Inserisci den di f2"));
	
		somma = f1.piu(f2);
		
		/**
		 * Stampare il risultato
		 * Trasforma somma in una string che la rappresenti 
		 */
		
		out.println(somma);
		
		
	}
	

}
