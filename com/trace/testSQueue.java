package com.trace;

/**
 * Created by tracehagan on 10/6/14.
 */
public class testSQueue {
    public static void main(String args[]){
        testSQueue t= new testSQueue();
        t.doTests();
    }

    public void doTests(){
        SatelliteQueue q1 = new SatelliteQueue();
        SatelliteQueue q2 = new SatelliteQueue();

       /* for (int i = 0; i < 5; i++){
            q1.enqueue(i);
        }

        while (!q1.isEmpty()){
            System.out.println(q1.dequeue().toString());
        }

        System.out.println("\n\n");

        for (int i = 0; i < 5; i++){
            q1.enqueue(i);
        }

        q1.reverse();

        while (!q1.isEmpty()){
            System.out.println(q1.dequeue().toString());
        }*/

        for (int i = 0; i < 5; i++){
            q1.enqueue(i);
        }

        for (int i = 4; i >=0; i--){
            q2.enqueue(i);
        }

        //q1.reverse();
        q2.reverse();
        q1.enqueue(q2);
        q1.reverse();

        while (!q1.isEmpty()){
            System.out.println(q1.dequeue().toString());
        }

    }
}
