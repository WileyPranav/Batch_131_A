/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;
import java.util.Arrays;
/**
 *
 * @author pshastri
 */
public class AbsSum {
    
        // function to find the sum of
	// minimum absolute Sum
	static int sumOfMinAbsSum(int A[] ,int N)
        {
        
        Arrays.sort(A);
        int tail = 0;
        int head = N - 1;
        int minAbsSum = Integer.MAX_VALUE; 
        while (tail <= head) {
            int currentSum = A[tail] + A[head];
            minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));
           
            if (currentSum <= 0)
                tail++;
            else
                head--;
        }
        return minAbsSum;
    }	

	// Driver code
	public static void main(String args[])
	{
		int arr[] = {-9,5,7,-1,3,11,3,5,6,7,1,-11,-4,-14,-3,12,13,14,15,16,7,-99,-88,-45};
		int n = arr.length;
		
		System.out.println( "Sum = "+ sumOfMinAbsSum(arr, n));
	}
}
