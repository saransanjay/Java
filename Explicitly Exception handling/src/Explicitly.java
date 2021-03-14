public class Explicitly {
	public static void main(String args[]){
		 try {
			 int a=1;
			 int b=0;
			 int c;
			 c=b/a;
			 System.out.println(c);
			 if(c==0) {
			 throw new ArithmeticException("c=0"); 
			  }
		 }
		 catch(ArithmeticException obj){
			 System.out.println(obj);
		 }
		 finally{
			 System.out.println("Thank you");
		 }
		 
	 }

}
