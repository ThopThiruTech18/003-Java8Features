package in.thiru;

@FunctionalInterface
interface Printer {
    void print();
}


public class Demo2 {

	 public void display() {
	        System.out.println("Printing via instance method reference!");
	    }

	    public static void main(String[] args) {
	    	Demo2 obj = new Demo2();
	        Printer p = obj::display; // Method reference
	        p.print();
	    }

}
