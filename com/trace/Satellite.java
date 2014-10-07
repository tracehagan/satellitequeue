package com.trace;

/**
 * Created by tracehagan on 10/6/14.
 */
public class Satellite {
    DataNode data=null;
    Satellite next=null;
    Satellite previous=null;

    Satellite(){

    }

    Satellite(DataNode d){
        data=d;
    }

    Satellite(DataNode d, Satellite n){
        data = d;
        next=n;
    }
    Satellite(Satellite p, DataNode d, Satellite n){
        data = d;
        next=n;
        previous = p;
    }
    Satellite(Satellite p, DataNode d){
        data = d;
        previous = p;
    }
}
