package question4;

public class Employee extends Person {

	protected int employeeID;
	protected double salary;
	
	public Employee(String name,int age,int employeeID,double salary) {
		super(name, age);
		this.employeeID=employeeID;
		this.salary=salary;
	}
}