package edu.capacitas.ventanas;

import javax.swing.*;
import java.awt.*;

public class MiVentana2 extends JFrame {
    public MiVentana2() {
        super ("Ejemplo de Grid Layout, Moudlo 7");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        GridLayout gridLayout = new GridLayout(4, 3);
        gridLayout.setHgap(5);
        gridLayout.setVgap(5);
        container.setLayout(gridLayout);
        for (int i = 0; i < 9; i++) {
            container.add(new JButton(String.valueOf(i)));
        }
        container.add(new JButton(String.valueOf("*")));
        container.add(new JButton(String.valueOf("0")));
        container.add(new JButton(String.valueOf("#")));
    }
}
