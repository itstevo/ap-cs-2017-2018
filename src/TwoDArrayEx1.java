
public class TwoDArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] wow2d = {{1,2,3}, {1,2,3},{1,2,3}};
		showArray(wow2d);
		arrTopDown(wow2d);
		showArray(wow2d);
	}
	public static void arrEditor(int[][] arr, int col1, int col2)
	{
		int counter=0;
		for(int col = 0; col<arr[0].length;col++)
		{
		for(int row = 0; row<arr.length;row++)
				{
				arr[row][col]=counter;
				counter++;
				}
	}
	}
	public static int[][] arrTopDown(int[][] arr)
	{
		int counter=0;
		for(int row = arr.length-1; row>0;row--)
		{
			for(int col = arr[0].length-1; col>0;col--)
			{
		
				arr[row][col]=counter;
				counter++;
				}
	}
		return arr;
	}
	public static int[][] arrCropper(int[][] arr, int rowEnd, int colEnd)
	{
		int[][] answer = new int[rowEnd][colEnd];
		for(int row = 0; row<rowEnd;row++)
			{
				for(int col = 0; col<colEnd;col++)
				{
					
				}
	}
		return answer;
	}
	public static int[][] arrInverter(int[][] arr)
	{
		int[][] answer = new int[arr[0].length][arr.length];
		for(int row = 0; row>0;row--)
			{
				for(int col = 0; col>0;col--)
				{
					answer[col][row]=arr[row][col];
				}
	}
		return answer;
	}
	public static void showArray(int[][]arr)
	{
		for(int row = 0; row<arr.length;row++)
		{
			for(int col = 0; col<arr[0].length;col++)
			{
				
					System.out.print(arr[row][col]);
		
			}
			System.out.println();
			

	}
		System.out.println();
		System.out.println();
	}

}
