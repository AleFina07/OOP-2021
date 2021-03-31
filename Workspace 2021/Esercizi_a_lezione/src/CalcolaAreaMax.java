import java.util.ArrayList;

import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

/**
 * Costruisce una sequenza di Rettangoli, Quadratti e Cerchi
 * a caso con lati da 1 a 5 a caso.
 * Li mette in un ArrayList.
 * Calcola la figura con area massima e la stampa con anche
 * il tipo di figura.
 * (il calcolo della figura massima lo mettiamo in un metodo a se)
 *  
 * @author Alessandro Finazzi
 *
 */
public class CalcolaAreaMax {

	public static void main(String[] args) {

		
		ArrayList<Figura> figureCreate = new ArrayList<Figura>();
		
		for (int i = 0; i < 20; i++) {
			
		}
		
		Figura max = cercaFiguraAreaMAx(figureCreate);
	}
	
	/**
	 * Crea un figura totalmente a caso
	 * 
	 * @return la figura creata
	 */
	private static Figura creaFiguraACaso() {
		
			//per decidere cosa creare estraiamo un numero a caso
			/**
			 * 1 --> RETTANGOLO
			 * 2 --> QUADRATO
			 * 3 --> CERCHIO
			 */
			int tipoFigura = (int) (Math.random() * 3 +1);
			
			System.out.println("Sto creando la figura di tipo " + tipoFigura);
			
			Figura daInserire = null; //= new Figura() non va bene perchè figura mè una classe astratta
			switch (tipoFigura) {
			case 1:
				//RETTANGOLO
				int base = (int) (Math.random() * 5 + 1);
				int altezza = (int) (Math.random() * 5 + 1);
				
				if(base == altezza)
					daInserire = new Quadrato(base);
				
				daInserire = new Rettangolo(base, altezza);
				break;
			case 2:
				//QUADRATO
				int lato = (int) (Math.random() * 5 + 1);
				daInserire = new Quadrato(lato);
				break;
			case 3:
				//CERCHIO
				int raggio = (int) (Math.random() * 5 + 1);
				daInserire= new Cerchio(raggio);
				break;
			default:
				System.err.println("Figura non riconosciuta " +  tipoFigura);
			}
		
		return daInserire;
		
	}

	private static Figura cercaFiguraAreaMAx(ArrayList<Figura> ff) {
		Figura candidatoMax = ff.get(0);
		for (Figura f : ff) {
			if (f.getArea() > candidatoMax.getArea()) {
				candidatoMax.getArea();
			}
		}

		return candidatoMax;
	}

}
