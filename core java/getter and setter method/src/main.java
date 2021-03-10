public class main {
	public static void main(String args[]) {
		Student s1=new Student();
		s1.setstName("saran");
		s1.setstId(1001);
		s1.setstMark(89);
//		s1.getstName();
//		s1.getstId();
//		s1.getstMark();
		s1.print();
		s1.setstName("sanjay");
		s1.setstMark(100);
		s1.print();
		}
}
