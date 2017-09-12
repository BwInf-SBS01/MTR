import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung  GBO von MTR
  *
  * @version 1.0 vom 12.09.2017
  * @author Paul Hollmann
  */

public class Gbo extends JFrame {
  // Anfang Attribute
  //private Parser parser;
  private JList jList1 = new JList();
    private DefaultListModel jList1Model = new DefaultListModel();
    private JScrollPane jList1ScrollPane = new JScrollPane(jList1);
  private JTextField jTextField1 = new JTextField();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JButton jButton8 = new JButton();
  private JButton jButton9 = new JButton();
  private JButton jButton10 = new JButton();
  private JButton jButton11 = new JButton();
  private JButton jButton12 = new JButton();
  private JButton jButton13 = new JButton();
  private JButton jButton14 = new JButton();
  private JButton jButton15 = new JButton();
  private JButton jButton16 = new JButton();
  private JButton jButton17 = new JButton();
  private JButton jButton18 = new JButton();
  private JButton jButton19 = new JButton();
  private JButton jButton20 = new JButton();
  private JButton jButton21 = new JButton();
  private JButton jButton22 = new JButton();
  // Ende Attribute
  
  public Gbo(/*Parser parser*/) { 
    // Frame-Initialisierung
    super("Mathematischer Taschenrechner");
    //this.parser = parser;
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 768; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jList1.setModel(jList1Model);
    jList1ScrollPane.setBounds(560, 8, 150, 228);
    cp.add(jList1ScrollPane);
    jTextField1.setBounds(16, 208, 382, 28);
    jTextField1.setEditable(false);
    cp.add(jTextField1);
    jButton1.setBounds(16, 168, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(16, 128, 75, 25);
    jButton2.setText("jButton2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(16, 96, 75, 25);
    jButton3.setText("jButton3");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jButton4.setBounds(16, 64, 75, 25);
    jButton4.setText("jButton4");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(96, 168, 75, 25);
    jButton5.setText("jButton5");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(96, 128, 75, 25);
    jButton6.setText("jButton6");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    cp.add(jButton6);
    jButton7.setBounds(96, 96, 75, 25);
    jButton7.setText("jButton7");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });
    cp.add(jButton7);
    jButton8.setBounds(96, 64, 75, 25);
    jButton8.setText("jButton8");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
    cp.add(jButton8);
    jButton9.setBounds(176, 168, 75, 25);
    jButton9.setText("jButton9");
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton9_ActionPerformed(evt);
      }
    });
    cp.add(jButton9);
    jButton10.setBounds(176, 128, 75, 25);
    jButton10.setText("jButton10");
    jButton10.setMargin(new Insets(2, 2, 2, 2));
    jButton10.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton10_ActionPerformed(evt);
      }
    });
    cp.add(jButton10);
    jButton11.setBounds(176, 96, 75, 25);
    jButton11.setText("jButton11");
    jButton11.setMargin(new Insets(2, 2, 2, 2));
    jButton11.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton11_ActionPerformed(evt);
      }
    });
    cp.add(jButton11);
    jButton12.setBounds(176, 64, 75, 25);
    jButton12.setText("jButton12");
    jButton12.setMargin(new Insets(2, 2, 2, 2));
    jButton12.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton12_ActionPerformed(evt);
      }
    });
    cp.add(jButton12);
    jButton13.setBounds(96, 24, 75, 25);
    jButton13.setText("jButton13");
    jButton13.setMargin(new Insets(2, 2, 2, 2));
    jButton13.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton13_ActionPerformed(evt);
      }
    });
    cp.add(jButton13);
    jButton14.setBounds(176, 24, 75, 25);
    jButton14.setText("jButton14");
    jButton14.setMargin(new Insets(2, 2, 2, 2));
    jButton14.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton14_ActionPerformed(evt);
      }
    });
    cp.add(jButton14);
    jButton15.setBounds(256, 168, 75, 25);
    jButton15.setText("jButton15");
    jButton15.setMargin(new Insets(2, 2, 2, 2));
    jButton15.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton15_ActionPerformed(evt);
      }
    });
    cp.add(jButton15);
    jButton16.setBounds(256, 136, 75, 25);
    jButton16.setText("jButton16");
    jButton16.setMargin(new Insets(2, 2, 2, 2));
    jButton16.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton16_ActionPerformed(evt);
      }
    });
    cp.add(jButton16);
    jButton17.setBounds(336, 168, 75, 25);
    jButton17.setText("jButton17");
    jButton17.setMargin(new Insets(2, 2, 2, 2));
    jButton17.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton17_ActionPerformed(evt);
      }
    });
    cp.add(jButton17);
    jButton18.setBounds(336, 136, 75, 25);
    jButton18.setText("jButton18");
    jButton18.setMargin(new Insets(2, 2, 2, 2));
    jButton18.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton18_ActionPerformed(evt);
      }
    });
    cp.add(jButton18);
    jButton19.setBounds(296, 104, 75, 25);
    jButton19.setText("jButton19");
    jButton19.setMargin(new Insets(2, 2, 2, 2));
    jButton19.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton19_ActionPerformed(evt);
      }
    });
    cp.add(jButton19);
    jButton20.setBounds(296, 72, 75, 25);
    jButton20.setText("jButton20");
    jButton20.setMargin(new Insets(2, 2, 2, 2));
    jButton20.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton20_ActionPerformed(evt);
      }
    });
    cp.add(jButton20);
    jButton21.setBounds(296, 40, 75, 25);
    jButton21.setText("jButton21");
    jButton21.setMargin(new Insets(2, 2, 2, 2));
    jButton21.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton21_ActionPerformed(evt);
      }
    });
    cp.add(jButton21);
    jButton22.setBounds(408, 208, 75, 25);
    jButton22.setText("jButton22");
    jButton22.setMargin(new Insets(2, 2, 2, 2));
    jButton22.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton22_ActionPerformed(evt);
      }
    });
    cp.add(jButton22);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Gbo
  
  // Anfang Methoden
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton1_ActionPerformed
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton2_ActionPerformed
  
  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton3_ActionPerformed
  
  public void jButton4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton4_ActionPerformed
  
  public void jButton5_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton5_ActionPerformed
  
  public void jButton6_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton6_ActionPerformed
  
  public void jButton7_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton7_ActionPerformed
  
  public void jButton8_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton8_ActionPerformed
  
  public void jButton9_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton9_ActionPerformed
  
  public void jButton10_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton10_ActionPerformed
  
  public void jButton11_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton11_ActionPerformed
  
  public void jButton12_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton12_ActionPerformed
  
  public void jButton13_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton13_ActionPerformed
  
  public void jButton14_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton14_ActionPerformed
  
  public void jButton15_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton15_ActionPerformed
  
  public void jButton16_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton16_ActionPerformed
  
  public void jButton17_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton17_ActionPerformed
  
  public void jButton18_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton18_ActionPerformed
  
  public void jButton19_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton19_ActionPerformed
  
  public void jButton20_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton20_ActionPerformed
  
  public void jButton21_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton21_ActionPerformed
  
  public void jButton22_ActionPerformed(ActionEvent evt) {
    /*String eingabe = jTextField1.getText();
    String ergebnis = parser.verarbeite(eingabe);
    */
  } 
  
  // Ende Methoden
  
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
      e.printStackTrace();
    } 
    new Gbo();
  } // end of main
  
} // end of class Gbo
