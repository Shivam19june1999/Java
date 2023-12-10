package TwoDArray;

public class SpiralMat {
	public static void getspiral(int arr[][]){
		int startRow=0;
		int startCol=0;
		int endRow=arr.length-1;
		int endCol=arr[0].length-1;
		while (startRow<=endRow && startCol<=endCol)
		{
			for(int j=startCol;j<=endCol;j++)
			{
			System.err.print(arr[startRow][j]+ " ");
		    }
			for(int i=startRow+1;i<=endRow ; i++)
			{
			System.err.print(arr[i][endCol] + " ");
		    }
			for(int j=endCol-1;j>=startCol;j--)
			{
			System.err.print(arr[endRow][j] + " ");
		    }
			for(int i=endRow-1;i>=startRow+1;i--)
			{
			System.err.print(arr[i][startCol] + " ");
		    }
			startCol++;
			endCol--;
			startRow++;
			endRow--;
		}
	}
	public static void main(String[] args) {
		int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		getspiral(arr);
	}
}
