import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonTest2{
   public static void main (String[] args) {
      // set up frame container
      ButtonTestFrame frame = new ButtonTestFrame ("Button Tester");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.pack();
   }
}

class ButtonTestFrame extends JFrame 
{
   JPanel panel;
   JButton buttonRed,buttonBlue;
   
   public ButtonTestFrame(String s)
   {  
      super(s);

      // set up a new panel in the frame
      panel = new JPanel();
      buttonRed = new JButton("Red");
      panel.add(buttonRed);
      buttonRed.addActionListener(new ButtonListener());

      buttonBlue = new JButton("Blue");
      panel.add(buttonBlue);
      buttonBlue.addActionListener(new ButtonListener());
   
      add(panel);
   }
   // private inner class
   class ButtonListener implements ActionListener{
      public void actionPerformed (ActionEvent e) {
         JButton b = (JButton)(e.getSource());
   
         if (b.getText().compareTo("Red") == 0)
           panel.setBackground(Color.red);
         else
            panel.setBackground(Color.blue);

         // OR
         /*
         if (e.getSource() == buttonRed)
            panel.setBackground(Color.red);
         else
            panel.setBackground(Color.blue);
         */
      }
   }
}