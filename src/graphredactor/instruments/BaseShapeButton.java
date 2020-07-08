
package graphredactor.instruments;

import graphredactor.shape.Oval;
import graphredactor.shape.Pencil;
import graphredactor.shape.PoliLine;
import graphredactor.shape.Polygon;
import graphredactor.shape.Queue;
import graphredactor.shape.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BaseShapeButton extends BaseButton{
    
    public BaseShapeButton(String s,Queue q) {
        super(s);
        this.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                   switch(s){
                       case "Oval":
                           q.addShape(new Oval());
                           break;
                       case "Pencil":
                           q.addShape(new Pencil());
                           break;
                       case "PoliLine":
                           q.addShape(new PoliLine());
                           break; 
                       case "Polygon":
                           q.addShape(new Polygon());
                           break;  
                       case "Rectangle":
                           q.addShape(new Rectangle());
                           break;
                   }
                }
        });
    }
    
}
