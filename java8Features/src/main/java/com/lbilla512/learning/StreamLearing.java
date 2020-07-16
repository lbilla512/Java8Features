package main.java.com.lbilla512.learning;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Stream;

public class StreamLearing {

	private static final String List = null;

	public static void main(String[] args) {
		Employee employee1 = new Employee("Lakshmi", 1234, new Date());
		
		java.util.List<Employee> employeeList = new ArrayList();
		employeeList.add(employee1);
		
		Stream<Employee> stream = employeeList.stream();
		
		//terminal Count  == 1
		System.out.println(stream.count());		
		
	}
	
}
