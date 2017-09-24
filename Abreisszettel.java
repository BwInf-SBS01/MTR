package code;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class Abreisszettel extends JFrame {

	private static final long serialVersionUID = 1L;

	private Gbo gbo;

	private JList<String> lAbreisszettel = new JList<String>();
	private DefaultListModel<String> lAbreisszettelMODEL = new DefaultListModel<String>();
	private JScrollPane lAbreisszettelSCROLLPANE = new JScrollPane(lAbreisszettel);

	public Abreisszettel(Gbo gbo) {
		super();
		this.gbo = gbo;
		lAbreisszettelMODEL.addElement("ABRISSZETTEL:");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 200;
		int frameHeight = 300;
		setSize(frameWidth, frameHeight);
		updateLoaction();
		setResizable(false);
		this.setUndecorated(true);
		Container cp = getContentPane();
		cp.setLayout(null);
		this.setLayout(new GridLayout());
		lAbreisszettel.setModel(lAbreisszettelMODEL);

		cp.add(lAbreisszettelSCROLLPANE);
		setVisible(true);
	}

	public void addElementToList(String string) {
		if (!string.isEmpty()) {
			lAbreisszettelMODEL.addElement(string);
		}
	}

	public void updateLoaction() {
		Point p = new Point(gbo.getX() + gbo.getWidth(), gbo.getY());
		if (!(getLocation().equals(p))) {
			setLocation(gbo.getX() + gbo.getWidth(), gbo.getY());
			gbo.requestFocus();
		}
	}

}
