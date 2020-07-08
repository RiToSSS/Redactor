
package graphredactor.instruments;

import Save.Saver;
import graphredactor.shape.Queue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class SaveProjectButton extends BaseButton {
    public SaveProjectButton(Queue q){
        super("Save project");
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Saver(q);
                } catch (IOException ex) {
                    Logger.getLogger(SaveProjectButton.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
    
}
