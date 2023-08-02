import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

class FCFrame extends JFrame{

Container c;

JLabel lblTf;
JButton btnSubmit, btnBack;
JTextField txtTf;

FCFrame(){
c= getContentPane();
c.setLayout(null);

lblTf = new JLabel("Enter temprature in fahrenheit: " , JLabel.CENTER);
txtTf = new JTextField(10);
btnSubmit = new JButton("Submit");
btnBack = new JButton("Back");

Font f = new Font("Courier" , Font.BOLD , 25);
lblTf.setFont(f); 
txtTf.setFont(f);
btnSubmit.setFont(f);
btnBack.setFont(f);

lblTf.setBounds(10,100,600,50);
txtTf.setBounds(200,190,180,40);
btnSubmit.setBounds(220,350,150,35);
btnBack.setBounds(220,400,150,35);

c.add(lblTf);
c.add(txtTf);
c.add(btnSubmit);
c.add(btnBack);


ActionListener a1=(ae) -> {
TC a = new TC();
dispose();
};
btnBack.addActionListener(a1);


ActionListener a2=(ae) -> {
try{
	if(txtTf.getText().equals("")){
		throw new Exception("This feild should not be empty");
	}
	double tf = Double.parseDouble(txtTf.getText());
	double tc = (tf - 32 )/1.8;
	JOptionPane.showMessageDialog(c, "Temprature in Celcius : " + String.format("%.3f",tc) +"C");
	txtTf.setText("");
	txtTf.requestFocus();
}
catch(NumberFormatException e){
	JOptionPane.showMessageDialog(c,"Enter numbers only");
	txtTf.setText("");
	txtTf.requestFocus();
}	
catch(Exception e){
	JOptionPane.showMessageDialog(c,e.getMessage());
	txtTf.setText("");
	txtTf.requestFocus();
}
};
btnSubmit.addActionListener(a2);


setTitle("fahrenheit to celcius ");
setSize(600,600);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);


}


}