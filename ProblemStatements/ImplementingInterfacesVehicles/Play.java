package ImplementingInterfacesVehicles;

public class Play {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.start();
		c.accelerate();
		c.brake();
		
		System.out.println();
		
		Motorcycle m =new Motorcycle();
		m.start();
		m.accelerate();
		m.brake();

	}

}
