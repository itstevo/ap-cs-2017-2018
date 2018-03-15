
public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] wow2d = new int[8][8];
		for(int row =0; row<wow2d.length; row++)
		{
			for(int col = 0; col<wow2d[0].length;col++)
			{
				if(col%2==0&&row%2==0)
				{
					wow2d[row][col]=1;
					
				}
				else if(row%2==1&&col%2==0)
				{
					wow2d[row][col]=0;
				}
				else if(row%2==1&&col%2==1)
				{
					wow2d[row][col]=1;
				}
			System.out.print(wow2d[row][col]+ "\t");
			}
			System.out.println();
	}

}
}
