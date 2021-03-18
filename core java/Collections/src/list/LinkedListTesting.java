package list;
import java.util.*;

public class LinkedListTesting {
 public static void main(String args[]) 
 {
	 LinkedList<String> linklist = new LinkedList<String>();
	 linklist.add("Saran");
     linklist.add("Saran");
     linklist.add("Sanjay");
     System.out.println(linklist); 
     linklist.remove(2); 
     System.out.println(linklist);
     linklist.remove(1);
     System.out.println(linklist);
     linklist.remove(0);
     System.out.println(linklist);
     linklist.add("Saran");
     linklist.add("Saran");
     linklist.add("Sanjay");
     System.out.println(linklist); 
 	linklist.remove("Saran");   
 	System.out.println(linklist); 
 	linklist.remove("Saran"); 
 	System.out.println(linklist);
 	linklist.remove("Sanjay");
 	System.out.println(linklist);
}
}
