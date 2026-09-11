package in.thiru;

@FunctionalInterface
interface Sayable {
	void say();
}

public class Demo {

	public static void greet() {
		System.out.println("Hello from static method!");
	}

	public static void main(String[] args) {

		Sayable d1 = Demo::greet;
		d1.say();

	}

}
