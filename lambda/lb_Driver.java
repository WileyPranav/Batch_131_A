/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 *
 * @author pshastri
 */
public class lb_Driver {
    public static void main(String[] args) {
        ArrayList <Learner> Al = new  ArrayList<>();
        Al.add(new Learner(19,"Rob",79,"Australia"));
        Al.add(new Learner(16,"Ron",68,"China"));
        Al.add(new Learner(21,"Harry",81,"London"));
        Al.add(new Learner(20,"Hermione",87,"Scotland"));
        Al.add(new Learner(13,"Snape",53,"NewYork"));
        
//        Consumer <Learner> cn = new Consumer <Learner>(){
//                            public void accept(Learner lr){
//                                System.out.println("The is "+lr);
//                            }};
//          Al.stream().forEach(cn);
//        
//        Consumer <Learner> cn_Ld = (Learner lr)->{
//                           System.out.println("The is "+lr);
//                       };
//         Al.stream().forEach(cn_Ld);
        
        Al.stream().forEach(lr->System.out.println(lr));
//        Al.stream().forEach(new student());

//        Comparator <Learner> cmp_ag = new Comparator <Learner> (){
//                                        public int compare(Learner o1, Learner o2) {
//                                        return (o1.getAge()-o2.getAge());
//                                                } };
//        Al.sort(cmp_ag);
        Al.sort((Learner l1,Learner l2)->l2.getAge()-l1.getAge());
        System.out.println("");
         Al.stream().forEach(lr->System.out.println(lr));
    }
}
