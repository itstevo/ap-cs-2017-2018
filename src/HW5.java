
public class HW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int numberFinder(int [][] wow2d,int wow)
	{
		int counter = 0;
		for(int row =0; row<wow2d.length; row++)
		{
			for(int col = 0; col<wow2d[0].length;col++)
			{
				if(wow2d[row][col]==wow)
					{
						counter++;
					}
				
			}
			
		}
		return counter;
		
	}

}
