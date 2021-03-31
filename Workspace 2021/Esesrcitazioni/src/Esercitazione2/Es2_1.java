package Esercitazione2;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es2_1 {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		out.println("Inserisci una parola:");
		
		String risposta = in.readLine();
		
		out.println(isVocale(risposta));
				
	}
	
	
	public static String isVocale(String b) {
		
		StringBuilder sb = new StringBuilder(b);
		
		for (int i = 0; i < sb.length(); i++) {
			
			switch(sb.charAt(i)) {
			
			case 'a'|'e'|'i'|'o'|'u'|'A'|'E'|'I'|'O'|'U':
				sb.deleteCharAt(i);
				i--;
			}
			
		}
		return sb.toString();
		
		
	}

}
