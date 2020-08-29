import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdk", "root", "root");
			System.out.println("Got connection");
			
			String insertData="insert into employee values('RRR',1,1000,'JAVA')";
			Statement st=con.createStatement();
			int row_inserted=st.executeUpdate(insertData);
			if(row_inserted>0){
				System.out.println("Row Inserted !!!");
			}
			else{
				System.out.println("Sorry row not inserted");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
