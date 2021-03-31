package Esercitazione2;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es2_3 {
	
	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String line = in.readLine("inserisci frase: ");
		
		// converti in miuscole (opzionale)
		String lineMin = line.toLowerCase();
		
		// per ogni lettera
		for(char c = 'a'; c <= 'z' ; c++){
			
			int contaC = 0;
			
			// trova c nella frase
			for(int i = 0 ; i < lineMin.length(); i++){
				if (lineMin.charAt(i) == c)
					contaC ++;
			}
			
			// se l'hai trovata stampa quante volte
			if (contaC >0){
				out.println(c + "-> "+ contaC);
			}
		}


	}

}
