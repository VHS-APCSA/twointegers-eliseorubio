import java.util.Scanner;
public class TIRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		int first = input.nextInt();
		System.out.println("Enter another number:");
		int second = input.nextInt();
		TwoIntegers twoInteger = new TwoIntegers(first, second);
		String arithmetic = twoInteger.arithmetic();
		System.out.println(arithmetic);
		String larger = twoInteger.Larger();
		System.out.println(larger);
		boolean even = twoInteger.isEven();
		System.out.println(even);
		boolean multiple = twoInteger.isMultiple();
		System.out.println(multiple);
	}
}