package singleton;

public class Main {

	public static void main(String[] args) {
		/*
		 * Non si può creqare un'istanza della classe Singleton
		 * perchè il costruttore è privato.
		 * si utilizzxa il metodo getIstance() della classe
		 */
		Singleton istanza=Singleton.getIstance();
		
		/*
		 * provo a creare una nuova istanza
		 * In questo caso ottengo il riferimento
		 * all'istanza creata in precedenza
		 * quindi è stato creato un unico oggetto
		 */
		Singleton istanza1=Singleton.getIstance();
		
		
		
		/*
		 * per vedere che i due riferimenti puntano allo stesso oggetto
		 * cioè l'unico oggetto creato
		 */
		
		System.out.println(istanza==istanza1);
		
		// deve stampare true
	}

}
