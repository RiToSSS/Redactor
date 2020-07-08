package graphredactor;

import graphredactor.instruments.BaseShapeButton;
import graphredactor.instruments.LoadButton;
import graphredactor.instruments.SaveButton;
import graphredactor.instruments.SaveProjectButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import graphredactor.shape.Queue;


@SuppressWarnings("serial")
public class ButtonPanel extends JPanel{
	private int buttonSize = 50;
	ButtonPanel(Dimension dim,Queue q, MyCanvas jp){
		super();
		this.setBounds(0, 0, dim.width, buttonSize);
		this.setBackground(Color.pink);
                
		this.add(new BaseShapeButton("Oval",q));
                this.add(new BaseShapeButton("Pencil",q));
                this.add(new BaseShapeButton("PoliLine",q));
                this.add(new BaseShapeButton("Polygon",q));
                this.add(new BaseShapeButton("Rectangle",q));
                this.add(new SaveButton(jp));
                this.add(new SaveProjectButton(q));
                this.add(new LoadButton(q,jp));
	}

    }