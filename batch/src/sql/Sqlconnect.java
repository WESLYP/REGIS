package sql;
import java.sql.*;
public class Sqlconnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://mysql1.cuwjnmiakuxh.us-west-1.rds.amazonaws.com/sonoo","admin","wesly1411");  
//		here sonoo is database name, root is username and password  
//		Statement stmt=con.createStatement();  
//		ResultSet rs=stmt.executeQuery("select * from emp where age=4"); 
//		stmt.execute("insert into emp values(1,'hiinserttt',10)"); 
//
//		
//		System.out.println("connected");
//		while(rs.next())  
//		System.out.println(rs.getInt("id")+"  "+rs.getString("name")+"  "+rs.getString("age"));  
//		con.close();  
		
		PreparedStatement st = con.prepareStatement("Insert into reg values(?,?)");
		st.setString(1,"wes");
		st.setString(2,"wwwww");
		System.out.println("completedddd");
		st.execute();
		con.close();
		}catch(Exception e){
			System.out.println(e);
			}  
		}  
		

	


}
