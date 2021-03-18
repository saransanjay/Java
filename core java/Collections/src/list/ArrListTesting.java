package list;
import java.util.*;

public class ArrListTesting {
	public static void main(String[] args) 
    { 
		ArrayList<String> arrlist = new ArrayList<String>(); 
        	arrlist.add("Saran");
            arrlist.add("Saran");
            arrlist.add("Sanjay");
            System.out.println(arrlist); 
            arrlist.remove(2); 
            System.out.println(arrlist);
            arrlist.remove(1);
            System.out.println(arrlist);
            arrlist.remove(0);
            System.out.println(arrlist);
            arrlist.add("Saran");
            arrlist.add("Saran");
            arrlist.add("Sanjay");
            System.out.println(arrlist); 
        	arrlist.remove("Saran");   
        	System.out.println(arrlist); 
        	arrlist.remove("Saran"); 
        	System.out.println(arrlist);
        	arrlist.remove("Sanjay");
        	System.out.println(arrlist);
    } 
} 

