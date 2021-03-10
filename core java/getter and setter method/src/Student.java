public class Student {
	private String studentName;
	private int studentId;
	private int studentMark;
	
//	String getstName() {
//		return studentName;
//	}
//	int getstId() {
//		return studentId;
//	}
//	int getstMark() {
//		return studentMark;
//		}
	void setstName(String stName) {
		this.studentName=stName;
	}
	void setstId(int stId) {
		this.studentId=stId;
	}
	void setstMark(int stMark) {
		this.studentMark=stMark;
	}
	void print() {
		System.out.println(studentName);
		System.out.println(studentId);
		System.out.println(studentMark);
		
	}

}