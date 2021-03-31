package temp;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Pappagallo {

	public static void main(String[] args) {

		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		String parola;
		
		parola = in.readLine("Ciao");
		out.println(parola);
	}

}
