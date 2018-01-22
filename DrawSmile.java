package DrawSmile;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
/**
 *
 * @author sema
 */
public class DrawSmile extends JPanel{
    
    public void paintComponent(Graphics g){
    
    super.paintComponents(g);
    
    //Hair
    g.setColor(Color.blue);
    g.drawLine(50,50,100,6);
    g.drawLine(60,60,90,6);
    g.drawLine(70,70,80,6);
    g.drawLine(80,50,70,6);
    g.drawLine(90,50,60,6);
    g.drawLine(100,50,50,6);
    //Face
    g.setColor(Color.pink);
    g.fillOval(10,10, 200,200);
    //Eyes
    g.setColor(Color.BLACK);   
    g.fillOval(55, 65, 30, 30); 
    g.fillOval(135, 65, 30, 30);
    //Noise
    g.setColor(Color.black);
    g.fillOval(95, 100, 20, 20);
    //Mouth
    g.setColor(Color.red);   
    g.fillRect(50, 135, 120, 30);
    g.fillOval(50, 140, 120, 40);
    
    }
    
}
