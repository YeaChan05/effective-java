package org.yeachan.chapter2.item7.memoryleak;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * package :  org.yeachan.chapter2.item7.memoryleak
 * fileName : Stack
 * author :  ShinYeaChan
 * date : 2023-09-08
 */
public class Stack {
    private Object[] elements;
    private int size=0;
    private static final int DEFAULT_INITIAL_CAPACITY=16;
    
    private Stack(){
        this.elements=new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e){
        this.ensureCapacity();
        this.elements[size++]=e;
    }
    
    public Object pop(){
        if (size==0){
            throw new EmptyStackException();
        }
        Object result=this.elements[--size];
        this.elements[size]=null;
        return result;
    }
    
    private void ensureCapacity() {
        if(this.elements.length==size){
            this.elements= Arrays.copyOf(elements,2*size+1);
        }
    }
}
