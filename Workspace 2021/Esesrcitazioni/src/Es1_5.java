import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es1_5 {

	public static void main(String[] args) {

	/**
	 * Per fare la media di n frazioni posso fare un ciclo che inserisce 
	 * una frazione per volta e piano piano ci fa la somma, per esempio se 
	 * inserisco 3 frazioni le sommo e poi le divido per tre se io non voglio
	 * più contiuare.
	 */
		

		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		int d, n, c = 0;
		Frazione somma = new Frazione(0, 1);
		
		Frazione media = new Frazione(0, 1);
		
		
		do {
			
			n = in.readInt("Inserisci il numeratore della frazione:  ");
			d = in.readInt("Inserisci il denominatore della frazione:  ");
			
			Frazione f = new Frazione(n, d);
			
			somma = somma.piu(f);
			
			c = c+1;
			
		} while (in.readSiNo("Vuoi continuare con i calcoli?"));
		
		Frazione k = new Frazione(c, 1);
		media = somma.diviso(k);
		
		out.println("La media dei numeri inseriti è:  " + media);
			
	}

}
