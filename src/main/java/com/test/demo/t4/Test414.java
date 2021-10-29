package com.test.demo.t4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 为什么不能实现线程同步，错误的锁上进行了同步，
 * 这个锁不是Test414上的锁，Test414只是带来同步的假象，putIfAbsent对其他类来说不是原子的
 * 如果要用就用415
 * @param <T>
 */
public class Test414<T> {
    public List<T> list = Collections.synchronizedList(new ArrayList<T>());

    public synchronized Boolean putIfAbsent(T x){
        boolean absent = !list.contains(x);
        if (absent){
            list.add(x);
        }
        return absent;
    }
}
