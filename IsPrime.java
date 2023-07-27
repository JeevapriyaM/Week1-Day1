package week1.day1;

public class IsPrime {
	
	public static void main(String[] args) {
		
		int n=11;
		int count=0;   // to check the number of factors
		for (int i= 1 ; i<=n ;i++)
		{
			if (n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("its a prime number");
		}
		else
		{
			System.out.println("its not a prime number");
		}
	}

}
