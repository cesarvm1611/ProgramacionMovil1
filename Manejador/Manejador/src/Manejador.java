/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cesar Venancio Martinez
 */
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Manejador extends JFrame implements ActionListener {
    Button b1, b2;     // Botones AWT
    JButton b3, b4;    // Botones Swing
    JPanel pc;         // Panel central

    public Manejador() {
        setTitle("Programa 01");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        pc = new JPanel();
        pc.setBackground(Color.WHITE);

        // Crear botones
        b1 = new Button("azul");
        b2 = new Button("naranja");
        b3 = new JButton("verde");
        b4 = new JButton("rojo");

        // Escuchadores de eventos
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        // Agregar componentes a la ventana
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.WEST);
        add(b4, BorderLayout.EAST);
        add(pc, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("azul");
            pc.setBackground(Color.BLUE);
        }
        if (e.getSource() == b2) {
            System.out.println("naranja");
            pc.setBackground(Color.ORANGE);
        }
        if (e.getSource() == b3) {
            System.out.println("verde");
            pc.setBackground(Color.GREEN);
        }
        if (e.getSource() == b4) {
            System.out.println("rojo");
            pc.setBackground(Color.RED);
        }
    }
}
