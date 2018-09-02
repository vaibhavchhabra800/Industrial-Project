package Hotel_room_reservation_system;
import java.sql.*;
public class dbconnect {

    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public dbconnect()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","toor");
           st=con.createStatement();
           getdata();
           
        }
        catch(Exception ex)
        {
           System.out.println("Error =  "+ex); 
        }
    }
    public void getdata()
    {
        try
        {
            String query1="select * from users";
            System.out.println(query1);
            rs=st.executeQuery(query1);
            String hello="vaibhavhello";
            String vaibhav= "\""+hello+"\"";
            System.out.println(vaibhav);
            while(rs.next())
            {
                String USERNAME=rs.getString("username");
                String NAME=rs.getString("name");
                String ADDRESS=rs.getString("address");
                String CITY=rs.getString("city");
                String PHONE=rs.getString("phoneno");
                System.out.println(USERNAME);
                System.out.println(NAME);
                System.out.println(ADDRESS);
                System.out.println(CITY);
                System.out.println(PHONE);
                
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception == "+ex);
        }
    }
}
    
    
   