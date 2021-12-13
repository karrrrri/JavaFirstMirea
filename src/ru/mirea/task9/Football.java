package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Football extends JFrame{
    private int x = 0;
    private int y = 0;

    JButton first = new JButton("AC Milan");
    JButton second = new JButton("Real Madrid");

    JLabel result = new JLabel();
    JLabel winner = new JLabel();
    JLabel score = new JLabel();

    JPanel [] panel = new JPanel[9];
    public Football(){
        super("Начнем игру!");
        this.setBounds(500,200,500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,3));
        for (int i = 0; i < panel.length; i++){
            panel[i] = new JPanel();
            panel[i].setBackground(new Color(255,250,205));
            add(panel[i]);
        }
        panel[3].setLayout(new BorderLayout());
        panel[5].setLayout(new BorderLayout());
        panel[3].add(first);
        panel[5].add(second);
        panel[1].add(winner,BorderLayout.NORTH);
        panel[4].add(result,BorderLayout.CENTER);
        panel[7].add(score,BorderLayout.SOUTH);
        first.addActionListener(new Tap1());
        second.addActionListener(new Tap2());
        setVisible(true);
    }
    class Tap1 implements ActionListener{
        public void actionPerformed(ActionEvent Event){
            x++;
            score.setText("Забили AC Milan");
            result.setText("Счет: "+String.valueOf(x)+" X "+String.valueOf(y));
            Winner(x,y);
        }
    }
    class Tap2 implements ActionListener{
        public void actionPerformed(ActionEvent Event){
            y++;
            score.setText("Забили Real Madrid");
            result.setText("Счет: "+String.valueOf(x)+" X "+String.valueOf(y));
            Winner(x,y);
        }
    }
    public void Winner(int x, int y){
        if (x == y)
            winner.setText("-НИЧЬЯ-");
        else if (x > y)
            winner.setText("-Победили-AC-Milan-");
        else
            winner.setText("-Победили-Real-Madrid");
    }
    public static void main(String[] args){
        new Football().setVisible(true);
    }
}
