import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

class CFFrame extends JFrame{

Container c;

JLabel lblTc;
JButton btnSubmit, btnBack;
JTextField txtTc;

CFFrame(){

c = getContentPane();
c.setLayout(null);

lblTc = new JLabel("Enter temprature in celcius: " , JLabel.CENTER);
txtTc = new JTextField(60);
btnSubmit = new JButton("Submit");
btnBack = new JButton("Back");

Font f = new Font("Courier" , Font.BOLD , 25);
lblTc.setFont(f); 
txtTc.setFont(f);
btnSubmit.setFont(f);
btnBack.setFont(f);

lblTc.setBounds(10,100,600,50);
txtTc.setBounds(200,190,180,40);
btnSubmit.setBounds(220,350,150,35);
btnBack.setBounds(220,400,150,35);


c.add(lblTc);
c.add(txtTc);
c.add(btnSubmit);
c.add(btnBack);


ActionListener a1=(ae) -> {
TC a = new TC();
dispose();
};
btnBack.addActionListener(a1);


ActionListener a2=(ae) -> {
try{
	if(txtTc.getText().equals("")){
		throw new Exception("This feild should not be empty");
	}
	double tc = Double.parseDouble(txtTc.getText());
	double tf = (tc*1.8)+32.0;
	JOptionPane.showMessageDialog(c, "Temprature in Fahrenheit : " + String.format("%.2f",tf) +"F");
	txtTc.setText("");
	txtTc.requestFocus();
}
catch(NumberFormatException e){
	JOptionPane.showMessageDialog(c,"Enter numbers only");
	txtTc.setText("");
	txtTc.requestFocus();
}	
catch(Exception e){
	JOptionPane.showMessageDialog(c,e.getMessage());
	txtTc.setText("");
	txtTc.requestFocus();
}
};
btnSubmit.addActionListener(a2);


setTitle("Celcius to fahrenheit");
setSize(600,600);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);


}
}