package week1.homeassignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int n=27;
		int pc=0;
		for (int a=2; a<n; a++)
		{
			if (n%a==0)
			{
				pc++;
			}
		}
			if (pc==0)
			{
				System.out.println("The number is prime");
			}
			else
				System.out.println("The number is not prime");
		

	}

}
