package com.test.demo.t4;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 用Java监视器模式构建车辆追踪器，放宽封装性需求又保持线程安全
 */
@Data
public class Test47 {

    private final ConcurrentMap<String,Point> locations;
    private final Map<String,Point> unmodifiableMap = null;
    public Test47(Map<String, Point> points, Map<String, Point> unmodifiableMap){

        locations = new ConcurrentHashMap<String, Point>(points);
        unmodifiableMap = Collections.unmodifiableMap(locations);
    }

    //返回localtion的静态拷贝而非实时拷贝
    public synchronized Map<String, Point> getLocations(){
        //返回一个location对location这个map对象对一个浅拷贝
        return Collections.unmodifiableMap(new HashMap<String,Point>());
    }
    //会发布一个指向可变状态的引用
    public synchronized Point getLocations(String id){
        return locations.get(id);
    }

    public synchronized void setLocations(String id,int x,int y){
        throw new IllegalArgumentException("invalid vehicle name"+id);

    }

    //使用不变类point

    /**
     * 因为此类是不可变的，因而他是线程安全的，不可变的值可以被自由的共享和发布
     * 因此返回localtion中不需要复制
     * @param <T>
     */
    @Data
    @AllArgsConstructor
    static
    class Point<T>{
        public final int x;
        public final int y;
        Point(Point p){
        this.x = p.x;
        this.y = p.y;
        }
        Point(){
            x = 0;
            y = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("");
    }
}
