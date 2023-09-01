package org.example.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
    private static final String HOST="localhost";
    private static final int port=3306;
    private static final String DB_NAME = "natwest";
    private static final String USER="root";
    private static final String PASS="Jaswanth@123";
    private static final String URL=String.format("jdbc:mysql://%s:%d/%s",HOST,port,DB_NAME);
    //jdbc.mysql://localhost:3306/natwest
    private static Connection connect;
    public Connection getConnect() throws SQLException{
        /*try{
            connect= DriverManager.getConnection(URL,USER,PASS);
        }catch(SQLException sql){
            System.out.println(sql.getMessage());
        }*/
        connect=DriverManager.getConnection(URL,USER,PASS);
        return connect;
}
}