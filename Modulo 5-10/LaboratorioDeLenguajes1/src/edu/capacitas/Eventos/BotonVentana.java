package edu.capacitas.Eventos;

import javax.swing.*;
import java.awt.*;

public class BotonVentana extends JFrame {

    public BotonVentana(String title){
        super(title);
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        JButton button = new JButton("Pulsame!");
        button.addActionListener(new EventoBotonPulsado());
        getContentPane().add(button);

    }
}
