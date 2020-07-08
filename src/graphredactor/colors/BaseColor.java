
package graphredactor.colors;


import graphredactor.instruments.BaseButton;
import graphredactor.shape.Queue;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BaseColor extends BaseButton {
	public BaseColor(Queue q, Color color){
		super(""); 
                this.setBackground(color);
                this.setMargin(new Insets(15, 15, 15, 15));
                
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
                                if (q.getLastShape()!=null){
                                    q.getLastShape().setColor(color);
                                }
				q.setCurrColor(color);
			}
		});
	}
}