public class Student {
	private String studentName;
	private int studentId;
	private int studentMark;
	
	Student(){
		this.studentName="saran";
		this.studentId=1001;
		this.studentMark=89;
	}
	public static void main(String args[]) {
		Student s1=new Student();
		System.out.println(s1.studentName);
		System.out.println(s1.studentId);
		System.out.println(s1.studentMark);
		
	}

}
