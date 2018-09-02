package Hotel_room_reservation_system;

import java.sql.*;


 public class getdataadmin {
       
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public  String thestring[][] ;

    public getdataadmin()
    {
        try
        {

            Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","toor");
           st=con.createStatement();
             thestring=checkdata2();

           
        }
        catch(Exception ex)
        {
           System.out.println("Error =  "+ex); 
        }
    }
    

 
    
   
      public  String[][] checkdata2()
    {
         int noofrows=1;
         String[][] values={{"1"},{"2"}};

        try
        {
            String query1="select username,phoneno,rooms,hasrequested from users;";
           
             String noofrowsquery="select count(username) from users;";
             rs=st.executeQuery(noofrowsquery);

             while(rs.next())
            {
               noofrows=rs.getInt("count(username)");
               
            break;
            }
           
   
          values=new String[noofrows][5];

              rs=st.executeQuery(query1);
             int i=0;
             
              while(rs.next())
              {
                 

                          values[i][0]=rs.getString("username");
                          values[i][1]=rs.getString("phoneno");
                          values[i][2]=Integer.toString(rs.getInt("rooms"));
                          values[i][3]=Integer.toString(rs.getInt("hasrequested"));
                          values[i][4]=Integer.toString(noofrows);
                          i++;
                  

                  
               }
              
              for (int j=0;j<noofrows;j++)
              {
                  //System.out.println();
                  for(int k=0;k<5;k++)
                  { 
                    //  System.out.print(values[j][k]+"   ");
                  }
                  
              }
        
           
      
            
                        
           
            }
            
              catch(Exception ex)
        {
            System.out.println("vaibhav Exception Chhabra yaha hai== "+ex);
        }
         return values;
    }
 }
 


