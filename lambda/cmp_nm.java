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
public class cmp_nm implements Comparator <Learner>{

    @Override
    public int compare(Learner l1, Learner l2) {
    return(l1.getName().compareTo(l2.getName()));   
    }
    
}
