import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Interface.Calculadora;

// a interface   ActionListener é itlizada para lidar com eventos como o click dos botões 
public class Calculadora extends JFrame implements ActionListener {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new Calculadora();
      }
    });
  }

  private JTextField textField;//campo de texto não idatavel 
  private JButton[] buttons; 
  private String[] buttonLabels = {
      "7", "8", "9", "/",
      "4", "5", "6", "*",
      "1", "2", "3", "-",
      "0", ".", "=", "+"
  };

  public Calculadora() {

    //super("Calculadora Swing/AWT");
    

    textField = new JTextField(15);
    textField.setEditable(false);

    JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
    buttons = new JButton[buttonLabels.length];

    for (int i = 0; i < buttonLabels.length; i++) {
      buttons[i] = new JButton(buttonLabels[i]);
      buttons[i].addActionListener(this);
      buttonPanel.add(buttons[i]);
    }

    setLayout(new BorderLayout());
    add(textField, BorderLayout.NORTH);
    add(buttonPanel, BorderLayout.CENTER);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }
}