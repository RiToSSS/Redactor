
package graphredactor.instruments;

import Save.Loader;
import Save.Saver;
import graphredactor.MyCanvas;
import graphredactor.shape.Queue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class LoadButton extends BaseButton {
    public LoadButton(Queue q, MyCanvas jp){
        super("Load");
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Loader(q,jp);
                } catch (IOException ex) {
                    Logger.getLogger(SaveProjectButton.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
    
}