package edu.capacitas.Eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBotonPulsado implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
//        System.out.println("Gracias!");
//        System.out.println("Lo necesitaba...");

        //Implementacion de eventos con casteo de objetos Source. Modulo 9.
        if (event.getSource() instanceof JButton) {
            JButton button = (JButton) event.getSource();
            button.setText("Gracias! Lo necesitaba...");
        }

    }
}
