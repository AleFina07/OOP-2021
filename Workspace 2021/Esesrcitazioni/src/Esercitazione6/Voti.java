package Esercitazione6;

import java.util.ArrayList;
import java.util.Arrays;

public class Voti {

	/**
	 * Serve per escludere tutti i voti che non vanno bene
	 * 
	 * @param listOfGrades
	 * @return
	 */
	public ArrayList<Integer> filter(String listOfGrades) {

		String[] st = listOfGrades.split(";");
		ArrayList<Integer> grades = new ArrayList<Integer>();
		int num = 0;

		// Aggiunta dei voti all'ArrayList
		for (int i = 0; i < st.length; i++) {
			try {
				num = Integer.parseInt(st[i]);
			} catch (NumberFormatException e) {
				System.out.println("Voto " + st[i] + " ignorato perchè stringa");
				continue;
				// Metto il continue perchè altrimenti il compilatore esegue anche
				// il controllo successivo if(num < 18 || num > 30)
			}

			if (num < 18 || num > 30) {
				// Se il voto non è valido, creo un'eccezione
				throw new RuntimeException("Voto " + st[i] + " non valido");
			}

			grades.add(num);

		}
		return grades;
	}

	/**
	 * Ottengo la media e il valore massimo della lista
	 * 
	 * @param listOfGrades
	 * @return
	 */
	public double[] getAvgAndMax(String listOfGrades) {
		ArrayList<Integer> grades = filter(listOfGrades);
		int sum = 0;
		int max = 0;

		for (Integer num : grades) {
			sum += num;
			if (num > max) {
				max = num;
			}
		}
		return new double[] { ((double) sum) / grades.size(), max };
	}

	public static void main(String[] args) {
		Voti v = new Voti();

		// Funzionamento regolare
		System.out.println(Arrays.toString(v.getAvgAndMax("18;20;30;25")));

		// Funzionamento regolare --> ignoriamo le lettere
		System.out.println(Arrays.toString(v.getAvgAndMax("18;a;30;25")));

		// Abbiamo un'eccezione
		System.out.println(Arrays.toString(v.getAvgAndMax("18;5;30;25")));

	}
}
