import java.util.Scanner;
public class ScannerTesting {
		public static void main(String[] args) 
		{ 
			Scanner sc = new Scanner(System.in); 
			
			String firstName = sc.next(); 
			String  lastName =sc.next(); 
			String fullName =sc.nextLine();
			
			int age = sc.nextInt(); 
			long mobileNo = sc.nextLong(); 
			double cgpa = sc.nextDouble(); 
			System.out.println("FirstName: "+firstName); 
			System.out.println("LastName: "+lastName); 
			System.out.println("FullName:"+fullName);
			System.out.println("Age: "+age); 
			System.out.println("Mobile Number: "+mobileNo); 
			System.out.println("CGPA: "+cgpa); 
			sc.close();
		} 
		
}

