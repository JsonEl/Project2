import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DotControls extends JPanel {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private DotCanvas dotCanvas;

    public DotControls(DotCanvas ec){
        button1 = new JButton("UP");
        button2 = new JButton("DOWN");
        button3 = new JButton("LEFT");
        button4 = new JButton("RIGHT");
        dotCanvas = ec;
    }

    public void setUpPanel(){
        setLayout(new GridLayout(2,2));
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        ButtonListener buttonListener = new ButtonListener();
        button1.addActionListener(buttonListener);
        button2.addActionListener(buttonListener);
        button3.addActionListener(buttonListener);
        button4.addActionListener(buttonListener);
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            Object o = ae.getSource();
            if(o==button1){
                dotCanvas.getEmoji().adjustYU(10);
            }else if(o==button2){
                dotCanvas.getEmoji().adjustYD(10);
            }else if(o==button3){
                dotCanvas.getEmoji().adjustXL(10);
            }else if(o==button4){
                dotCanvas.getEmoji().adjustXR(10);
            }
                dotCanvas.repaint();
        }
    }
}