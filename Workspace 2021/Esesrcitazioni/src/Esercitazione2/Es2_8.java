package Esercitazione2;


import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.SequenzaOrdinata;

/**
 * Scrivi un metodo statico che prende una stringa che
 * rappresenta una sequenza di coppie «nomeStudente voto», 
 * memorizza in una sequenza ordinata i nomi degli
 * studenti che hanno preso voto >=24
 * 
 * @author Alessandro Finazzi
 *
 */
public class Es2_8 {
	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String input = in.readLine("Inserisci nomeStudente-voto separati da ;: ");
		
		SequenzaOrdinata<String> nomiStudenti= new SequenzaOrdinata<>();
		
		nomiStudenti=estraiNomi(input);
		
		Iterator<String> i = nomiStudenti.iterator();
		
		while (i.hasNext())
			out.println(i.next());
		
		Vector<String> nomiStudentiV= new Vector<>();
		
		nomiStudentiV=estraiNomiVector(input);
		
		Collections.sort(nomiStudentiV);
		
		for (int j=0; j<nomiStudentiV.size();j++)
			out.println(nomiStudentiV.get(j));
	}

	/**
	 * Funzione che mi consente di estrarre dall'input i nomi 
	 * degli studenti inseriti
	 * 
	 * @param input
	 * @return nomi degli studenti
	 */
	private static SequenzaOrdinata<String> estraiNomi(String input) {
		
		SequenzaOrdinata<String> nomiStudenti= new SequenzaOrdinata<>();
		StringTokenizer st = new StringTokenizer(input, ";");
		//separa la stringa utilizzando come simbolo separatore il ';'
		while (st.hasMoreTokens()) {
			
			String nomeVoto = st.nextToken();	//salvo nomeStudente-voto in un unico token
			
			/**
			 * Dichiaro un nuovo tipo di token
			 */
			StringTokenizer stNome = new StringTokenizer(nomeVoto, "-");
			String nome = stNome.nextToken();
			int voto = Integer.parseInt(stNome.nextToken());
			if (voto>=24)
				nomiStudenti.add(nome);
		}
		return nomiStudenti;
	}
	
	private static Vector<String> estraiNomiVector(String input) {
		Vector<String> nomiStudenti= new Vector<>();
		StringTokenizer st = new StringTokenizer(input, ";");
		//separa la stringa utilizzando come simbolo separatore il ;
		while (st.hasMoreTokens()) {
			String nomeVoto = st.nextToken();
			StringTokenizer stNome = new StringTokenizer(nomeVoto, "-");
			String nome = stNome.nextToken();
			int voto = Integer.parseInt(stNome.nextToken());
			if (voto>=24)
				nomiStudenti.add(nome);
		}
		return nomiStudenti;
	}
}
