//  Design a Simple Calculator using methods in java containing the following functionalitie 
//  namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root.


import java.util.Scanner;
public class Q1 {
	
	public static int additionSimple(int x, int y) 
	{
		return x+y;
	}
	public static int subtractionSimple(int x, int y) 
	{
		return y-x;
	}
	public static int multiplicationSimple(int x, int y) 
	{
		 return x*y;
	}
	public static int divisionSimple(int x, int y) 
	{
		if(x!=0)
			return y/x;
		return (0);
	}
	public static int remainderSimple(int n, int m) 
	{
		return n%m;
	}
	public static double squareRootSimple(int n) 
	{
		return (double)Math.sqrt(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in );
		System.out.println("Input x and y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		while(true) {
			System.out.println("Enter your option(0-->Quit  ;1-->Add ;2-->Subtract ;3-->Multiply ;4-->Divide ;5-->Mod ;6-->SqRoot)");
			int h=sc.nextInt();
			switch(h)
			{
			case 0: return;
			case 1: System.out.println("Result= " +additionSimple(x,y));
			break;
			case 2: System.out.println("Result= " +subtractionSimple(x,y));
			break;
			case 3: System.out.println("Result= " +multiplicationSimple(x,y));
			break;
			case 4: System.out.println("Result= " +divisionSimple(x,y));
			break;
			case 5: System.out.println("Result= " +remainderSimple(x,y));
			break;
			case 6: System.out.println("Result= " +squareRootSimple(x));
			break;
			default: System.out.println("Invalid operation");
			
			}
		}

   }
}