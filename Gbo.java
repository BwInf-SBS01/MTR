import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/**
 *
 * Beschreibung GBO von MTR
 *
 * @version 1.0 vom 12.09.2017
 * @author Paul Hollmann
 */

public class Gbo extends JFrame {

  private static final long serialVersionUID = 1L;

  // Anfang Attribute
  private Parser parser;
  private JList<String> lAbreisszettel = new JList<String>();
  private DefaultListModel<String> lAbreisszettelMODEL = new DefaultListModel<String>();
  private JScrollPane lAbreisszettelSCROLLPANE = new JScrollPane(lAbreisszettel);
  private JTextField tfEingabe = new JTextField();

  private JButton bNR0 = new JButton();
  private JButton bNR1 = new JButton();
  private JButton bNR4 = new JButton();
  private JButton bNR7 = new JButton();
  private JButton bKOMMA = new JButton();
  private JButton bNR2 = new JButton();
  private JButton bNR5 = new JButton();
  private JButton bNR8 = new JButton();
  private JButton bHOCH = new JButton();
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
  private JButton bPRO = new JButton();
  private JButton bFAK = new JButton();
  private JButton bINTEG = new JButton();
  private JButton bDEL = new JButton();
  private JButton bAC = new JButton();
  // Ende Attribute
  
