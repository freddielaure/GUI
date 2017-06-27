package DatenStrukturNewView;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.GridBagConstraints;

public class AuswahlPanel extends JPanel {
	JLabel label=new JLabel("ww");

	/**
	 * Create the panel.
	 */
	PanelManager panelmanager;
	public AuswahlPanel(PanelManager panelmanager) {
		this.panelmanager=panelmanager;
		setBackground(Color.RED);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		

	}

}
