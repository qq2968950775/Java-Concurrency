package com.test.demo.t4;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 用Java监视器模式构建车辆追踪器，放宽封装性需求又保持线程安全
 */
@Data
public class Test44 {

    private final Map<String,MutablePoint> locations;
    public Test44(Map<String, MutablePoint> locations){

        this.locations = locations;
    }

    //调用deepCopy的方法来防止对象发布
    public synchronized Map<String, MutablePoint> getLocations(){
        return deepCopy(locations);
    }

    public synchronized MutablePoint getLocations(String id){
        return locations.get(id);
    }

    public synchronized void setLocations(String id,int x,int y){
        MutablePoint mutablePoint = locations.get(id);
        mutablePoint.x = x;
        mutablePoint.y = y;

    }
    private static Map<String,MutablePoint> deepCopy(Map<String, MutablePoint> map){
        //返回车辆信息的时候，通过 此方法复制正确的值，形成一个新的对象
        HashMap<String, MutablePoint> map1 = new HashMap<String, MutablePoint>();
        for (String s : map1.keySet()) {
            map1.put(s,new MutablePoint(map.get(s)));
        }

        //unmodifiableMap 产生一个只读的Map，当你调用此map的put方法时会抛错。
        Map<String, MutablePoint> map2 = Collections.unmodifiableMap(map1);


        return Collections.unmodifiableMap(map1);
    }
    //这个内部类是线程不安全的,但上面是线程安全的，他的map和point对象都未发布
    @Data
    @AllArgsConstructor
    static
    class MutablePoint<T>{
        public int x;
        public int y;
        MutablePoint(MutablePoint p){
        this.x = p.x;
        this.y = p.y;
        }
        MutablePoint(){
            x = 0;
            y = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("");
    }
}
