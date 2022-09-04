package week1.day1;

public class Fibonacci {
	public static void main(String[] args) {
		int firstNum=0,secNum=1,sum=0;
		System.out.println(firstNum);
	
		for(int i=1;i<11;i++)
		{
			
			firstNum=secNum;
			secNum=sum;
			sum=firstNum+secNum;
			System.out.println(sum);
			
		}
		
	}

}
