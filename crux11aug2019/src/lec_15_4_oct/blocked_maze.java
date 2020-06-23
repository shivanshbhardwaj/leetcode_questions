package lec_15_4_oct;

import java.util.Scanner;

public class blocked_maze {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] board = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		work(board, 0, 0, "", new boolean[4][4]);

	}

	private static void work(int[][] board, int row, int col, String ans, boolean[][] visited) {

		if (row == board.length - 1 && col == board[0].length - 1) {
			System.out.println(ans);
			return;
		}

		if (row >= board.length || col >= board[0].length || row < 0 || col < 0 || board[row][col] == 1
				|| visited[row][col] == true) {
			return;
		}

		visited[row][col] = true;

//		B
		work(board, row + 1, col, ans + "B", visited);
//		T
		work(board, row - 1, col, ans + "T", visited);
//		l
		work(board, row, col - 1, ans + "L", visited);
//		R
		work(board, row, col + 1, ans + "R", visited);

		visited[row][col] = false;

	}
}