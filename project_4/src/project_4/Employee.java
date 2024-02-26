package project_4;

class Employee {
	private int empId;
	private String empName;
	private Date date_of_joining;
	
	public Employee(int empId, String empName, Date date_of_joining) {
		this.empId = empId;
		this.empName = empName;
		this.date_of_joining = date_of_joining;
	}
	
	public String toString() {
		return "Employee [empId=" + empId + "," +" empName=" +empName + ", date_of_joining " + date_of_joining;
		
	}
	
	public static void main(String[] args) {
		Date d = new Date(12,12,2002);
		Employee e = new Employee(111,"Vishal",d);
		System.out.println(e);
	}

}
