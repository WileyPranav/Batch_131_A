/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.Comparator;

/**
 *
 * @author pshastri
 */
public class Cmp_Grade implements Comparator<Learner>{

    @Override
    public int compare(Learner o1, Learner o2) {
        return (Math.round(o1.getMarks()-o2.getMarks()));
    }
    
}
