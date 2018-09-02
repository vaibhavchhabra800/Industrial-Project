package Hotel_room_reservation_system;

import java.sql.*;
 public class newuser {
       
    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public newuser(String user_name,String na_me,String add_ress,String ci_ty,String phone_no,String pass_word)
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","toor");
           st=con.createStatement();
           insertdata(user_name,na_me,add_ress,ci_ty,phone_no,pass_word);
           
        }
        catch(Exception ex)
        {
           System.out.println("Error =  "+ex); 
        }
    }
    

 
   

 
   
    public void insertdata(String user_name,String na_me,String add_ress,String ci_ty,String phone_no,String pass_word)
    {
        try
        {
            String query1="INSERT INTO users(username,name,address,city,phoneno,password,status)"
                    + " values(?,?,?,?,?,?,?);";
            PreparedStatement preparedStatement = con.prepareStatement(query1);
            //"+"\""+user_name+"\""+","+"\""+na_me+"\""+","+          "\""+add_ress+"\""
            //+","+"\""+ci_ty  +"\""   +  ","  +"\""+phone_no+ "\""  +
            //","+"-1
            System.out.println(query1);
            preparedStatement.setString(1, user_name);
            preparedStatement.setString(2, na_me);
            preparedStatement.setString(3, add_ress);
            preparedStatement.setString(4,  ci_ty);
            preparedStatement.setString(5, phone_no);
            preparedStatement.setString(6, pass_word);
            preparedStatement.setInt(7, -1);
           
            
            preparedStatement.executeUpdate(); 
        }
        catch(Exception ex)
        {
            System.out.println("vaibhav there there is Exception == "+ex);
        }
    }
}

