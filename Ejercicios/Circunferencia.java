import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circunferencia extends JApplet {
  public void paint (Graphics g) {
    g.drawString ("O",50,50);
  }
  public static void main (String[] args){
    frame = new Jframe ("Cargando JApplet");
    Circunferencia circunferenciaApplet = new Circunferencia();
    
    circunferenciaApplet.init();
    frame.getContentPane().add(circunferenciaApplet);
    frame.setSize(200.200);
    frame.setVisible(true);
}
}