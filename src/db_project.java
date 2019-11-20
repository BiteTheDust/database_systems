import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class db_project {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://cs1.calstatela.edu:5432/cs4222s08","cs4222s08", "*****"); //edited out password
			PreparedStatement stmt = con.prepareStatement("select * from professor");
			ResultSet Rs = stmt.executeQuery();
			while(Rs.next()) {
				System.out.println(Rs.getString(1)+" "+Rs.getString(2));
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " exception");
		}
	}
}