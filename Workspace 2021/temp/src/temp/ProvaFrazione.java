package temp;

import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class ProvaFrazione {

	public static void main(String[] args) {

		int a = 0;
		Frazione f = new Frazione(1,2);
		
		/**
		 * Utilizzo la dot notation utilizzando il punto
		 */
		
		int denF = f.getDenominatore();
		
		Frazione g = new Frazione(3, 2);
		
		Frazione somma = f.piu(g);
		
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		out.println("CIAO");
		
		
	}

}

