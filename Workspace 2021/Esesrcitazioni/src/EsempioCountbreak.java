import prog.io.ConsoleInputManager;

public class EsempioCountbreak {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		int somma = 0;
		
		//ciclo infinito fino a quando premo zero
		//avrei potuto anche usare un while(true)
		for(;;) {		
			
			int x= in.readInt("?");
			if(x == 0) break;
			
			//se è dispari domanda un nuovo numero
			if(x%2 == 1) continue;
			
			somma+= x;
		}
		
		System.out.println(somma);
	}

}
