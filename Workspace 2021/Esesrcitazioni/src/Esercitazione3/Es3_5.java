package Esercitazione3;

import java.util.ArrayList;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.io.FileInputManager;

/**
 * Dato il file di testo "La Tigre della Malesia.txt" contare quante vocali cisono. 
 * Restituire il numero di a, e, i, o, u. 
 * Attenzione: il testo contiene sia maiuscole che minuscole.
 * 
 * NB: CTRL+SHIFT+F --> riordina il codice
 * 
 * @author Alessandro Finazzi
 *
 */
public class Es3_5 {
	public static void main(String[] args) {

		ConsoleInputManager input = new ConsoleInputManager();

		String nomeFile = input.readLine("Che file devo esaminare?");

		// verifico l'esistenza del file
		if (FileInputManager.exists(nomeFile)) {
			/**
			 * Se il file esiste, utilizzo il meotodo
			 */
			getVocali(nomeFile);

		} else {
			System.out.println("Il file non esiste");
		}

	}

	/**
	 * Metodo che estrae e stampa il numero di vocali da un qualsiasi file
	 * 
	 * @param Nome del file da esaminare
	 */
	static void getVocali(String nomeFile) {

		FileInputManager ingresso = new FileInputManager(nomeFile);

		String riga;

		// contatori
		int a = 0, e = 0, i = 0, o = 0, u = 0;

		// ciclo while per la lettura di una riga alla volta
		while ((riga = ingresso.readLine()) != null) {

			// metto tutta la riga in minuscolo
			riga.toLowerCase();

			// confronto tutti i caratteri della riga uno alla volta
			for (int j = 0; j < riga.length(); j++) {

				switch (riga.charAt(j)) {
				case 'a':
					a++;
					break;
				case 'e':
					e++;
					break;
				case 'i':
					i++;
					break;
				case 'o':
					o++;
					break;
				case 'u':
					u++;
					break;
				default:
					/**
					 * Nel caso di una consonante passo alla lettera successiva
					 */
					break;
				}
			}
		}

		// chiudo il file
		ingresso.close();

		// stampo i risultati del metodo
		System.out.println("Hai inserito " + (a + e + i + o + u) + " vocali");
		System.out.println("a -->" + a);
		System.out.println("e -->" + e);
		System.out.println("i -->" + i);
		System.out.println("o -->" + o);
		System.out.println("u -->" + u);
	}

}
