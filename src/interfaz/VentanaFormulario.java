package interfaz;

<<<<<<<< HEAD:src/interfaz/VentanaFormulario.java
import equipo.Equipo;

import util.JsonUtil;
========
>>>>>>>> origin/master:src/Interfaz/ventanaFormulario.java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class VentanaFormulario extends JFrame {

    private JTextField nombreField;
    private JButton enviarButton;

    public VentanaFormulario() {
<<<<<<<< HEAD:src/interfaz/VentanaFormulario.java

        setTitle("Crear Equipo");
        setSize(300,250);
========
        setTitle("Formulario Futbol");
        setSize(300,150);
>>>>>>>> origin/master:src/Interfaz/ventanaFormulario.java
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
<<<<<<<< HEAD:src/interfaz/VentanaFormulario.java

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
========
                String nombre = nombreField.getText();
                JOptionPane.showMessageDialog(null, "El equipo ingresado es: " + nombre);
>>>>>>>> origin/master:src/Interfaz/ventanaFormulario.java
            }
        });
    }
}
