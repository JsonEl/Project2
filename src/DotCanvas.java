import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DotCanvas extends JComponent
{
    private int width;
    private int height;
    private Color bgColor;
    private Dot dot;

    public DotCanvas(int w, int h, Color c)
    {
        this.width = w;
        this.height = h;
        this.bgColor = c;
        this.dot = new Dot(260, 190, 300, Color.BLACK);
        setPreferredSize(new Dimension(width, height));
    }

    protected void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        Rectangle2D.Double background = new Rectangle2D.Double(0,0,width, height);
        g2d.setColor(bgColor);
        g2d.fill(background);

        dot.draw(g2d);
    }

    public Dot getEmoji()
    {
        return dot;
    }
}