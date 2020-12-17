package atelier11;

import java.awt.*;
import javax.swing.*;

public class Test {
	JFrame f;
	monPanneau p;
	public Test() {
	f = new JFrame();
	Container c = f.getContentPane();    
    // set the LayoutManager
    c.setLayout(new BorderLayout());        
    p = new monPanneau();    
    // add MyPanel object into container    
    c.add(p); 
    // set the size of the JFrame
    f.setSize(400,400);    
    // make the JFrame visible
    f.setVisible(true);    
    // sets close behavior; EXIT_ON_CLOSE invokes System.exit(0) on closing the JFrame
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }     
	
    public static void main(String args[ ]){    
        Test t = new Test();     
    } 
}
