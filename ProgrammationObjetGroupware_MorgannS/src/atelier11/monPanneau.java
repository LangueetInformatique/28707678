package atelier11;

import javax.swing.*;
import java.awt.*;
// MyPanel extends JPanel, which will eventually be placed in a JFrame
public class monPanneau extends JPanel { 
    // custom painting is performed by the paintComponent method
    @Override
    public void paintComponent(Graphics g){
        // clear the previous painting
        super.paintComponent(g);
        // cast Graphics to Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red); // sets Graphics2D color
        // draw the rectangle
        g2.drawRect(0,0,100,100); // drawRect(x-position, y-position, width, height)
        g2.setColor(Color.blue);
        g2.fillRect(200,0,100,100); // fill new rectangle with color blue
    
     public menu (Color c, String nom, String[] prenoms){
    	this.setBackground(c);
 		JMenuBar mb = new JMenuBar();
 		this.add(mb);
 		
 		JMenu m = new JMenu("prenoms");
 		mb.add(m);
 		for (int i = 0;i < prenoms.length;i++)
 			m.add(prenoms[i]);
     }
       	
    } 
}