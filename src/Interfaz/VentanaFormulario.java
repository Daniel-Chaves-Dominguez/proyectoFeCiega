package Interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaFormulario extends JFrame {

    private JTextField nombreField;
    private JButton enviarButton;

    public VentanaFormulario() {
        setTitle("Formulario Futbol");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Nombre del equipo:");
        label.setBounds(10,10,200,25);
        add(label);

        nombreField = new JTextField();
        nombreField.setBounds(10,40,200,25);
        add(nombreField);

        enviarButton = new JButton("Enviar");
        enviarButton.setBounds(10,80,100,25);
        add(enviarButton);

        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                JOptionPane.showMessageDialog(null, "El equipo ingresado es: " + nombre);
            }
        });
    }
}
