
package Hotel_room_reservation_system;

import java.sql.*;


public class BOOKROOMS {
    
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public BOOKROOMS(){
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
       
    public void checkdata(String username,String[] restdata)
    {
        
        try
        {
            
            int status=Integer.parseInt(restdata[0]);
            String checkin=restdata[1];
            String checkout=restdata[2];
            int rooms=Integer.parseInt(restdata[3]);;
            System.out.println("vaibahv username="+username);
            String query1="update users set checkin=?,checkoutn=?,rooms=?,hasrequested=? where username= "+"\""+username+"\""+ ";";
            PreparedStatement preparedStmt = con.prepareStatement(query1);
            preparedStmt.setString(1, checkin);
            preparedStmt.setString(2, checkout);
            preparedStmt.setInt(3, rooms);
            preparedStmt.setInt(4, 1);


      // execute the java preparedstatement
      preparedStmt.executeUpdate();
      System.out.println("Done done done");       
           
            
            }
        catch(Exception ex)
        {
            System.out.println("vaibhav there there is Exception yaha hai== "+ex);
        
        }
}
}