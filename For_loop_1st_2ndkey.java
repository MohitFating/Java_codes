package Java;

public class For_loop_1st_2ndkey {

	public static void main(String[] args) {
		
		// In this code, you have two nested loops labeled as "first" and "second". 
		
       first: 
    	   
    	   for(int i =1;i<5;i++)
    	   {
    		   second:
    			   for(int j=1;j<3;j++)
    			   {
    				   System.out.println("i = "+ i +" ; j = "+ j);
    			   }
    		   if (i==2)
    			   break first;
    	   }
	}

}
  