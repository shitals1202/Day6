package Day6;

import java.util.Scanner;

public class Reverse_number {
	public static void main(String[] args){
		int m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		m= isReverse(num);
		System.out.println("This is reverse number  "+m );
		
	}

	private static int isReverse(int num) {
		int reverse = 0;
		for(;num != 0;)   
		{  
		int remainder = num % 10;  
	  reverse = reverse * 10 + remainder;  
		num=num/10;  
		}
			return reverse;
	}
}