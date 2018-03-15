
public class oddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[][] oddArrayMaker(int [][] wow2d)
	{
		int [][]newArray = null;
		for(int row =0; row<wow2d.length; row++)
		{
			for(int col = 0; col<wow2d[0].length;col++)
			{
				 newArray = new int[row/2][col];
				 if(row%2==1)
				 {
					 newArray[row-1][col]=wow2d[row][col];
				 }
				
			}
			
		}
		return newArray;
		
	}

}
