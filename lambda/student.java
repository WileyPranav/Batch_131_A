/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.function.Consumer;

/**
 *
 * @author pshastri
 */
public class student implements Consumer{
//
//    @Override
//    public void study() {
//        System.out.println(" Pranav Studies with songs on !!!");
//    }

    @Override
    public void accept(Object t) {
        System.out.println("the learner is " +t);
    }
    
}
