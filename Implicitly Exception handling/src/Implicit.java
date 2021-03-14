public class Implicit {
 public static void main(String args[]){
	 try {
		 int a=1;
		 int b=0;
		 int c;
		 c=b/a;
		 System.out.println(c);
		 c=a/b;
		 System.out.println(c);
		  }
	 catch(ArithmeticException obj){
		 System.out.println(obj);
	 }
	 finally{
		 System.out.println("Thank you");
	 }
	 
 }
 
}
