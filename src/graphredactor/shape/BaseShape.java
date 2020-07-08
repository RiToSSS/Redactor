
package graphredactor.shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.util.List;


public abstract class BaseShape implements Serializable  {
    
     abstract public void addCoordinate(Point2D point);
     
     abstract public void addFinishCoordinate (Point2D point);
     
     abstract public String getType ();
     
     abstract public List<Point2D> getPoints();
     
     abstract public void setCoordinates(List<Point2D> coordinates);
     
     abstract public void paintShape(Graphics g);
     
     abstract public Color getColor();
     
     abstract public void setColor(Color color);
   
}
