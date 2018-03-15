
public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] wow2d = new int[10][10];
		int counter=0; 
		for(int row =0; row<wow2d.length; row++)
		{
			for(int col = 0; col<wow2d[0].length;col++)
			{
				wow2d[row][col]=counter;
				counter++;
				System.out.print(wow2d[row][col]+ "\t");
			}
			System.out.println();
			System.out.println("WoW");
		}
	}

}
