package com.test.demo.t4;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 将线程安全委托给多个变量
 *
 */
public class Test410 {
    final AtomicInteger lower = new AtomicInteger(0);
    final AtomicInteger upper = new AtomicInteger(0);
    public static void main(String[] args) {

    }

    public void setLower(int i){
        //不安全的先检查后执行
        if (i>upper.get()){
            throw new IllegalArgumentException();
        }
        lower.set(i);
    }

    public void setUpper(int i){
        if (i < lower.get()){
            throw new IllegalArgumentException();
        }
        upper.set(i);
    }

    public boolean isInRange(int i){
        return (i>=lower.get() && i<= upper.get());
    }
}
