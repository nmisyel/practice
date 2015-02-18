/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lec2;

/**
 *
 * @author 15325330
 */
public class Counter {
    int myCount = 0;
    static int ourCount = 0;
    
    void increment (){
        this.myCount++;
        Counter.ourCount++;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        
        counter1.increment();
        counter1.increment();
        counter2.increment();
        
        System.out.println("Counter 1: " + counter1.myCount + " " + counter1.ourCount);
        System.out.println("Counter 2: " + counter2.myCount + " " + counter2.ourCount);
    }
    
}
