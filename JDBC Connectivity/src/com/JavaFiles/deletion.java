package com.JavaFiles;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class deletion {
	public void deleteData() {
		try {
			Scanner scanner = new Scanner(System.in);
			Connection con = new LoadDriver().loadingDriver();
			Statement stmt = con.createStatement();
			stmt.execute("DELETE FROM actor WHERE actor_id <= 19");
			System.out.println("Data Deleted");
			con.close();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
