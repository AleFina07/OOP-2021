/**
 * Tipo di dato da inserire all'interno dell'albero
 * @author Alessandro Finazzi
 *
 */
class Animale {

	String nome;

	public Animale(String nome) {
		this.nome = nome;
	}
}

/**
 * Implementazione dell'albero
 * @author Alessandro Finazzi
 *
 */
public class AlberoAnimali {

	NodoAlbero radice;

	public AlberoAnimali() {
		radice = null;
	}

	/**
	 * Struttura base di un nodo dell'albero
	 *
	 * 				DATO
	 * 			   /    \
	 * 			  /		 \
	 * 			 SX		 DX
	 * 
	 * @author Alessandro Finazzi
	 *
	 */
	private class NodoAlbero {
		// salvo il dato
		Animale dato;

		// creo due puntatori ricorsivi
		AlberoAnimali sx;
		AlberoAnimali dx;
	}

	public void inserisci(Animale a) {
		if (radice == null) {
			// albero VUOTO
			radice = new NodoAlbero();
			radice.dato = a;

			radice.sx = new AlberoAnimali();
			radice.dx = new AlberoAnimali();
		} else {

			// NOTA BENE: posso utilizzare il compareTo perchè lo eredito da "String"

			if (a.nome.compareTo(radice.dato.nome) < 0) {
				radice.sx.inserisci(a);
			} else if (a.nome.compareTo(radice.dato.nome) > 0) {
				radice.dx.inserisci(a); 
			}
		}
	}
	
	public void visualizza() {
		if(radice != null) {
			radice.sx.visualizza();
			System.out.println(radice.dato.nome);
			radice.dx.visualizza();
		}
	}
	
	public boolean cerca(String nome) {
		if(radice != null) {
			if(nome.compareTo(radice.dato.nome) < 0)
				return radice.sx.cerca(nome);
			else if(nome.compareTo(radice.dato.nome) > 0)
				return radice.dx.cerca(nome);
			else if(nome.equals(radice.dato.nome))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
	}
}
