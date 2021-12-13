package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Guess extends JFrame {
    JButton check_button = new JButton("Check");
    JLabel result = new JLabel();
    JTextField textbox = new JTextField(20);
    JPanel[] panel = new JPanel[2];

    private int number;
    private int n = 3;

    public Guess() {
        super("Guess");
        setSize(450 ,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(1,2));
        for(int i = 0 ; i < panel.length ; i++)
        {
            panel[i] = new JPanel();
            add(panel[i]);
        }
        Random random = new Random();
        number = random.nextInt(20)+1;

        panel[0].add(check_button);
        panel[1].add(result);
        panel[1].add(textbox);
        result.setText(String.valueOf(number));

        ActionListener button = new buttonAction();
        check_button.addActionListener(button);
    }

    public class buttonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if ((result.getText() == "You win") || (result.getText() ==  "You lost")) {
                n = 3;
                Random random = new Random();
                number = random.nextInt(20)+1;
                result.setText("");
                actionPerformed(e);
            }
            else {
                if (n > 0) {
                    if (Integer.parseInt(textbox.getText()) == number) {
                        result.setText("You win");
                    }
                    else if (Integer.parseInt(textbox.getText()) > number) {
                        result.setText("less");
                        n--;
                    }
                    else {
                        result.setText("greater");
                        n--;
                    }
                }
                else {
                    result.setText("You lost");

                }
            }
        }
    }

    public static void main(String[] args) {
        new Guess().setVisible(true);
    }
}