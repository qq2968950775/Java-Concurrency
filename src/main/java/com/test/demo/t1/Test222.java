package com.test.demo.t1;

/**
 * 延迟初始化中的竞态条件
 * 延迟初始化就是说，对象初始化的操作放到实际中运行，只能被初始化一次
 */
public class Test222 {
//竞态条件：如果ab同时执行getInstance,得到不同的结果
    class LazyInitRace{
        private ExpensiveObject instance = null;

        public ExpensiveObject getInstance(){
            if (instance == null){
                instance = new ExpensiveObject();
            }
            return instance;
        }
    }

    class ExpensiveObject{

    }
}
