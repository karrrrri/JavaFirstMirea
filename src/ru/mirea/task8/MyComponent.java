package ru.mirea.task8;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComponent;

public class MyComponent extends JComponent{
    int i;
    public MyComponent() {
        this.i = i;
        addMouseListener(new MouseHandler());
    }

    private ArrayList<Rectangle2D> arrOfRect=new ArrayList<>();
    private ArrayList<Ellipse2D> arrOfEllipse=new ArrayList<>();

    Random rand = new Random();
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (Rectangle2D r : arrOfRect) {
            g.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
            g2.draw(r);

        }
        for (Ellipse2D e : arrOfEllipse) {
            g.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
            g2.draw(e);
        }
    }
    public void add(Point2D p)
    {
        double x=p.getX();
        double y=p.getY();
        if (Shape.i == 1){
            Ellipse2D ellipse = new Ellipse2D.Double(x, y, 100,100);
            arrOfEllipse.add(ellipse);
        }
        if (Shape.i == 2){
            Rectangle2D rectangls=new Rectangle2D.Double(x, y, 100, 100);
            arrOfRect.add(rectangls);

        }
        if (Shape.i == 3){
            Rectangle2D rectangls=new Rectangle2D.Double(x, y, 150, 100);
            arrOfRect.add(rectangls);

        }
        if (Shape.i == 4){
            Ellipse2D ellipse = new Ellipse2D.Double(x, y, 100,50);
            arrOfEllipse.add(ellipse);
        }
    }
    private class MouseHandler extends MouseAdapter {
        public void mousePressed(MouseEvent event)
        {
            add(event.getPoint());
            repaint();
        }
    }
}
