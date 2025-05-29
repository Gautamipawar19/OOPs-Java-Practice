class Emp
{
	private int empMobile;
	private String empDept;
	Emp(int empMobile, String empDept)
	{
		this.empMobile = empMobile;
		this.empDept = empDept;
	}
	public int getEmpMobile()
	{
		return empMobile;
	}
	public String getEmpDept()
	{
		return empDept;
	}
	public void setEmpMobile(int empMobile)
	{
		this.empMobile = empMobile;
	}
	public void setEmpDept(String empDept)
	{
		this.empDept = empDept;		
	}
}
class Example2
{
	public static void main(String args[])
	{
		Emp e1 = new Emp(12345, "SAP");
		int empMobile = e1.getEmpMobile();
		String empDept = e1.getEmpDept();
		System.out.println("Emp1 number is "+empMobile+ "Belongs to Department " +empDept);
		e1.setEmpMobile(67890);
		e1.setEmpDept("Salesforce");
		empMobile = e1.getEmpMobile();
		empDept = e1.getEmpDept();															
		System.out.println("Emp1 number is "+empMobile+ "Belongs to Department " +empDept);  
	}
}