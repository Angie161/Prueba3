package src.main.java.org.example.Vistas;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
        super();
        this.setTitle("Ventana nueva");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);

        PanelOperaciones pp = new PanelOperaciones();
        this.add(pp);

        this.setVisible(true);
    }
}
