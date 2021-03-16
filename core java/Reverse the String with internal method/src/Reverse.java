public class Reverse {
	public static void main(String args []) {
	String name = "helloworld";
	char reverse[];
	int j;
	j=name.length();
	j--;
	reverse = name.toCharArray();
	for( int i=j;i>=0;--i) {
		System.out.println(reverse[i]);
	    }
	}
	
}
