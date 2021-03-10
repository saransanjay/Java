public class Student {
		private String studentName;
		private int studentId;
		private int studentMark;
		
		Student(String stName, int stId ,int stMark){
			this.studentName=stName;
			this.studentId=stId;
			this.studentMark=stMark;
		}
		public static void main(String args[]) {
			Student s1=new Student("saran",1001,89);
			System.out.println(s1.studentName);
			System.out.println(s1.studentId);
			System.out.println(s1.studentMark);
			
		}


}
