package Java;

public class AndOperator {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10;++i)
		{
			if (i>4&&i<9)
			{
				continue; // skip 5,6,7,8
			}
			System.out.println(i);
		}

	}

}
