package set;
import java.util.*;

public class HashSetTesting {
	public static void main(String args[]) {
		HashSet<String> hashset =new HashSet<String>();
		hashset.add("Saran");
		hashset.add("Saran");
		hashset.add("Sanjay");
		//hashset.remove(0);
		System.out.println(hashset); 
	    hashset.remove("Saran"); 
	    System.out.println(hashset);
	    hashset.remove("Sanjay");
	    System.out.println(hashset);
	}

}
