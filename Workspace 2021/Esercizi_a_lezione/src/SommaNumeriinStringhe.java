import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/**
 * Chiediamo all'utente una serie di numeri termintati da "exit" 
 * inseriti come stringhe. Calcoliamo la somma quando viene inserita la parola exit.
 * 
 * @author Alessandro Finazzi
 *
 */
public class SommaNumeriinStringhe {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		int somma = 0;
		
		for(;;) {
			String numero = in.readLine();
			if(numero.equals("exit")) break;
			somma+= Integer.parseInt(numero);
		}

		System.out.println(somma);
	}
}
