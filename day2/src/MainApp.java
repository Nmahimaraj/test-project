/**
 * 
 * @author mypc
 *
 */
public class MainApp {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.empNo = 10;
		employee.empName = "Frist";
		employee.salary  = 50000f;
		employee.age = 21;
		
		System.out.println("Employee number : " + employee.empNo);
		System.out.println("Employee name : " + employee.empName);
		System.out.println("Employee salary : " + employee.salary);
		
		Employee employee2 = new Employee();
		employee2.empNo = 20;
		employee2.empName = "Second";
		employee2.salary  = 23000f;
		employee2.age = 70;
		
		System.out.println("Employee2 number : " + employee.empNo);
		System.out.println("Employee2 name : " + employee.empName);
		System.out.println("Employee2 salary : " + employee.salary);
		Validation validation = new Validation();
		Validation.salaryDifference(employee.salary,employee2.salary);
		


	}

	}


