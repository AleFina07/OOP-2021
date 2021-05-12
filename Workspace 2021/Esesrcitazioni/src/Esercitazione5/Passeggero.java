package Esercitazione5;

public class Passeggero {

	int id_biglietto;
	String nome;
	String cognome;
	float prezzo;
	char classe;

	public Passeggero(int id_biglietto, String nome, String cognome, float prezzo, char classe) {

		this.id_biglietto = id_biglietto;
		this.nome = nome;
		this.cognome = cognome;
		this.prezzo = prezzo;
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "Passeggero [id_biglietto=" + id_biglietto + ", nome=" + nome + ", cognome=" + cognome + ", prezzo="
				+ prezzo + ", classe=" + classe + "]";
	}

	public float getPrezzo() {
		return prezzo;
	}

	public char getClasse() {
		return classe;
	}

}
