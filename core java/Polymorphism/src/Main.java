public class Main extends Polymorphism {
	void overriding() {
		System.out.println("overriding");
		}
	public static void main(String args[]) {
		Main s1 = new Main();
		s1.overloading(1);
		s1.overloading("a");
		s1.overriding();
		}
}
