package com.lq.jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * MysqlDemo03
 *
 * @author qingqing
 * @date 2025/1/4
 */

public class MysqlDemo03 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db01?useSSL=false" +
                "&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "123456");
        PreparedStatement preparedStatement1 = connection.prepareStatement("create table if not exists table03(" +
                "date date," +
                "time time," +
                "datetime datetime," +
                "timestamp timestamp" +
                ");");
        System.out.println(preparedStatement1.execute());

        PreparedStatement preparedStatement2 = connection.prepareStatement("insert into table03 values (?,?,?,?);");
        preparedStatement2.setDate(1, Date.valueOf(LocalDate.now()));
        preparedStatement2.setTime(2, Time.valueOf(LocalTime.now()));
        preparedStatement2.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
        preparedStatement2.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
        System.out.println(preparedStatement2.execute());

        PreparedStatement preparedStatement3 = connection.prepareStatement("select * from table03");
        ResultSet resultSet = preparedStatement3.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getDate(1));
            System.out.println(resultSet.getTime(2));
            System.out.println(resultSet.getTimestamp(3));
            System.out.println(resultSet.getTimestamp(4));
        }
        connection.close();
    }
}
