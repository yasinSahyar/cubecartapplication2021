package com.unitedcoder.databasetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    /*
    The step of database test using java:
    1.Connect to database
    ConnectionManager(connect to database
                 disconnect from database)
    2.Create a method for data operation
    3.data base test Runner(execute)
    */
    //create aa method to connect database

    public static Connection connectToDataBaseServer(String dbUrl,String dbPort,String dbUserName,
                                                     String dbPassword,String defaultDatabase,ConnectionType connectionType){
        Connection connection = null;
        //for sql
        String JTDS_driver = "net.sourceforge.jdbc.Driver";//MSSQL
        String MYSQL_driver = "com.mysql.cj.jdbc.Driver";//MYSQL
        switch (connectionType){
            case MSSQLSERVER:
                try {
                    Class.forName(JTDS_driver);//load the driver into the memory
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                String connectURL = "jdbc:jtds:sqlserver://" + dbUrl + ":"+";databaseName=" + defaultDatabase;
                try {
                    connection = DriverManager.getConnection(connectURL,dbUserName,dbPassword);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case MYSQLSERVER:
                try {
                    Class.forName(MYSQL_driver).newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                String mySQLConnection = "jdbc:mysql://"+dbUrl+":"+dbPort+"/"+defaultDatabase;
                try {
                    connection=DriverManager.getConnection(mySQLConnection,dbUserName,dbPassword);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            default:
                System.out.println("Please secify the Connection type(MSSQL or MYSQL)");
        }
        //Verify if the connection is established or not
        try {
            if (!connection.isClosed()){
                System.out.println("Database connection is established");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void closeDataBaseConnection(Connection connection){
        try {
            if (connection.isClosed()){
                System.out.println("Database has been closed");
            }
            else {
                connection.close();
                System.out.println("Database connection closed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}