package map;
import java.util.*;

public class TreeMapTesting {
	public static void main(String args[]) {
		TreeMap<Integer,String> trmap =new TreeMap<Integer,String>();
		trmap.put(1, "test");
		trmap.put(1, "Saran");
		trmap.put(2, "Saran");
		trmap.put(3, "Sanjay");
		System.out.println(trmap);
		trmap.remove(1);
		System.out.println(trmap);
		trmap.remove(2);
		System.out.println(trmap);
		trmap.remove(3);
		System.out.println(trmap);
		
	}

}
