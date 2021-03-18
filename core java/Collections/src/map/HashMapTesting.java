package map;

import java.util.*;

public class HashMapTesting {
	public static void main(String args[]) {
		HashMap<Integer,String> hashmap =new HashMap<Integer,String>();
		hashmap.put(1, "test");
		hashmap.put(1, "Saran");
		hashmap.put(2, "Saran");
		hashmap.put(3, "Sanjay");
		System.out.println(hashmap);
		hashmap.remove(1);
		System.out.println(hashmap);
		hashmap.remove(2);
		System.out.println(hashmap);
		hashmap.remove(3);
		System.out.println(hashmap);
		
	}

}
