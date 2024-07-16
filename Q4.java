//  Write a method that returns the number of days in a year using the following header:
//  public static int numberOfDaysInAYear(int year)
//  Write a java program that displays the number of days in year from 2000 to 2020.


import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2000;i<=2020;i++)
		{
				System.out.println("No of days in "+i+" is "+numberOfDaysInAYear(i)+" days");
		}
	}
	
	public static int numberOfDaysInAYear(int year)
	{
		int days;
		if(year%100==0 && year%400==0)
			days=366;
		else if (year%100!=0 && year%4==0)
			days=366;
		else
			days=365;
		return(days);

	}

}
