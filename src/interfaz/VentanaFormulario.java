package interfaz;

import equipo.Equipo;

import util.JsonUtil;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class VentanaFormulario extends JFrame {

    private JTextField nombreField;
    private JTextField titulosField;
    private JTextField presupuestoField;
    private JButton botonCrear;

    public VentanaFormulario() {

        setTitle("Crear Equipo");
        setSize(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Nombre
        JLabel nombreLabel = new JLabel("Nombre del club:");
        nombreLabel.setBounds(20,20,100,25);
        add(nombreLabel);

        nombreField = new JTextField();
        nombreField.setBounds(20,45,200,25);
        add(nombreField);

        // Títulos
        JLabel titulosLabel = new JLabel("Títulos del equipo:");
        titulosLabel.setBounds(20,80,100,25);
        add(titulosLabel);

        titulosField = new JTextField();
        titulosField.setBounds(20,105,200,25);
        add(titulosField);

        // Presupuesto
        JLabel presupuestoLabel = new JLabel("Presupuesto del club:");
        presupuestoLabel.setBounds(20,140,100,25);
        add(presupuestoLabel);

        presupuestoField = new JTextField();
        presupuestoField.setBounds(20,165,200,25);
        add(presupuestoField);

        // Botón
        botonCrear = new JButton("Crear");
        botonCrear.setBounds(20,195,100,25);
        add(botonCrear);

        botonCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String nombre = nombreField.getText();
                    int titulos = Integer.parseInt(titulosField.getText());
                    double presupuesto = Double.parseDouble(presupuestoField.getText());

                    if (nombre.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío");
                        return;
                    }

                    if (titulos < 0) {
                        JOptionPane.showMessageDialog(null, "Los títulos no pueden ser negativos");
                        return;
                    }

                    if (presupuesto < 0) {
                        JOptionPane.showMessageDialog(null, "El presupuesto no puede ser negativo");
                        return;
                    }

                    // Crear objeto Equipo (clasificado por defecto false)
                    Equipo equipo = new Equipo(nombre, titulos, false, presupuesto);

                    // Guardar equipo en JSON
                    try {
                        String equipoJson = "{ \"nombre\": \"" + nombre + "\", \"titulos\": " + titulos + ", \"presupuesto\": " + presupuesto + " }";
                        JsonUtil.escribirJson("equipo.json", equipoJson);
                    } catch (IOException ioException) {
                        JOptionPane.showMessageDialog(null, "Error guardando el archivo JSON");
                    }

                    // Mostrar información usando toString
                    JOptionPane.showMessageDialog(null,
                            "Equipo creado:\n" + equipo.toString());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Introduce números válidos en títulos y presupuesto");
                }
            }
        });
    }
}