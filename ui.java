package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.util.ResourceBundle;
import java.util.*;

import edu.cuny.csi.csc330.project.GameChoices;

public class UI implements ActionListener
{
	BinaryTree bt = new BinaryTree();
	Node current;
	JFrame screen;
	JPanel upper;
	JLabel titleLabel;
	JTextArea label1;
	JPanel lower;
	JButton start, left, right, restart;
	
	
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
	
	public void gameScreen(String story, String lCH, String rCh) //(String story, String lCh, String rCh)
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
       
        left = new JButton(lCH); 
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
	
	public void endScreen(String story)
	{
	upper = new JPanel(); //upper
	upper.setBounds(0,0,1000,300);
	upper.setBackground(Color.white);//end of upper
	    
        lower = new JPanel(); //lower
        lower.setBounds(0,300,1000,200);
        lower.setBackground(Color.black); 
        
        restart = new JButton("Restart");
        restart.setBackground(Color.red);
        restart.addActionListener(this);
        
        lower.add(restart);
        screen.add(upper);  
        screen.add(lower); 
        screen.setVisible(true); 
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == start)
		{
			upper.setVisible(false);
			lower.setVisible(false);
			current = bt.root;
			gameScreen(current.story,current.leLabel,current.rLabel);
		}
		else if(e.getSource() == left)
		{
			upper.setVisible(false);
			lower.setVisible(false);
			if(current.left != null)
			{
				current = current.left;
			}
			if(current.isLeaf())
			{
				endScreen(current.story);
			}
			else
			{
				gameScreen(current.story,current.leLabel,current.rLabel);
			}
		}
		else if(e.getSource() == right)
		{
			upper.setVisible(false);
			lower.setVisible(false);
			if(current.right != null)
			{
				current = current.right;
			}
			if(current.isLeaf())
			{
				endScreen(current.story);
			}
			else
			{
				gameScreen(current.story,current.leLabel,current.rLabel);
			}
		}
		else if(e.getSource() == restart)
		{
			upper.setVisible(false);
			lower.setVisible(false);
			current = bt.root;
			gameScreen(current.story,current.leLabel,current.rLabel);
		}
	
	}
	
	

	
	
	public static void main(String[] args) {

	    UI s = new UI();
	    
		GameChoices.initFromPropBundle();
	    
	    
	    int arr[] = {45,34,70,24,38,62,80,21,27,37,41,79,82,26,28,81,83};
	    Storage[] stringArr = Arrays.copyOf(GameChoices.stringArr(), arr.length);
		for (int i = 0; i < arr.length;i++) {
			s.bt.add(arr[i],stringArr[i]);
		}
	    
//	    s.bt.add(45, Node45);
//	    s.bt.add(34, Node34);
//	    s.bt.add(70, Node70);
//	    s.bt.add(24, Node24);
//	    s.bt.add(38, Node38);
//	    s.bt.add(62, Node62);
//	    s.bt.add(62, Node80);
//	    s.bt.add(21, Node21);
//	    s.bt.add(27, Node27);
//	    s.bt.add(37, Node37);
//	    s.bt.add(41, Node41);
//	    s.bt.add(79, Node79);
//	    s.bt.add(82, Node82);
//	    s.bt.add(26, Node26);
//	    s.bt.add(28, Node28);
//	    s.bt.add(81, Node81);
//	    s.bt.add(83, Node83);
	    s.startScreen();
		
	}


}
