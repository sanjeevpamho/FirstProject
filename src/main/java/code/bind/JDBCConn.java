package code.bind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConn {

	public static void main(String[] args) {

		try {
			//   Class.forName("oracle.jdbc.Driver.OracleDriver");
			Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			Statement st = conn.createStatement();
			System.out.println("connection successful");

			ResultSet rs=st.executeQuery("select * from employees where employee_id=102");  

			while(rs.next()){  

				int id  = rs.getInt("employee_id");
				int age = rs.getInt("salary");
				String first = rs.getString("first_name");
				String last = rs.getString("last_name");

				//Display values
				System.out.print("ID: " + id);
				System.out.print(", salary: " + age);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);

			}  
			rs.close();
			st.close();
			
			conn.close();
		} 
		catch (Exception e) {

			System.out.println("error : " + e);
		}  


	}

}
