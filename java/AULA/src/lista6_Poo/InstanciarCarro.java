package lista6_Poo;

public class InstanciarCarro {
public static void main(String[] args) {
		
		
		Carro carro1 = new Carro();
		carro1.name = "Camaro";
		carro1.year = 2021;
		carro1.brand = "Chevrolet";
		
		
		Carro carro2 = new Carro();
		carro2.name = "X1";
		carro2.year = 2021;
		carro2.brand = "BMW";
		carro2.speed = 0.0;
		
		carro2.turnOn();
		carro2.accelerate();
		System.out.println("Velocidade = " + carro2.speed + " km/h ");
		carro2.turnOff();

	}

}

