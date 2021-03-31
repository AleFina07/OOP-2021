class Persona{
	public String toString() { return "persona";}
}

class Studente extends Persona {
	public String toString() {return "einstein";}
}

class Lavoratore extends Persona{
	public String toString() { return "stakanov";}
}


public class UsoOverride {

	public static void main(String[] args) {

		Persona p = new Persona();
		System.out.println(p);
		
		p = new Studente();
		System.out.println(p.toString());
		
		p = new Lavoratore();
		System.out.println(p.toString());
		
		
		/**
		 * L'OUTPUT DI QUESTO CODICE FA CAPIRE BENE COME 
		 * FUNZIONA L'OVERRIDING
		 */
		
		/**
		 * instanceof va a vedere se l'oggetto passato è un'istanza 
		 * dell'oggetto da confrontare
		 */
		
		if(p instanceof Lavoratore) {		//vero perchè personalavoratore è un'istanza di lavoratore 
			System.out.println("Lavoratore!!!!!!!!");
		}
		if(p instanceof Studente) {			//falso perchè persona lavoratore non è un'istanza di lavoratore
			System.out.println("Studente!!!!!!!!!");
		}
		if(p instanceof Persona) {			//vero perchè personalavoratore è un istanza di persona
			System.out.println("Persona!!!!!!!!");
		}
	}

}
