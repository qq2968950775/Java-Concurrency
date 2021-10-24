package com.test.demo.t4;

/**
 * 感觉有点意思
 */
public class Test43 {
    private final Object myLock = new Object();
    Widget widget;

    void someMethod(){
        synchronized (myLock){
            //访问或者修改widget的状态
        }
    }

    class Widget{

    }
}
