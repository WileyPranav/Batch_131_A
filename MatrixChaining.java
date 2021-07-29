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
public class MatrixChaining {
	static int MinMatrixCalc(int p[], int i, int j)
	{
		if (i == j)
			return 0;

		int min = Integer.MAX_VALUE;

		for (int k = i; k < j; k++)
		{
			int count = MinMatrixCalc(p, i, k)
                                    + MinMatrixCalc(p, k + 1, j)
                                    + p[i - 1] * p[k] * p[j];

			if (count < min)
				min = count;
		}

		return min;
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = new int[] { 10, 20, 30, 40, 30,10,30,20,10,20,20,10,20,30,40,
                                          50,60,70,80, 20, 30, 40,30,10,30,10,30,20,10,20,20,10,
                                           20,30,40,50,60,70,80,30,10,30,20,10,20,20,10,20};
		int n = arr.length;

		System.out.println(
			"Minimum number of multiplications is "
			+ MinMatrixCalc(arr, 1, n - 1));
	}
}

