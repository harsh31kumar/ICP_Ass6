//  A regular polygon is an n-sided polygon in which all sides are of the same length and all angles 
//  have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for 
//  computing the area of a regular polygon is
//  Area = n*s^2/4*tan(pi/n)
//  Write a method that returns the area of a regular polygon using the following header:


import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of sides: ");
		int num=sc.nextInt();
		System.out.println("Input value of sides: ");
		int s=sc.nextInt();
		System.out.println("The area of the polygon is"+area(num,s));
	}
	public static double area(int n, int side)
	{
		double a=n*Math.pow(side, 2);
		double b=Math.tan(Math.PI)/n;
		double area=a/4*b;
		return area;
	} 
}
