package com.test.demo.t1;

import lombok.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 也可以不需要用其他的方法
 */

public class Test3101 {
    public static String DB_URL = "";
    private static ThreadLocal<Test3101T> connectionTest3101TThreadLocal = new ThreadLocal<Test3101T>(){
        public Test3101T init() throws SQLException {
            Test3101T test3101T = new Test3101T();
            return test3101T;
        }
    };

    public static Test3101T getTest3101TConnection(){
        return connectionTest3101TThreadLocal.get();
    }

}
@Data
class Test3101T{
    String name;
    String age;


}

class Test3101A{
    public static void main(String[] args) {
        Test3101T test3101TConnection = Test3101.getTest3101TConnection();


    }
}
