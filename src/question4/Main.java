package question4;

public class Main {

	public static void main(String[] args) {
		
		Employee employee=new Employee("Balaji", 20, 54321, 35000);
		
		System.out.println("Name:"+employee.name);
		System.out.println("Age:"+employee.age);
		System.out.println("EmployeeID:"+employee.employeeID);
		System.out.println("Salary:"+employee.salary);
	}
}