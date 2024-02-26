package session_6;

class Factorial {
	public int fact(int no) {
		int fact = 1;
		for(int i =1; i<= no;i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		

	}

}
