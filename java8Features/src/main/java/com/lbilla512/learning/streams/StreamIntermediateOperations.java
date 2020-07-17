package main.java.com.lbilla512.learning.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Date;
import java.util.Optional;
import java.util.function.Predicate;

import java.util.stream.Stream;

import main.java.com.lbilla512.learning.Employee;

public class StreamIntermediateOperations {

	private static final String List = null;

	public static void main(String[] args) {
		// filter, map, mapToInt, mapToLong, mapToDouble, flatMap, 
		Employee employee1 = new Employee("Lakshmi", 1, new Date());
		Employee employee2 = new Employee("Deepala", 2, new Date());
		Employee employee3 = new Employee("Billa", 0, new Date());

		java.util.List<Employee> employeeList = new ArrayList();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		Stream<Employee> stream = employeeList.stream();
		// Intermediate filter(Predicate) : returns Stream
		System.out.println(stream.filter(t -> t.getId() == 1).count()); // 1
		stream.close();

		stream = employeeList.stream();
		// Intermediate map(Function) : returns the new stream
		System.out.println(
				stream.map(t -> new Employee(t.getName(), t.getId() + 2, t.getDob())).collect(Collectors.toList()));
		stream.close();


	}

}
