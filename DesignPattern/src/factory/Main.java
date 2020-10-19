package factory;

public class Main {

	public static void main(String[] args) {
		
		// creo un oggetto di tipo FiguraFactory
		FiguraFactory factory = new FiguraFactory();
		
		
		
		// utilizzo l'oggetto factory per creare, col metodo getFigura(),tre oggetti
		// che istanziano le tre classi che implementano Figura
		
		Figura figura1=factory.getFigura("CERCHIO");
		figura1.draw();
		
		Figura figura2=factory.getFigura("RETTANGOLO");
		figura2.draw();
		
		Figura figura3=factory.getFigura("Quadrato");
		figura3.draw();
	}
}
