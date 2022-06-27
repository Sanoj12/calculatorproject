import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	
	boolean IsOperatorClicked=false;
	
 
	
	JFrame jf;
	JLabel displaylabel;
	JButton sevenbutton;
	
	String oldvalue,newvalue;
	float result;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
    JButton threebutton;
    JButton dotbutton;
    JButton zerobutton;
    
    
    
    JButton equaltobutton;
    JButton addbutton;
    JButton substractbutton;
    JButton multiplebutton;
    JButton divisionbutton;
    JButton clearbutton;
    
    
    
    
	Calculator(){
		
 jf=new JFrame("CALCULATOR");
		
	jf.setLayout(null);
	jf.setSize(600,600);
	jf.setLocation(300, 180);
	
    displaylabel =new JLabel();
	displaylabel.setBackground(Color.GRAY);
	displaylabel.setOpaque(true);
	displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
	displaylabel.setForeground(	Color.WHITE);
	displaylabel.setBounds(30, 50, 540, 40);
	jf.add(displaylabel);
	
	
	
	sevenbutton=new JButton("7");
	
	sevenbutton.setBounds(30, 130, 50, 50);
    sevenbutton.setFont(new Font("Arial", Font.BOLD, 18));;
    sevenbutton.addActionListener(this);
	jf.add(sevenbutton);
		
	eightbutton=new JButton("8");
	eightbutton.setBounds(110 ,130, 50, 50);
	eightbutton.setFont(new Font("Arial", Font.BOLD, 18));
	eightbutton.addActionListener(this);
	jf.add(eightbutton);
	
	ninebutton=new JButton("9");
	ninebutton.setBounds(190, 130, 50, 50);
	ninebutton.setFont(new Font("Arial", Font.BOLD, 18));;
	ninebutton.addActionListener(this);
	jf.add(ninebutton);
	
	
	 fourbutton=new JButton("4");
	fourbutton.setBounds(30,200, 50, 50);
	fourbutton.setFont(new Font("Arial", Font.BOLD, 18));;
	fourbutton.addActionListener(this);
	jf.add(fourbutton);
	
    fivebutton=new JButton("5");
	fivebutton.setBounds(110, 200, 50, 50);
	fivebutton.setFont(new Font("Arial", Font.BOLD, 18));;
	fivebutton.addActionListener(this);
	jf.add(fivebutton);
	
	
    sixbutton =new JButton("6");
	sixbutton.setBounds(190, 200, 50, 50);
    sixbutton.setFont(new Font("Arial", Font.BOLD, 18));;
    sixbutton.addActionListener(this);
	jf.add(sixbutton);



    onebutton =new JButton("1");
    onebutton.setBounds(30, 270, 50, 50);
    onebutton.setFont(new Font("Arial", Font.BOLD, 18));;
    onebutton.addActionListener(this);
    jf.add(onebutton);


    twobutton=new JButton("2");
    twobutton.setBounds(110,270, 50, 50);
    twobutton.setFont(new Font("Arial", Font.BOLD, 18));;
    twobutton.addActionListener(this);
	jf.add(twobutton);
	
    threebutton=new JButton("3");
    threebutton.setBounds(190, 270, 50, 50);
    threebutton.setFont(new Font("Arial", Font.BOLD, 18));;
    threebutton.addActionListener(this);
	jf.add(threebutton);
	
	
	dotbutton=new JButton(".");
	dotbutton.setBounds(30, 340, 50, 50);
	dotbutton.setFont(new Font("Arial", Font.BOLD, 18));;
	dotbutton.addActionListener(this);
	jf.add(dotbutton);
	
	zerobutton=new JButton("0");
    zerobutton.setBounds(110, 340, 50, 50);
    zerobutton.setFont(new Font("Arial", Font.BOLD, 18));;
    zerobutton.addActionListener(this);
	jf.add(zerobutton);
	
    equaltobutton=new JButton("=");
	equaltobutton.setBounds(190, 340, 50, 50);
	equaltobutton.setFont(new Font("Arial", Font.BOLD, 18));;
	equaltobutton.addActionListener(this);
	jf.add(equaltobutton);
	
	
	
	
	
	
    addbutton=new JButton("+");
	addbutton.setBounds(260, 130, 50, 50);
	addbutton.setFont(new Font("Arial", Font.BOLD, 18));;
	addbutton.addActionListener(this);
	jf.add(addbutton);
	
	
	 substractbutton=new JButton("-");
	 substractbutton.setBounds(260, 200, 50,50);
	 substractbutton.setFont(new Font("Arial", Font.BOLD, 18));;
	 substractbutton.addActionListener(this);
	 jf.add(substractbutton);
		
		
	 multiplebutton=new JButton("*");
	 multiplebutton.setBounds(260, 270, 50,50);
	 multiplebutton.setFont(new Font("Arial", Font.BOLD, 18));;
	 multiplebutton.addActionListener(this);
	 jf.add(multiplebutton);
		
		
	 divisionbutton=new JButton("/");
	 divisionbutton.setBounds(260, 340, 50,50);
	 divisionbutton.setFont(new Font("Arial", Font.BOLD, 18));;
	 divisionbutton.addActionListener(this);
	 jf.add(divisionbutton);
		
		
	

	    clearbutton=new JButton("Clear");
		clearbutton.setBounds(260, 410, 80, 80);
		clearbutton.setFont(new Font("Arial", Font.BOLD, 18));;
		clearbutton.addActionListener(this);
		jf.add(clearbutton);
	
	
	
	
	
	
	jf.setVisible(true);	
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
	}
	public static void main(String[] args) {
		/*Calculator c=*/new Calculator();
				
				
 	}

	public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()== sevenbutton) {
		
		if(IsOperatorClicked) {
			displaylabel.setText("7");
			IsOperatorClicked=false;
		}else {
		
		displaylabel.setText(displaylabel.getText()+ "7");
		}
		
		
		
		
	}else if(e.getSource()== eightbutton) {
		if(IsOperatorClicked) {
			displaylabel.setText("8");
			IsOperatorClicked=false;
		}else {
		
		
		displaylabel.setText(displaylabel.getText()+ "8");
		}
		
		
		
	}else if (e.getSource()==  ninebutton) {
		
		if(IsOperatorClicked) {
			displaylabel.setText("9");
			IsOperatorClicked=false;
		}else {
		
		displaylabel.setText(displaylabel.getText() + "9");
		}
		
		
	
	}else if(e.getSource()==  fourbutton) {
		
	
		if(IsOperatorClicked) {
			displaylabel.setText("4");
			IsOperatorClicked=false;

		}displaylabel.setText(displaylabel.getText()+ "4");
		
	
	
	}else if(e.getSource()==  fivebutton) {
		
		if(IsOperatorClicked) {
			displaylabel.setText("5");
			IsOperatorClicked=false;
		}else {
		
		displaylabel.setText(displaylabel.getText()+ "5");
	
		}
		
	 
	}else if(e.getSource()== sixbutton) {
		

		if(IsOperatorClicked) {
			displaylabel.setText("6");
			IsOperatorClicked=false;
		}else {
		
		displaylabel.setText(displaylabel.getText()+ "6");
		}
		
		
		
		
	}else if(e.getSource()== onebutton) {

		if(IsOperatorClicked) {
			displaylabel.setText("1");
			IsOperatorClicked=false;
		}else {
		
		displaylabel.setText(displaylabel.getText()+ "1");
		}
		
		
		
	}else if(e.getSource()== twobutton) {

		if(IsOperatorClicked) {
			displaylabel.setText("2");
			IsOperatorClicked=false;
		}else {
		
		displaylabel.setText(displaylabel.getText()+ "2");
		}
		
		
		
		
	}else if(e.getSource()== threebutton) {
		

		if(IsOperatorClicked) {
			displaylabel.setText("3");
			IsOperatorClicked=false;
		}else {
		
		displaylabel.setText(displaylabel.getText()+ "3");
		}
		
		
		
		
	}else if(e.getSource()== dotbutton) {
		displaylabel.setText(".");
	
	}else if(e.getSource()== zerobutton) {

		if(IsOperatorClicked) {
			displaylabel.setText("o");
			IsOperatorClicked=false;
		}else {
		
		displaylabel.setText(displaylabel.getText()+ "0");
		}
		
		
		
	
	
	}else if(e.getSource()== dotbutton) {
		
		displaylabel.setText(".");
	
	}else if(e.getSource()== equaltobutton) {
		
		String newvalue=displaylabel.getText();
		
	Float oldvalueF=Float.parseFloat(oldvalue);
	Float newvalueF=Float.parseFloat(newvalue);
		Float result=oldvalueF+newvalueF;
	    Float result=oldvalueF-newvalueF;
		Float result=oldvalueF*newvalueF;
		Float resuit=oldvalueF/newvalueF;
		
		displaylabel.setText(result+"");
		displaylabel.setText(result+"");
		displaylabel.setText(result+"");		
		displaylabel.setText(result+"");	
	}else if(e.getSource()== addbutton) {
		
		   
		IsOperatorClicked=true;
		oldvalue=displaylabel.getText();
		newvalue=displaylabel.getText();
		
		
		
		
		
	}else if(e.getSource()== substractbutton) {
		
		IsOperatorClicked=true;
		oldvalue=displaylabel.getText();
		newvalue=displaylabel.getText();
		
		
	}else if(e.getSource()== multiplebutton) {
		
		IsOperatorClicked=true;
		oldvalue=displaylabel.getText();
		newvalue=displaylabel.getText();
		
		
	}else if(e.getSource()== divisionbutton) {
		
		
		IsOperatorClicked=true;
		oldvalue=displaylabel.getText();
		newvalue=displaylabel.getText();
		
		
	}else if(e.getSource()== clearbutton) {
		
		displaylabel.setText("");
	}
	
		
		
		
		  
		
	}
}
 