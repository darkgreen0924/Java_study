package com.lq.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Mysql
 *
 * @author qingqing
 * @date 2024/12/30
 */

public class Mysql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db01?useSSL=false" +
                "&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "123456");

        PreparedStatement preparedStatement = connection.prepareStatement("create table if not exists table02(" +
                "id int ," +
                "name varchar(20)" +
                ");");

        boolean execute = preparedStatement.execute();

        connection.close();
    }
}
