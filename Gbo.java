import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.09.2017
  * @author 
  */

public class Gbo extends JFrame {
  // Anfang Attribute
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
  // Ende Attribute
  
  public Gbo(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 500; 
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
    jList1ScrollPane.setBounds(328, 16, 150, 228);
    cp.add(jList1ScrollPane);
    jTextField1.setBounds(16, 208, 286, 20);
    cp.add(jTextField1);
    jButton1.setBounds(24, 136, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(24, 80, 75, 25);
    jButton2.setText("jButton2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(24, 32, 75, 25);
    jButton3.setText("jButton3");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jButton4.setBounds(128, 120, 75, 25);
    jButton4.setText("jButton4");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(136, 80, 75, 25);
    jButton5.setText("jButton5");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(144, 32, 75, 25);
    jButton6.setText("jButton6");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    cp.add(jButton6);
    jButton7.setBounds(152, 64, 75, 25);
    jButton7.setText("jButton7");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });
    cp.add(jButton7);
    jButton8.setBounds(168, 104, 75, 25);
    jButton8.setText("jButton8");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
    cp.add(jButton8);
    jButton9.setBounds(168, 160, 75, 25);
    jButton9.setText("jButton9");
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton9_ActionPerformed(evt);
      }
    });
    cp.add(jButton9);
    jButton10.setBounds(248, 40, 75, 25);
    jButton10.setText("jButton10");
    jButton10.setMargin(new Insets(2, 2, 2, 2));
    jButton10.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton10_ActionPerformed(evt);
      }
    });
    cp.add(jButton10);
    jButton11.setBounds(256, 80, 75, 25);
    jButton11.setText("jButton11");
    jButton11.setMargin(new Insets(2, 2, 2, 2));
    jButton11.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton11_ActionPerformed(evt);
      }
    });
    cp.add(jButton11);
    jButton12.setBounds(264, 128, 75, 25);
    jButton12.setText("jButton12");
    jButton12.setMargin(new Insets(2, 2, 2, 2));
    jButton12.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton12_ActionPerformed(evt);
      }
    });
    cp.add(jButton12);
    jButton13.setBounds(32, 0, 75, 25);
    jButton13.setText("jButton13");
    jButton13.setMargin(new Insets(2, 2, 2, 2));
    jButton13.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton13_ActionPerformed(evt);
      }
    });
    cp.add(jButton13);
    jButton14.setBounds(144, 8, 75, 25);
    jButton14.setText("jButton14");
    jButton14.setMargin(new Insets(2, 2, 2, 2));
    jButton14.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton14_ActionPerformed(evt);
      }
    });
    cp.add(jButton14);
    jButton15.setBounds(248, 8, 75, 25);
    jButton15.setText("jButton15");
    jButton15.setMargin(new Insets(2, 2, 2, 2));
    jButton15.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton15_ActionPerformed(evt);
      }
    });
    cp.add(jButton15);
    jButton16.setBounds(360, 8, 75, 25);
    jButton16.setText("jButton16");
    jButton16.setMargin(new Insets(2, 2, 2, 2));
    jButton16.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton16_ActionPerformed(evt);
      }
    });
    cp.add(jButton16);
    jButton17.setBounds(280, 208, 75, 25);
    jButton17.setText("jButton17");
    jButton17.setMargin(new Insets(2, 2, 2, 2));
    jButton17.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton17_ActionPerformed(evt);
      }
    });
    cp.add(jButton17);
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

  // Ende Methoden
  
  public static void main(String[] args) {
    new Gbo("Gbo");
  } // end of main
  
} // end of class Gbo
