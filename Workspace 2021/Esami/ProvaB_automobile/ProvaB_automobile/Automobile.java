package ProvaB_automobile;

public class Automobile implements Comparable<Automobile>{
	String targa;
	
	public Automobile(String targa) {
		//se la targa è troppo lunga, sollevo un'eccezione
		if (targa.length() != 7)
			throw new RuntimeException("La targa deve avere lunghezza 7");
		
		this.targa = targa;
	}
	
	public String getTarga() {
		return this.targa;
	}
	
	@Override
	public String toString() {
		return this.targa;
	}

	@Override
	public int compareTo(Automobile o) {
		return targa.compareTo(o.targa);
	}
	
	public static void ordina(Automobile[] listaAuto) {
		// Non esiste un'auto
		if (listaAuto == null || listaAuto.length == 0)
			throw new RuntimeException("Nessuna auto passata al metodo di ordinamento");
		// C'è almeno un'auto. Ordino il vettore e ritorno quella più vecchia
		// Merge-Sort
		MergeSorter.mergeSort(listaAuto);
	}
	
	private static Boolean ricercaDicotomica(Automobile[] listaAuto, String t) {
		int start = 0, end = listaAuto.length - 1;
		int med;
		while (start <= end) {
			med = (start + end) / 2;
			if (listaAuto[med].getTarga().compareTo(t) == 0) {
				return true;
			}
			else {
				if (listaAuto[med].getTarga().compareTo(t) < 0) {
					// Devo cercare a destra
					start = med + 1;
				}
				else {
					// Devo cercare a sinistra
					end = med - 1;
				}
			}
		}
		
		// Auto non trovata
		return false;
	}
	
	public static Boolean cerca(Automobile[] listaAuto, String t) {
		// Ordino il vettore
		ordina(listaAuto);
		// Sfrutto il fatto che il vettore è ordinato e cerco se esiste un'auto con targa T
		// Ricerca dicotomica
		return ricercaDicotomica(listaAuto, t);
	}
	
	// Main di prova
	public static void main(String[] args) {
		Automobile[] listaAuto = new Automobile[5];
		listaAuto[0] = new Automobile("DZ476SN");
		listaAuto[1] = new Automobile("AH507KJ");
		listaAuto[2] = new Automobile("PL653HT");
		listaAuto[3] = new Automobile("CZ963QQ");
		listaAuto[4] = new Automobile("MM777II");
		
		// Ordinamento
		ordina(listaAuto);
		for (Automobile a : listaAuto)
			System.out.println(a);
		
		// Cerco auto con targa
		System.out.println(cerca(listaAuto, "PL653HT"));
		System.out.println(cerca(listaAuto, "XX123CC"));
	}
}
