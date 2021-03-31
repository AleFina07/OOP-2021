package Esercitazione3;

import java.util.ArrayList;
import java.util.StringTokenizer;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Es3_1D {

	public static void main(String[] args) {
		ConsoleInputManager input = new ConsoleInputManager();
		ConsoleOutputManager output = new ConsoleOutputManager();

		ArrayList<Figura> elencoFigure = new ArrayList<>();

		String elencoFigureStringa = input.readLine("Inserire l'elenco delle figure (l1_1,l2_1;l1_2,l2_2): ");

		StringTokenizer figura = new StringTokenizer(elencoFigureStringa, ";");
		String[] lati;
		while (figura.hasMoreTokens()) {
			lati = figura.nextToken().split(",");
			if (lati[0].equalsIgnoreCase(lati[1]))
				elencoFigure.add(new Quadrato(Double.parseDouble(lati[0])));
			else
				elencoFigure.add(new Rettangolo(Double.parseDouble(lati[0]), Double.parseDouble(lati[1])));
		}

		Figura maggiore_Area = elencoFigure.get(0);
		Figura maggiore_Perimetro = elencoFigure.get(0);
		for (int i = 1; i < elencoFigure.size(); i++) {
			if (elencoFigure.get(i).getArea() > maggiore_Area.getArea())
				maggiore_Area = elencoFigure.get(i);
			if (elencoFigure.get(i).getPerimetro() > maggiore_Perimetro.getPerimetro())
				maggiore_Perimetro = elencoFigure.get(i);
		}
		// usando instanceof
		output.print("La figura con area maggiore �: ");
		if (maggiore_Area instanceof Quadrato)
			output.print(" Quadrato ");
		else
			output.print(" Reattngolo ");
		output.println(maggiore_Area.toString());
		// oppure con getClass
		output.println("La figura con perimetro maggiore �: " + maggiore_Perimetro.getClass().getSimpleName() + " "
				+ maggiore_Perimetro.toString());

	}

}