package Java_Prac;

import java.util.Scanner;

public class Quotient_Remainder {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dividend No : ");
		int a = sc.nextInt();
		System.out.println("Enter Divisor No : ");
		int b = sc.nextInt();
		int Quotient=a/b;
		int Remainder=a%b;
		System.out.println
		(a+" / "+b+" = Quotient is : "+ Quotient + "\n" + a+" % "+b+" = Remainder is : " +Remainder);
		

	}

}
