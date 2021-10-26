package com.test.demo.t4;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 将线程安全委托给多个变量
 *
 */
public class Test49 {
    //使用CopyOnWriteArrayList来保存监听器的列表，列表是线程安全的
    private final List<KeyListener> keyListeners = new CopyOnWriteArrayList<KeyListener>();
    //为了将读取的性能发挥到极致，CopyOnWriteArrayList 读取是完全不用加锁的，并且更厉害的是：写入也不会阻塞读取操作，只有写入和写入之间需要进行同步等待，读操作的性能得到大幅度提升。
    private final List<MouseListener> mouseListeners = new CopyOnWriteArrayList<MouseListener>();

    public void addkeyListeners(KeyListener keyListener){
        keyListeners.add(keyListener);
    }
    public void addMouseListener(MouseListener listener){
        mouseListeners.add(listener);
    }
    public void removeKeyListener(KeyListener listener){
        keyListeners.remove(listener);
    }
    public void removeKeyListener(MouseListener mouseListener){
        mouseListeners.remove(mouseListener);
    }
    class KeyListener{

    }
    class MouseListener{

    }
}
