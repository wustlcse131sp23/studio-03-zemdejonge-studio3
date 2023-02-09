package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Number?");
		int n = in.nextInt();
		boolean [] values = new boolean [n + 1];
		for (int  i = 2; i <= n; i ++)
		{
			for (int j = i + i; j <= n; j = j + i)
			{
				values[j] = true;
			}
		}
		for (int i = 1; i <= n; i++)
		{
			if (values [i] == false)
			{
				System.out.println(i);
			}
		}
		
	}

}
