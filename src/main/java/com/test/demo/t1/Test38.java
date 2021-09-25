package com.test.demo.t1;

import java.awt.*;

/**
 * 安全的对象构造过程
 */
public class Test38 {
    private final EventListener eventListener;

    //在构造方法中注册一个事件监听器或者启动一个线程，可以使用一个私有构造函数和一个公共的工厂方法
    public Test38() {
        eventListener = new EventListener(){
            public void onEven(Event event){
                //doSomething
                System.out.println("321");
            }
        };
    }

    //工厂方法
    public static Test38 newInstance(EventSource eventSource){
        Test38 test38 = new Test38();
        eventSource.registerListener(test38.eventListener);
        return test38;
    }
}
