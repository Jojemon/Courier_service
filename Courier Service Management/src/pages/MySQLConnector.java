/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;


import java.sql.*;

import javax.swing.JOptionPane;
 
public class MySQLConnector {
    static Connection conn;

	public static Connection ConnecrDb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "");
			System.out.println("Connected");
			// JOptionPane.showMessageDialog(null, "Connected");
			return conn;
		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "Database Connection Failed");
			return null;
		}
	}
    
}
