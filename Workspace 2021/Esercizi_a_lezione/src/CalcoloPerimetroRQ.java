import prog.io.ConsoleInputManager;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

/**
 * L'utente inserisce un rettangolo o un quadrato 
 * e poi calcolo il perimetro
 * 
 * @author Alessandro Finazzi
 *
 */
public class CalcoloPerimetroRQ {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		
		//INSERIMENTO DA PARTE DELL'UTENTE
		char f = in.readChar("R per rettangolo, Q per quadrato");
		
		Rettangolo r;
		//SWITCH CASE
		switch (f) {
		case 'R':
			//RETTANGOLO
			double b = in.readDouble("Base?");
			double h = in.readDouble("Altezza?");
			r = new Rettangolo(b, h);
			System.out.println(r.getArea());
			break;
		case 'Q':
			//QUADRATO
			double l = in.readDouble("Base?");
			/**
			 * Posso utilizzare un rettangolo come quardato perchè 
			 * è una superclasse di quandrato, quadrato è un filgio 
			 * di rettangolo
			 */
			r = new Quadrato(l);
			System.out.println(r.getArea());
			break;
		default:
			System.err.println("Reinserisci la figura");
			break;
		}
		
		/**
		 * ATTENZIONE: non posso utilizzare metodi delle sottoclassi
		 * come nell'esempio qua sotto. Per esempio il metodo "getLato" 
		 * non esiste nella classe Rettangolo perchè quadrato è un rettangolo
		 * ma rettangolo non è un quadrato.
		 */
		
		//System.out.println(r.getLato());
	}

}
