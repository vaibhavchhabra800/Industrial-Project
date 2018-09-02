package Hotel_room_reservation_system;
import java.sql.*;

public class lo_gin 
{
    
    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public lo_gin(String user_name,String pass_word)
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
    

 


 
   
    public int checkdata(String user_name,String pass_word)
    {
        try
        {
            int id=-1;
            String query1="select password from users where username="+"\""+user_name+"\";";
            System.out.println("Vaibhav new user quer1="+query1);
            
            rs=st.executeQuery(query1);
            String passcheck;
            while(rs.next())
            {
               passcheck=rs.getString("password");
              
            if(passcheck.equals(pass_word))
            {
                  String query2="select id from users where username= "+"\""+user_name+"\";";
            rs=st.executeQuery(query2);
               while(rs.next())
                {
               id=rs.getInt("id");
               System.out.println("authorised user vaibhav");

               return id;
                }
                
            } 
            else
            {
                return id;
            }
            break;
            }
            
                        
            
        }
        catch(Exception ex)
        {
            System.out.println("vaibhav there there is Exception yaha hai== "+ex);
        
        }
        return -1;
}
}



