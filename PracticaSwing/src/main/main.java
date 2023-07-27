package main;

import com.sun.tools.javac.Main;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author reych
 */
public class main extends JFrame {
   
    public main (){
      JLabel lblHola= new JLabel("Hola!");  
        
      
      add(lblHola);
      this.setSize(300,300);
      this.setTitle("JFrame");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
    }
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new main();
    }
    
}
