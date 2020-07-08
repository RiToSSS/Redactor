
package graphredactor;

import graphredactor.colors.BaseColor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;


import graphredactor.shape.Queue;


@SuppressWarnings("serial")
public class ColorButtonPanel extends JPanel{
	private int buttonSize = 50;
	ColorButtonPanel(Dimension dim,Queue q){
		super();
		this.setBounds(0, buttonSize, dim.width, buttonSize);
		this.setBackground(Color.pink);
                
                
		this.add(new BaseColor(q, Color.RED));
                this.add(new BaseColor(q, Color.PINK));
                this.add(new BaseColor(q, Color.ORANGE));
                this.add(new BaseColor(q, Color.YELLOW));
		this.add(new BaseColor(q, Color.GREEN));
		this.add(new BaseColor(q, Color.BLUE));
                this.add(new BaseColor(q, Color.BLACK));
		this.add(new BaseColor(q, Color.WHITE));
		this.add(new BaseColor(q, Color.GRAY));
		
	}
}