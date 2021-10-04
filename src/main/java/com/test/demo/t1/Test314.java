package com.test.demo.t1;

import com.sun.tools.corba.se.idl.toJavaPortable.Holder;

/**
 *如不安全的发布,其他线程看到的holder将处于不一致状态
 */
public class Test314 {
    public Holder holder;

    public void initialize(){
        holder = new Holder();
    }
}
