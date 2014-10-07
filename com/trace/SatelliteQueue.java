package com.trace;

/**
 * Created by tracehagan on 10/6/14.
 */
public class SatelliteQueue {

    int numObj=0;
    Satellite FirstSForward;
    Satellite LastSForward;
    Satellite FirstSReverse;
    Satellite LastSReverse;
    boolean reversed=false;
    SatelliteQueue(){

    }

    public void enqueue(Object o){
        if (numObj>0){
            DataNode d = new DataNode(o);
            Satellite newSatR = new Satellite(d, FirstSReverse);
            Satellite newSatF = new Satellite(LastSForward, d);
            LastSForward.next = newSatF;
            LastSForward = newSatF;
            FirstSReverse.previous=newSatR;
            FirstSReverse = newSatR;
            numObj++;
        }else{
            DataNode d = new DataNode(o);
            Satellite newSatF = new Satellite(d);
            Satellite newSatR = new Satellite(d);
            FirstSForward = newSatF;
            LastSForward = newSatF;
            FirstSReverse = newSatR;
            LastSReverse = newSatR;
            numObj++;
        }
    }

    public void enqueue(SatelliteQueue s){
        if (numObj>0){
            LastSForward.next = s.FirstSForward;
            s.FirstSForward.previous = LastSForward;
            LastSForward = s.LastSForward;

            s.LastSReverse.next = FirstSReverse;
            FirstSReverse.previous = s.LastSReverse;
            FirstSReverse = s.FirstSReverse;
            numObj+=s.numObj;
        }else{
            FirstSForward=s.FirstSForward;
            LastSForward=s.LastSForward;
            FirstSReverse=s.FirstSReverse;
            LastSReverse=s.LastSReverse;
            numObj=s.numObj;
        }
    }

    public Object dequeue(){
        if(numObj>0){
        Object o;
        o=FirstSForward.data.data;
        FirstSForward=FirstSForward.next;
        LastSReverse = LastSReverse.previous;
        numObj--;
        return o;
        }else{
            return "No objects in Queue!";
        }
    }

    public boolean isEmpty(){
        return (numObj==0);
    }

    public void reverse(){
        Satellite temp;
        temp = FirstSForward;
        FirstSForward = FirstSReverse;
        FirstSReverse = temp;
        temp = LastSForward;
        LastSForward = LastSReverse;
        LastSReverse = temp;
        reversed=!reversed;
    }

    public boolean isReversedFromCreation(){
        return reversed;
    }

}
