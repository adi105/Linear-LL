package com.company;

public class LLL_node {
    //fields
    protected int data;
    protected LLL_node next;

    //functions
    LLL_node(){
        data = 0;
        next = null;
    }

    LLL_node(int to_set){
        data = to_set;
        next = null;
    }

    public int get_data(){
        return data;
    }

    public LLL_node get_next(){
        return next;
    }

    public void set_data(int to_set){
        data = to_set;
    }

    public void set_next(LLL_node to_set){
        next = to_set;
    }
}
