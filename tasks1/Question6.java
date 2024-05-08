package tasks1;

public class Question6 {

	public static void main(String[] args) {
		
		
		int rows=5;
		int cols =5;
		
		
		for(int i=1; i<=rows; i++)
	    {
	        for(int j=cols; j>cols-i; j--)
	        {
	            System.out.print(j);
	        }

	        for(int j=1; j<=cols-i; j++)
	        {
	            System.out.print(rows - i + 1);
	        }

	        System.out.println();
	    }

	}

}
