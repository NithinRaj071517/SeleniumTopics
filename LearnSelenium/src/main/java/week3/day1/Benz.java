package week3.day1;

public class Benz extends Car {
	public void sunRoof()
	{
		System.out.println("Sunroof from Benz");
	}
	
	public void applyBrake() {
		System.out.println("Aplly break in Benz");
	}
	
	public static void main(String[] args) {
		Benz be=new Benz();
		be.sunRoof();
		be.openDoor();
		be.applyBrake();
		be.soundHorn();
		Vehicle ve=new Vehicle();
		ve.applyBrake();
	}
	
}
