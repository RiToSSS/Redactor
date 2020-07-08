
package graphredactor.instruments;
import graphredactor.GraphRedactor;
import graphredactor.MyCanvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graphredactor.shape.Queue;
import graphredactor.shape.Rectangle;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class SaveButton extends BaseButton {
	public SaveButton(MyCanvas jp){
		super("Save");
		this.addActionListener(new ActionListener() {
			@Override
                    public void actionPerformed(ActionEvent e) {
                        File f = new File("image.png");
                        try {
                            ImageIO.write(jp.getBuffer(),"png", f);
                        } catch (IOException ex) {
                            Logger.getLogger(GraphRedactor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
	}
}
