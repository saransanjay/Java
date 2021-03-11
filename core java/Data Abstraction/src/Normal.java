public class Normal extends DataAbstraction {

	@Override
	void example2() {
		System.out.println("now completed");
	}
	public static void main(String args[]) {
		Normal n1=new Normal();
		n1.example1();
		n1.example2();
	}
 
}
