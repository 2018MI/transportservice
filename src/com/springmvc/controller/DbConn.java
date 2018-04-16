//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.springmvc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConn {
    public DbConn() {
    }

    public static Connection getConnSql() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException var3) {
            var3.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/transportDB?user=root&password=123456&useUnicode=true&characterEncoding=utf-8");
        } catch (SQLException var2) {
            var2.printStackTrace();
        }

        return conn;
    }

    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException var2) {
                var2.printStackTrace();
            }
        }

    }

    public static void close(PreparedStatement sm) {
        if (sm != null) {
            try {
                sm.close();
            } catch (SQLException var2) {
                var2.printStackTrace();
            }
        }

    }

    public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException var2) {
                var2.printStackTrace();
            }
        }

    }
}
