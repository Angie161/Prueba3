package org.example.Vistas;

import org.example.Logica.Operaciones;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class PanelOperaciones extends JPanel {
    Operaciones op = new Operaciones(10, 2);

    private BufferedImage imagen; //!!!!!!!!!!!!!!

    PanelOperaciones(){
        this.setLayout(new BorderLayout());
        this.setBackground(Color.BLUE);

        JButton JBRestar  = new JButton("Restar");
        JButton JBSumar  = new JButton("Sumar");

        JLabel JLresultado = new JLabel("0", SwingConstants.CENTER);

        this.add(JBRestar, BorderLayout.WEST);
        this.add(JBSumar, BorderLayout.EAST);
        this.add(JLresultado, BorderLayout.CENTER);

        JBRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op.resta();
                JLresultado.setText(op.resultado+"");
            }
        });

        JBSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op.sumar();
                JLresultado.setText(op.resultado+"");
                System.out.println(op.resultado);
            }
        });

        try {
            // Cargar la imagen desde la carpeta resources
            InputStream is = getClass().getResourceAsStream("/Agua.jpg");

            imagen = ImageIO.read(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja la imagen en el panel
        if (imagen != null) {
            int nuevoAncho = 200;  // Cambia el ancho según lo desees
            int nuevoAlto = 150;   // Cambia la altura según lo desees
            int posicionX = 200;    // Coordenada X donde se dibuja la imagen
            int posicionY = 300;   // Coordenada Y donde se dibuja la imagen
            g.drawImage(imagen, posicionX, posicionY, nuevoAncho, nuevoAlto, this); // Dibuja la imagen en la posición (posicionX, posicionY)
        }
    }
}
