package week1.homeassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		System.out.println("Fibonacci series:"+"\n"+a);
		int b=a+1;
		System.out.println(b);
		for (int i=0; i<5;i++)
		{
			int x=a+b;
			a=b;
			b=x;
			System.out.println(x);
		}

	}

}
