package com.test.demo.t1;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 如果子类改写父类的synchronized方法，如果没有可重入锁，这段代码产生死锁，
 * 每个doSomething方法执行前都会获取widgt上的锁，
 * 如果锁不是可重入的，调用super.doSomething();无法获得widget上的锁，因为这个锁被持有，线程永远无法停顿下去
 *
 */
public class Test27 {
    class Widget{
        public synchronized void doSomething(){

        }
    }

    class LoggingWidget extends Widget{
        @Override
        public synchronized void doSomething() {
            super.doSomething();
        }
    }
}
