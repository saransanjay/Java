
public class SystemLenovo {
	String SystemName = "saran";
	int SystemID =100;
	void typing() 
	{
		System.out.println("Typing");
		System.out.println(SystemName);
		System.out.println(SystemID);
	}
	public static void main(String args[]) {
		SystemLenovo s1= new SystemLenovo();
		s1.typing();
	}
}
