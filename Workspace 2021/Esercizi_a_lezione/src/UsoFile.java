import prog.io.FileInputManager;

public class UsoFile {

	public static void main(String[] args) {

		if (!FileInputManager.exists("testo.txt")) {
			System.out.println("Attenzione, il file non esiste!");
			return;
		}
		
		FileInputManager filein = new FileInputManager("testp.txt");
		System.out.println("Il file esiste");
		String line;
		/**
		 * 
		 * ALTERNATIVA 1
		 * 
		do {
			line = filein.readLine();
			System.out.println(line);
		} while (line != null);
		
		ALTERNATIVA 2
		
		while (line = filein.readLine()	!= null) {
			System.out.println(line);			
		}
		
		ALTERNATIVA 3
		
		while(true) {
			String linea = filein.readLine();
			if(linea == null) break;
			System.out.println(linea);
		}
		
		*/
	}

}
