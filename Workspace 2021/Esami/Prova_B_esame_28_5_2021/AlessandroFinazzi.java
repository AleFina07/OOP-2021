
class ListaDinamica<T extends Comparable<? super T>> {
	
	/**
	 * Struttura base del nodo della lista
	 * @author Alessandro Finazzi
	 *
	 */
	class NodoLista {
		T dato;
		NodoLista next;
	}

	NodoLista head = null;

	/**
	 * Inserimento del nodo secondo l'ordine crescente della lista
	 * @param info
	 */
	public void inserisciInOrdine(T info) {

		NodoLista temp = new NodoLista();
		temp.dato = info;

		NodoLista p = head;
		NodoLista q = null;

		// ricerca all'interno della lista ordinata
		while (p != null && p.dato.compareTo(info) < 0) {
			q = p;
			p = p.next;
		}

		if (q == null) {
			// inserimento in testa del nodo
			temp.next = null;
			head = temp;
		} else {
			temp.next = p;
			q.next = temp;
		}
	}

	
	/**
	 * Cancellazione di un determinato nodo della lista tenendo conto dei tre diversi casi:
	 * 1 --> Nodo da cancellare si trova in testa alla lista
	 * 2 --> Nodo da cancellare si trova in mezzo alla lista
	 * 3 --> Nodo da cancellare si trova in fondo alla lista
	 * @param info
	 */
	public void cancella(T info) {
		NodoLista p = head;
		NodoLista q = null;

		while (p != null && p.dato.compareTo(info) <= 0) {
			if (p.dato.compareTo(info) == 0) {
				// rimozione
				if (q == null) {
					// CANCELLAZIONE DEL PRIMO NODO
					head = head.next;
				} else if (p != null) {
					q.next = p.next;
					return; // uso il return per bloccare l'esecuziuone del metodo
				} else { // ultimo nodo della lista
					q.next = null;
					return;
				}
			}
			q = p;
			p = p.next;
		}
	}

	
	/**
	 * Conta il numero di nodi della lista che sono minori del valore passato per paramentro 
	 * al metodo
	 * 
	 * @param info
	 * @return numero dei dati minori di info
	 */
	public int countLessThan(T info) {
		NodoLista p = head;
		int count = 0;
		
		while (p != null) { // finchè non finisco la lista
			if (p.dato.compareTo(info) < 0) {
				count++;
			}
			p=p.next;
		}
		return count;
	}
	
	/**
	 * Stampa tutti i valori della lista
	 */
	public void print() {
		System.out.print("[");
		
		NodoLista p = head;
		while(p != null) {//se scrivo p.next != null non tengo conto dell'ultimo nodo
			System.out.print(p.dato.toString());
			p = p.next;
			if(p!= null) {
				System.out.print(";");
			}
		}
		
		System.out.print("]");
	}
}

public class AlessandroFinazzi {

	public static void main(String[] args) {
		
		//creare le varie cose
	}
}
