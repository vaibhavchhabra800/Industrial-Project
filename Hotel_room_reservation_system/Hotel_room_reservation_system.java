package Hotel_room_reservation_system;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class Hotel_room_reservation_system extends JFrame implements ActionListener {

    public JFrame jf1;
    public JFrame mainframe;
    public JFrame registerjf1;
    public JFrame adminjf1;
    public JPanel jp1;
    public JPanel adminjp1;
    public JPanel mainpanel;
    public JPanel registerjp1;
    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
    public JLabel label5;
    public JLabel mainpanellabel1;
    public JLabel mainpanellabel2;

    public JButton jb1;
    public JButton jb2;
    public JButton registerjb1;
    public JButton registerjb2;
    public JButton registerjb3;
    public JButton registerjb4;
    public JButton mainpaneljb1;
    public JButton mainpaneljb2;

    public JTable jt1;
    public JPanel jtjp1;
            
    public JLabel registerlabel1;
    public JLabel registerlabel2;
    public JLabel registerlabel3;
    public JLabel registerlabel4;
    public JLabel registerlabel5;
    public JLabel registerlabel6;
  
    
    public JLabel datechecklabel;

    public JTextField tf1;
    public JTextField tf2;
    public JTextField tf3;
    public JTextField tf4;
    public JTextField tf5;
    public JTextField registertf1;
    public JTextField registertf2;
    public JTextField registertf3;
    public JTextField registertf4;
    public JTextField registertf5;
    public JPasswordField registertf6;
    public JTextField mainpaneltf1;
    public JTextField mainpaneltf2;

    public JPanel jptf1;
    public JPanel jptf2;
    public JPanel jptf3;
    public JPanel jptf4;
    public JPanel jptf5;
    public JPanel registerjptf1;
    public JPanel registerjptf2;
    public JPanel registerjptf3;
    public JPanel registerjptf4;
    public JPanel registerjptf5;
    public JPanel registerjptf6;
    public JPanel mainpaneljptf1;
    public JPanel mainpaneljptf2;
    public static int l;
    
    
    
    
    
  
    public Hotel_room_reservation_system() {
        guimake();
    }

    public void guimake() {
        jf1 = new JFrame("BOOK A ROOM");
        registerjf1 = new JFrame("New Customer");
        mainframe = new JFrame("Hotel Room Reservation System");
        adminjf1 = new JFrame("ADMIN");
        jp1 = new JPanel();
        adminjp1 = new JPanel();
        jtjp1 =new JPanel();
        registerjp1 = new JPanel();
        mainpanel = new JPanel(null);
        jptf1 = new JPanel(new BorderLayout());
        jptf2 = new JPanel(new BorderLayout());
        jptf3 = new JPanel(new BorderLayout());
        jptf4 = new JPanel(new BorderLayout());
        jptf5 = new JPanel(new BorderLayout());

        registerjptf1 = new JPanel(new BorderLayout());
        registerjptf2 = new JPanel(new BorderLayout());
        registerjptf3 = new JPanel(new BorderLayout());
        registerjptf4 = new JPanel(new BorderLayout());
        registerjptf5 = new JPanel(new BorderLayout());
        registerjptf6 = new JPanel(new BorderLayout());

        mainpaneljptf1 = new JPanel(new BorderLayout());
        mainpaneljptf2 = new JPanel(new BorderLayout());

        jt1=new JTable();
        label1 = new JLabel("USERNAME", SwingConstants.RIGHT);
        label2 = new JLabel("STATUS", SwingConstants.RIGHT);
        label3 = new JLabel("CHECK IN", SwingConstants.RIGHT);
        label4 = new JLabel("CHECK OUT", SwingConstants.RIGHT);
        label5 = new JLabel("ROOMS", SwingConstants.RIGHT);
     
        
        datechecklabel = new JLabel("", SwingConstants.RIGHT);

        registerlabel1 = new JLabel("USERNAME", SwingConstants.RIGHT);
        registerlabel2 = new JLabel("NAME", SwingConstants.RIGHT);
        registerlabel3 = new JLabel("ADDRESS", SwingConstants.RIGHT);
        registerlabel4 = new JLabel("CITY", SwingConstants.RIGHT);
        registerlabel5 = new JLabel("PHONE", SwingConstants.RIGHT);
        registerlabel6 = new JLabel("PASSWORD", SwingConstants.RIGHT);

        mainpanellabel1 = new JLabel("USERNAME", SwingConstants.RIGHT);
        mainpanellabel2 = new JLabel("PASSWORD", SwingConstants.RIGHT);

        tf1 = new JTextField("", 40);
        tf2 = new JTextField("", 40);
        tf3 = new JTextField("", 40);
        tf4 = new JTextField("", 40);
        tf5 = new JTextField("", 40);

        registertf1 = new JTextField("", 40);
        registertf2 = new JTextField("", 40);
        registertf3 = new JTextField("", 40);
        registertf4 = new JTextField("", 40);
        registertf5 = new JTextField("", 40);
        registertf6 = new JPasswordField("", 40);

        mainpaneltf1 = new JTextField("", 40);
        mainpaneltf2 = new JPasswordField("", 40);

        jb1 = new JButton("BOOK");
        jb2 = new JButton("LOG OUT");
        
        
        
        
        
        
        
        
        
        
         acceptrequest  objacceptreq=new acceptrequest();

       
         String[] columns = {"username", "Phone", "ROOMS","Allow","Cancel"};
         getdataadmin obj1=new getdataadmin();
          String[][] data = obj1.thestring;
          int no_of_rows=Integer.parseInt(data[0][4]);
          int hasrequested[]=new int[no_of_rows];
          for(int i=0;i<no_of_rows;i++)
          {
                  hasrequested[i]=Integer.parseInt(data[i][3]);
                  data[i][3]="Allow";
              
              }
          for(int i=0;i<no_of_rows;i++)
          {
             
                  data[i][4]="Cancel";
              
          }
        /*  String data2[][] =
                {{"John", "18", "Male","Allow","Cancel"},
                  {"Daisy", "19", "Female","Allow","Cancel"},
                  {"Dave", "23", "Male","Allow","Cancel"},
                  {"Jake", "30", "Male","Allow","Cancel"}};
  */
          jt1 = new JTable(data, columns);
  
         jt1.setPreferredScrollableViewportSize(new Dimension(450, 63));
         jt1.setFillsViewportHeight(true);
  
         JScrollPane jps = new JScrollPane(jt1);

      //   jt1.rowAtPoint(evt.getPoint());


         ListSelectionModel model = jt1.getSelectionModel();
        
         model.addListSelectionListener(new ListSelectionListener()
         {

            public void valueChanged(ListSelectionEvent e) {
                if(!model.isSelectionEmpty())
                {
                int selectedRow;


                    if(!e.getValueIsAdjusting() )
                    {   
                      selectedRow=model.getMinSelectionIndex();
                      Hotel_room_reservation_system.l=objacceptreq.rowreceived(selectedRow);

                    }
                }
                else
                    System.out.println("Maybe this is going on");
            }

             
         });
         
         
        jt1.getColumnModel().getColumn(3).setCellRenderer((TableCellRenderer) new ButtonRenderer2(jt1));;
	
	//SET CUSTOM EDITOR TO TEAMS COLUMN
	jt1.getColumnModel().getColumn(3).setCellEditor(new ButtonEditor2(new JTextField()));
	
         
        jt1.getColumnModel().getColumn(4).setCellRenderer((TableCellRenderer) new ButtonRenderer2(jt1));;
	
	//SET CUSTOM EDITOR TO TEAMS COLUMN
	jt1.getColumnModel().getColumn(4).setCellEditor(new ButtonEditorcancel(new JTextField()));
	
         
         
         
         
        
        
        jb1.setLocation(20, 200);
        jb1.setSize(80, 30);
        jb2.setLocation(120, 200);
        jb2.setSize(120, 30);

        registerjb1 = new JButton("Register");
        registerjb2 = new JButton("Cancel");
        registerjb1.setLocation(10, 230);
        registerjb1.setSize(100, 30);
        registerjb2.setLocation(120, 230);
        registerjb2.setSize(100, 30);

        mainpaneljb1 = new JButton("LOG IN");
        mainpaneljb1.setLocation(10, 160);
        mainpaneljb1.setSize(100, 30);

        mainpaneljb2 = new JButton("REGISTER");
        mainpaneljb2.setLocation(130, 160);
        mainpaneljb2.setSize(100, 30);

        mainframe.setSize(300, 300);

        jf1.setSize(600, 600);
        registerjf1.setSize(600, 600);
        adminjf1.setSize(900, 900);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerjf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminjf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerjf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminjf1.setLayout(null);
        mainframe.setLayout(null);
        jp1.setBackground(Color.WHITE);
        adminjp1.setBackground(Color.WHITE);
        jp1.setLayout(null);
        registerjp1.setLayout(null);
        ImageIcon img = new ImageIcon("C:\\Users\\vaibhav2\\Documents\\NetBeansProjects\\Hotel_room_reservation_system\\src\\Hotel_room_reservation_system\\camera.png");

        jp1.setSize(250, 400);
        jptf1.setSize(100, 22);
        jptf2.setSize(100, 22);
        jptf3.setSize(100, 22);
        jptf4.setSize(100, 22);
        jptf5.setSize(100, 22);

        registerjptf1.setSize(100, 22);
        registerjptf2.setSize(100, 22);
        registerjptf3.setSize(100, 22);
        registerjptf4.setSize(100, 22);
        registerjptf5.setSize(100, 22);
        registerjptf6.setSize(100, 22);

        mainpaneljptf1.setSize(100, 22);
        mainpaneljptf2.setSize(100, 22);

        adminjp1.setSize(800, 800);

        mainpanel.setSize(250, 200);
        

        registerjp1.setSize(250, 400);
        registerjp1.setBackground(Color.WHITE);

        jt1.setPreferredScrollableViewportSize(new Dimension(450, 133));
        jtjp1.setSize(550,220);
        
        
        jf1.setLayout(null);
        label1.setSize(70, 30);
        label2.setSize(70, 30);
        label3.setSize(70, 30);
        label4.setSize(70, 30);
        label5.setSize(70, 30);
        
        datechecklabel.setSize(230, 30);

        registerlabel1.setSize(70, 30);
        registerlabel2.setSize(70, 30);
        registerlabel3.setSize(70, 30);
        registerlabel4.setSize(70, 30);
        registerlabel5.setSize(70, 30);
        registerlabel6.setSize(70, 30);

        mainpanellabel1.setSize(70, 30);
        mainpanellabel2.setSize(70, 30);

        jf1.setIconImage(img.getImage());
        mainframe.setIconImage(img.getImage());
        adminjf1.setIconImage(img.getImage());
        registerjf1.setIconImage(img.getImage());
        label1.setLocation(20, 30);
        label2.setLocation(20, 60);
        label3.setLocation(20, 90);
        label4.setLocation(20, 120);
        label5.setLocation(20, 150);

        registerlabel1.setLocation(20, 30);
        registerlabel2.setLocation(20, 60);
        registerlabel3.setLocation(20, 90);
        registerlabel4.setLocation(20, 120);
        registerlabel5.setLocation(20, 150);
        registerlabel6.setLocation(20, 180);
        
        
        datechecklabel.setLocation(10, 250);

        mainpanellabel1.setLocation(20, 30);
        mainpanellabel2.setLocation(20, 60);

        jp1.setBackground(Color.WHITE);

        mainpanel.setBackground(Color.WHITE);

        jp1.setLocation(20, 25);
        adminjp1.setLocation(20, 25);

        mainpanel.setLocation(20, 25);

        registerjp1.setLocation(20, 25);

        jptf1.setLocation(120, 35);
        jptf2.setLocation(120, 63);
        jptf3.setLocation(120, 94);
        jptf4.setLocation(120, 123);
        jptf5.setLocation(120, 153);

        registerjptf1.setLocation(120, 35);
        registerjptf2.setLocation(120, 63);
        registerjptf3.setLocation(120, 94);
        registerjptf4.setLocation(120, 123);
        registerjptf5.setLocation(120, 153);
        registerjptf6.setLocation(120, 183);

        mainpaneljptf1.setLocation(120, 35);
        mainpaneljptf2.setLocation(120, 63);

        //Actions performed
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BOOKROOMS obj6=new BOOKROOMS();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        	try{
                Date checkiin = sdf.parse(tf3.getText());
        	Date checkoout = sdf.parse(tf4.getText());
                if(checkiin.compareTo(checkoout)>0)
                {
                    System.out.println("checkin greate than checkout");
                    datechecklabel.setText("Plz enter a valid checkin/checkout date");
                }
                else{
                        String restdata[]={tf2.getText(),tf3.getText(),tf4.getText(),tf5.getText()};
                        obj6.checkdata(tf1.getText(),restdata);
                        JButton jbb2=new JButton("OK");
                        JOptionPane.showMessageDialog(jbb2, "Thanks your ur req is being processed logout");
                        datechecklabel.setText("");

                        }
            }
                catch(Exception ex)
                {System.out.println("Date Exception");}
                
            }
        });

        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jf1.setVisible(false);
                mainframe.setVisible(true);
                  mainpaneltf1.setText("");
                mainpaneltf2.setText("");
            }
        });
        registerjb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              mainframe.setVisible(true);
              registerjf1.setVisible(false);
            }
        });
        
        
               
        registerjb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             String user_name;
             String na_me;
             String add_ress;
             String ci_ty;
             String phone_no;
             String pass_word;
             user_name=registertf1.getText();
             na_me=registertf2.getText();
             add_ress=registertf3.getText();
             ci_ty=registertf4.getText();
             phone_no=registertf5.getText();
            
             System.out.println("Shit username vaibhav vaibhav =="+user_name);
             pass_word=registertf6.getText();

             new newuser(user_name,na_me,add_ress,ci_ty,phone_no,pass_word);
             registerjf1.setVisible(false);
             
             mainframe.setVisible(true);
             mainpaneltf1.setText("");
             mainpaneltf2.setText("");
            }
        });
        
         mainpaneljb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            mainframe.setVisible(false);
            registerjf1.setVisible(true);
            
            }
        });
        
        mainpaneljb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            String user_name;
            String pass_word;
            user_name=mainpaneltf1.getText();
            pass_word=mainpaneltf2.getText();
            if(user_name.equals("admin")&&pass_word.equals("admin"))
                    {
                        adminjf1.setVisible(true);
                        mainframe.setVisible(false);
                    }
         else{
                    
                       
            lo_gin obj4=new lo_gin(user_name,pass_word);
            int id= obj4.checkdata(user_name,pass_word);    
            if(id!=-1){
                  mainframe.setVisible(false);
                 jf1.setVisible(true);
                 String alldata[];
                 getdataafterlogin obj5=new getdataafterlogin();
                 alldata=obj5.checkdata(id);
                 tf1.setText(alldata[0]);
                 tf1.setEditable(false);
                 tf2.setText(alldata[1]);
                 tf3.setText(alldata[2]);
                 tf4.setText(alldata[3]);
                 tf5.setText(alldata[4]);

                                                   tf1.setText(alldata[0]);

                                  
                 
                 
                  }
            else
                 {
                JButton jbb1=new JButton();
                jbb1.setText("OK");
                JOptionPane.showMessageDialog(jbb1,"Incorrect Username/Password ");
                  }
            }
          }
            
      });
         
         
  
        
        
        
                
                
                
                
                
                
        
        jp1.add(label1);
        jp1.add(label2);
        jp1.add(label3);
        jp1.add(label4);
        jp1.add(label5);

        jp1.add(jb1);
        jp1.add(jb2);

        registerjp1.add(registerjb1);
        registerjp1.add(registerjb2);

        mainpanel.add(mainpanellabel1);
        mainpanel.add(mainpanellabel2);

        jptf1.add(tf1);
        jptf2.add(tf2);
        jptf3.add(tf3);
        jptf4.add(tf4);
        jptf5.add(tf5);

        registerjptf1.add(registertf1);
        registerjptf2.add(registertf2);
        registerjptf3.add(registertf3);
        registerjptf4.add(registertf4);
        registerjptf5.add(registertf5);
        registerjptf6.add(registertf6);

        mainpaneljptf1.add(mainpaneltf1);
        mainpaneljptf2.add(mainpaneltf2);

        jp1.add(jptf1);
        jp1.add(jptf2);
        jp1.add(jptf3);
        jp1.add(jptf4);
        jp1.add(jptf5);

        registerjp1.add(registerjptf1);
        registerjp1.add(registerjptf2);
        registerjp1.add(registerjptf3);
        registerjp1.add(registerjptf4);
        registerjp1.add(registerjptf5);
        registerjp1.add(registerjptf6);

        mainpanel.add(mainpaneljptf1);
        mainpanel.add(mainpaneljptf2);

        registerjp1.add(registerlabel1);
        registerjp1.add(registerlabel2);
        registerjp1.add(registerlabel3);
        registerjp1.add(registerlabel4);
        registerjp1.add(registerlabel5);
        registerjp1.add(registerlabel6);
       
        
        jp1.add(datechecklabel);

        mainpanel.add(mainpaneljb1);
        mainpanel.add(mainpaneljb2);

        mainframe.add(mainpanel);
        registerjf1.add(registerjp1);
     //   adminjf1.add(jt);
     //  adminjp1.add(jp);
      jtjp1.add(jps,BorderLayout.CENTER);
      adminjp1.add(jtjp1);
         
        jf1.add(jp1);
        adminjf1.add(adminjp1);
        //jf1.add(tf1);
        jf1.setVisible(false);
           registerjf1.setVisible(false);
        mainframe.setVisible(true);
        
        adminjf1.setVisible(false);
    }

    
    

    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Hotel_room_reservation_system();
                new getdataadmin();
                //new NewClass();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}




