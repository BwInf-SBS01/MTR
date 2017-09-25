package code;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/**
 *
 * Beschreibung GBO von MTR
 *
 * @version 2.0 vom 21.09.2017
 * @author Paul Hollmann
 */

public class Gbo extends JFrame {

	private static final long serialVersionUID = 1L;

	// Anfang Attribute
	private Parser parser;
	private Abreisszettel abreisszettel;
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
	private JButton bOFF = new JButton();
	private JButton bOPENZETTEL = new JButton();
	// Ende Attribute

	public Gbo() {
		// Frame-Initialisierung
		super("Mathematischer Taschenrechner");
		this.parser = new Parser();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		int frameWidth = 400;
		int frameHeight = 525;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		setResizable(false);
		Container cp = getContentPane();
		cp.setLayout(null);
		try {
			BufferedImage img = ImageIO.read(new File("src/tr.png"));
			this.setIconImage(img);
		} catch (IOException e) {
			System.err.println("No tr.png");
		}

		// Anfang Komponenten
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// NULL
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// NULL
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (abreisszettel != null)
					abreisszettel.updateLoaction();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				if (abreisszettel != null)
					abreisszettel.updateLoaction();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// NULL
			}
		});

		tfEingabe.setBounds(25, 75, 350, 50);
		tfEingabe.setEditable(false);
		@SuppressWarnings("deprecation")
		int textCursor = TEXT_CURSOR;
		tfEingabe.setCursor(new Cursor(textCursor));
		tfEingabe.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				tastaturCheck(e);

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// NULL

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// NULL

			}
		});
		cp.add(tfEingabe);

		bNR0.setBounds(25, 450, 50, 38);
		bNR0.setText("0");
		bNR0.setMargin(new Insets(2, 2, 2, 2));
		bNR0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bNR0_ActionPerformed(evt);
			}
		});
		cp.add(bNR0);
		bNR1.setBounds(25, 400, 50, 38);
		bNR1.setText("1");
		bNR1.setMargin(new Insets(2, 2, 2, 2));
		bNR1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bNR1_ActionPerformed(evt);
			}
		});
		cp.add(bNR1);
		bNR4.setBounds(25, 350, 50, 38);
		bNR4.setText("4");
		bNR4.setMargin(new Insets(2, 2, 2, 2));
		bNR4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bNR4_ActionPerformed(evt);
			}
		});
		cp.add(bNR4);
		bNR7.setBounds(25, 300, 50, 38);
		bNR7.setText("7");
		bNR7.setMargin(new Insets(2, 2, 2, 2));
		bNR7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bNR7_ActionPerformed(evt);
			}
		});
		cp.add(bNR7);
		bKOMMA.setBounds(100, 450, 50, 38);
		bKOMMA.setText(",");
		bKOMMA.setMargin(new Insets(2, 2, 2, 2));
		bKOMMA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bKOMMA_ActionPerformed(evt);
			}
		});
		cp.add(bKOMMA);
		bNR2.setBounds(100, 400, 50, 38);
		bNR2.setText("2");
		bNR2.setMargin(new Insets(2, 2, 2, 2));
		bNR2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bNR2_ActionPerformed(evt);
			}
		});
		cp.add(bNR2);
		bNR5.setBounds(100, 350, 50, 38);
		bNR5.setText("5");
		bNR5.setMargin(new Insets(2, 2, 2, 2));
		bNR5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bNR5_ActionPerformed(evt);
			}
		});
		cp.add(bNR5);
		bNR8.setBounds(100, 300, 50, 38);
		bNR8.setText("8");
		bNR8.setMargin(new Insets(2, 2, 2, 2));
		bNR8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bNR8_ActionPerformed(evt);
			}
		});
		cp.add(bNR8);
		bHOCH.setBounds(175, 450, 50, 38);
		bHOCH.setText("^");
		bHOCH.setMargin(new Insets(2, 2, 2, 2));
		bHOCH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bHOCH_ActionPerformed(evt);
			}
		});

		cp.add(bHOCH);
		bNR3.setBounds(175, 400, 50, 38);
		bNR3.setText("3");
		bNR3.setMargin(new Insets(2, 2, 2, 2));
		bNR3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bNR3_ActionPerformed(evt);
			}
		});
		cp.add(bNR3);
		bNR6.setBounds(175, 350, 50, 38);
		bNR6.setText("6");
		bNR6.setMargin(new Insets(2, 2, 2, 2));
		bNR6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bNR6_ActionPerformed(evt);
			}
		});
		cp.add(bNR6);
		bNR9.setBounds(175, 300, 50, 38);
		bNR9.setText("9");
		bNR9.setMargin(new Insets(2, 2, 2, 2));
		bNR9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bNR9_ActionPerformed(evt);
			}
		});
		cp.add(bNR9);
		bKLAMMERAUF.setBounds(25, 250, 50, 25);
		bKLAMMERAUF.setText("(");
		bKLAMMERAUF.setMargin(new Insets(2, 2, 2, 2));
		bKLAMMERAUF.setBackground(Color.DARK_GRAY);
		bKLAMMERAUF.setForeground(Color.GRAY);
		bKLAMMERAUF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bKLAMMERAUF_ActionPerformed(evt);
			}
		});
		cp.add(bKLAMMERAUF);
		bKLAMMERZU.setBounds(100, 250, 50, 25);
		bKLAMMERZU.setText(")");
		bKLAMMERZU.setBackground(Color.DARK_GRAY);
		bKLAMMERZU.setForeground(Color.GRAY);
		bKLAMMERZU.setMargin(new Insets(2, 2, 2, 2));
		bKLAMMERZU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bKLAMMERZU_ActionPerformed(evt);
			}
		});
		cp.add(bKLAMMERZU);
		bPLUS.setBounds(250, 400, 50, 38);
		bPLUS.setText("+");
		bPLUS.setMargin(new Insets(2, 2, 2, 2));
		bPLUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bPLUS_ActionPerformed(evt);
			}
		});
		cp.add(bPLUS);
		bMAL.setBounds(250, 350, 50, 38);
		bMAL.setText("*");
		bMAL.setMargin(new Insets(2, 2, 2, 2));
		bMAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bMAL_ActionPerformed(evt);
			}
		});
		cp.add(bMAL);
		bMINUS.setBounds(325, 400, 50, 38);
		bMINUS.setText("-");
		bMINUS.setMargin(new Insets(2, 2, 2, 2));
		bMINUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bMINUS_ActionPerformed(evt);
			}
		});
		cp.add(bMINUS);
		bGETEILT.setBounds(325, 350, 50, 38);
		bGETEILT.setText("/");
		bGETEILT.setMargin(new Insets(2, 2, 2, 2));
		bGETEILT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bGETEILT_ActionPerformed(evt);
			}
		});
		cp.add(bGETEILT);
		bSIN.setBounds(175, 250, 50, 25);
		bSIN.setText("SIN");
		bSIN.setMargin(new Insets(2, 2, 2, 2));
		bSIN.setBackground(Color.DARK_GRAY);
		bSIN.setForeground(Color.GRAY);
		bSIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bSIN_ActionPerformed(evt);
			}
		});
		cp.add(bSIN);
		bCOS.setBounds(250, 250, 50, 25);
		bCOS.setText("COS");
		bCOS.setMargin(new Insets(2, 2, 2, 2));
		bCOS.setBackground(Color.DARK_GRAY);
		bCOS.setForeground(Color.GRAY);
		bCOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bCOS_ActionPerformed(evt);
			}
		});
		cp.add(bCOS);
		bTAN.setBounds(325, 250, 50, 25);
		bTAN.setText("TAN");
		bTAN.setMargin(new Insets(2, 2, 2, 2));
		bTAN.setBackground(Color.DARK_GRAY);
		bTAN.setForeground(Color.GRAY);
		bTAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bTAN_ActionPerformed(evt);
			}
		});
		cp.add(bTAN);
		bGLEICH.setBounds(325, 450, 50, 38);
		bGLEICH.setText("=");
		bGLEICH.setMargin(new Insets(2, 2, 2, 2));
		bGLEICH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bGLEICH_ActionPerformed(evt);
			}
		});
		cp.add(bGLEICH);
		bPRO.setBounds(100, 200, 50, 25);
		bPRO.setText("\u220F");
		bPRO.setToolTipText("new Produktfunktion");
		bPRO.setMargin(new Insets(2, 2, 2, 2));
		bPRO.setBackground(Color.DARK_GRAY);
		bPRO.setForeground(Color.GRAY);
		bPRO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bPRO_ActionPerformed(evt);
			}
		});
		cp.add(bPRO);

		bINTEG.setBounds(25, 200, 50, 25);
		bINTEG.setText("\u222B");
		bINTEG.setToolTipText("new Integralfunktion");
		bINTEG.setMargin(new Insets(2, 2, 2, 2));
		bINTEG.setBackground(Color.DARK_GRAY);
		bINTEG.setForeground(Color.GRAY);
		bINTEG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bINTEG_ActionPerformed(evt);
			}
		});
		cp.add(bINTEG);
		bFAK.setBounds(175, 200, 50, 25);
		bFAK.setText("!");
		bFAK.setToolTipText("Fakultät");
		bFAK.setMargin(new Insets(2, 2, 2, 2));
		bFAK.setBackground(Color.DARK_GRAY);
		bFAK.setForeground(Color.GRAY);
		bFAK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bFAK_ActionPerformed(evt);
			}
		});
		cp.add(bFAK);
		bDEL.setBounds(250, 300, 50, 38);
		bDEL.setText("DEL");
		bDEL.setToolTipText("...entfernt das letzte Zeichen");
		bDEL.setMargin(new Insets(2, 2, 2, 2));
		bDEL.setBackground(Color.ORANGE);
		bDEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bDEL_ActionPerformed(evt);
			}
		});
		cp.add(bDEL);
		bAC.setBounds(325, 300, 50, 38);
		bAC.setText("AC");
		bAC.setToolTipText("entfernt die gesamte Rechung");
		bAC.setMargin(new Insets(2, 2, 2, 2));
		bAC.setBackground(Color.ORANGE);
		bAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bAC_ActionPerformed(evt);
			}
		});
		cp.add(bAC);
		bOFF.setBounds(325, 150, 50, 25);
		bOFF.setText("OFF");
		bOFF.setMargin(new Insets(2, 2, 2, 2));
		bOFF.setBackground(Color.BLUE);
		bOFF.setForeground(Color.GRAY);
		bOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				dispose();
				if (abreisszettel != null)
					abreisszettel.dispose();
				System.out.println("OFF...");
			}
		});
		cp.add(bOFF);

		bOPENZETTEL.setBounds(250, 150, 50, 25);
		bOPENZETTEL.setText("ZETTEL");
		bOPENZETTEL.setToolTipText("öffnet/schließt den Abrisszettel");
		bOPENZETTEL.setMargin(new Insets(2, 2, 2, 2));
		bOPENZETTEL.setBackground(Color.BLUE);
		bOPENZETTEL.setForeground(Color.GRAY);
		bOPENZETTEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				toggleAbreisszettel();
			}

		});
		cp.add(bOPENZETTEL);

		// Ende Komponenten

		setVisible(true);
	}

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
				ergebnis = parser.parsen(eingabe) + "";
			} catch (Exception e) {
				ergebnis = "ERROR";
				JDialog d = new JDialog(this, "ERROR", Dialog.ModalityType.TOOLKIT_MODAL);
				d.setBounds(this.getX(), this.getY(), this.getWidth(), 80);
				d.add(new TextArea(e.toString()));
				try {
					BufferedImage img = ImageIO.read(new File("src/err.png"));
					d.setIconImage(img);

				} catch (IOException e1) {
					System.err.println("Cant find bild1");
				}
				d.setVisible(true);
			}
			tfEingabe.setText(eingabe + "=" + ergebnis);
			if (this.abreisszettel != null) {
				abreisszettel.addElementToList(eingabe + "=" + ergebnis);
			}
		}
	}

	private void toggleAbreisszettel() {
		if (abreisszettel == null) {
			abreisszettel = new Abreisszettel(this);
		} else {
			abreisszettel.dispose();
			abreisszettel = null;
		}
	}

	private void fINTEGRAL() {
		String text = customDialog("Integral(von; bis; f(x))");

		if (!text.isEmpty()) {
			String[] werte = text.split(";");
			eingabeAdd(this.parser.integral(werte[0], werte[1], werte[2]));
		}
	}

	private void fPRODUKT() {
		String text = customDialog("Produkt(von; bis; f(x))");
		if (!text.isEmpty()) {
			String[] werte = text.split(";");
			eingabeAdd(this.parser.produktfunktion(werte[0], werte[1], werte[2]));
		}
	}

	private String customDialog(String title) {

		JDialog d = new JDialog(this, title, true);
		d.setLayout(new GridLayout());
		JButton bOK = new JButton("OK");
		JTextField tfVON = new JTextField();
		JTextField tfBIS = new JTextField();
		JTextField tfFUNKTION = new JTextField();
		tfVON.setToolTipText("von=");
		tfBIS.setToolTipText("bis=");
		tfFUNKTION.setToolTipText("Funktion f(x)=");
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
			return tfVON.getText() + ";" + tfBIS.getText() + ";" + tfFUNKTION.getText();
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
			if (text.endsWith("sin") || text.endsWith("cos") || text.endsWith("tan") || text.endsWith("int")
					|| text.endsWith("pro")) {
				tfEingabe.setText(text.substring(0, text.length() - 3));
			} else if (text.endsWith("!")) {
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

	// --------------------------------------------------------------------------------
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Gbo();
	}
	// --------------------------------------------------------------------------------
}
