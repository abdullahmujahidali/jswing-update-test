import javax.swing.*;
import java.awt.event.*;

public class Main {
  public static void main(String[] args) {
    // creating instance of JFrame
    JFrame f = new JFrame();

    // creating instance of JButton
    JButton b = new JButton("Click me!");

    // x axis, y axis, width, height
    b.setBounds(80, 100, 250, 40);

    // add event listener
    b.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Hello world!");
      }
    });

    // add button to JFrame
    f.add(b);

    f.setSize(400, 500);
    f.setLayout(null);
    // make the frame visible
    f.setVisible(true);
  }
}