//BUTTON RENDERER CLASS
class ButtonRenderer2  implements  TableCellRenderer
{       public JButton jbinside;

	//CONSTRUCTOR
	public ButtonRenderer2(JTable jt1) {
		//SET BUTTON PROPERTIES
                jbinside =new JButton();
		jbinside.setOpaque(true);
	}
	public Component getTableCellRendererComponent(JTable table, Object obj,
			boolean selected, boolean focused, int row, int col) {
		
		//SET PASSED OBJECT AS BUTTON TEXT
			jbinside.setText((obj==null) ? "":obj.toString());
				
		return jbinside;
	}
	
}

//BUTTON EDITOR CLASS
class ButtonEditor2 extends DefaultCellEditor
{
	protected JButton btn;
	private String lbl;
	private Boolean clicked;
	 
	 public ButtonEditor2(JTextField txt) {
		super(txt);
		btn=new JButton();
		btn.setOpaque(true);
		
		//WHEN BUTTON IS CLICKED
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			acceptrequest obj2=new acceptrequest();
                   	obj2.accepthim();

                        fireEditingStopped();

			}
		});
	}
	 
	 //OVERRIDE A COUPLE OF METHODS
	 
      
         @Override
	public Component getTableCellEditorComponent(JTable table, Object obj,
		boolean selected, int row, int col) {

		//SET TEXT TO BUTTON,SET CLICKED TO TRUE,THEN RETURN THE BTN OBJECT
                 lbl=(obj==null) ? "":obj.toString();
		 btn.setText(lbl);
		 clicked=true;
		 return btn;
                        
                }
	
	 
	//IF BUTTON CELL VALUE CHNAGES,IF CLICKED THAT IS
	 @Override
	public Object getCellEditorValue() 
{

        if(clicked)
	{
			
                            
            //SHOW US SOME MESSAGE
				
                            JOptionPane.showMessageDialog(btn, " Granted permission");
                         //   btn.setVisible(false);
                          //  super.setVisible(false);
			}
          //SET IT TO FALSE NOW THAT ITS CLICKED
          clicked=false;
	  return new String(lbl);
	 // return null;
	}
	
	 @Override
	public boolean stopCellEditing() {

	       //SET CLICKED TO FALSE FIRST
			clicked=false;
                      //  btn.setVisible(false);
		return super.stopCellEditing();
                
	}
	 
	 @Override
	protected void fireEditingStopped() {
		// TODO Auto-generated method stub
		super.fireEditingStopped();
                //btn.setVisible(false);
	}

}

