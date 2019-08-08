package com.JavaFiles;

import java.sql.*;
public class Fetch {

	public void fetchData() {
		try {
			Connection con=new LoadDriver().loadingDriver();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from actor");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  "
						+ rs.getString(4));
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
