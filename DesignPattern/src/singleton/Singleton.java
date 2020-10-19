package singleton;

/*
 * Il pattern Singleton è utilizzato per 
 * consentire la creazione di un unico oggetto
 * della classe spacificata
 */

public class Singleton {
	// definisco una variabile statica del tipo della classe stessa
	// che deve essere di tipo privato
	private static Singleton istanza;
	
	/*
	 * dichiaro il costruttore di tipo privato
	 * in questo modo non si possa fare new Singleton
	 * nell' esecutore che contiene il main
	 * Il costruttore non ha parametri
	 */
	private Singleton() {
		
	}
	
	/*
	 * definisco un metodo statico che ritorna un 
	 * oggetto del tipo della classe
	 */
	public static Singleton getIstance() {
		
		/*
		 * crea l'oggetto della classe se non
		 * è ancora stato creato
		 */
		if(istanza==null) {
			istanza=new Singleton();
		}
		return istanza;
	}
	
	public void showMessage() {
		System.out.println("Hello world");
	}
	

}
