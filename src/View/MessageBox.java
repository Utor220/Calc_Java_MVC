/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author utor_
 */
public class MessageBox {
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Erro: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
