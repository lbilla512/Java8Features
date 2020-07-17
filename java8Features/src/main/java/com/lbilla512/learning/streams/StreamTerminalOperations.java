package main.java.com.lbilla512.learning.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Stream;

import main.java.com.lbilla512.learning.Employee;

public class StreamTerminalOperations {

	private static final String List = null;

	public static void main(String[] args) {
		Employee employee1 = new Employee("Lakshmi", 1, new Date());
		Employee employee2 = new Employee("Deepala", 2, new Date());
		Employee employee3 = new Employee("Billa", 0, new Date());

		java.util.List<Employee> employeeList = new ArrayList();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		Stream<Employee> stream = employeeList.stream();
		// terminal Count : returns long
		System.out.println(stream.count()); // 3
		stream.close();

		stream = employeeList.stream();
		// terminal anyMatch(Predicate) : returns boolean
		System.out.println(stream.anyMatch(t -> t.getId() == 1)); // true
		stream.close();

		stream = employeeList.stream();
		// terminal allMatch(Predicate) : returns boolean
		System.out.println(stream.allMatch(t -> t.getId() == 1)); // false
		stream.close();

		stream = employeeList.stream();
		// terminal noneMatch(Predicate) : returns boolean
		System.out.println(stream.noneMatch(t -> t.getId() == 0)); // false
		stream.close();

		stream = employeeList.stream();
		// terminal findFirst() : returns Optional<T>
		System.out.println(stream.findFirst().get().getName()); // Lakshmi
		stream.close();

		stream = employeeList.stream();
		// terminal findAny() : returns Optional<T> : nondeterministic
		System.out.println(stream.findAny().get().getName()); // Lakshmi/Deepala
		stream.close();
		/**
		 * stream = employeeList.stream(); // terminal min(Comparator): returns
		 * Optional<T> System.out.println(stream.min((t1, t2) -> { if (t1.getId() >=
		 * t2.getId()) { return 1; } return 0; }).get().getName()); // Billa
		 * stream.close();
		 * 
		 * 
		 * stream = employeeList.stream(); // terminal max(Comparator): returns
		 * Optional<T> System.out.println(stream.max((t1, t2) -> { if (t1.getId() >=
		 * t2.getId()) return 0; return 1; }).get().getName()); // Lakshmi
		 * stream.close();
		 */

	}

}
