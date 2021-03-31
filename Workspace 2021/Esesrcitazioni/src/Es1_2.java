import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_2 {

	public static void main(String[] args) {

		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
			
		int n1 = in.readInt("Inserisci il primo numero:   ");
		int n2 = in.readInt("Inserisci il secondo numero:   ");
		
		out.println("La somma è: " + (n1 + n2));
	}

}
