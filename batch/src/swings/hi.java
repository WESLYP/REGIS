package swings;
import java.awt.BorderLayout;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class hi {
	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://mysql1.cuwjnmiakuxh.us-west-1.rds.amazonaws.com/sonoo","admin","wesly1411");  
		System.out.println("hi");
		
		
		JFrame f=new JFrame("LOGIN");
		
		JLabel l1=new JLabel("USERNAME");
		l1.setBounds(30, 30, 90, 40);
		
		JTextField text=new JTextField();
		text.setBounds(110, 30, 150, 40);
		
		
		JLabel l2=new JLabel("PASS");
		l2.setBounds(30, 85, 90, 40);
		
		JPasswordField jp=new JPasswordField();
		jp.setBounds(110,85,150,40);
		
		
		JButton b1=new JButton("Login");
		b1.setBounds(110, 130, 90, 40);
		
		JLabel forShowing=new JLabel();
		forShowing.setBounds(180,200,100,150);
		
		f.add(jp);
		f.add(l1);
		//f.add(j1);
		f.add(b1);
		f.add(l2);
		f.add(text);
		f.add(forShowing);
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//String details=text.getText()+" "+new String(jp.getPassword());
				String user=text.getText();
				String passs=new String(jp.getPassword());
//				System.out.println(details);
//				forShowing.setText(details);
				
				
				try {
					PreparedStatement st = con.prepareStatement("Insert into reg values(?,?)");
					st.setString(1,user);
					st.setString(2,passs);
					st.execute();
					con.close();
		            JOptionPane.showMessageDialog(null, "REGISTERED SUCCESSFULLY");

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		
		
//		JButton b=new JButton("clickkkkk");
//		b.setBounds(1096, 325, 90,70);
//		
//		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		System.out.println("connectedddddd");
		}catch(Exception e){
			System.out.println("error");
		}

//		
//		JFrame.setDefaultLookAndFeelDecorated(true);
//	    JFrame frame = new JFrame("Get X and Y coordinates");
//	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	 
//	    frame.setLayout(new BorderLayout());
//	    frame.setSize(1000,200);
//	 
//	    final JTextField text = new JTextField();;
//	    frame.add(text,BorderLayout.SOUTH);
//	 
//	    frame.addMouseListener(new MouseListener() {
//	        public void mousePressed(MouseEvent me) { }
//	        public void mouseReleased(MouseEvent me) { }
//	        public void mouseEntered(MouseEvent me) { }
//	        public void mouseExited(MouseEvent me) { }
//	        public void mouseClicked(MouseEvent me) { 
//	          int x = me.getX();
//	          int y = me.getY();
//	          text.setText("X:" + x + " Y:" + y); 
//	        }
//	    });
//	 
//	    frame.setVisible(true);
	}
}

