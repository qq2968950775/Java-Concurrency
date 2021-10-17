package com.test.demo.t1;

import com.sun.tools.corba.se.idl.toJavaPortable.Holder;

import java.util.*;

/**
 * 事实不可变对象，没有额外同步的情况下，任何线程都可以安全的使用被安全发布的事实不可变对象
 */
public class Test315 {

    // data 本身是可变的，如果将它作为不可对象来时候，多个线程之间共享对象时，可以省去对锁的使用
    public static void main(String[] args) {
       // SortedMap<String, Date> map = Collections.synchronizedSortedMap(new SortedMap<String, Date>());
    }
}
