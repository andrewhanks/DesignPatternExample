package com.example.andrewhanks.myapplication.iterator;

import java.util.Iterator;

public class IteratorMain {
    public static void start() {
        foreach(new IterableString("Justin"));
    }

    public static void foreach(Iterable<Character> iterable) {
        Iterator<Character> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
