
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
public class SumofNonAddjecentNodes {
    
    public static int CalcMax(Node root){
        if(root==null){return 0;
        }
        int incl = root.data;
        if(root.Left!=null){
            incl += CalcMax(root.Left.Left);
            incl += CalcMax(root.Left.Right);
        }
          if(root.Right!=null){
            incl += CalcMax(root.Right.Left);
            incl += CalcMax(root.Right.Right);
        }
        int excl = CalcMax(root.Left)+CalcMax(root.Right);
        return Math.max(incl, excl);
    }
    	public static void main(String args[]) {
		Node root= new Node(1);
		root.Left= new Node(2);
                root.Right = new Node(3);
		root.Left.Left= new Node(9);
		root.Left.Right= new Node(3);
                root.Right.Left= new Node(4);
		root.Right.Right= new Node(5);
		root.Left.Right.Right= new Node(500);
                root.Left.Right.Left= new Node(88);
                root.Left.Left.Left =  new Node(44);
                root.Left.Left.Right = new Node(66);
                root.Right.Left.Left = new Node(120);
                root.Right.Left.Right = new Node(2);
                root.Right.Right.Left = new Node(12);
                root.Right.Right.Right = new Node(8);
                root.Left.Right.Right.Left= new Node(15);
                root.Left.Right.Right.Right= new Node(25);
                root.Left.Right.Left.Left= new Node(68);
                root.Left.Right.Left.Right= new Node(38);
                root.Left.Left.Left.Left =  new Node(14);
                root.Left.Left.Left.Right =  new Node(2);
                root.Left.Left.Right.Left = new Node(100);
                root.Left.Left.Right.Right = new Node(105);
                root.Right.Left.Left.Left = new Node(12);
                root.Right.Left.Left.Right = new Node(13);
                root.Right.Left.Right.Left = new Node(255);
                root.Right.Left.Right.Right = new Node(28);
               
                long start = System.nanoTime();
                System.out.println(CalcMax(root));
                System.out.println(" Time taken "+(System.nanoTime()-start));
	}
}
