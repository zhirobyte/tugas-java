/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Andika Sundawijaya
 */
public class DatabaseConnection {

    private static Connection conn;

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/perpustakaan";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() {
        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            //conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return conn;
    }
}
