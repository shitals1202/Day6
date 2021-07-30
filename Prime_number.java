package Day6;

import java.util.Scanner;

public class Prime_number
{
	public static void main(String[] args){
		int p;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		if(isPrime(n))
		{
			System.out.println("This is prime number");
		}
		else 
		{
			System.out.println("This number is not a prime number");
		}
		
	}

	private static boolean isPrime(int n) {
	
		 if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  

		}
			