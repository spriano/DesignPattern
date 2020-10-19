package Decorator;

//questa classe è il concrete component
// che rappresenta la figura che verrà  decorata
public class Rettangolo implements Figura{

	@Override
	public void operazione() {
		System.out.println("sono un rettangolo");
		
	}

}
