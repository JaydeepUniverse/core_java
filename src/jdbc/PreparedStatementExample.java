package jdbc;

import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) throws SQLException {
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/devops", "root", "devops");
	    PreparedStatement p = c.prepareStatement("insert into emp values(?,?,?)");
	    p.setInt(1, 11);
	    p.setString(2, "aaa");
	    p.setInt(3, 110000);
	    p.executeUpdate();
	    ResultSet r = p.executeQuery("select * from emp");
	    while(r.next())
		System.out.println(r.getInt(1) + " " + r.getString(2) + " " + r.getInt(3));
	    c.close();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}	
    }
}
