package ProvaB_automobile;

public class MergeSorter {
	static void mergeSort(Automobile[] a) {
		mergeSort(a, 0, a.length - 1);
	}

	// Ordina L'array a nella porzione da min a max (compresi)
	private static void mergeSort(Automobile[] a, int min, int max) {
		// Caso base della ricorsione
		if (min >= max)
			return;
		
		// Ordino a destra, a sinistra e poi faccio il merge
		int middle = (max + min) / 2;
		mergeSort(a, min, middle);
		mergeSort(a, middle + 1, max);
		merge(a, min, middle, max);
	}

	// Assume che la parte di "a" tra min e med sia ordinato
	// e così anche tra med +1 e max
	// Fonde le due parti 
	private static void merge(Automobile[] a, int min, int med, int max) {
		// Prendo due indici
		int sx = min, dx = med + 1;
		Automobile[] temp = new Automobile[max - min + 1];
		int i = 0;
		while (i < temp.length) {
			// Copio l'elemento di sinistra nell'array temporaneo
			if (dx > max || (sx <= med && a[sx].compareTo(a[dx]) < 0)) {
				// Copio l'elemento di sinistra
				temp[i++] = a[sx++];
			} else {
				// Copio l'elemento di destra
				temp[i++] = a[dx++];
			}
		}
		// Ricopio temp in a
		for (i = 0; i < temp.length; i++) {
			a[min + i] = temp[i];
		}
	}
}
