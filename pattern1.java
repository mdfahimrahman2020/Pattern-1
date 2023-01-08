import java.util.Scanner;
public class pattern1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int n;

		System.out.print("\n\n\n\"Please enter the line numbers : \"");
		n = input.nextInt();
		System.out.println("\n\nThe pattern is : ");

		for(int r = 1; r <= n; r++)
		{
			for(int c = 1; c <=r ; c++)
			{
				System.out.print(" "+c);
			}

		 System.out.println();
		}


	}
}