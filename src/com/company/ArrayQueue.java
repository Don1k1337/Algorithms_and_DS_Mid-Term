package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {
    public int front;
    public int back;
    public int[] queueArr;

    public ArrayQueue(int size) {
        this.front = this.back = -1;
        this.queueArr = new int[size];
    }

    // helper methods
    public boolean isFull() {
        return (back + 1) % queueArr.length == front;
    }

    // Resizing of our array if it is already full
    public void resizer() {
        int[] copiedArr = new int[queueArr.length * 2];
        // we can use arraycopy or copyOf() method for copying our array
        copiedArr = Arrays.copyOf(queueArr, copiedArr.length);
        queueArr = copiedArr;
    }

    // main methods for our queue (enq, deq, empty)
    public void enqueue(int x) {
        if(isFull()) {
            resizer();
        } else if (isEmpty()) {
            front++;
        }
        back = (back + 1) % queueArr.length;
        queueArr[back] = x;
        System.out.println("Enqueued element is " + x);
    }

    // Deleting elements if our checks are OK
    public int dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("Your queue is empty!");
        }
        int x = queueArr[front];
        if(front == back)
        {
            front = back = -1;
        }
        else {
            front = (front + 1) % queueArr.length;
        }
        System.out.println("Dequeued element is " + x);
        return x;
    }

    public boolean isEmpty() {
        return front == -1;
    }
}