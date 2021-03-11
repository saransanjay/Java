public class Main implements Encapsulation {

	@Override
	public void example1() {
		System.out.println("now completed");
	}

	@Override
	public void example2() {
		System.out.println("now completed");
		}
	public static void main(String args[]) {
		Main m1 = new Main();
		m1.example1();
		m1.example2();
	}
	
}
