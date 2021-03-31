import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_1 {

	public static void main(String[] args) {
	
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
			
		String s = in.readLine("Inserisci una stringa:   ");
		
		out.println(s);
	}
	
}
