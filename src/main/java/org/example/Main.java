package org.example;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        PriorityQueue<Integer> resultQueue = new PriorityQueue<>();

        for (int i = 0; i <= 20; i += 2) {
            queue1.add(i);
        }

        for (int i = 1; i < 20; i += 2) {
            queue2.add(i);
        }

        resultQueue.addAll(queue1);
        resultQueue.addAll(queue2);

        while (!resultQueue.isEmpty()) {
            System.out.print(resultQueue.poll() + " ");
        }
    }
}