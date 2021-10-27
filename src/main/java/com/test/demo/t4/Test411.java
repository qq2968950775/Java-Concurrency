package com.test.demo.t4;

import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 保证线程安全性不被破坏
 * Test411提供的set get 方法能同时获得x,y的值，并将二者放到同一时间返回
 */
@Data
public class Test411 {
    private int x;
    private int y;

    private Test411(int[] a){
        this(a[0],a[1]);
    }

    public Test411(Test411 p){
        this(p.get());
    }

    public Test411(int x,int y){
        this.x = x;
        this.y = y;
    }

    public synchronized int[] get(){
        return new int[] {x,y};
    }

    public synchronized void set(int x,int y){
        this.x = x;
        this.y = y;
    }
}
