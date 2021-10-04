package com.test.demo.t1;

import java.math.BigInteger;
import java.util.Arrays;

/**
 *如果是一个可变对象，必须使用锁确保原子性，如果是不可变对象时，
 *当线程获取当对象引用的时候，不担心另外一个线程修改对象的状态
 */
public class Test313 {
    private volatile Test312 cache = new Test312(null,null);

//    public void service(ServletRequest servletRequest,ServletResponse resp){
//        BigI
//    }
}
