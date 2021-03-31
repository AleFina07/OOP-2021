package Esercitazione3;

import java.util.ArrayList;

import prog.io.ConsoleInputManager;
import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Es3_1 {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();

		ArrayList<Rettangolo> rettangoli = new ArrayList<Rettangolo>();

		do {
			int base = Integer.parseInt(in.readLine("Inserisci la base del rettangolo"));
			int altezza = Integer.parseInt(in.readLine("Inserisci l'altezza del rettangolo"));

			Rettangolo r = new Rettangolo(base, altezza);

			rettangoli.add(r);

		} while (in.readSiNo("Vuoi continuare?"));

		System.out.println("Il rettangolo con area maggiore è :" + cercaRettangoloAreaMAx(rettangoli));
	}

	private static Figura cercaRettangoloAreaMAx(ArrayList<Rettangolo> r) {

		Rettangolo rettMax = r.get(0);

		for (Rettangolo rett : r) {

			if (rett.getArea() > rettMax.getArea()) {
				rettMax.getArea();
			}
		}

		return rettMax;
	}
}
