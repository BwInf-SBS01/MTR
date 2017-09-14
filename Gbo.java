import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

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
  public java.util.List<String> abreisszettel = new ArrayList<String>();
  
  
  
  private JList jList1 = new JList();
    private DefaultListModel jList1Model = new DefaultListModel();
    private JScrollPane jList1ScrollPane = new JScrollPane(jList1);
  private JTextField jTextField1 = new JTextField();
  private JButton bNR0 = new JButton();
  private JButton bNR1 = new JButton();
  private JButton bNR4 = new JButton();
  private JButton bNR7 = new JButton();
  private JButton bKOMMA = new JButton();
  private JButton bNR2 = new JButton();
  private JButton bNR5 = new JButton();
  private JButton bNR8 = new JButton();
  private JButton b10HOCH = new JButton();
  private JButton bNR3 = new JButton();
  private JButton bNR6 = new JButton();
  private JButton bNR9 = new JButton();
  private JButton bKLAMMERAUF = new JButton();
  private JButton bKLAMMERZU = new JButton();
  private JButton bPLUS = new JButton();
  private JButton bMAL = new JButton();
  private JButton bMINUS = new JButton();
  private JButton bGETEILT = new JButton();
  private JButton bSIN = new JButton();
  private JButton bCOS = new JButton();
  private JButton bTAN = new JButton();
  private JButton bGLEICH = new JButton();
  private JButton jButton23 = new JButton();
  
  private JButton jButton25 = new JButton();
  private JButton jButton26 = new JButton();
  // Ende Attribute
  
  public Gbo(/*Parser parser*/) { 
    // Frame-Initialisierung
    super("Mathematischer Taschenrechner");
    //this.parser = parser;
    jList1Model.addElement("ABRISSZETTEL:");
    
    
    
    
    
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 768; 
    int frameHeight = 289;
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
    bNR0.setBounds(16, 168, 75, 25);
    bNR0.setText("NR0");
    bNR0.setMargin(new Insets(2, 2, 2, 2));
    bNR0.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNR0_ActionPerformed(evt);
      }
    });
    cp.add(bNR0);
    bNR1.setBounds(16, 128, 75, 25);
    bNR1.setText("NR1");
    bNR1.setMargin(new Insets(2, 2, 2, 2));
    bNR1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNR1_ActionPerformed(evt);
      }
    });
    cp.add(bNR1);
    bNR4.setBounds(16, 96, 75, 25);
    bNR4.setText("NR4");
    bNR4.setMargin(new Insets(2, 2, 2, 2));
    bNR4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNR4_ActionPerformed(evt);
      }
    });
    cp.add(bNR4);
    bNR7.setBounds(16, 64, 75, 25);
    bNR7.setText("NR7");
    bNR7.setMargin(new Insets(2, 2, 2, 2));
    bNR7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNR7_ActionPerformed(evt);
      }
    });
    cp.add(bNR7);
    bKOMMA.setBounds(96, 168, 75, 25);
    bKOMMA.setText("NR_KOMMA");
    bKOMMA.setMargin(new Insets(2, 2, 2, 2));
    bKOMMA.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bKOMMA_ActionPerformed(evt);
      }
    });
    cp.add(bKOMMA);
    bNR2.setBounds(96, 128, 75, 25);
    bNR2.setText("NR2");
    bNR2.setMargin(new Insets(2, 2, 2, 2));
    bNR2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNR2_ActionPerformed(evt);
      }
    });
    cp.add(bNR2);
    bNR5.setBounds(96, 96, 75, 25);
    bNR5.setText("NR5");
    bNR5.setMargin(new Insets(2, 2, 2, 2));
    bNR5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNR5_ActionPerformed(evt);
      }
    });
    cp.add(bNR5);
    bNR8.setBounds(96, 64, 75, 25);
    bNR8.setText("NR8");
    bNR8.setMargin(new Insets(2, 2, 2, 2));
    bNR8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNR8_ActionPerformed(evt);
      }
    });
    cp.add(bNR8);
    b10HOCH.setBounds(176, 168, 75, 25);
    b10HOCH.setText("NR_10HOCH");
    b10HOCH.setMargin(new Insets(2, 2, 2, 2));
    b10HOCH.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b10HOCH_ActionPerformed(evt);
      }
    });
    cp.add(b10HOCH);
    bNR3.setBounds(176, 128, 75, 25);
    bNR3.setText("NR3");
    bNR3.setMargin(new Insets(2, 2, 2, 2));
    bNR3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNR3_ActionPerformed(evt);
      }
    });
    cp.add(bNR3);
    bNR6.setBounds(176, 96, 75, 25);
    bNR6.setText("NR6");
    bNR6.setMargin(new Insets(2, 2, 2, 2));
    bNR6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNR6_ActionPerformed(evt);
      }
    });
    cp.add(bNR6);
    bNR9.setBounds(176, 64, 75, 25);
    bNR9.setText("NR9");
    bNR9.setMargin(new Insets(2, 2, 2, 2));
    bNR9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNR9_ActionPerformed(evt);
      }
    });
    cp.add(bNR9);
    bKLAMMERAUF.setBounds(96, 24, 75, 25);
    bKLAMMERAUF.setText("(");
    bKLAMMERAUF.setMargin(new Insets(2, 2, 2, 2));
    bKLAMMERAUF.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bKLAMMERAUF_ActionPerformed(evt);
      }
    });
    cp.add(bKLAMMERAUF);
    bKLAMMERZU.setBounds(176, 24, 75, 25);
    bKLAMMERZU.setText(")");
    bKLAMMERZU.setMargin(new Insets(2, 2, 2, 2));
    bKLAMMERZU.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bKLAMMERZU_ActionPerformed(evt);
      }
    });
    cp.add(bKLAMMERZU);
    bPLUS.setBounds(256, 168, 75, 25);
    bPLUS.setText("PLUS");
    bPLUS.setMargin(new Insets(2, 2, 2, 2));
    bPLUS.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bPLUS_ActionPerformed(evt);
      }
    });
    cp.add(bPLUS);
    bMAL.setBounds(256, 136, 75, 25);
    bMAL.setText("MAL");
    bMAL.setMargin(new Insets(2, 2, 2, 2));
    bMAL.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bMAL_ActionPerformed(evt);
      }
    });
    cp.add(bMAL);
    bMINUS.setBounds(336, 168, 75, 25);
    bMINUS.setText("MINUS");
    bMINUS.setMargin(new Insets(2, 2, 2, 2));
    bMINUS.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bMINUS_ActionPerformed(evt);
      }
    });
    cp.add(bMINUS);
    bGETEILT.setBounds(336, 136, 75, 25);
    bGETEILT.setText("GETEILT");
    bGETEILT.setMargin(new Insets(2, 2, 2, 2));
    bGETEILT.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGETEILT_ActionPerformed(evt);
      }
    });
    cp.add(bGETEILT);
    bSIN.setBounds(296, 104, 75, 25);
    bSIN.setText("SIN");
    bSIN.setMargin(new Insets(2, 2, 2, 2));
    bSIN.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSIN_ActionPerformed(evt);
      }
    });
    cp.add(bSIN);
    bCOS.setBounds(296, 72, 75, 25);
    bCOS.setText("COS");
    bCOS.setMargin(new Insets(2, 2, 2, 2));
    bCOS.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bCOS_ActionPerformed(evt);
      }
    });
    cp.add(bCOS);
    bTAN.setBounds(296, 40, 75, 25);
    bTAN.setText("TAN");
    bTAN.setMargin(new Insets(2, 2, 2, 2));
    bTAN.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bTAN_ActionPerformed(evt);
      }
    });
    cp.add(bTAN);
    bGLEICH.setBounds(408, 208, 75, 25);
    bGLEICH.setText("=");
    bGLEICH.setMargin(new Insets(2, 2, 2, 2));
    bGLEICH.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGLEICH_ActionPerformed(evt);
      }
    });
    cp.add(bGLEICH);
    jButton23.setBounds(376, 40, 75, 25);
    jButton23.setText("jButton23");
    jButton23.setMargin(new Insets(2, 2, 2, 2));
    jButton23.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton23_ActionPerformed(evt);
      }
    });
    cp.add(jButton23);
    
    jButton25.setBounds(376, 72, 75, 25);
    jButton25.setText("jButton25");
    jButton25.setMargin(new Insets(2, 2, 2, 2));
    jButton25.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton25_ActionPerformed(evt);
      }
    });
    cp.add(jButton25);
    jButton26.setBounds(376, 104, 75, 25);
    jButton26.setText("jButton26");
    jButton26.setMargin(new Insets(2, 2, 2, 2));
    jButton26.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton26_ActionPerformed(evt);
      }
    });
    cp.add(jButton26);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Gbo
  
  // Anfang Methoden
  
  
  public void jButton25_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("bu(");
  }
  
  public void jButton26_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("bu");
  }
  
  public void jButton23_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("bu");
  }
  
  public void bTAN_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("TAN(");
  }
  
  public void bCOS_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("aCOSINUS(");
  }
  
  public void bSIN_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("SINUS(");
  }
  
  public void bGETEILT_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("/");
  }
  
  public void bMAL_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("*");
  }
  
  public void bMINUS_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("-");
  }
  
  public void bPLUS_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("+");
  }
  
  public void b10HOCH_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("*10^");
  }
  
  public void bKLAMMERAUF_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("(");
  }
  
  public void bKLAMMERZU_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd(")");
  }
  
  public void bKOMMA_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd(".");
  }
  
  public void bGLEICH_ActionPerformed(ActionEvent evt) {
    rechne();
  }
  
  public void bNR0_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("0");
  } 
  
  public void bNR1_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("1");
  } 
  
  public void bNR2_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("2");
  } 
  
  public void bNR3_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("3");
  }
  
  public void bNR4_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("4");
  } 
  
  public void bNR5_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("5");
  } 
  
  public void bNR6_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("6");
  }
  
  public void bNR7_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("7");
  } 
  
  public void bNR8_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("8");
  } 
  
  public void bNR9_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("9");
  } 
  // Ende Methoden
  
  //############################Meine Methoden
  private void rechne(){
    String eingabe = jTextField1.getText();
    //String ergebnis = parser.verarbeite(eingabe);
    jTextField1.setText(eingabe+" = " /*+ ergebnis*/);
    jList1Model.addElement(eingabe+" = " /*+ ergebnis*/);
  }
  private void eingabeAdd(String element){
    jTextField1.setText(jTextField1.getText()+element);
  }
  
  
  
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
      e.printStackTrace();
    } 
    new Gbo();
  } // end of main
  
} // end of class Gbo
