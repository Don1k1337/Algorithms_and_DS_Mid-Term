package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        // Test cases for Stack using Array
        ArrayStack s = new ArrayStack(4);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.pop();

        System.out.println("\n");

        // Test cases for Queue using Array
        ArrayQueue q = new ArrayQueue(2);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.dequeue();
    }
}
