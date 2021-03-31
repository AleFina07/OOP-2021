package Esercitazione2;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_7 {

	public static void main(String[] args) {

		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		String cornice = "************************************************";
		
		String spazio = "                                                 ";
		
		String frase = in.readLine("Inserisci la tua frase:   ");
		
		int lunghezza = frase.length();
		
		String riga = cornice.substring(0, lunghezza+5);
		
		String spazioBianco = spazio.substring(0, lunghezza-2);
		
		String rigaIntermedia = "*" + spazioBianco + "*";
		String rigaTesto = "*" + frase + "*";
		
		
		out.println(riga);
		out.println(rigaIntermedia);
		out.println(rigaTesto);
		out.println(rigaIntermedia);
		out.println(riga);
		
		
		
		
	}

}
