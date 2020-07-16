package main.java.com.lbilla512.learning.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Stream;

import main.java.com.lbilla512.learning.Employee;

public class StreamLearing {

	private static final String List = null;

	public static void main(String[] args) {
		Employee employee1 = new Employee("Lakshmi", 1, new Date());
		Employee employee2 = new Employee("Deepala", 2, new Date());
		
		java.util.List<Employee> employeeList = new ArrayList();
		employeeList.add(employee1);
		employeeList.add(employee2);
		
		Stream<Employee> stream = employeeList.stream();
		
		//terminal Count  == 2
		System.out.println(stream.count());		
		
		
		
	}
	
}
