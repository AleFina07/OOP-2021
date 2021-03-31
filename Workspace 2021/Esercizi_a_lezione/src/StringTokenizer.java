import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class StringTokenizer {

	public static void main(String[] args) {
		/*
		String data = "Alessandro Manzoni; Fermo e Lucia; 18";

		StringTokenizer st = new StringTokenizer(data, ";"); */
		
		Vector<String> nomi = new Vector<String>();
		
		nomi.add("luigi");
		nomi.add("mario");
		
		System.out.println(nomi);
		for (String n : nomi) {
			System.out.println(n);
		}
		
		Collections.sort(nomi);
		for (String n : nomi) {
			System.out.println(n);
		}
		
		int[] nomiArray = new int[60];
		//
		System.out.println(nomiArray.length);		//LENGTH è UN CAMPO(FIELD)
	
		System.out.println(nomi.size());			//SIZE NON è UN CAMPO MA è UN 
													//VERO E PROPRIO METODO CHE VIENE
													//ESEGUITO
	}

}
