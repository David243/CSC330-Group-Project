package game;

	import java.awt.Color;
	import java.awt.Dimension;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	
public class ui {
	public void displayScreen() {
			
			JFrame screen= new JFrame("Game Name here"); //frame
	       
			JPanel upper =new JPanel(); //upper
		    upper.setBounds(0,0,1000,300);  //left cushion,top cushion, width, height  
		    upper.setBackground(Color.white);//end of upper
	       
			
			
	        JPanel lower = new JPanel(); //lower

	        lower.setBounds(0,300,1000,200);
	        lower.setBackground(Color.black); 
	       
	        JButton left = new JButton("left");
	        left.setBounds(100,100,300,300);
	        left.setBackground(Color.white);
	        
	        
	        JButton right = new JButton("right"); 
	        right.setBackground(Color.red);
	        
	        
	        lower.add(left);
	        lower.add(right);
	        
	        screen.add(upper);  
	        screen.add(lower);
	        screen.setSize(1000,500);    
	        screen.setLayout(null);    
	        screen.setVisible(true); 
	        
		}
		
		
		
	}
