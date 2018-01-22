
package DrawSmile;
import javax.swing.JFrame;
import java.awt.Graphics;
/**
 *
 * @author sema
 */
public class DrawSmileTest {
    
    public static void main(String [] args){
    DrawSmile panel = new DrawSmile();
    JFrame app = new JFrame();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   app.add(panel);
    app.setSize(300,300);
    app.setVisible(true);
    
    }
    
}
