import prog.io.ConsoleInputManager;

public class UsoSwitch {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		String s = in.readLine("?");
		
		switch (s) {
		case "ciao":
			System.out.println("Ciao anche a te!");
			/**
			 * SE NON C'E' IL BREAK NON FUNZIONA
			 */
			break;

		default:
			System.out.println("Non mi saluti?");
			break;
		}
	}

}
