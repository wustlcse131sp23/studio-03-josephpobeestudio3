package studio3;

import java.util.Scanner;

public class SymmetricalImage {

	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);

		System.out.println("How many rows do you want?");
		int n = scan.nextInt();


		System.out.println("How many columns do you want?");
		int m = scan.nextInt();

		int array[][] = new int[n][m];


		for(int k=0; k < ((n*m)/4); k++)
		{
			int n1 =	(int)(Math.random() * n) ;
			int m1 = 	(int)(Math.random() * m) ;

			array[n1][m1] = 2;
			//System.out.println()
		}



		for(int k = 0; k < n; k++)
		{
			for (int j =0; j <m; j++)
			{
				if ( array[k][j] ==2)
				{
					System.out.print("*");
				}
				else if (array[k][m-j-1] == 2 ) 
				{
					System.out.print("*");

				}

				else
				{
					System.out.print(" ");

				}

			}
			System.out.println();		
		}



	}

}
