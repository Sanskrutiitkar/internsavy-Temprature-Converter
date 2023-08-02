import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class TC extends JFrame
{
Container c;
JLabel lblproj;
JButton btncf , btnfc;

TC(){
c = getContentPane();
c.setLayout(null);

lblproj = new JLabel("Welcome to Temprature Converter!");
btncf = new JButton("celsius to farenhite");
btnfc = new JButton("farenheit to celsius");

Font f =  new Font("Courier",Font.BOLD,20);
lblproj.setFont(f);
btncf.setFont(f);
btnfc.setFont(f);

lblproj.setBounds(80,75,550,25);
btncf.setBounds(80,150,400,50);
btnfc.setBounds(80,250,400,50);

c.add(lblproj);
c.add(btncf);
c.add(btnfc);

ActionListener a1=(ae) -> {
CFFrame a = new CFFrame();
dispose();
};
btncf.addActionListener(a1);

ActionListener a2=(ae) -> {
FCFrame a = new FCFrame();
dispose();
};
btnfc.addActionListener(a2);


setTitle("Temprature Converter");
setSize(600,600);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}
}