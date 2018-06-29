
package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class GUI implements ActionListener
{
    JFrame frame;
    JButton btn1,btn2,btn3,btn4,btn5,btn6;
    JLabel lab1,lab2,mlabel,nlabel,ans1,ans2;
    JTextField t1,t2;
    Container con;
    Font font;
    public int x,y;
    public long res,res1;
    public double a,b,s;
    public String str,str1,str2;
    public void initGUI()
    {
        frame=new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBounds(320,170,395,430);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
     
        font = new Font("Serif BOLD",Font.ITALIC,26);
        
        con = frame.getContentPane();
        con.setBackground(Color.LIGHT_GRAY);
        
//
//  Label
//
        mlabel  =new JLabel("CALCULATOR");    //  Header
        con.add(mlabel);
        mlabel.setFont(font);
        mlabel.setBounds(110,30,200,40);
        
        
        lab1 = new JLabel("Enter 1st number  : ");
        con.add(lab1);
        lab1.setBounds(45,129, 150, 20);
       
        lab2 = new JLabel("Enter 2nd number : ");
        con.add(lab2);
        lab2.setBounds(45,156, 150, 20);
        
        nlabel = new JLabel("made by: Muhammad Ahsan  (NUCES)");
        con.add(nlabel);
        nlabel.setBounds(45,380, 265, 20);
        
        ans1 = new JLabel("Desired answer is  : ");
        con.add(ans1);
        ans1.setBounds(45,210,150,20);
        
        ans2 = new JLabel("00");
        con.add(ans2);
        ans2.setBounds(195,210,180,20);
//
//  Text Fields
//
    t1=new JTextField();
    con.add(t1);
    t1.setBounds(195,130,50,20);
    
    t2=new JTextField();
    con.add(t2);
    t2.setBounds(195,155,50,20);
        
//
//  Buttons
//
        //  add button
        btn1 = new JButton();
        con.add(btn1);
        btn1.setText("ADD");
        btn1.setBounds(12, 300, 110, 30);
        //  subract button
        btn2 = new JButton();
        con.add(btn2);
        btn2.setText("SUBTRACT");
        btn2.setBounds(131, 300, 114, 30);
        //  multiply button
        btn3 = new JButton();
        con.add(btn3);
        btn3.setText("Multiply");
        btn3.setBounds(252, 300, 114, 30);
        //  Divide button ////////////////////    new line
        btn4 = new JButton();
        con.add(btn4);
        btn4.setText("Divide");
        btn4.setBounds(12, 340, 110, 30);
        //  modulous button
        btn5 = new JButton();
        con.add(btn5);
        btn5.setText("Modulous");
        btn5.setBounds(131, 340, 114, 30);
        //  Factorial button
        btn6 = new JButton();
        con.add(btn6);
        btn6.setText("Factorial");
        btn6.setBounds(252, 340, 114, 30); 
        //  Design is ended here
        //  Working Start here
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        
    }
     public void actionPerformed(ActionEvent e)
     {
         
        str1= t1.getText();
        str2=t2.getText();
        x = Integer.parseInt(str1);
        y = Integer.parseInt(str2);
         
         if(e.getSource()==btn1)
         {
             res=x+y;
             ans2.setText(""+res);
         }
            
         else if(e.getSource()==btn2)
         {
             res=x-y;
             ans2.setText(""+res);
         }
         else if(e.getSource()==btn3)
         {
             res=x*y;
             ans2.setText(""+res);
         }
         else if(e.getSource()==btn4)
         {
            a = x * 1.0;
            b = y * 1.0;
            s = a/b;
            ans2.setText(""+s);
         }
         else if(e.getSource()==btn5)
         {
             res=x%y;
             ans2.setText(""+res);
            
         }
         else if(e.getSource()==btn6)
         {
             res=res1=1;
             for(int i=1; i<=x ; i++)
             {
                 res = res * i;
             }
             for(int i=1; i<=y ; i++)
             {
                 res1 = res1 * i;
             }
            // ans2.setText(x+" = "+res+" || "+y+" = "+res1);
            ans2.setText(""+res+"  &  "+res1);
         }
            
       }
}

class Calculator 
{ 
    public static void main(String[] args) 
    {
        GUI obj = new GUI();
        obj.initGUI();
    }
    
}
