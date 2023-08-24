package Java_Prac;

import java.util.Scanner;

public class VowelsOrConso {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Char - ");
		char a = sc.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		{
			System.out.println("Given Char is Vowels ");
		}
		else
		{
			System.out.println("Given Char is Consonant ");
		}

	}

}

