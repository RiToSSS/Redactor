package graphredactor;

import graphredactor.shape.Queue;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.io.IOException;

public class GraphRedactor extends JFrame
{
    MyCanvas jp;
    Queue q = new Queue();
  
    public GraphRedactor() throws IOException
    {
        super("Graph Editor");
        
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        
        this.setSize(screenSize.width,screenSize.height);
        this.setVisible(true);
        this.setLayout(null);
        
        jp = new MyCanvas(screenSize.width,screenSize.height,q);
        jp.setBounds(100,100,screenSize.width-200,screenSize.height);
        jp.setBackground(Color.white);
        this.add(jp);
        
        JPanel buttonPanel = new ButtonPanel(screenSize,q,jp);
        this.add(buttonPanel);
        
        JPanel colorButtonPanel = new ColorButtonPanel(screenSize,q);
        this.add(colorButtonPanel); 
        
            
    }

    public static void main(String[] args) throws IOException {
        GraphRedactor app=new GraphRedactor();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}