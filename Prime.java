package week1.day1;

public class Prime {
	public static void main(String[] args) {
		int n=57,f=0;
		
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				f=1;
			}
		}		
		if(f==1)
			{
			System.out.println("It is not a Prime number");
			}		
		else
		{
			System.out.println("It is a Prime number");
		}
				
}
}

