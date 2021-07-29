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
public class Node {
    int data;
    Node Left,Right;

    public Node(int data) {
        this.data = data;
        Left = null;
        Right = null;
    }
}
