
public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void evenArrayEditor(int [][] wow2d)
	{
		for(int row =0; row<wow2d.length; row++)
		{
			for(int col = 0; col<wow2d[0].length;col++)
			{
				if(wow2d[row][col]%2==0)
					{
						wow2d[row][col]=0;
					}
			}
			
		}
		
	}

}
