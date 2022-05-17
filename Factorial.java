package week1.day1;

public class Factorial 
{
	//Find the factorial of the given number
	//5 = 5*4*3*2*1 = 120
	
	public static void main(String[] args)
	{
		int Input = 5;
		int Fact = 1;
		
		for(int i=1; i<=Input; i++)
		{
			Fact = Fact * i;
		}
		System.out.println("Factorial of " + Input + " is : " + Fact);
	}
	
}
