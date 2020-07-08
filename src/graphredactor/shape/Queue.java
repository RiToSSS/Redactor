
package graphredactor.shape;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;



public class Queue {
    private Color CurrColor = Color.black;
    ArrayList<BaseShape> shapes = new ArrayList<>();
    

    
    public void addShape(BaseShape bt){
        shapes.add(bt);
        this.getLastShape().setColor(CurrColor);
    }
    
    public BaseShape getLastShape(){
        if (shapes.size()==0) return null;
        return shapes.get(shapes.size()-1);
    }

    public void paintShapes(Graphics g){
       for (BaseShape bs:shapes){
           bs.paintShape(g);
        } 
       
    }
    public void setCurrColor(Color color) {
            this.CurrColor = color;
    }
    public  ArrayList<BaseShape> getQueue() {
        return shapes;
    }

    public void refresh() {
        shapes.clear();
    }
          
}
