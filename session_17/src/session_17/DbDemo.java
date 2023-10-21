package session_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DbDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		PreparedStatement pstmt;
		ResultSet rs;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		double salary;
		
		//Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		//Establish Connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
		System.out.println("Connection Established");
		
		//Create Statement
		pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		System.out.println("Enter Employee ID: ");
		id = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		name = sc.next();
		System.out.println("Enter Employee Salary: ");
		salary = sc.nextDouble();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setDouble(3, salary);
		
		int status = pstmt.executeUpdate();
		if(status == 1) {
			System.out.println("Successfully Inserted");
		}else {
			System.out.println("Faild!");
		}
		rs = pstmt.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
	}
}
