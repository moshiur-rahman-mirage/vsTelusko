package dbconnect;
// Step 1: Import Package

import java.sql.*;

public class Connect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String query = "Select * from student";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=GAZI;encrypt=true;trustServerCertificate=true";
        // Database credentials
        int id = 6;
        String studentname = "rabit";

       String insertQuery="insert into student values(?,?) ";
        String username = "sa";
        String password = "123456";
        int i=0;
        // Step 2: Load & Register Driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        // Step 3: Create Connection
        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement st = con.prepareStatement(insertQuery);

//               ResultSet rs = st.executeQuery(query);

       )
       {
           st.setInt(1,id);
           st.setString(2,studentname);
           int count = st.executeUpdate();
           System.out.println(count+" Rows Affected");
//            while (rs.next() && i<10) {
//                String id = rs.getString("id");
//                String name = rs.getString("name");
//                System.out.println(id+" "+name);
//                i++;
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
