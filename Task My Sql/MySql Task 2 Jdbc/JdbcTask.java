package jdbctask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTask {

	public static void main(String[] args) {
	
		Connection con = null;
		
		int [] empcode = {101,102,103,104,105};
		String[] empname = {"Jenny","Jacky","Joe","John","Shammer"};
		int[] empage = {25,30,20,40,25};
		double[] esalary= {10000,20000,40000,80000,90000};
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","@Az9443622818");
			
			PreparedStatement pst = con.prepareStatement("insert into employees(empcode,empname,empage,esalary)values(?,?,?,?)");
			
			for(int i=0;i<empcode.length;i++) {
				
				pst.setInt(1, empcode[i]);
				pst.setString(2, empname[i]);
				pst.setInt(3, empage[i]);
				pst.setDouble(4, esalary[i]);
				
				pst.executeUpdate();
				
			}
			System.out.println("Data entered MySql sucessfully");
			
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
