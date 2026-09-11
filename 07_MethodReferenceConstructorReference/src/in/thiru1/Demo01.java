package in.thiru1;

//✅ Example 1: No-arg constructor

interface Messageable {
	Message getMessage();
}

class Message {
	public Message() {
		System.out.println("Hello from constructor reference!");
	}
}

public class Demo01 {

	public static void main(String[] args) {
		Messageable m = Message::new; // Constructor reference
		m.getMessage();
	}

}
