package com.test.demo.t1;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 使用原子性操作
 */
public class Test25 {
    private final AtomicReference<BigInteger> lastNumber = new AtomicReference<>();
    private final AtomicReference<BigInteger[]> lastFactois = new AtomicReference<>();

    public void service(){
        //bigInteger的值从别处获取
        BigInteger i = null;
        if (lastNumber.get().equals(i)){
            System.out.println(lastFactois.get());
        }else{
            //里面可以寸i
            BigInteger[] bigIntegers = new BigInteger[10];
            lastNumber.set(i);
            lastFactois.set(bigIntegers);
        }
    }
}
