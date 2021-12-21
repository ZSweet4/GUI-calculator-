// Calculator Start Code
import javax.swing.*;  
import java.awt.event.*;  
public class Main implements ActionListener {  
    // Delcare Text Fields
    JTextField tf1,tf2,tf3;
    // Declare buttons  
    JButton b1, b2, b3, b4;  
    Main() {  
        // Setup frame and element locations and boundaries
        JFrame f = new JFrame("Calculator"); 
        // Text fields 
        tf1 = new JTextField();  
        tf1.setBounds(50,50,150,20);  
        tf2 = new JTextField();  
        tf2.setBounds(50,100,150,20);  
        tf3 = new JTextField();  
        tf3.setBounds(50,150,150,20);  
        tf3.setEditable(false);
        // Buttons
        b1 = new JButton("+");  
        b1.setBounds(50,200,50,50);  
        b1.addActionListener(this);  

        b2 = new JButton("-");
        b2.setBounds(100,200,50,50);
        b2.addActionListener(this);

        b3 = new JButton("*");
        b3.setBounds(150,200,50,50);
        b3.addActionListener(this);

        b4 = new JButton("/");
        b4.setBounds(200,200,50,50);
        b4.addActionListener(this);
        // Add to form
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1); 
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  

        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b2); 
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true); 

        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b3); 
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true); 

        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b4); 
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true); 
    }         
    public void actionPerformed(ActionEvent e) {  
        // Read in numbers
        String s1 = tf1.getText();  
        String s2 = tf2.getText();  
        double a = Double.parseDouble(s1);  
        double b = Double.parseDouble(s2);  
        double c = 0;
        // Do math
        if (e.getSource() == b1) {  
            c = a + b;  
        } 
        if (e.getSource() == b2){
            c = a - b; 
        }
        if (e.getSource() == b3){
            c = a * b;
        }
        if (e.getSource() == b4){
            c = a / b;
        }
        // Drop .0 decimals
        int tempC = (int) c;
        double minus = c-tempC;
        if (minus == 0.0) {
          int d = (int) c;
          String result = String.valueOf(d);
          tf3.setText(result); 
        } else {
          double d = c;
          String result = String.valueOf(d);
          tf3.setText(result); 
        }         
    }  
  public static void main(String[] args) {  
    new Main();  
  } 
}  
//Zachary Sweet
//11/18/2021