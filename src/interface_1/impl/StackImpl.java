package interface_1.impl;

import interface_1.DynamicArray;
import interface_1.Stack;
import interface_1.customException.EmptyStackException;

public class StackImpl implements Stack {
    DynamicArray dynamicArray;
    private int peekCount;

    public StackImpl() {
        this.dynamicArray = new DynamicArray();
        this.peekCount = 0;
    }

    public int getStackSize() {
        return this.dynamicArray.getCurrentSize();
    }

    @Override
    public int peek() {
        if (peekCount < 0) {
            throw new EmptyStackException("The stack is empty");
        } else {
            this.peekCount++;
            int lastIndex = dynamicArray.getCurrentSize() - this.peekCount;
            return dynamicArray.getByIndex(lastIndex);
        }

    }

    @Override
    public int pop() {
        return dynamicArray.removeIndex(dynamicArray.getCurrentSize() - 1);
    }

    @Override
    public void push(int item) {
        dynamicArray.addByValue(item);
    }

    public String toString() {
        return dynamicArray.toString();
    }
}
