import prog.io.ConsoleInputManager;

public class PappagalloStanco {

	public static void main(String[] args) {

		/**
		 * Domanda all'utente una parola e la ripete al massimo tre volte
		 * Se scrivo stanco esce prima
		 */
		
		ConsoleInputManager in = new ConsoleInputManager();
		
		for (int i = 0; i < 3; i++) {
			
			String parola = in.readLine("?");
			if (parola.equals("stanco")) break;
			System.out.println(parola);
			
		}
	}

}
