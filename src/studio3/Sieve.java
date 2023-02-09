package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub




		Scanner scan = new Scanner(System.in);
		System.out.println("What number are you inputting?");
		int n = scan.nextInt();

		boolean[] ArrayIsPrime = new boolean[n+1];
		
		
		
		for(int i=0; i <n+1; i++)
		{
			ArrayIsPrime[i] = true;
		}
		
		
		
		for (int i=2; i <n+1; i++)
		{

			if( ArrayIsPrime[i] == true)
			{
				for (int j = (i*2); j<n+1; j+=i )
				{
					ArrayIsPrime[j] = false;
				}
			}


		}
		for(int i =0; i < n+1; i++) 
		{
			System.out.println("Is " + i + " prime?: "  + ArrayIsPrime[i]);
		}





	}

}
