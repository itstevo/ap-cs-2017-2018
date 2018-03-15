
public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static int sumArray(int [][] wow2d)
	{
		int sum = 0;
		for(int row =0; row<wow2d.length; row++)
		{
			for(int col = 0; col<wow2d[0].length;col++)
			{
				sum+=wow2d[row][col];
			}
			
		}
		return sum;
	}
		

}
