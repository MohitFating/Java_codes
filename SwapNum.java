package Java_Prac;
import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number - ");
int a = sc.nextInt();
System.out.println("Enter Second Number - ");
int b = sc.nextInt();
int c = a;
a=b;
b=c;
System.out.println("Given Two Swap Num is - first num = "+a+"; Second num - "+b);

	}

}
