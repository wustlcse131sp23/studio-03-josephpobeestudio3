package studio3;

import java.util.Scanner;

public class FrequencyTable {

	public static void main(String[] args) 
	{


		Scanner scan = new Scanner(System.in);

		System.out.println("How many values do you want?");
		int amount = scan.nextInt();


		System.out.println("What is the max value a number can be?");
		int max = scan.nextInt();


		int array[] = new int[max];

		for (int i =0; i < amount; i++)
		{
			int rand = (int)(Math.random()* max) + 1;
			array[rand-1]++;

		}

		for(int j= 0; j < max; j++)
			
		{
			System.out.println(j+1 + ": " +  array[j]);

		}











	}

}
