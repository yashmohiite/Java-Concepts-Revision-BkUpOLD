//22/12/22
public class Employee3 implements Comparable<Employee3>{
	private int empId2;
	private String empName2;
	private double empSal2;
	public Employee3(int empId2, String empName2, double empSal2) {
		super();
		this.empId2 = empId2;
		this.empName2 = empName2;
		this.empSal2 = empSal2;
	}
	public int getEmpId2() {
		return empId2;
	}
	public void setEmpId2(int empId2) {
		this.empId2 = empId2;
	}
	public String getEmpName2() {
		return empName2;
	}
	public void setEmpName2(String empName2) {
		this.empName2 = empName2;
	}
	public double getEmpSal2() {
		return empSal2;
	}
	public void setEmpSal2(double empSal2) {
		this.empSal2 = empSal2;
	}
	
	@Override
	public int compareTo(Employee3 o) {
		if(this.getEmpSal2()>o.getEmpSal2())
		{
			return 1;
		}
		else if(this.getEmpSal2()<o.getEmpSal2())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
