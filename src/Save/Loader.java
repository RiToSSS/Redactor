package Save;

import graphredactor.MyCanvas;
import graphredactor.shape.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Loader {
    public Loader(Queue q,MyCanvas jp) throws IOException {
        SaveShapeQueue shapes = new SaveShapeQueue();
        FileInputStream fileInputStream = new FileInputStream("save.ser");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            try {
                shapes = (SaveShapeQueue) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            q.refresh();
            for (SaveShape saveShape : shapes.getShapes()) {
                q.setCurrColor(saveShape.getColor());
                if (saveShape.getType().equals("Oval")) {
                    q.addShape(new Oval());
                } else if (saveShape.getType().equals("Rectangle")) {
                    q.addShape(new Rectangle());
                } else if (saveShape.getType().equals("Polygon")) {
                    q.addShape(new Polygon());
                } else if (saveShape.getType().equals("Polyline")) {
                    q.addShape(new PoliLine());
                } else if (saveShape.getType().equals("Pencil")) {
                    q.addShape(new Pencil());    
                } else throw new RuntimeException("problem");
                if (saveShape.getPoints().size() != 0) {
                    q.getLastShape().setCoordinates(saveShape.getPoints());
                }
            }
            jp.paintToBuffer();
            jp.repaint();
        }
    }
}