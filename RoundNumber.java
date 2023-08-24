package Java_Prac;

import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numer - ");
		double num = sc.nextDouble();
		System.out.println("Enter the number of decimal places - ");
		int place=sc.nextInt();
		if(place < 0) {
			System.out.println("Invalid input. the number of decimal place must be non-negative.");
			return;
		}
		BigDecimal bd = new BigDecimal(num);
		bd = bd.setScale(place,RoundingMode.HALF_UP);
		System.out.println("The number "+num+" Round to "+place+" decimal place is "+bd);
		

	}
	

}
