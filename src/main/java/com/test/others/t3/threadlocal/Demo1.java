package com.test.others.t3.threadlocal;

import lombok.Data;

@Data
public class Demo1 {
    private String content;

    public static void main(String[] args) {
        final Demo1 demo1 = new Demo1();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    //线程做的事情一样，先存一个变量
                    demo1.setContent(Thread.currentThread().getName());
                    System.out.println("");
                }
            });
            thread.start();
        }

    }
}
