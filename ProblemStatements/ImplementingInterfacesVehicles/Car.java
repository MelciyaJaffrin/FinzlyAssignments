package ImplementingInterfacesVehicles;

public class Car implements Vehicle{
	
	public void start() {
		System.out.println("Car Started");
	}
	
	public void accelerate() {
		System.out.println("Car accelerated");
	}
	
	public void brake() {
		System.out.println("Brake applied, car stopped!");
	}

}
