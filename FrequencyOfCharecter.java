package Java_Prac;

import java.util.Scanner;

public class FrequencyOfCharecter {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a String  : ");
     String str = sc.nextLine();
     
     System.out.println("Enter a charector : ");
     char ch = sc.next().charAt(0);
     
     int Freq=0;
     
     for(int i=0;i < str.length();i++)
     {
    	 if(str.charAt(i)==ch)
    	 {
    		 Freq++;
    	 }
     }
System.out.println("The frequency of "+ch+" in "+str+" is "+Freq);
	}

}
