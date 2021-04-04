package com.company;

import java.util.Arrays;

public class ArrayStack {
    public int[] stackArray;
    public int top;

    public ArrayStack(int size){
        this.stackArray = new int[size];
        this.top = 0;
    }

    // Method for resizing our array
    public void resizer(){
        int[] copiedArr = new int[stackArray.length * 2];
        // we can use arraycopy or copyOf() method for copying our array
        copiedArr = Arrays.copyOf(stackArray, copiedArr.length); // copy contents
//      System.arraycopy(stackArray, 0, copiedArr, 0, stackArray.length);// copy contents
        stackArray = copiedArr;
    }

    // Push will add new element to our stack
    public void push(int x){
        // Making some resizing, if our Array is smaller than needed
        if(top == stackArray.length) {
            resizer();
        } else {
            stackArray[top] = x;
            top++;
            System.out.println("Pushed element is " + x);
        }
    }

    // Pop will remove and return the top element of our stack
    public void pop() {
        // Checks for empty stack
        // If checks is OK - going to pop our element
        if(!isEmpty()) {
            top--;
            int x = stackArray[top];
            System.out.println("Popped element is " + x);
        }
    }
    public boolean isEmpty() {
        if (top == 0) {
            throw new RuntimeException("Your stack is empty");
        }
        return false;
    }
}
