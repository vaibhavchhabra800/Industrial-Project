package Hotel_room_reservation_system;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
 
import java.awt.event.*;
 
import javax.swing.table.*;
 
public class JTableDatabase {
    private static Vector columnNames = new Vector();
    private static Vector data = new Vector();
//  private static Vector buttons = new Vector();
    private static JPanel p = new JPanel();
    private static Connection con;
    private static JButton btnDelete = new JButton();
 
    public static void main(String[] args) {
        // ButtonColumn deleteCol = new ButtonColumn(table , delete, 0) ;
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/userdb", "root", "toor");
            String sql = "select * from userlist";
            Statement stmt;
 
            stmt = con.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery(sql);
 
            ResultSetMetaData md = rs.getMetaData();
 
            int columns = md.getColumnCount();
            for (int i = 1; i <= columns; i++) {
                columnNames.addElement(md.getColumnName(i));        
            }
            while (rs.next()) {
                Vector vectorRow = new Vector(columns);
                for (int i = 1; i <= columns; i++) {
                    vectorRow.addElement(rs.getObject(i));                  
                }
                data.addElement(vectorRow);
                //data.add(btnDelete);
            }
 
            rs.close();
 
            stmt.close();
 
        } catch (Exception e) {
            System.out.println(e);
        }
//      DefaultTableModel dm = new DefaultTableModel();
//      dm.setDataVector(data, buttons);
     
        JTable table = new JTable(data, columnNames);
        TableColumn col;
        for (int i = 0; i < table.getColumnCount(); i++) {
            col = table.getColumnModel().getColumn(i);
            col.setMaxWidth(250);
        }
        JScrollPane scrollPane = new JScrollPane(table);
        p.add(scrollPane);
        JFrame f = new JFrame();
        f.add(p);
        f.setSize(600, 400);
        f.setVisible(true);
 
         
 
    }
    }