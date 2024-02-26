package project_4;

class Finalkeyword {
	private int dd,mm,yy;
		
	
	
	public Finalkeyword(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String toString()
	{
		return "Date [dd=" + dd + ", mm = " + mm + ", yy = " + yy + "]";
		
	}
	public static void main(String[] args) {
		Finalkeyword Final = new Finalkeyword(12,12,2002);
//		Final = new Date(12,12,3002);
		System.out.println(Final);
	}
}