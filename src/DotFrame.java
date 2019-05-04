import javax.swing.*;
import java.awt.*;

public class DotFrame extends JFrame
{
    private int height;
    private int width;
    private String title;

    public DotFrame(int w, int h, String t){
        width = w;
        height = h;
        title = t;
    }

    public void setUpFrame(){
        Container contentPane = getContentPane();
        DotCanvas dotCanvas = new DotCanvas(width, height, Color.WHITE);
        DotControls controls = new DotControls(dotCanvas);
        controls.setUpPanel();
        setTitle(title);
        contentPane.add(dotCanvas, BorderLayout.CENTER);
        contentPane.add(controls, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}