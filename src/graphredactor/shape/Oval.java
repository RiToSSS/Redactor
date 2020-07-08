
package graphredactor.shape;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import java.awt.geom.Point2D;
import java.util.ArrayList;


public class Oval extends BaseShape {
    private Color shapeColor;
    private List<Point2D> coordinates = new ArrayList<Point2D>();
    private int xs,ys;
    private int xf,yf=-1;
    
    @Override
    public void addCoordinate(Point2D point){
        this.coordinates.add(point);
        this.xs=(int)point.getX();
        this.ys=(int)point.getY();        
    }
 
    
    @Override
    public void addFinishCoordinate (Point2D point){
        this.coordinates.add(point);
        this.xf=(int)point.getX();
        this.yf=(int)point.getY();
    }

    
    @Override
    public void paintShape(Graphics g){
        g.setColor(shapeColor);
        if(yf!=-1){
            g.fillOval(xs, ys, xf-xs, yf-ys);
        }

    }
     @Override
	public Color getColor() {;
            return this.shapeColor;
	}
     @Override
	public void setColor(Color color) {
            this.shapeColor=color;
		
	}

    @Override
    public String getType() {
       return "Oval";
    }

    @Override
    public List<Point2D> getPoints() {
        return this.coordinates;
    }

    @Override
    public void setCoordinates(List<Point2D> coordinates) {
        addCoordinate(coordinates.get(0));
        addFinishCoordinate(coordinates.get(coordinates.size()-1));
    }
}

    