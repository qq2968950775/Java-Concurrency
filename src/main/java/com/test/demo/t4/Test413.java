package com.test.demo.t4;

import java.util.Vector;

public class Test413<E> extends Vector<E> {
    public synchronized boolean putIfAbsent(E x){
        boolean absent = !contains(x);
        if (absent){
            add(x);
        }
        return absent;
    }
}
