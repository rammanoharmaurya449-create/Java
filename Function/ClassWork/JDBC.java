import java.sql.*;

class JDBC {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/college";  // Database details
        String username = "root";     // MySQL username
        String password = "Ram@12345";    // MySQL password
        String query = "select * from students";   // Query to run

        // Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");

        // Create a statement
        Statement st = con.createStatement();

        // Execute the query
        ResultSet rs = st.executeQuery(query);

        // Process the results
        while (rs.next()) {
            String name = rs.getString("name");   // Retrieve name column
            System.out.println(name);             // Print result
        }

        // Close resources
        st.close();
        con.close();
        System.out.println("Connection Closed....");
    }
}