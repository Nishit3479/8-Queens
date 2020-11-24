package ai.lab.project;

import java.util.*;

public class BT 
{ 
	final int N = 8; 

	void printSolution(int board[][]) 
	{
		String []q8 = new String[N];
		for (int i = 0; i < N; i++) 
		{ 
			q8[i] = "";
			for (int j = 0; j < N; j++)
			{
				if(board[i][j]==1)
				{
					q8[i] = q8[i]+"| Q";
				}
				else
				{
					q8[i] = q8[i]+"|  ";
				}
			}
			q8[i] = q8[i]+"|";
		} 
		for(int i = 0; i < N; i++)
		{
			System.out.println(q8[i]);
		}
	} 

	boolean isSafe(int board[][], int row, int col) 
	{ 
		int i, j; 

		for (i = 0; i < col; i++) 
		{
			if (board[row][i] == 1)				
			{
				return false; 
			}
		}

		for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
		{
			if (board[i][j] == 1) 
			{
				return false; 
			}
		}

		for (i = row, j = col; j >= 0 && i < N; i++, j--) 
		{
			if (board[i][j] == 1) 
			{
				return false;
			}
		}
		return true; 
	} 

	boolean solveNQUtil(int board[][], int col) 
	{ 
		if (col >= N) 
		{
			return true;
		} 
		for (int i = 0; i < N; i++) 
		{
			if (isSafe(board, i, col)) 
			{ 
				board[i][col] = 1; 
				
				if (solveNQUtil(board, col + 1) == true) 
					{
						return true; 
					}
				board[i][col] = 0; 
			} 
		} 
		return false; 
	} 
	boolean solveNQ() 
	{ 
		int board[][] = { { 0, 0, 0, 0, 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0, 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0, 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 0, 0, 0, 0 }}; 

		if (solveNQUtil(board, 0) == false) 
		{ 
			System.out.print("Solution does not exist"); 
			return false; 
		} 
		printSolution(board); 
		return true; 
	}  
} 
