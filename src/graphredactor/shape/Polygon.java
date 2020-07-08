package graphredactor.shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;


public class Polygon extends BaseShape {
private int[] xmas;
private int[] ymas;
private List<Integer> x = new ArrayList<Integer>();
private List<Integer> y = new ArrayList<Integer>();

private List<Point2D> coordinates = new ArrayList<Point2D>();
private Color shapeColor;
private Shape shape=null;




@Override
public void paintShape(Graphics g){
    xmas=new int[x.size()];
    ymas=new int[y.size()];
    for (int i=0; i<y.size(); i++){
        xmas[i]=x.get(i);
        ymas[i]=y.get(i);
    }
    g.setColor(shapeColor);
    g.drawPolygon(xmas,ymas,xmas.length);

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
        this.x.add((int)point.getX());
        this.y.add((int)point.getY());
        
    }

    @Override
    public void addFinishCoordinate(Point2D point) {
        
    }

    @Override
    public String getType() {
        return "Polygon";
    }

    @Override
    public List<Point2D> getPoints() {
        return this.coordinates;
    }

    @Override
    public void setCoordinates(List<Point2D> coordinates) {
        for(int i=0;i<coordinates.size();i++){
           addCoordinate(coordinates.get(i));
        }
    }
}