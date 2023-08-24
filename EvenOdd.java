package Java_Prac;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num - ");
		Long a = sc.nextLong();
		if(a%2==0)
		{
			System.out.println("Given num is Even");
		}
		else
		{
			System.out.println("Given num is Odd");
		}

	}

}
