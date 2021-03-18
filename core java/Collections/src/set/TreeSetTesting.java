package set;
import java.util.*;

public class TreeSetTesting {
	public static void main(String args[]) {
	TreeSet<String> trset = new TreeSet<String>();
	trset.add("Saran");
	trset.add("Saran");
	trset.add("Sanjay");
	//trset.remove(1);
	System.out.println(trset); 
    trset.remove("Saran"); 
    System.out.println(trset);
    trset.remove("Sanjay");
    System.out.println(trset);
}

}
