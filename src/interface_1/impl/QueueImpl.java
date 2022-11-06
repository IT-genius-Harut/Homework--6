package interface_1.impl;

import interface_1.DynamicArray;
import interface_1.Queue;
import interface_1.customException.EmptyQueueException;
import interface_1.customException.EmptyStackException;

public class QueueImpl implements Queue {
    DynamicArray dynamicArray ;
    private int peekCount;

    public QueueImpl(){
        this.dynamicArray = new DynamicArray();
        this.peekCount = 0;
    }

    public int getQueueSize(){
        return this.dynamicArray.getCurrentSize();
    }

    @Override
    public boolean add(Integer e) {
        dynamicArray.addByValue(e);
        return true;
    }

    @Override
    public Integer pop(){
        if (peekCount < 0) {
            throw new EmptyQueueException("The queue is empty");
        }
        return dynamicArray.removeIndex(0);
    }

    @Override
    public Integer peek() {
        int returnValue = dynamicArray.getByIndex(peekCount) ;
        peekCount++;
        return returnValue;
    }

    public String toString(){ return dynamicArray.toString();}
}
