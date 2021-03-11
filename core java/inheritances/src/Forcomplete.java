public class Forcomplete extends Abstraction {

	@Override
	void example1() {
		System.out.println("Abstraction class");
		
	}

	@Override
	public void example3() {
		System.out.println("Encapsulation class");
		
	}

	@Override
	public void example4() {
		System.out.println("Encapsulation class");
		
	}
public static void main(String args[]) {
	Forcomplete s1=new Forcomplete();
	s1.example1();
	s1.example2();
	s1.example3();
	s1.example4();
}
}
