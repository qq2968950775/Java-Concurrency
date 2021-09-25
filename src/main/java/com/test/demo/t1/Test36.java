package com.test.demo.t1;

import java.util.HashSet;
import java.util.Set;

/**
 * 使内部的可变状态逸出
 * 发布了本应该私有的状态数据
 * 从非私有方法中饮用了一个对象，从非私有方法中返回一个饮用
 */
public class Test36 {
    public String[] states = new String[]{
            "ak","al"
    };

    public String[] getStates(){
        return states;
    }

}
