package DatenStrukturNewView;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;

public class nnn extends JPanel {

	/**
	 * Create the panel.
	 */
	public nnn() {
		setLayout(new BorderLayout(0, 0));
		
		Button button = new Button("New button");
		button.setPreferredSize(new Dimension(400, 100));
		
		this.add(button, BorderLayout.CENTER);
		
		
		Button button1 = new Button("Button 3 (LINE_START)");
		button1.setPreferredSize(new Dimension(200, 100));
		button1.setSize(100, 100);
        add(button1, BorderLayout.LINE_START);
        
        Button button3 = new Button("Button 3 (LINE_START)");
        add(button3, BorderLayout.LINE_END);

	}

}
