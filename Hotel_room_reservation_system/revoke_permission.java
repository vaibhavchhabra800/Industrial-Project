package Hotel_room_reservation_system;
import java.sql.*;
import javax.swing.text.html.HTMLDocument;

public class revoke_permission

{
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public  String thestring[][] ;
    public int selectedrow;
   
    
       public int rowreceived(int giveselectedrow)
       {
           selectedrow=giveselectedrow;
          // System.out.println("Row === "+selectedrow);
           return selectedrow;
           
       }


       
      public  void rejecthim()
    {
        String username="";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","toor");
           st=con.createStatement();
           
           
            String query2="select username from users limit "+   Hotel_room_reservation_system.l  +",1";
            rs=st.executeQuery(query2);
            while(rs.next())
            {
               username=rs.getString("username");
               break;
            }
         //  System.out.println(username);
             
           
           String query1="UPDATE users SET status=? WHERE username ="+"\"" +username +"\""+";";

            PreparedStatement prep=con.prepareStatement(query1);

           prep.setInt(1, 0);

           prep.executeUpdate();

           con.close();

             
            }
            
            catch(Exception ex)
        {
            System.out.println("vaibhav Exception Chhabra yaha hai== "+ex);
        }
         
    }
       
 } 