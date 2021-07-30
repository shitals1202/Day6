package Day6;

import java.util.Scanner;

public class Perfect_no {
	public static void main(String[] args){
		long number, s;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextLong();
		s=isPerfect(number);
		if(s==number)
			System.out.println(number+" This is perfect number");
		else
			System.out.println(number+"This is not perfect");
	}
	static long isPerfect(long num)
	{
		long sum = 0;
		for (int i =1;i<=num/2;i++)
		{
			if(num % i ==0)
			{
				sum =sum+i;
			}
		}
		return sum;
	}
}
