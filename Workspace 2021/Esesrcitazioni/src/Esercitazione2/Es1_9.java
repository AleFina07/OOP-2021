package Esercitazione2;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_9 {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String parola = in.readLine("Inserisci la parola:   ");
		StringBuilder palindroma = new StringBuilder("");
		char c;
		
		for (int i = parola.length() - 1; i >= 0; i--) {
			
			c  = parola.charAt(i);
			palindroma.append(c);			
		}
		
		System.out.println(palindroma);
		
		if(palindroma.equals(parola)) {
			System.out.println("La tua parola è palindroma");
		}else {
			System.out.println("La tua parola non è palindroma");
		}
	}

}
