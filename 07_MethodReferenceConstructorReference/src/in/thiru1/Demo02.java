package in.thiru1;

interface PersonFactory {
	Person create(String name);
}

class Person {
	Person(String name) {
		System.out.println("Created person: " + name);
	}
}

public class Demo02 {

	public static void main(String[] args) {
		PersonFactory pf = Person::new; // Constructor reference
		pf.create("Thiru");
	}

}
