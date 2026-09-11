package in.thiru1;

import java.util.function.Supplier;

class Student {
	Student() {
		System.out.println("Student object created");
	}
}

public class Demo03 {

	public static void main(String[] args) {
	    Supplier<Student> supplier = Student::new; // Constructor reference
        supplier.get();
	}

}
