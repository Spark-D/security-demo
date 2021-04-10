package com.devil.securitydemo;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

class DBConnTest {
	
	private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://securitydemo.coigpl3y7flb.ap-northeast-2.rds.amazonaws.com:3306/security";
    private static final String USER = "security";
    private static final String PASSWORD = "qwerty1234";

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
