package Java_Prac;

public class StringEmptyOrNull {

	public static void main(String[] args) {
	
		String str = "Mohit";
		String str1= null;
		String str2="";
		System.out.println("Is str is empty or null? "+isEmptyOrNull(str));
		System.out.println("Is str is empty or null? "+isEmptyOrNull(str1));
		System.out.println("Is str is empty or null? "+isEmptyOrNull(str2));
		

	}
	public static boolean isEmptyOrNull(String str)
	{
		if(str == null || str.length()==0)
		{
		return true;	
		}else
		{
			return false;
		}
	}

}
