package session_6;

public class B extends A{

	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of b is called");
	}
	public B(int d) {
		// TODO Auto-generated constructor stub
		super(10);
		System.out.println("Parameterised Constructor of b is called " + d);
	}
	

	public static void main(String[] args) {
		B b = new B(10);
		// TODO Auto-generated method stub

	}
}