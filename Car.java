package week1.day1;

public class Car {

	public void applyAccelerate() {
		System.out.println("I can Start/Accelerate the Car");
	}
	
	public void applyGear() {
		System.out.println("I can Gear up the Car");
	}
	

	public void switchonAc() {
		System.out.println("I can Switch On the AC");
	}	
	
	public void applyBreak() {
		System.out.println("I can Stop/Break the Car");
	}
	
	public static void main(String[] args) {
		System.out.println("This is Assisgnment 2: Car");
		System.out.println("--------------------------");
		
		Car myCar = new Car();
		myCar.applyAccelerate();
		myCar.applyGear();
		myCar.switchonAc();
		myCar.applyBreak();
	}
}
