import java.util.ArrayList;

import prog.io.ConsoleInputManager;
import prog.utili.Sequenza;

/**
 * Chiedo una sequenza di parole fino a quando inserisci la parola vuota.
 * Memorizzo e ristampo alla fine
 * 
 * @author Alessandro Finazzi
 *
 */
public class usoSequenza {

	public static void main(String[] args) {

		//dove memorizzo le parole?
		//si espande automanticamente
		Sequenza<String> parole = new Sequenza<>();
		ConsoleInputManager in = new ConsoleInputManager();
		
		//inserimentoo
		/*
		parole.add("piero");
		System.out.println(parole);
		parole.add("paolo");
		System.out.println(parole);
		parole.add("ciao");
		System.out.println(parole);*/
		
		for(;;) {
			String parola = in.readLine("?");
			
			if (parola.length() == 0) {
				break;
			}
			
			parole.add(parola);
		}
		
		//stampo con il for each
		for(String p : parole) {
			System.out.println(p + " ");
		}
		
		//utilizzo gli ArrayList
		ArrayList<String> nomi = new ArrayList<>();
		
		nomi.add("piero");
		nomi.set(0, "paolo");
		nomi.add(0, "anna");
		
		System.out.println(nomi);
		System.out.println(nomi.get(1));
		
		nomi.remove(0);
		
		System.out.println(nomi);
	}

}
