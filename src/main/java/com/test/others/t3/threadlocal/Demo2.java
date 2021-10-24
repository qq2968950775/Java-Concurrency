package com.test.others.t3.threadlocal;

import lombok.Data;

@Data
public class Demo2 {
    private String content;
    ThreadLocal<String> stringThreadLocal = new ThreadLocal<String>();
    private String getContent() {
        //return content; return 当前线程绑定的变量
        return stringThreadLocal.get();
    }

    private void setContent(String content) {
        //就将content变量绑定到当前线程
        stringThreadLocal.set(content);
    }

    public static void main(String[] args) {

        final Demo2 demo1 = new Demo2();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    //线程做的事情一样，先存一个变量
                    demo1.setContent(Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().getName()+" --- "+demo1.getContent());
                }
            });
            thread.start();

        }

    }
}
