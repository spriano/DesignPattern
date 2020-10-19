package Decorator;

public class FiguraRossa extends FiguraDecorator {

	// il costruttore richiede un oggetto di tipo Figura
	// questo è l'oggetto da decorare
	public FiguraRossa(Figura figura) {
		super(figura);
	}

	@Override
	// aggiunge la funzionalità BordoRosso all'oggetto da decorare
	public void operazione() {
		figura.operazione();
		setBordoRosso();
	}
	
	private void setBordoRosso() {
		System.out.println("Bordo di colore rosso");
		
	}

}
