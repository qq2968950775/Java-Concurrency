package com.test.demo.t1;

import java.awt.*;

/**
 * 隐式的使用this引用逸出
 */
public class Test37 {
    /**
     * Test37发布，当Test37发布EventListener时，隐含当发布了Test37实例本身，因为内部类当实例保护对Test37实例对调用
     * @param eventSource
     */
    public Test37(EventSource eventSource){
        eventSource.registerListener(
                new EventListener(){
                    public void onEvent(Event event){
                        System.out.println("312");
                    }
                }
        );
    }
}
class EventSource{

    public void registerListener(Object object){

    }
}
class EventListener{

    public void onEvent(Event event){

    }
}
