package com.lq.jdbc;

import com.mysql.cj.jdbc.Driver;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * MysqlDemo02
 *
 * @author qingqing
 * @date 2025/1/4
 */

public class MysqlDemo02 {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        InputStream resourceAsStream = MysqlDemo02.class.getResourceAsStream("/config.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        Driver driver1 = new Driver();
        Connection connection1 = driver1.connect
        ("jdbc:mysql://localhost:3306/db01?useSSL=false&allowPublicKeyRetrieval" +
                "=true", properties);
        boolean autoCommit = connection1.getAutoCommit();
        System.out.println(autoCommit);
        connection1.close();

        //"jdbc:mysql://localhost:3306/db01?useSSL=false&allowPublicKeyRetrieval=true",
        Class<Driver> aClass = (Class<Driver>) Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver2 = aClass.getConstructor().newInstance();
        Connection connection2 = driver2.connect("jdbc:mysql://localhost:3306/db01?useSSL=false" +
                "&allowPublicKeyRetrieval=true", properties);
        connection2.close();
    }
}
