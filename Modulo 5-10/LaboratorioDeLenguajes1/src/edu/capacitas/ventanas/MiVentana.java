package edu.capacitas.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana extends JFrame {

    private JTextField textField;

    public MiVentana () {
        super("Titulo de MiVentana, Modulo 5(contenido de la ventana Moudlo 6)");
        setSize(600, 200);

        initComponent();

    }

    public MiVentana (String titulo, int width, int height) {
        setTitle(titulo);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        initComponent();
    }

    // Se agrego por le Modulo 6: "Componentes de las ventanas"
    private void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        // Modulo 7: "Alineacion de los componentes"
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        flowLayout.setHgap(10);
        flowLayout.setVgap(15);
        contentPane.setLayout(flowLayout);

        JLabel label = new JLabel("Nombre ");
        textField = new JTextField(20);
        JButton button = new JButton("Saludar!");
        button.addActionListener(new EventoSaludo2());

        contentPane.add(label);
        contentPane.add(textField);
        contentPane.add(button);
    }

    class EventoSaludo2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Hola " + textField.getText() + "!");
        }
    }
}
