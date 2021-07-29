/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;
import java.io.*;
import java.util.*;
/**
 *
 * @author pshastri
 */
public class MatrixChainingDp {

static int[][] dp = new int[100][100];

// Function for matrix chain multiplication
static int matrixChainMemoised(int[] p, int i, int j)
{
	if (i == j)
	{
	return 0;
	}
	if (dp[i][j] != -1)
	{
	return dp[i][j];
	}
	dp[i][j] = Integer.MAX_VALUE;
	for (int k = i; k < j; k++)
	{
	dp[i][j] = Math.min(
		dp[i][j], matrixChainMemoised(p, i, k)
		+ matrixChainMemoised(p, k + 1, j)
		+ p[i - 1] * p[k] * p[j]);
	}
	return dp[i][j];
}

static int MatrixChainOrder(int[] p, int n)
{
	int i = 1, j = n - 1;
	return matrixChainMemoised(p, i, j);
}

// Driver Code
public static void main (String[] args)
{

	int arr[] = { 10, 20, 30, 40, 30,10,30,20,10,20,20,10,20,30,40,
                      50,60,70,80, 20, 30, 40, 30,10,30,20,10,20,20,10,
                      20,30,40,50,60,70,80,30,10,30,20,10,20,20,10,20};
	int n= arr.length;

	for (int[] row : dp)
	Arrays.fill(row, -1);

	System.out.println("Minimum number of multiplications is " + MatrixChainOrder(arr, n));
}
}
