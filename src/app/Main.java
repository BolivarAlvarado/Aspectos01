package app;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private static JLabel contadorLabel;
    public Main() {
        setTitle("Observer AspectJ");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton redBtn = new JButton("Rojo");
        JButton greenBtn = new JButton("Verde");
        JButton blueBtn = new JButton("Azul");
        JPanel buttonPanel = new JPanel(new FlowLayout());


        contadorLabel = new JLabel("Clicks totales: ", SwingConstants.CENTER);
        contadorLabel.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));

        add(redBtn);
        add(greenBtn);
        add(blueBtn);

        add(buttonPanel, BorderLayout.CENTER);

        add(contadorLabel, BorderLayout.SOUTH);

        redBtn.addActionListener(e -> changeColor(Color.RED));
        greenBtn.addActionListener(e -> changeColor(Color.GREEN));
        blueBtn.addActionListener(e -> changeColor(Color.BLUE));

        setVisible(true);
    }

    public static void actualizarContador(int total){
        contadorLabel.setText("Clicks totales: " + total);
    }

    public void changeColor(Color color) {
        getContentPane().setBackground(color);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main();
        });
    }
}