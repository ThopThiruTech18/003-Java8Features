package in.thiru1;

import java.util.function.Function;

class Employee {
	Employee(String name) {
		System.out.println("Employee created: " + name);
	}
}

public class Demo04 {

	public static void main(String[] args) {
		Function<String, Employee> emp = Employee::new; // Constructor reference
		emp.apply("Thiru");
	}

}
