package game;

	import java.awt.Color;
	import java.awt.Dimension;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	
public class ui {
	public void startScreen()
	{
		
		Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
		Font sButton = new Font("Times New Roman", Font.PLAIN, 75);
		
		screen = new JFrame("Hitamo");
		upper = new JPanel();
		lower = new JPanel();
		titleLabel = new JLabel("Hitamo");
		start = new JButton("START");
		
		//setting window size
		screen.setSize(1000,500);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.getContentPane().setBackground(Color.black);
		screen.setLayout(null);
		
		upper.setBounds(0,0,1000,300); //left cushion,top cushion, width, height  
		upper.setBackground(Color.black);
		titleLabel.setForeground(Color.white);
		titleLabel.setFont(titleFont);
		
		lower.setBounds(0,300,1000,200);
		lower.setBackground(Color.black);
		
		start.setBackground(Color.blue);
		start.setForeground(Color.white);
		start.addActionListener(this);
		start.setFont(sButton);
		
		upper.add(titleLabel);
		lower.add(start);
		screen.add(upper);
		screen.add(lower);
		screen.setVisible(true);
	}
	
	public void gameScreen(String story, String lCh, String rCh) //(String story, String lCh, String rCh)
	{	
		Font sFont = new Font("Times New Roman", Font.PLAIN, 30);
		Font cFont = new Font("Times New Roman", Font.PLAIN, 30);
		
        label1 = new JTextArea(story);
        label1.setLineWrap(true);
        label1.setWrapStyleWord(true);
        label1.setBounds(0,10,900,300);
        label1.setFont(sFont);
		
		upper = new JPanel(); //upper
		upper.setBounds(0,0,1000,300);
	    upper.setBackground(Color.white);//end of upper
		
        lower = new JPanel(); //lower
        lower.setBounds(0,300,1000,200);
        lower.setBackground(Color.black); 
       
        left = new JButton("test"); 
        left.setBounds(100,100,300,300);
        left.setBackground(Color.white);
        left.addActionListener(this);
        left.setFont(cFont);
        
        right = new JButton(rCh); 
        right.setBackground(Color.red);
        right.addActionListener(this);
        right.setFont(cFont);
        
        upper.add(label1);
        
        lower.add(left);
        lower.add(right);
        
        screen.add(upper);  
        screen.add(lower);    
        screen.setVisible(true); 
        
	}
		
		
		
	}
