
package Hotel_room_reservation_system;

import java.sql.*;


public class getdataafterlogin {
   
    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public getdataafterlogin()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","toor");
           st=con.createStatement();
          
           
        }
        catch(Exception ex)
        {
           System.out.println("Error =  "+ex); 
        }
    }
    

   
    public String[] checkdata(int idreceived)
    {
        try
        {
            
            String query1="select username,status,checkin,checkoutn,rooms from users where id= "+idreceived+ ";";
            System.out.println(query1);
            
            rs=st.executeQuery(query1);
            String username;
            int status;
            String checkin;
            String checkout;
            int rooms;
                 while(rs.next())
                 {
               username=rs.getString("username");
               status=rs.getInt("status");
               checkin=rs.getString("checkin");
               checkout=rs.getString("checkoutn");
               rooms=rs.getInt("rooms");
               String alldata[]={username,Integer.toString(status),checkin,checkout,Integer.toString(rooms)};
               return alldata;
               
                  }
            
            }
        catch(Exception ex)
        {
            System.out.println("vaibhav there there is Exception yaha hai== "+ex);
        
        }
        return null;
}
}



