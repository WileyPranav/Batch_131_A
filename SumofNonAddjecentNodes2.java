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
public class SumofNonAddjecentNodes2 {
 
     public static Pair maxSumCalculator(Node root)
	{
		if (root==null)
		{
			Pair sum=new Pair(0, 0);
			return sum;
		}
		Pair sum1 = maxSumCalculator(root.Left);
		Pair sum2 = maxSumCalculator(root.Right);
		Pair sum=new Pair(0,0);

		// This node is included (Left and right children
		// are not included)
		sum.inc = sum1.exc + sum2.exc + root.data;

		// This node is excluded (Either left or right
		// child is included)
		sum.exc = Math.max(sum1.inc, sum1.exc) +
					Math.max(sum2.inc, sum2.exc);

		return sum;
	}

	// Returns maximum sum from subset of nodes
	// of binary tree under given constraints
	public static int maxSum(Node root)
	{
		Pair res=maxSumCalculator(root);
		return Math.max(res.inc, res.exc);
	}

	public static void main(String args[]) {
		Node root= new Node(1);
		root.Left= new Node(2);
                root.Right = new Node(3);
		root.Left.Left= new Node(9);
		root.Right.Left= new Node(4);
		root.Left.Right= new Node(3);
		root.Right.Right= new Node(5);
		root.Left.Right.Right= new Node(5);
		System.out.println(maxSum(root));
	}
}
class Pair
{
	int inc,exc;
	Pair(int inc,int exc)
	{
		this.inc=inc;
		this.exc=exc;
	}
}

