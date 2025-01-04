package com.lq.jdbc;


import com.lq.jdbc.dto.A;

import java.sql.*;


/**
 * Mysql
 *
 * @author qingqing
 * @date 2024/12/30
 */

public class Mysql {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Class.forName("com.mysql.cj.jdbc.Driver");DriverManager 已经可以自动加载 详情请看ensureDriversInitialized方法
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db01?useSSL=false" +
                "&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "123456");
        // 创建表
        PreparedStatement preparedStatement1 = connection.prepareStatement("create table if not exists table02(" +
                "id int ," +
                "name varchar(20)" +
                ");");

        // 搜索表
        PreparedStatement preparedStatement2 = connection.prepareStatement("select * from table01;");
        ResultSet resultSet = preparedStatement2.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            A a = new A(id, name);
            System.out.println(a);
        }

        // 插入表
        PreparedStatement preparedStatement3 = connection.prepareStatement("insert into table01 values(?,?)");
        preparedStatement3.setInt(1, 3);
        preparedStatement3.setString(2, "cc");

        // 删除
        PreparedStatement preparedStatement4 = connection.prepareStatement("delete from table01 where id = ?");
        preparedStatement4.setInt(1, 3);
        connection.close();
    }
}
