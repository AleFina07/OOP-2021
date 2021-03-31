package Esercitazione2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es2_4 {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		
		
		String input = in.readLine("Inserisci i numeri separati da #: 	");
		
		/**
		 * String Token
		 */
		StringTokenizer st = new StringTokenizer (input,"#");
		
		ArrayList<Double> numbers = new ArrayList<>();
		while (st.hasMoreTokens()) {
			
			numbers.add(Double.parseDouble(st.nextToken()));
			
		}
		
		/**
		 * Split
		 */
		String[] numbersSplit = input.split("#");
		ArrayList<Double> numbersSplitAL = new ArrayList<>();
		for (int i = 0; i < numbersSplit.length; i++) {
			
			numbersSplitAL.add(Double.parseDouble(numbersSplit[i]));
			
		}
		
		System.out.println("Il massimo è: " + getMax(numbers));
		System.out.println("Il massimo è: " + getMax(numbersSplitAL));
		System.out.println(getMedia(numbers));
			
	}
	
	/**
	 * Calcolo del massimo numero inserito
	 * @param num
	 * @return
	 */
	private static double getMax(ArrayList<Double> num) {
		
		double max = num.get(0);	//prendo il primo numero e lo pongo coe massimo
		for (double n : num) {
			if(n>max)
				max = n;
		}
		return max;
	}
	
	/**
	 * Calcolo della media
	 * @param num
	 * @return
	 */
	private static double getMedia(ArrayList<Double> num) {
		double sum = 0;
		for(double n: num)
			sum+= n;
		return sum/num.size();
	}
	
	private static double getVarianza(ArrayList<Double> num) {
		
		ArrayList<Double> lowerThan100 = new ArrayList<>();
		for(double n: num)
			if(n>=0 && n<=100 && n%2 == 0)
				lowerThan100.add(n);
		
		double media = getMedia(lowerThan100);
		
		double sum = 0;
		
		for(double n: lowerThan100)
			sum = sum+Math.pow(n-media, 2);		//n è in psizione i-esima
		return sum/lowerThan100.size();
			
			
	}

}
