/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author USER
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:resep.db";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}