/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ekky
 */
public class ConnectDB {

    public ConnectDB() {
    }
    
    public static Connection getConnection(){
    Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/posresto", "root", "root");
        } catch (Exception e) {
            connection = null;
        }
        return connection;
    }
}
