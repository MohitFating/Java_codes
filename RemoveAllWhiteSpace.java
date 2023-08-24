package Java_Prac;

import java.util.Scanner;

public class RemoveAllWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String - ");
		String str =sc.nextLine();
		System.out.println("Orignal String is : "+str);
		str=str.replaceAll("\\s", "");
		System.out.println("Modified String is - "+str);
	}

}
