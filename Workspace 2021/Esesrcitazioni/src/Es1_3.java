import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es1_3 {

	public static void main(String[] args) {

		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		Frazione f1 = new Frazione(1, 3);
		Frazione f2 = new Frazione(2, 3);
		
		out.println("Somma= " + f1.piu(f2));
		out.println("Differenza= " + f1.meno(f2));
		out.println("Prodotto= " + f1.per(f2));
		out.println("Quoziente= " + f1.diviso(f2));

		
	}

}
