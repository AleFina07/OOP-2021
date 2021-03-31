package Esercitazione4;

/**
 * Scrivere una classe Dipendente. Ciascun dipendente ha un nome (di tipo
 * stringa) e uno stipendio (di tipo double). Scrivere un costruttore con due
 * parametri (nome e stipendio) e i metodi per conoscere nome e stipendio (get).
 * Aggiungere un metodo incrementaStipendio(double percentuale), che incrementi
 * lo stipendio del dipendente secondo una certa percentuale. Fare una classe di
 * prova contenente il metodo main per testare i metodi della classe Dipendente
 * 
 * @author Alessandro Finazzi
 *
 */
public class Dipendente {

	private String nome;
	private double stipendio;
	private static final double stipendioFisso = 1500; //servono due campi, uno per lo stipendio e uno stati final per stipendio fisso
	//private final double stipendio = 1500;
	//pensavo ne servisse uno solo, grazie
	public Dipendente(String nome, double stipendio) {

		this.nome = nome;
		this.stipendio = stipendio;
	}
	
	public Dipendente(String nome) {

		this(nome, stipendioFisso);
	}
	//anche qui c'è un problema
	public void incrementaStipendio(double percentuale) {
		
		stipendio += stipendio / 100 * percentuale; //così è corretto
	}
	public String getNome() {
		return nome;
	}

	
	public double getStipendio() {
		return stipendio;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dipendente d = new Dipendente("Alessandro");
		d.incrementaStipendio(50);
		
		System.out.println(d.getStipendio());
	}

}
