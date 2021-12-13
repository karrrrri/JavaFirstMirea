package ru.mirea.task8;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Shape extends JFrame{
    public static int i;
    public static void main(String[] args) {

        JFrame frame= new JFrame("Shape Stamper!");

        JPanel container;
        JButton circle = new JButton("Circle");
        JButton square = new JButton("Square");
        JButton rectangle = new JButton("Rectangle");
        JButton oval = new JButton("Oval");

        container = new JPanel(new GridLayout(1, 4));
        container.add(circle);
        container.add(square);
        container.add(rectangle);
        container.add(oval);

        circle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i = 1;
            }
        });

        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i = 2;
            }
        });

        rectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i = 3;
            }
        });

        oval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i = 4;
            }
        });

        MyComponent shape = new MyComponent();
        frame.setSize(500, 500);

        frame.add(shape, BorderLayout.CENTER);
        frame.add(container, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
