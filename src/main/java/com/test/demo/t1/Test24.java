package com.test.demo.t1;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 使用原子性操作
 */
public class Test24 {
    private final AtomicLong count = new AtomicLong(0);

    public long getCount(){
        return count.get();
    }

    public void service(){
        count.incrementAndGet();
    }
}
