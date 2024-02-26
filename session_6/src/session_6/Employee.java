package session_6;

class Employee {
	private int empId;
	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Empolyee = " + empId + " " + empName;
		
	}
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if ((this.empId == e.empId) && (this.empName == e.empName)) {
			return true;
			
		}
		else
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(111,"Vishal");
		Employee e2 = new Employee(111,"Vishal");
		/*
		if (e1.equals(e2)) {
			System.out.println("Are Equal");
		}
		else {
			System.out.println("Are Not Equal ");
			
		}
		*/
		if (e1.equals(e2)) {
			System.out.println("Objects Are Equal");
		}
		else {
			System.out.println("Objects Are Not Equal ");
			
		}
		

	}

}
