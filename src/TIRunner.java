import java.util.Scanner;
public class TIRunner 
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int numone = input.nextInt();
		System.out.print("Enter a second number: ");
		int numtwo = input.nextInt();
		
		TwoIntegers twointegers = new TwoIntegers(numone, numtwo);
		int num1 = twointegers.getNum1();
		int num2 = twointegers.getNum2();
		String arithmetic = twointegers.arithmetic();
		System.out.println(arithmetic);
		System.out.println("The largest number is " + twointegers.larger());
		System.out.println(num1 + "+" + num2 + " is even: " + twointegers.isEven());
		System.out.println("Number 1 is a multiple of Number 2:" + twointegers.isDivisible());
		
	}
}
