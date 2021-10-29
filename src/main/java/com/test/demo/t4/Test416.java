package com.test.demo.t4;

import java.util.List;

/**
 * Test416通过自身内置锁增加一层额外的加锁，并不关心底层的list是否是线程安全的
 * @param <T>
 */
//public class Test416<T> implements List<T>{
public class Test416<T>{
    public final List<T> list ;

    public Test416(List<T> list) {
        this.list = list;
    }


    public synchronized boolean putIfAbsent(T x){
        boolean contains = list.contains(x);

        if (contains){
            list.add(x);
        }
        return !contains;
    }

    public synchronized void clear(){
        list.clear();
    }
}
