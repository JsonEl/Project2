import java.awt.*;
import java.awt.geom.*;

public class Dot {
    private double x;
    private double y;
    private double size;
    private Color color1;

    public Dot(double x, double y, double s, Color c1){
        this.x = x;
        this.y = y;
        size = s;
        color1 = c1;
    }

    public void draw(Graphics2D g2d){
        Ellipse2D.Double dasIt = new Ellipse2D.Double(x, y, size*.01, size*.01);
        g2d.setColor(color1);
        g2d.fill(dasIt);
    }
    public void adjustYU(double distance)
    {
        y-= distance;
    }

    public void adjustYD(double distance)
    {
        y+= distance;
    }

    public void adjustXL(double distance)
    {
        x-= distance;
    }

    public void adjustXR(double distance)
    {
        x+= distance;
    }

    public void grow(double diameter)
    {
        size += diameter;
        x-=diameter*.195;
        y-=diameter*.20;
    }

    public void shrink(double diameter){
        size -= diameter;
        x+=diameter*.195;
        y+=diameter*.20;
    }
}