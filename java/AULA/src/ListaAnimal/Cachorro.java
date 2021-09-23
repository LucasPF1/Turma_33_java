package ListaAnimal;

public class Cachorro extends Animal {
	public Cachorro(String name, int age) {
		super(name, age);
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("Auu..Auuuu... ");
	}

}
