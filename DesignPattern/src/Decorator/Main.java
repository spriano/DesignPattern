package Decorator;

public class Main {

	public static void main(String[] args) {
		// si crea un cerchio non decorato
		Figura cerchio= new Cerchio();
		
		
		// si crea un cercho da decorare
		// avvolgo l'oggetto col decoratore
		Figura cechioRosso= new FiguraRossa(new Cerchio());
		
		// si crea un Rettangolo da decorare
		Figura rettangoloRosso= new FiguraRossa(new Rettangolo());
		
		System.out.println("-----------------");
		System.out.println("cerchio con bordo normale");
		cerchio.operazione();
		System.out.println("-----------------");
		System.out.println("cerchio con bordo rosso");
		cechioRosso.operazione();
		System.out.println("-----------------");
		System.out.println(("rettangolo con bordo rosso"));
		rettangoloRosso.operazione();
	}

}
