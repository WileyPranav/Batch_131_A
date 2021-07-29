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
public class Zero_One_KnapSack {
	static int max(int a, int b)
	{
	return (a > b) ? a : b;
	}

	// Returns the maximum value that
	// can be put in a knapsack of
	// capacity W
	static int KS(int W, int wt[], int val[], int n)
	{
		// Base Case
		if (n == 0 || W == 0)
			return 0;

		// If weight of the nth item is
		// more than Knapsack capacity W,
		// then this item cannot be included
		// in the optimal solution
		if (wt[n - 1] > W)
			return KS(W, wt, val, n - 1);

		// Return the maximum of two cases:
		// (1) nth item included
		// (2) not included
		else
			return max(val[n - 1]
					+ KS(W - wt[n - 1], wt,
								val, n - 1),
					KS(W, wt, val, n - 1));
	}

	// Driver code
	public static void main(String args[])
	{
		int val[] = new int[] { 60, 100, 120,100,250,30,90,200,70,90 };
		int wt[] = new int[] { 10, 20, 30,40,35,20,66,100,5,12 };
		int W = 0;
		int n = val.length;
		System.out.println(KS(W, wt, val, n));
	}

}
