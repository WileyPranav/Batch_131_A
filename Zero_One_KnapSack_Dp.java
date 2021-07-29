/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author pshastri
 */
public class Zero_One_KnapSack_Dp {
	static int max(int a, int b)
	{
		return (a > b) ? a : b;
	}

	// Returns the maximum value that can
	// be put in a knapsack of capacity W
	static int KS_Calc(int W, int wt[],
						int val[], int n)
	{
		int i, w;
		int K[][] = new int[n + 1][W + 1];

		// Build table K[][] in bottom up manner
		for (i = 0; i <= n; i++)
		{
			for (w = 0; w <= W; w++)
			{
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w]
						= max(val[i - 1]
						+ K[i - 1][w - wt[i - 1]],
						K[i - 1][w]);
				else
					K[i][w] = K[i - 1][w];
			}
		}

		return K[n][W];
	}

	// Driver code
	public static void main(String args[])
	{
		int val[] = new int[] { 60, 100, 120,100,250,30,90,200 };
		int wt[] = new int[] { 10, 20, 30,40,35,20,66,100 };
		int W = 500;
		int n = val.length;
		System.out.println(KS_Calc(W, wt, val, n));
	}
}


