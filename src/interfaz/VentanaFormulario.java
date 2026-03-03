package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class VentanaFormulario extends JFrame {

    private JTextField campoEquipo1;
    private JTextField campoEquipo2;
    private JButton botonJugar;
    private JLabel labelResultado;
    private JLabel labelPuntos;

    private int puntosEquipo1 = 0;
    private int puntosEquipo2 = 0;

    public VentanaFormulario() {

        setTitle("Simulador de Partido");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        panel.setLayout(new GridLayout(7, 1, 10, 10));

        panel.add(new JLabel("Equipo 1:"));
        campoEquipo1 = new JTextField();
        panel.add(campoEquipo1);

        panel.add(new JLabel("Equipo 2:"));
        campoEquipo2 = new JTextField();
        panel.add(campoEquipo2);

        botonJugar = new JButton("Jugar Partido");
        panel.add(botonJugar);

        labelResultado = new JLabel("Resultado: ---", SwingConstants.CENTER);
        panel.add(labelResultado);

        labelPuntos = new JLabel("Puntos: ---", SwingConstants.CENTER);
        panel.add(labelPuntos);

        add(panel);

        botonJugar.addActionListener((ActionEvent e) -> jugarPartido());
    }

    private void jugarPartido() {

        String equipo1 = campoEquipo1.getText().trim();
        String equipo2 = campoEquipo2.getText().trim();


        if (equipo1.isEmpty() || equipo2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes escribir ambos equipos");
            return;
        }

        if (equipo1.equalsIgnoreCase(equipo2)) {
            JOptionPane.showMessageDialog(this, "No se puede jugar un equipo contra sí mismo");
            return;
        }

        Random random = new Random();
        int goles1 = random.nextInt(4);
        int goles2 = random.nextInt(4);

        if (goles1 > goles2) {
            puntosEquipo1 += 3;
            labelResultado.setText("Ha ganado " + equipo1 + ": 3 puntos");
        } else if (goles2 > goles1) {
            puntosEquipo2 += 3;
            labelResultado.setText("Ha ganado " + equipo2 + ": 3 puntos");
        } else {
            puntosEquipo1 += 1;
            puntosEquipo2 += 1;
            labelResultado.setText("Empate: 1 punto para ambos");
        }

        labelPuntos.setText(
                equipo1 + ": " + puntosEquipo1 +
                        " | " +
                        equipo2 + ": " + puntosEquipo2
        );
    }
}