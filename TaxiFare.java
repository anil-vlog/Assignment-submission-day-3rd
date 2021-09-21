import java.util.Scanner;
public class TaxiFare
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int distance, amount=0;
		System.out.print( "Enter Distance : ");
		distance=sc.nextInt();
		if(distance<=5)
		amount=50;
		else if(distance>5 && distance<=10)
		amount=(distance-5)*20+50;
		else if(distance>10)
		amount=(distance-10)*15+150;
		System.out.println("Distance Covered : "+distance);
		System.out.	println("Total fare Amount : "+amount);
	}
}