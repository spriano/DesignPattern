package factory;

public class FiguraFactory {
	
	/**
	 * Questo metodo crea un oggetto della classe che implementa figura
	 * @param figuraType indica il tipo di classe da creare
	 * @return il riferimento all'oggetto creato, specificato dal parametro.
	 */

	public Figura getFigura(String figuraType) {

		if (figuraType == null) {
			return null;
		}

		if (figuraType.equalsIgnoreCase("CERCHIO")) {
			return new Cerchio();
		}

		if (figuraType.equalsIgnoreCase("RETTANGOLO")) {
			return new Rettangolo();
		}

		if (figuraType.equalsIgnoreCase("QUADRATO")) {
			return new Quadrato();
		}

		return null;

	}

}
