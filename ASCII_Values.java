package Java_Prac;

import java.util.Scanner;

public class ASCII_Values {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Single Charecter - ");
		char ch = sc.next().charAt(0);
		int asciivalue =(int)ch;
		System.out.println("ASCII Value of "+ch+"is "+asciivalue);
        sc.close();
	}
}
