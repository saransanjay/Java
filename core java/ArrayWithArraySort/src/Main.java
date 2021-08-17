import java.util.Arrays;

public class Main {

	public static void main(String args[]) {
		int[] number = new int[5];
		number[0] = 5;
		number[1] = 4;
		number[2] = 3;
		number[3] = 2;
		number[4] = 1;
		Arrays.sort(number);
		for(int i = 0;i < number.length;i++)
		{
			System.out.println(number[i]);
		}
		}
}
