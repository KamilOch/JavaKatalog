package klasa_class.klasaWewnetrzna.FactoryPiotr;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSwingExample {
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("click");//creating instance of JButton  
b.setBounds(130,100,100, 40);//x axis, y axis, width, height  

    JPanel comp = new JPanel();
    f.add(comp);//adding button in JFrame

          comp.add(b);

    JLabel aaaa = new JLabel("aaaa");


    b.addActionListener(e -> {

        aaaa.setText("aaaaa");
        System.out.println("duuuppaaaaaa");
    }

    );




    f.setSize(400,500);//400 width and 500 height
    f.setLayout(null);//using no layout managers
    f.setVisible(true);//making the frame visible
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


}
} 