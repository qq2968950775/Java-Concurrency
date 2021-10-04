package com.test.demo.t1;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 安全的对象构造过程
 */
public class Test310 {
    public static String DB_URL = "";
    private static ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<Connection>(){
        public Connection init() throws SQLException {
            return DriverManager.getConnection(DB_URL);
        }
    };

    public static Connection getConnection(){
        return connectionThreadLocal.get();
    }

}
