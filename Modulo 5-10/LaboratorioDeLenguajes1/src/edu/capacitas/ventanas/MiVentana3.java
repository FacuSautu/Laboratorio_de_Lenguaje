package edu.capacitas.ventanas;

import javax.swing.*;
import java.awt.*;

public class MiVentana3 extends JFrame {
    public MiVentana3(){
        super("Ejemplo de paneles, Moudelo 8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);

        //Panel de Fecha
        JPanel  panelFecha = new JPanel(new FlowLayout());
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));

        //Panel de Datos Personales
        JPanel panelDatos = new JPanel(new GridLayout(3, 2, 0,5));
        panelDatos.add(new JLabel("Nombre: "));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("DNI: "));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("Fecha de nacimiento: "));
        panelDatos.add(panelFecha);

        //Panel de Botones
        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(new JButton("Aceptar"));
        panelBotones.add(new JButton("Cancelar"));

        Container container = getContentPane();
        container.add(panelDatos, BorderLayout.CENTER);
        container.add(panelDatos, BorderLayout.SOUTH);

    }
}
