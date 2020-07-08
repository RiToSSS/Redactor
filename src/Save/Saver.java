package Save;

import graphredactor.shape.BaseShape;
import graphredactor.shape.Queue;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Saver{
    public Saver(Queue q) throws IOException {
        SaveShapeQueue Queueshape = new SaveShapeQueue();
        for(BaseShape shape: q.getQueue()) {
            Queueshape.addShape(new SaveShape(shape));
        }
        FileOutputStream outputStream = new FileOutputStream("save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(Queueshape);
        objectOutputStream.close();
    }
}