//Button editor class for cancel
class ButtonEditorcancel extends DefaultCellEditor
{
	protected JButton btn;
	private String lbl;
	private Boolean clicked;
	 
	 public ButtonEditorcancel(JTextField txt) {
		super(txt);
		btn=new JButton();
		btn.setOpaque(true);
		
		//WHEN BUTTON IS CLICKED
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			revoke_permission obj3=new revoke_permission();
                   	obj3.rejecthim();

                        fireEditingStopped();

			}
		});
	}
	 
	 //OVERRIDE A COUPLE OF METHODS
	 
      
         @Override
	public Component getTableCellEditorComponent(JTable table, Object obj,
		boolean selected, int row, int col) {

		//SET TEXT TO BUTTON,SET CLICKED TO TRUE,THEN RETURN THE BTN OBJECT
                 lbl=(obj==null) ? "":obj.toString();
		 btn.setText(lbl);
		 clicked=true;
		 return btn;
                        
                }
	
	 
	//IF BUTTON CELL VALUE CHNAGES,IF CLICKED THAT IS
	 @Override
	public Object getCellEditorValue() 
{

        if(clicked)
	{
			
                            
            //SHOW US SOME MESSAGE
				
                        
                        revoke_permission obj3 = new revoke_permission();
                        obj3.rejecthim();

                        JOptionPane.showMessageDialog(btn, " Revoked permission");
                         //   btn.setVisible(false);
                          //  super.setVisible(false);
			}
          //SET IT TO FALSE NOW THAT ITS CLICKED
          clicked=false;
	  return new String(lbl);
	 // return null;
	}
	
	 @Override
	public boolean stopCellEditing() {

	       //SET CLICKED TO FALSE FIRST
			clicked=false;
		return super.stopCellEditing();
                
	}
	 
	 @Override
	protected void fireEditingStopped() {
		// TODO Auto-generated method stub
		super.fireEditingStopped();
                //btn.setVisible(false);
	}

}