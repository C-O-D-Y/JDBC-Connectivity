package com.JavaFiles;

import java.sql.Connection;
import java.sql.Statement;

public class Insertion {

	public void insertData() {
		try {
			Connection con = new LoadDriver().loadingDriver();
			Statement stmt = con.createStatement();
			
			
			stmt.executeUpdate("INSERT INTO actor " + 
	                "VALUES (1001, 'Simpson', 'Springfield', '2019-08-08 16:16:16')");
			System.out.println("Data inserted");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
