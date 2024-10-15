import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		int red = (int)(Math.random()*(255-1+1))+1;
		int green = (int)(Math.random()*(255-1+1))+1;
		int blue = (int)(Math.random()*(255-1+1))+1;
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
  
        
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g2.drawLine(765/2, 10, 765/2,550 );
		
		//top left
		int lines = 0;
		while(lines <= 100) {
			red = (int)(Math.random()*(255-1+1))+1;
			green = (int)(Math.random()*(255-1+1))+1;
			blue = (int)(Math.random()*(255-1+1))+1;
			g.setColor(new Color(red, green, blue));
			g.drawLine((int)(Math.random()*(763/2-11+1)) + 11, (int)(Math.random()*(539/2-11+1)) + 11, (int)(Math.random()*(763/2-11+1)) + 11, (int)(Math.random()*(539/2-11+1)) + 11);
			lines++;
		}
		
		//top right
		int squares = 0;
		while(squares <= 100) {
			red = (int)(Math.random()*(255-1+1))+1;
			green = (int)(Math.random()*(255-1+1))+1;
			blue = (int)(Math.random()*(255-1+1))+1;
			g.setColor(new Color(red, green, blue));
			g.fillRect((int)(Math.random()*(714-767/2+1)) + 767/2, (int)(Math.random()*(219-11+1)) + 11, 50, 50);
			squares ++;
		}
		
		//bottom left
		int circles = 0;
		while(circles <= 100) {
			int diameter = (int)(Math.random()*(200-1+1))+1;
			red = (int)(Math.random()*(255-1+1))+1;
			green = (int)(Math.random()*(255-1+1))+1;
			blue = (int)(Math.random()*(255-1+1))+1;
			g.setColor(new Color(red, green, blue));
			g.drawOval((int)(Math.random()*((382-diameter)-11+1)) + 11, (int)(Math.random()*((539-diameter)-271+1)) + 271, diameter, diameter);
			circles ++;
		}
		
		//bottom right
		g.setColor(new Color((int)(Math.random()*(255-1+1))+1, 0, 0));
		g.fillRect(650, 700, 50, 50);
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		 

	
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
