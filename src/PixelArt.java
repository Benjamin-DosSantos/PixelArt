import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;


public class PixelArt extends Applet{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Generates a screen size framework
    int Screenwidth = (int) screenSize.getWidth();	// Makes a variable for screen width
	int Screenheight = (int) screenSize.getHeight();	// Makes a variable for screen height
	
	Color bgColor = Color.DARK_GRAY;
	
	public void init(){
		this.setSize(new Dimension(Screenwidth, Screenheight));
		this.setBackground(bgColor);
	}// End of init
	
	public void paint(Graphics g){
		int cube_size = 10;
		int x_pos = 0;
		int y_pos = 0;
		
		for(int i = 0; i < Screenwidth; i++){
			g.drawLine(x_pos, y_pos, x_pos, y_pos + Screenheight);
			x_pos += cube_size;
		}
		
		for(int i = 0; i < Screenheight; i++){
			g.drawLine(x_pos, y_pos, x_pos + Screenwidth, y_pos);
			y_pos += cube_size;
		}
		
	}// End of Paint
}// End of class
