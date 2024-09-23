package org.example;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {

        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        for (int i = 0; i <= 20; i += 2) {
            queue1.add(i);
        }

        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
        for (int i = 1; i < 20; i += 2) {
            queue2.add(i);
        }

        PriorityQueue<Integer> queue3 = new PriorityQueue<>();
        queue3.addAll(queue1);
        queue3.addAll(queue2);
        while (!queue3.isEmpty()) {
            System.out.println(queue3.poll());
        }
    }
}