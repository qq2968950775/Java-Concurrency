package com.test.demo.t4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 将线程安全性托付给底层的ConcurrentHashMap，map中的元素是线程安全的，是可变的
 *getlocation返回可变对象的一个不可变副本，调用者不能增加或者修改车辆位置，可以通过
 * 修改map中的Test411的方法值来修改位置 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test412 {

    private final Map<String,Test411> locations;
    private final Map<String,Test411> unmodifiableMap;

    public Test412(Map<String,Test411> locations){
        this.locations = new ConcurrentHashMap<String, Test411>(locations);
        this.unmodifiableMap = Collections.unmodifiableMap(this.locations);
    }

    public Map<String,Test411> getLocations(){
        return unmodifiableMap;
    }

    public Test411 getLocation(String id){
        return locations.get(id);
    }

    public void setLocations(String id,int x,int y){
        locations.get(id).set(x,y);
    }
}
class SafePoint{

}