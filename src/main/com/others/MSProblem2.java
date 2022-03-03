package com.others;

import com.toolClasses.ListNode;

import java.util.PriorityQueue;
import java.util.Stack;

public class MSProblem2 {
    Stack<Integer> normal;
    Stack<Integer> specal;

    public MSProblem2(){
        normal = new Stack<Integer>();
        specal = new Stack<Integer>();
    }

    public void push(int t){
        normal.push(t);
        if(!specal.isEmpty() && specal.peek()<t){
            specal.push(specal.peek());
        }else {
            specal.push(t);
        }
    }
    public int pop(){
        specal.pop();


        return normal.pop();
    }
    public int getMin(){
        return specal.peek();
    }
}
