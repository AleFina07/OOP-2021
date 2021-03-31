import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es1_4 {

	public static void main(String[] args) {

		
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		int d1, d2;
		
		//PRIMA FRAZIONE
		int n1 = in.readInt("Inserisci il numeratore della prima frazione: ");
		do {
			d1 = in.readInt("Inserisci il denominatore della prima frazione: ");
		} while (d1 == 0);
		
		//SECONDA FRAZIONE
		int n2 = in.readInt("Inserisci il numeratore della seconda frazione: ");
		do {
			d2 = in.readInt("Inserisci il denominatore della seconda frazione: ");
		} while (d2 == 0);
		
		
		Frazione f1 = new Frazione(n1, d1);
		Frazione f2 = new Frazione(n2, d2);
		
		out.println("Somma= " + f1.piu(f2));
		out.println("Differenza= " + f1.meno(f2));
		out.println("Prodotto= " + f1.per(f2));
		out.println("Quoziente= " + f1.diviso(f2));
	}

}
