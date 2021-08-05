/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author pshastri
 */
public class driver {
    public static void main(String[] args) {
        person pr = new student();
        pr.study();
        
        person SB = new person(){
                        public void study(){
                            System.out.println(" Shubham Likes to Focus in silience !!!");
                        }};
        
        SB.study();
        person KG =()->{
                            System.out.println(" Kushagra like studies while lying down!!!");
                        };
        
        KG.study();
    }
}
