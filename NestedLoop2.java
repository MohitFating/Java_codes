package Java;

public class NestedLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outer loop is labeld as first
		first:
			for(int i=1;i<6;++i)
			{
				//inner loop
				for(int j = 1;j<5;++j)
				{
					if(i==3 || j==2)
						//skip the current iteration of outer loop 
						continue first;
					System.out.println("i= "+i+" j= "+j);
				}
			}

	}

}


//Note - the use of labeled continue is often discourage as it
//  makes your code hard to understand . if you are in a situation
//  where you have to use labeled continue, refactor your code and try
//  to solve it in a differennt way to make it more readable.