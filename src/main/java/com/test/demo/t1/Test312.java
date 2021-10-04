package com.test.demo.t1;

import java.math.BigInteger;
import java.util.Arrays;

/**
 *如果是一个可变对象，必须使用锁确保原子性，如果是不可变对象时，
 *当线程获取当对象引用的时候，不担心另外一个线程修改对象的状态
 */
public class Test312 {
    private final BigInteger lastNumber;
    private final BigInteger[] lastFactors;

    public Test312(BigInteger lastNumber, BigInteger[] lastFactors) {
        this.lastNumber = lastNumber;
        this.lastFactors = lastFactors;
    }

    public BigInteger[] getFactors(BigInteger i){
        if (lastNumber == null && !lastNumber.equals(i)){
            return null;
        }
        return Arrays.copyOf(lastFactors,lastFactors.length);
    }
}
