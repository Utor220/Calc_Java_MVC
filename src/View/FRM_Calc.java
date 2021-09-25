package View;

import Model.Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ContainerAdapter;

public class FRM_Calc extends JFrame {

    private JPanel mainPanel;
    private JTextField v1TField;
    private JTextField v2TField;
    private JButton adcButton;
    private JButton subButton;
    private JButton divButton;
    private JButton mulButton;
    private JLabel v1Label;
    private JLabel v2Label;
    private JLabel resLabel;
    private JButton sairButton;
    Calculadora Calculadora = new Calculadora();

    public FRM_Calc(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);

        adcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculadora.setValor1(Float.parseFloat(v1TField.getText()));
                Calculadora.setValor2(Float.parseFloat(v2TField.getText()));

                resLabel.setText("Resultado:" + Calculadora.adicao());
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculadora.setValor1(Float.parseFloat(v1TField.getText()));
                Calculadora.setValor2(Float.parseFloat(v2TField.getText()));

                resLabel.setText("Resultado:" + Calculadora.subtracao());
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculadora.setValor1(Float.parseFloat(v1TField.getText()));
                Calculadora.setValor2(Float.parseFloat(v2TField.getText()));

                resLabel.setText("Resultado:" + Calculadora.divisao());
            }
        });

        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculadora.setValor1(Float.parseFloat(v1TField.getText()));
                Calculadora.setValor2(Float.parseFloat(v2TField.getText()));

                resLabel.setText("Resultado:" + Calculadora.multiplicacao());
            }
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame Frame = new FRM_Calc("Calculadora");
        Frame.setVisible(true);
    }
}
