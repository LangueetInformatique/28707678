package atelier12;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import java.awt.*;

public class testJTextComponent {


	public static void main(String[] args) {
		// Declaration de la JFrame
		 JFrame fen = new JFrame("testJTextField"); fen.setSize(280, 280); 
		 JPanel p = new JPanel();
		 fen.getContentPane().add(p);
		 JTextField jtf = new JTextField("Morgann");
		 p.add(jtf);
		 
		 // STYLE 
		 
		//StyledDocument dsdoc = jtf.getStyledDocument();
		//dsdoc.putProperty("Titre" , "L'avare");
		Style s = ((StyledDocument) jtf).addStyle("Personnage" , null);
		StyleConstants.setForeground(s, Color.PINK);
		StyleConstants.setFontSize(s, 22);
		StyleConstants.setItalic(s, true);
		//StyleConstants.FontFamily(s, Times);
        StyleConstants.setBackground(s, Color.blue);  

		 
//			Affichage de la JFrame et de son contenu
		 fen.setVisible(true);

	}

}
