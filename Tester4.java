import javax.swing.*;
import java.awt.*; // for layout
public class Tester4 
{
   public static void main(String [] args) 
   {
      JFrame frame = new MyFrame("New Frame ...");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

   }
}

class MyFrame extends JFrame 
{
   // create panel containers
   private JPanel p1,p2,p3,p4;
   
   public MyFrame(String s) 
   {
      super (s);
      
      // layout of "this" JFrame
      setLayout(new GridLayout(2,2));
       
      // create individual panels to demonstrate layouts
      p1 = new JPanel();
      p1.setBackground(Color.RED);
      p1.setLayout(new FlowLayout());
      for (int i = 1; i <= 5;i++)
         p1.add(new JLabel("Label"+i));

       
      p2 = new JPanel();
      p2.setBackground(Color.GREEN);
      p2.setLayout(new GridLayout(3,2));
      for (int i = 1; i <= 5;i++)
         p2.add(new JLabel("Label"+i));

       
      p3 = new JPanel();
      p3.setBackground(Color.MAGENTA);
      p3.setLayout(new GridLayout(1,0));
      for (int i = 1; i <= 5;i++)
         p3.add(new JLabel("Label"+i));

       
      p4 = new JPanel();
      p4.setBackground(Color.CYAN);
      p4.setLayout(new BorderLayout());
      p4.add(new JLabel("Label1"),BorderLayout.NORTH);
      p4.add(new JLabel("Label2"),BorderLayout.SOUTH);
      p4.add(new JLabel("Label3"),BorderLayout.EAST);
      p4.add(new JLabel("Label4"),BorderLayout.WEST);
      p4.add(new JLabel("Label5"),BorderLayout.CENTER);
//       JLabel label = new JLabel("Label5");
//       label.setHorizontalAlignment(JLabel.CENTER);
//       p4.add(label,BorderLayout.CENTER);
       
        
      // add panels to JFrame              
      add(p1);
      add(p2);
      add(p3);
      add(p4);
             
      
   }

}