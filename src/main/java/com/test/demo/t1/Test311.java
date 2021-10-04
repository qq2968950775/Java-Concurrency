package com.test.demo.t1;

import java.util.HashSet;
import java.util.Set;

/**
 *  在不可变对象内部使用可变对象来管理他们的状态
 *
 */
public class Test311 {
    private final Set<String> stooges = new HashSet<String>();
    public static void main(String[] args) {
        Test311 test311 = new Test311();
        boolean adc = test311.isStooge("adc");
        System.out.println(adc);

    }
    public Test311(){
        stooges.add("moe");
        stooges.add("Larry");
        stooges.add("Curly");
    }

    public boolean isStooge(String name){
        return stooges.contains(name);
    }
}
