package session_6;


public class Car extends Vehicle{
	private String modelname = "TATA HARRIER";

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("Brand = " + c.brand);
		c.honk();
		System.out.println("ModelName = " + c.modelname);

	}

}
