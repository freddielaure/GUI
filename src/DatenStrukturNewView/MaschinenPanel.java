package DatenStrukturNewView;


import javax.swing.JPanel;

import datenstrukturenController.Maschine;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;


import java.awt.Panel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class MaschinenPanel extends JPanel {

    private PanelManager panelManager;

    Itempanel p=new Itempanel();
    Itempanel p1=new Itempanel();
    Itempanel p2=new Itempanel();
	public MaschinenPanel(PanelManager panelManager) {
    	this.panelManager = panelManager;
        setLayout(new BorderLayout(0, 0));
        
        Panel outerPanel = new Panel();
       
        add(outerPanel, BorderLayout.CENTER);
        GridBagLayout gbl_outerPanel = new GridBagLayout();
        gbl_outerPanel.columnWidths = new int[]{150, 150, 150, 0};
        gbl_outerPanel.rowHeights = new int[]{63, 0};
        gbl_outerPanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        gbl_outerPanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
        outerPanel.setLayout(gbl_outerPanel);
        p.setPreferredSize(new Dimension(100, 100));
        GridBagConstraints gbc_p = new GridBagConstraints();
        gbc_p.fill = GridBagConstraints.BOTH;
        gbc_p.insets = new Insets(0, 0, 0, 5);
        gbc_p.gridx = 0;
        gbc_p.gridy = 0;
        outerPanel.add(p, gbc_p);
        
        
        
        p1.setForeground(new Color(255, 228, 181));
        p1.setPreferredSize(new Dimension(100, 100));
        GridBagConstraints gbc_p1 = new GridBagConstraints();
        gbc_p1.fill = GridBagConstraints.BOTH;
        gbc_p1.insets = new Insets(0, 0, 0, 5);
        gbc_p1.gridx = 1;
        gbc_p1.gridy = 0;
        outerPanel.add(p1, gbc_p1);
        p2.setPreferredSize(new Dimension(100, 100));
        GridBagConstraints gbc_p2 = new GridBagConstraints();
        gbc_p2.fill = GridBagConstraints.BOTH;
        gbc_p2.gridx = 2;
        gbc_p2.gridy = 0;
        outerPanel.add(p2, gbc_p2);
       
      
        
    	}
	
	public Itempanel getItemPanel(){
		return this.p;
	}
       
	
	
	  
//    public void updateData1(){
//   panelManager.getMaschinenentwürfe().removeAll(null);  
//  
//}
}