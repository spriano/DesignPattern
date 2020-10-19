package Decorator;

public abstract class FiguraDecorator implements Figura{
	
	protected Figura figura;

	// prende come perametro un oggetto di tipo Figura
	public FiguraDecorator(Figura figura) {
		this.figura = figura;
	}

	@Override
	public abstract void operazione();

}
