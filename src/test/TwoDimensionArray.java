package test;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int row = 4;
		int col = 4;
		int[][] twoDimensionArray = new int[row][col];

		populateTwoDimArray(row, col, twoDimensionArray);

		printTwoDimensionArray(row, col, twoDimensionArray);

	}

	public static void printTwoDimensionArray(int row, int col, int[][] twoDimensionArray) {
		for (int rowCount = 0; rowCount < row; rowCount++) {
			for (int colCount = 0; colCount < col; colCount++) {
				System.out.print(" " + twoDimensionArray[rowCount][colCount] + " ");
			}
			System.out.println();
		}
	}

	public static void populateTwoDimArray(int row, int col, int[][] twoDimensionArray) {
		int offset = 11;
		for (int rowCount = 0; rowCount < row; rowCount++) {
			for (int colCount = 0; colCount < col; colCount++) {
				twoDimensionArray[rowCount][colCount] = offset;
				offset++;
			}
		}
	}
}
