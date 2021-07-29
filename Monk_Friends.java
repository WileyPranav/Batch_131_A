/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.Scanner;

/**
 *
 * @author pshastri
 */
public class Monk_Friends {
    public static void main(String[] args) {
   int t ;
   int count;
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of time syou want to enter the no : ");
    t = sc.nextInt();
   while(t-- >0 )
   {
   long a,b,k;
    System.out.println("Enter first No");
    a =sc.nextInt();
    System.out.println("Enter Second No");
    b=sc.nextInt();
    if(a==b)
       System.out.println("0\n");
    else
    {
     k=a^b;
     count=0;
     while( k>0 ){
        k = k&(k-1);
           count++;
        }
        System.out.println(" The Different Bit are  "+count);
    }
   }
} 
}
