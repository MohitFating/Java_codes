package Java_Prac;

import java.util.*;

public class QuadraticEqu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Coefficient of the Quadratic Equation : ");
       System.out.println("a = ");
       double a = sc.nextDouble();
       System.out.println("b = ");
       double b = sc.nextDouble();
       System.out.println("c = ");
       double c = sc.nextDouble();
       sc.close();
       
       // calculate discreaminant
       double d = Math.pow(b, 2)-4*a*c;
       
       // check value of discreminant and finds roots
       
       if(d>0)
       {
    	   double x1 = (-b + Math.sqrt(d))/(2*a);
    	   double x2 = (-b - Math.sqrt(d))/(2*a);
    	   
    	   System.out.println("The roots are "+x1+" and "+x2);
       }else if(d==0)
       {
    	   double x=-b/(2*a);
    	   System.out.println("The root is "+x);
       }else
       {
    	   double real = -b/(2*a);
    	   double imag = Math.sqrt(-d)/(2*a);
    	   System.out.println("The roots are "+real+" + "+imag+" i and "+real+" - "+imag+" i ");
       }
	}

}