  public Gbo(/* Parser parser */) {
    // Frame-Initialisierung
    super("Mathematischer Taschenrechner");
    this.parser = new Parser();
    lAbreisszettelMODEL.addElement("ABRISSZETTEL:");
    
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
    
    lAbreisszettel.setModel(lAbreisszettelMODEL);
    lAbreisszettelSCROLLPANE.setBounds(560, 8, 150, 228);
    cp.add(lAbreisszettelSCROLLPANE);
    tfEingabe.setBounds(16, 208, 382, 28);
    tfEingabe.setEditable(false);
    tfEingabe.addKeyListener(new KeyListener() {
      
      @Override
      public void keyTyped(KeyEvent e) {
        tastaturCheck(e);
        
      }
      
      @Override
      public void keyReleased(KeyEvent e) {
        
      }
      
      @Override
      public void keyPressed(KeyEvent e) {
        
      }
    });
    cp.add(tfEingabe);
    bNR0.setBounds(16, 168, 75, 25);
    bNR0.setText("0");
    bNR0.setMargin(new Insets(2, 2, 2, 2));
    bNR0.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bNR0_ActionPerformed(evt);
      }
    });
    cp.add(bNR0);
    bNR1.setBounds(16, 128, 75, 25);
    bNR1.setText("1");
    bNR1.setMargin(new Insets(2, 2, 2, 2));
    bNR1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bNR1_ActionPerformed(evt);
      }
    });
    cp.add(bNR1);
    bNR4.setBounds(16, 96, 75, 25);
    bNR4.setText("4");
    bNR4.setMargin(new Insets(2, 2, 2, 2));
    bNR4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bNR4_ActionPerformed(evt);
      }
    });
    cp.add(bNR4);
    bNR7.setBounds(16, 64, 75, 25);
    bNR7.setText("7");
    bNR7.setMargin(new Insets(2, 2, 2, 2));
    bNR7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bNR7_ActionPerformed(evt);
      }
    });
    cp.add(bNR7);
    bKOMMA.setBounds(96, 168, 75, 25);
    bKOMMA.setText(",");
    bKOMMA.setMargin(new Insets(2, 2, 2, 2));
    bKOMMA.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bKOMMA_ActionPerformed(evt);
      }
    });
    cp.add(bKOMMA);
    bNR2.setBounds(96, 128, 75, 25);
    bNR2.setText("2");
    bNR2.setMargin(new Insets(2, 2, 2, 2));
    bNR2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bNR2_ActionPerformed(evt);
      }
    });
    cp.add(bNR2);
    bNR5.setBounds(96, 96, 75, 25);
    bNR5.setText("5");
    bNR5.setMargin(new Insets(2, 2, 2, 2));
    bNR5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bNR5_ActionPerformed(evt);
      }
    });
    cp.add(bNR5);
    bNR8.setBounds(96, 64, 75, 25);
    bNR8.setText("8");
    bNR8.setMargin(new Insets(2, 2, 2, 2));
    bNR8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bNR8_ActionPerformed(evt);
      }
    });
    cp.add(bNR8);
    bHOCH.setBounds(176, 168, 75, 25);
    bHOCH.setText("^");
    bHOCH.setMargin(new Insets(2, 2, 2, 2));
    bHOCH.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bHOCH_ActionPerformed(evt);
      }
    });
    
    cp.add(bHOCH);
    bNR3.setBounds(176, 128, 75, 25);
    bNR3.setText("3");
    bNR3.setMargin(new Insets(2, 2, 2, 2));
    bNR3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bNR3_ActionPerformed(evt);
      }
    });
    cp.add(bNR3);
    bNR6.setBounds(176, 96, 75, 25);
    bNR6.setText("6");
    bNR6.setMargin(new Insets(2, 2, 2, 2));
    bNR6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bNR6_ActionPerformed(evt);
      }
    });
    cp.add(bNR6);
    bNR9.setBounds(176, 64, 75, 25);
    bNR9.setText("9");
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
    bPLUS.setText("+");
    bPLUS.setMargin(new Insets(2, 2, 2, 2));
    bPLUS.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bPLUS_ActionPerformed(evt);
      }
    });
    cp.add(bPLUS);
    bMAL.setBounds(256, 136, 75, 25);
    bMAL.setText("*");
    bMAL.setMargin(new Insets(2, 2, 2, 2));
    bMAL.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bMAL_ActionPerformed(evt);
      }
    });
    cp.add(bMAL);
    bMINUS.setBounds(336, 168, 75, 25);
    bMINUS.setText("-");
    bMINUS.setMargin(new Insets(2, 2, 2, 2));
    bMINUS.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bMINUS_ActionPerformed(evt);
      }
    });
    cp.add(bMINUS);
    bGETEILT.setBounds(336, 136, 75, 25);
    bGETEILT.setText("/");
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
    bPRO.setBounds(376, 40, 75, 25);
    bPRO.setText("PRODUKT");
    bPRO.setMargin(new Insets(2, 2, 2, 2));
    bPRO.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bPRO_ActionPerformed(evt);
      }
    });
    cp.add(bPRO);
    
    bINTEG.setBounds(376, 72, 75, 25);
    bINTEG.setText("INTEG");
    bINTEG.setMargin(new Insets(2, 2, 2, 2));
    bINTEG.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bINTEG_ActionPerformed(evt);
      }
    });
    cp.add(bINTEG);
    bFAK.setBounds(376, 104, 75, 25);
    bFAK.setText("FAK");
    bFAK.setMargin(new Insets(2, 2, 2, 2));
    bFAK.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bFAK_ActionPerformed(evt);
      }
    });
    cp.add(bFAK);
    bDEL.setBounds(440, 136, 75, 25);
    bDEL.setText("bDEL");
    bDEL.setMargin(new Insets(2, 2, 2, 2));
    bDEL.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bDEL_ActionPerformed(evt);
      }
    });
    cp.add(bDEL);
    bAC.setBounds(440, 168, 75, 25);
    bAC.setText("bAC");
    bAC.setMargin(new Insets(2, 2, 2, 2));
    bAC.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bAC_ActionPerformed(evt);
      }
    });
    cp.add(bAC);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Gbo
  
  // Anfang Methoden
  public void bDEL_ActionPerformed(ActionEvent evt) {
    this.eingabeRemove();
  }
  
  public void bAC_ActionPerformed(ActionEvent evt) {
    while (!tfEingabe.getText().isEmpty()) {
      this.eingabeRemove();
    }
  }
  
  public void bPRO_ActionPerformed(ActionEvent evt) {
    this.fPRODUKT();
  }
  
  public void bINTEG_ActionPerformed(ActionEvent evt) {
    this.fINTEGRAL();
  }
  
  public void bFAK_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("!(");
  }
  
  public void bTAN_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("tan(");
  }
  
  public void bCOS_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("cos(");
  }
  
  public void bSIN_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("sin(");
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
  
  public void bHOCH_ActionPerformed(ActionEvent evt) {
    this.eingabeAdd("^");
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
  
  // ############################Meine Methoden
  private void rechne() {
    eingabeAdd("");
    String eingabe = tfEingabe.getText();
    if (!eingabe.isEmpty()) {
      String ergebnis;
      try {
        ergebnis = parser.parsen(eingabe)+"";
      }catch(Exception e) {
        ergebnis = "ERROR";
      }
      tfEingabe.setText(eingabe + "=" + ergebnis);
      lAbreisszettelMODEL.addElement(eingabe + " = " + ergebnis);
    }
  }
  
  private void fINTEGRAL() {
    String text = customDialog("Integral(von; bis; f(x)");
    
    if (!text.isEmpty()) {
      String[] werte = text.split(";");
      eingabeAdd(this.parser.integral(werte[0],werte[1],werte[2]));
    }
  }
  
  private void fPRODUKT() {
    String text = customDialog("Produkt(von; bis; f(x))");
    
  }
  
  private String customDialog(String title) {
    
    JDialog d = new JDialog(this, title, true);
    d.setLayout(new GridLayout());
    JButton bOK = new JButton("OK");
    JTextField tfVON = new JTextField();
    JTextField tfBIS = new JTextField();
    JTextField tfFUNKTION = new JTextField();
    
    bOK.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (!checkDialog(tfVON.getText())) {
          tfVON.setBackground(Color.RED);
        }
        if (!checkDialog(tfBIS.getText())) {
          tfBIS.setBackground(Color.RED);
        }
        if (!checkDialog(tfFUNKTION.getText())) {
          tfFUNKTION.setBackground(Color.RED);
        }
        if (checkDialog(tfVON.getText()) && checkDialog(tfBIS.getText()) && checkDialog(tfFUNKTION.getText())) {
          d.dispose();
        }
        
      }
    });
    d.add(tfVON);
    d.add(tfBIS);
    d.add(tfFUNKTION);
    d.add(bOK);
    d.setSize(300, 75);
    d.setLocation(this.getLocation());
    d.setVisible(true);
    if (checkDialog(tfVON.getText()) && checkDialog(tfBIS.getText()) && checkDialog(tfFUNKTION.getText())) {
      d.dispose();
      return tfVON.getText() + ";" + tfBIS.getText() + ";" + tfFUNKTION.getText() ;
    } else {
      return "";
    }
  }
  
  private boolean checkDialog(String text) {
    text.trim();
    if (text.isEmpty()) {
      return false;
    }
    char[] chars = text.toCharArray();
    char[] goodKey = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '+', '-', '*', '/', '.', '(', ')', 'x',
    'X' };
    
    for (int i = 0; i < chars.length; i++) {
      boolean ok = false;
      for (int j = 0; j < goodKey.length; j++) {
        if (chars[i] == goodKey[j]) {
          ok = true;
        }
      }
      if (!ok) {
        return false;
      }
    }
    return true;
  }
  
  private void eingabeAdd(String element) {
    String text = tfEingabe.getText().replace(',', '.');
    if (text.contains("=")) {
      int point = text.indexOf('=');
      text = text.substring(0, point);
    }
    tfEingabe.setText(text + element);
  }
  
  private void eingabeRemove() {
    String text = tfEingabe.getText();
    if (!text.isEmpty()) {
      if (text.contains("=")) {
        int point = text.indexOf('=');
        text = text.substring(0, point + 1);
      }
      if (text.endsWith("]")) {
        text = text.substring(0, text.lastIndexOf('[') + 1);
      }
      tfEingabe.setText(text.substring(0, text.length() - 1));
      text = tfEingabe.getText();
      if (text.endsWith("sin") || text.endsWith("cos") || text.endsWith("tan") || text.endsWith("int") || text.endsWith("pro")) {
        tfEingabe.setText(text.substring(0, text.length() - 3));
      }else if(text.endsWith("!")){
        tfEingabe.setText(text.substring(0, text.length() - 1));
      }
      
      if (text.contains("=")) {
        int point = text.indexOf('=');
        text = text.substring(0, point);
      }
    }
  }
  
  private void tastaturCheck(KeyEvent e) {
    char key = e.getKeyChar();
    System.out.println("key:" + key);
    char[] goodKey = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '+', '-', '*', '/', '.', ',', '^', '(',
    ')' };
    for (int i = 0; i < goodKey.length; i++) {
      if (key == goodKey[i]) {
        eingabeAdd(goodKey[i] + "");
      }
    }
    if (key == 127/* DEL */) {
      eingabeRemove();
    } else if (key == '\n') {
      rechne();
    } else if (key == 's') {
      eingabeAdd("sin(");
    } else if (key == 'c') {
      eingabeAdd("cos(");
    } else if (key == 't') {
      eingabeAdd("tan(");
    } else if (key == 'p') {
      fPRODUKT();
    } else if (key == '!') {
      eingabeAdd("!(");
    } else if (key == 'f') {
      eingabeAdd("!(");
    } else if (key == 'i') {
      fINTEGRAL();
    }
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
