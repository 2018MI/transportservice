//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.springmvc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtil {
    public DatabaseUtil() {
    }

    public static String queryIpPort() {
        ResultSet rs = null;
        PreparedStatement ps = null;
        String str = "http://192.168.1.100:8890/";
        Connection conn = DbConn.getConnSql();
        if (conn != null) {
            try {
                String sql = " select * from config";
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();

                while(rs.next()) {
                    str = "http://" + rs.getString("IP") + ":" + rs.getString("PORT") + "/";
                    System.out.println("****ip&port:" + str);
                }
            } catch (SQLException var8) {
                var8.printStackTrace();
            } finally {
                DbConn.close(conn);
                DbConn.close(ps);
                DbConn.close(rs);
            }
        }

        return str;
    }
}
