package Esercitazione4;

import java.util.ArrayList;

public class Automobile {

	static int counter = 0;
	int id; // per il contatore automatico usa due variabili, una static che serve per
			// contare le automobili e l'id che serve per memorizzare l'ID dell'automobile
	long km;

	public Automobile(int km) {
		// this.id = counter; // qui puoi usare this
		// counter++;
		// this.km = km;
		this(++counter, km);
		// grazie

	}

	public Automobile(int id, int km) {
		this.id = id;
		this.km = km;
	}

	public boolean isMaggioreKm(Automobile a) {

		if (a.km < this.km) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isMinoreKm(Automobile a) {
		if (a.km >= this.km) { // qui puoi fare return a.km > this.km direttamente
			return true;
		} else {
			return false;
		}

	}

	
	public long getKm() {
		return km;
	}

	public int compareTo(Automobile auto) {
		int res = 0;
		if (this.id < auto.getKm()) {
			res = -1;
		}
		if (this.id > auto.getKm()) {
			res = 1;
		}
		return res;
	}

	public static void bubbleSortArrayList(ArrayList<Automobile> list) {
		Automobile temp;
		boolean sorted = false;

		while (!sorted) {
			sorted = true;
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i).compareTo(list.get(i + 1)) > 0) {
					temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);
					sorted = false;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Automobile [id=" + id + ", km=" + km + "]";
	}

	public static void main(String[] args) {

		Automobile a = new Automobile(120000);
		Automobile b = new Automobile(50000);
		Automobile c = new Automobile(300000);

		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());

		ArrayList<Automobile> auto = new ArrayList<>();

		auto.add(a);
		auto.add(b);
		auto.add(c);
		
		bubbleSortArrayList(auto);
		System.out.println(auto.toString());

		/*
		System.out.println(a.isMaggioreKm(b));
		System.out.println(a.isMaggioreKm(c));
		System.out.println(a.isMinoreKm(a));
		*/
	}

}
