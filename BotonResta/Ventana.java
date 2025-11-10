//Cesar Venancio Martinez

package ejemplo02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {
    JButton b1, b2, b3;
    JTextField txt1, txt2;
    JLabel et01, et02, etR;

    public Ventana() {
        setTitle("Mi ventana");
        setSize(350,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(new GridLayout(4, 2, 10, 10)); // filas, columnas, espacio horizontal, espacio vertical

        et01 = new JLabel("Número 1:");
        et02 = new JLabel("Número 2:");
        etR = new JLabel("Resultado: ");
        txt1 = new JTextField();
        txt2 = new JTextField();

        b1 = new JButton("Sumar");
        b3 = new JButton("Restar");
        b2 = new JButton("Limpiar");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        add(et01);
        add(txt1);
        add(et02);
        add(txt2);
        add(b1);
        add(b3);
        add(b2);
        add(etR);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int op1 = Integer.parseInt(txt1.getText());
            int op2 = Integer.parseInt(txt2.getText());
            
            if (e.getSource() == b1) {
                int res = op1 + op2;
                etR.setText("Resultado: " + res);
                JOptionPane.showMessageDialog(null, "Suma = " + res);
            }
            if (e.getSource() == b3) {
                int res = op1 - op2;
                etR.setText("Resultado: " + res);
                JOptionPane.showMessageDialog(null, "Resta = " + res);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese números válidos.");
        }

        if (e.getSource() == b2) {
            txt1.setText("");
            txt2.setText("");
            etR.setText("Resultado: ");
        }
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
    }
}
