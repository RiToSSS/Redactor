
package graphredactor.shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;


public class Rectangle extends BaseShape {
    private int xs,ys;
    private int xf,yf=-1;

    private Color shapeColor;
    private Shape shape=null;
    private List<Point2D> coordinates = new ArrayList<Point2D>();

    @Override
    public void paintShape(Graphics g){
        g.setColor(shapeColor); 
         if(yf!=-1){
            g.fillRect(xs, ys, xf-xs, yf-ys);
        }

    }
    @Override
	public Color getColor() {
		return this.shapeColor;
	}
         @Override
	public void setColor(Color color) {
		this.shapeColor=color;
		
	}

    @Override
    public void addCoordinate(Point2D point) {
        this.coordinates.add(point);
        this.xs=(int)point.getX();
        this.ys=(int)point.getY(); 
    }

    @Override
    public void addFinishCoordinate(Point2D point) {
        this.coordinates.add(point);
        this.xf=(int)point.getX();
        this.yf=(int)point.getY();
    }

    @Override
    public String getType() {
        return "Rectangle";
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
