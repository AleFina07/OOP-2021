package Esercitazione4;

import java.util.Arrays;

public class Studente {

	//costante lunghezza array
	static final int lenArray=5;

	// PARAMETRI
	private String nome;
	private String cognome;
	private int[] voti;
	private String paese;

	/**
	 * Costruttore vuoto
	 * 
	 * @param nome
	 * @param cognome
	 * @param voti
	 */
	
	
	public Studente(String nome, String cognome) { 
		this.nome = nome;
		this.cognome = cognome;
		voti = new int[lenArray]; //così inizializzi l'array, per assegnare 0 a tutti gli elementi puoi fare un ciclo for
		for (int i=0; i<lenArray;i++)
			voti[i]=0;
	}

	/**
	 * Costruttore
	 * 
	 * @param nome
	 * @param cognome
	 * @param voti
	 * @param paese
	 */
	public Studente(String nome, String cognome, String paese) {
		
		this(nome,cognome);
		this.paese = paese;
	}


	/**
	 * Metodo per inserire un esame in una determinata posizione
	 * 
	 * @param n
	 */
	public void inserisciEsame(int n, int posizione) {

		this.voti[posizione] = n;
		System.out.println("Ho inserito il tuo voto");
	}

	/**
	 * Meotodo per calcolare la media
	 * @return
	 */
	public double getMedia() {
		int somma = 0;
		int n = 0;
		for (int i = 0; i < voti.length; i++) {
			if (voti[i] != 0) {
				somma = somma + voti[i];
				n++;
			}
		}
		
		int media = somma/n;
		
		return media;
	}

	public void setPaese(String paese) {
		this.paese = paese;
	}

	
	
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", voti=" + Arrays.toString(voti) + ", paese="
				+ paese + "]";
	}

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Studente a = new Studente("Alessandro", "Finazzi", "Italia");
		a.inserisciEsame(18, 0);
		a.inserisciEsame(20, 1);
		
		System.out.println(a.getMedia());
		
		System.out.println(a.toString());
	}
}
