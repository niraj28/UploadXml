package scs;

import java.util.ArrayList;
import java.util.List;

public class ProblemOne {
	
	public static void main(String args[]) {
		
//		List<String> list = list();
		List<Employee> listEmp = list();
		List<Employee> empList = list(new Employee());
		List<Employee> empList1 = list(new Employee(), new Employee() );
		List<String> stringList = list("abc");
		List<String> stringList1 = list("123", "2324" );
		
	}

	private static List<Employee> list(Object employee) {
		// TODO Auto-generated method stub
		List<Employee> listEmp= new ArrayList<Employee>();

		return listEmp;
	}

	private static List<Employee> list() {
		// TODO Auto-generated method stub
		List<Employee> listEmp= new ArrayList<Employee>();
//		List<Object> listEmp= new ArrayList<>();
		
		
		return listEmp;
	}
	
	private static List<Employee> list(Employee employee,Employee ep ) {
		// TODO Auto-generated method stub
		List<Employee> listEmp= new ArrayList<Employee>();

		return listEmp;
	}
	private static List<String> list(String employee,String ep ) {
		// TODO Auto-generated method stub
		List<String> listEmp= new ArrayList<String>();

		return listEmp;
	}
	
	private static List<String> list(String employee ) {
		// TODO Auto-generated method stub
		List<String> listEmp= new ArrayList<String>();

		return listEmp;
	}
	
	

}
