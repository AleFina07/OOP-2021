package Esercitazione5;

import java.awt.Component;
import java.awt.List;
import java.util.ArrayList;

/**
 * Si vuole progettare un sistema per la gestione dei voli. 
 * 
 * Ogni volo è identificato da:
 * -ID alfanumerico
 * -aeroporto di destinazione
 * -aeroporto di partenza
 * -numero di posti disponibili in classe economica
 * -numero di posti disponibili in prima classe
 * -lista di passeggeri. 
 * 
 * Per ogni passeggero vengono memorizzati: 
 * -id biglietto
 * -nome
 * -cognome
 * -prezzo del biglietto pagato
 * -viene memorizzato se viaggia in prima classe o in classe economica
 * (‘P’:prima classe,‘E’:economica).
 * 
 * L’applicazione deve permettere di:
 * 1 -->aggiungere passeggeri al volo (solo se ci sono posti disponibili nella classe richiesta)
 * 2 -->rimuovere passeggeri (dato l’id del biglietto)
 * 3 -->calcolare l’incasso del volo
 * 4 -->stampare la lista passeggeri
 * 
 * @author Alessandro Finazzi
 *
 */
public class Volo {

	static int idNumero = 1;
	static char idChar = 'A';
	
	String id = "";
	String aeroporto_destinazione;
	String aeroporto_partenza;
	
	int posti_disponibili_e;
	int posti_disponibili_p;
	
	ArrayList<Passeggero> passeggeri;
	
	
	/**
	 * Costruttore 
	 * @param id
	 * @param aeroporto_destinazione
	 * @param aeroporto_partenza
	 * @param posti_disponibili_e
	 * @param posti_disponibili_p
	 */
	public Volo(String aeroporto_destinazione, String aeroporto_partenza, 
			int posti_disponibili_e, int posti_disponibili_p) {
		
		
		this.aeroporto_destinazione = aeroporto_destinazione;
		this.aeroporto_partenza = aeroporto_partenza;
		this.posti_disponibili_e = posti_disponibili_e;
		this.posti_disponibili_p = posti_disponibili_p;
		
		passeggeri = new ArrayList<>(); 
		
		id = idNumero + ":" + idChar;
		
		if (idChar == 'Z') {
			idChar = 'A';
			idNumero++;
		} else
			idChar++;
	}
	// Eccomi, ora guardo
	
	void aggiungiPasseggeri(Passeggero p){
		if (p.getClasse() == 'E' && posti_disponibili_e > 0) {
			passeggeri.add(p);
			posti_disponibili_e--;
		} else if (p.getClasse() == 'P' && posti_disponibili_p > 0) {
			passeggeri.add(p);
			posti_disponibili_p--;
		} else
			System.out.println("Non ci sono più posti in classe " + p.getClasse());
	}

	
	void rimuoviPasseggeri(Passeggero p){
		if (p.getClasse() == 'E') {
			posti_disponibili_e++;
		}else {
			posti_disponibili_p++;
		}
		passeggeri.remove(p);
	}
	
	// Ti manca questo metodo, però per il resto in questa classe è tutto giusto
	
	//si, non avevo ancora fatto il metodo, lo faccio ora
	//grazie mille!
	// Ottimo, di niente!
	
	/*
	float calcoloIncasso(){
		
		for (int i = 0; i < passeggeri.size(); i++) {
			
		}
		
		
	}*/
	
	void stampaListaPasseggeri(){
		for (Passeggero passeggero : passeggeri) {
			System.out.println(passeggero.toString());
		}
		
	}

	public ArrayList<Passeggero> getPasseggeri() {
		return passeggeri;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
