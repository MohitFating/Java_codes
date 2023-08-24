package Java_Prac;

import java.util.Scanner;

public class LargestNoAmg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number - ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number - ");
		int b = sc.nextInt();
		System.out.println("Enter Third Number - ");
		int c = sc.nextInt();
		if(a>b)
		{
	    if(a>c)
	    {
		System.out.println(a+" Number is greater Among Other Two Number");
	    }

		}
		
		else if(b>a)
		{
			if(b>c)
			{
				System.out.println(b+" Number is greater Among Other Two Number");
			}
			else
			{
				System.out.println(c+" Number is greater Among Other Two Numbers");
			}
		}
		
		
	}

}
