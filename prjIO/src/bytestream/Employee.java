package bytestream;

public class Employee {
	private int no;
	private	String name;
	private String job;
	private int dept;
	private double point;
	
	public Employee(int no, String name, String job, int dept, double point) {
		this.no = no;
		this.name = name;
		this.job = job;
		this.dept = dept;
		this.point = point;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return no + " : " + name + " : " + job + " : " + dept + " : "
			+ point;
	}
}


