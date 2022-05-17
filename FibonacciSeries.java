package week1.day1;

public class FibonacciSeries 
{
	//To print the FibonacciSerier 
	//0,1,1,2,3,5,8,13,21,34
	
	public static void main(String[] args)
	{
		int num1 = 0;
		int num2 = 1;
		int num3;
		int Flag = 0;
		
		if(Flag == 0)
		{
			System.out.print("FibonacciSeries is : ");
			Flag = 1;
		}
		System.out.print(num1);
		System.out.print(num2);
		
		//Up to 8 Iterations
		for(int i=1; i<=8; i++)
		{
			//Every time num3 gets a new number
			num3 = num1 + num2;
			System.out.print(num3);
			
			//Swap the numbers:
			num1 = num2;
			num2 = num3;
		}
	}
}
