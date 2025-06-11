package app;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        setTitle("Observer AspectJ");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton redBtn = new JButton("Rojo");
        JButton greenBtn = new JButton("Verde");
        JButton blueBtn = new JButton("Azul");

        add(redBtn);
        add(greenBtn);
        add(blueBtn);

        redBtn.addActionListener(e -> changeColor(Color.RED));
        greenBtn.addActionListener(e -> changeColor(Color.GREEN));
        blueBtn.addActionListener(e -> changeColor(Color.BLUE));

        setVisible(true);
    }

    public void changeColor(Color color) {
        getContentPane().setBackground(color);
    }

    public static void main(String[] args) {
        new Main();
    }
}