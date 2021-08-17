import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int a;
	public String toString(){
		return String.valueOf(a);
	}
}
class Sort implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		return a.a - b.a;
	}
	
}
public class Main{
	public static void main(String args[]){
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		s1.a=6;
		s2.a=7;
		s3.a=3;
		s4.a=1;
		s5.a=8;
		ArrayList<Student> array = new ArrayList<Student>();
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		
		Collections.sort(array,new Sort());
		for(int i = 0 ; i<array.size();i++) {
			System.out.println(array.get(i));
		}
	}
}