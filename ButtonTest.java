import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest{
	public static void main (String[] args) {
		// set up frame container
		ButtonTestFrame frame = new ButtonTestFrame("Button Tester");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
      frame.pack();
	}
}

class ButtonTestFrame extends JFrame 
{
   private JPanel panel;
   private JButton button;
   
   public ButtonTestFrame(String s)
   {  
      super(s);

      // set up a new panel in the frame
      panel = new JPanel();
      
      // create button 
      button = new JButton("Red");
      // add button to frame
      panel.add(button);
      // **** ADD ACTION LISTENER ****
      button.addActionListener(new ButtonListener());
   
      add(panel);
   }
   
   // private inner class (can see private data of containing class)
   class ButtonListener implements ActionListener{
      public void actionPerformed (ActionEvent e) 
      {
         panel.setBackground(Color.red);
      }
   }
}