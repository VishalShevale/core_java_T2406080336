package project_4;

public class Date {
	private int dd,mm,yy;
	
		
	
	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String toString()
	{
		return "Date [dd=" + dd + ", mm = " + mm + ", yy = " + yy + "]";
		
	}
	public static void main(String[] args) {
		final Date newdate = new Date(12,12,2002);
		System.out.println(newdate);
	}
}
