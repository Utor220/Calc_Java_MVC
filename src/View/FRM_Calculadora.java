/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Calculadora;
import Controller.CTR_Calculadora;
import Model.Extra;
import java.util.HashSet;
/**
 *
 * @author utor_
 */
public class FRM_Calculadora extends javax.swing.JFrame {
        Extra Extra;
        CTR_Calculadora CTR_Calculadora;
        Calculadora Calculadora;
        MessageBox Msgbx;
    public FRM_Calculadora() {
        initComponents();
        Extra = new Extra();
        Calculadora = new Calculadora();
        CTR_Calculadora = new CTR_Calculadora();
        Msgbx = new MessageBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Num8 = new javax.swing.JButton();
        Num9 = new javax.swing.JButton();
        Num4 = new javax.swing.JButton();
        Num5 = new javax.swing.JButton();
        Num6 = new javax.swing.JButton();
        Num1 = new javax.swing.JButton();
        Num2 = new javax.swing.JButton();
        Num3 = new javax.swing.JButton();
        Num0 = new javax.swing.JButton();
        TeclaPonto = new javax.swing.JButton();
        TeclaMais = new javax.swing.JButton();
        TeclaIgual = new javax.swing.JButton();
        TeclaSubtracao = new javax.swing.JButton();
        TeclaMc = new javax.swing.JButton();
        TeclaDivisao = new javax.swing.JButton();
        TeclaMr = new javax.swing.JButton();
        TeclaMultiplicacao = new javax.swing.JButton();
        TeclaMmais = new javax.swing.JButton();
        TeclaSen = new javax.swing.JButton();
        TeclaMmenos = new javax.swing.JButton();
        TeclaCos = new javax.swing.JButton();
        TeclaAC = new javax.swing.JButton();
        TeclaTan = new javax.swing.JButton();
        TeclaLog = new javax.swing.JButton();
        TeclaEXP = new javax.swing.JButton();
        TeclaPi = new javax.swing.JButton();
        txbCalc = new javax.swing.JTextField();
        TeclaEul = new javax.swing.JButton();
        Num7 = new javax.swing.JButton();
        memLabel = new javax.swing.JLabel();
        txbMem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        Num8.setText("8");
        Num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num8ActionPerformed(evt);
            }
        });

        Num9.setText("9");
        Num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num9ActionPerformed(evt);
            }
        });

        Num4.setText("4");
        Num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num4ActionPerformed(evt);
            }
        });

        Num5.setText("5");
        Num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num5ActionPerformed(evt);
            }
        });

        Num6.setText("6");
        Num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num6ActionPerformed(evt);
            }
        });

        Num1.setText("1");
        Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num1ActionPerformed(evt);
            }
        });

        Num2.setText("2");
        Num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num2ActionPerformed(evt);
            }
        });

        Num3.setText("3");
        Num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num3ActionPerformed(evt);
            }
        });

        Num0.setText("0");
        Num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num0ActionPerformed(evt);
            }
        });

        TeclaPonto.setText(".");
        TeclaPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaPontoActionPerformed(evt);
            }
        });

        TeclaMais.setText("+");
        TeclaMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeclaMaisMouseClicked(evt);
            }
        });
        TeclaMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaMaisActionPerformed(evt);
            }
        });

        TeclaIgual.setText("=");
        TeclaIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaIgualActionPerformed(evt);
            }
        });

        TeclaSubtracao.setText("-");
        TeclaSubtracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeclaSubtracaoMouseClicked(evt);
            }
        });
        TeclaSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaSubtracaoActionPerformed(evt);
            }
        });

        TeclaMc.setText("MC");
        TeclaMc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaMcActionPerformed(evt);
            }
        });

        TeclaDivisao.setText("/");
        TeclaDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaDivisaoActionPerformed(evt);
            }
        });

        TeclaMr.setText("MR");
        TeclaMr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaMrActionPerformed(evt);
            }
        });

        TeclaMultiplicacao.setText("*");
        TeclaMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaMultiplicacaoActionPerformed(evt);
            }
        });

        TeclaMmais.setText("M+");
        TeclaMmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaMmaisActionPerformed(evt);
            }
        });

        TeclaSen.setText("sen");
        TeclaSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaSenActionPerformed(evt);
            }
        });

        TeclaMmenos.setText("M-");
        TeclaMmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaMmenosActionPerformed(evt);
            }
        });

        TeclaCos.setText("cos");
        TeclaCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaCosActionPerformed(evt);
            }
        });

        TeclaAC.setText("AC");
        TeclaAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeclaACMouseClicked(evt);
            }
        });
        TeclaAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaACActionPerformed(evt);
            }
        });

        TeclaTan.setText("tan");
        TeclaTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaTanActionPerformed(evt);
            }
        });

        TeclaLog.setText("log");
        TeclaLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaLogActionPerformed(evt);
            }
        });

        TeclaEXP.setText("EXP");
        TeclaEXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaEXPActionPerformed(evt);
            }
        });

        TeclaPi.setText("Pi");
        TeclaPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaPiActionPerformed(evt);
            }
        });

        txbCalc.setName(""); // NOI18N
        txbCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbCalcActionPerformed(evt);
            }
        });

        TeclaEul.setText("eul");
        TeclaEul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaEulActionPerformed(evt);
            }
        });

        Num7.setText("7");
        Num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num7ActionPerformed(evt);
            }
        });

        memLabel.setText("Memória:");
        memLabel.setName(""); // NOI18N

        txbMem.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txbCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(memLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txbMem, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TeclaMais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TeclaSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TeclaMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TeclaDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TeclaSen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TeclaCos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TeclaTan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TeclaLog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TeclaEXP)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(TeclaPi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TeclaEul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TeclaAC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TeclaMr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TeclaMmais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TeclaMmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TeclaMc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TeclaPonto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TeclaIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memLabel)
                    .addComponent(txbMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TeclaMais)
                            .addComponent(TeclaSubtracao)
                            .addComponent(TeclaMultiplicacao)
                            .addComponent(TeclaDivisao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TeclaSen)
                            .addComponent(TeclaCos)
                            .addComponent(TeclaTan)
                            .addComponent(TeclaLog))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TeclaEXP)
                                .addComponent(TeclaPi)
                                .addComponent(TeclaEul))
                            .addComponent(TeclaAC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TeclaMr)
                            .addComponent(TeclaMmais)
                            .addComponent(TeclaMmenos)
                            .addComponent(TeclaMc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Num7)
                            .addComponent(Num8)
                            .addComponent(Num9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Num4)
                            .addComponent(Num5)
                            .addComponent(Num6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Num1)
                            .addComponent(Num2)
                            .addComponent(Num3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Num0)
                            .addComponent(TeclaPonto))))
                .addGap(18, 18, 18)
                .addComponent(TeclaIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        txbCalc.getAccessibleContext().setAccessibleName("txbCalc");
        memLabel.getAccessibleContext().setAccessibleName("memLabel");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void Num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num8ActionPerformed
        Extra.str_num = txbCalc.getText() + Num8.getText();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_Num8ActionPerformed

    private void Num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num9ActionPerformed
        Extra.str_num = txbCalc.getText() + Num9.getText();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_Num9ActionPerformed

    private void Num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num4ActionPerformed
        Extra.str_num = txbCalc.getText() + Num4.getText();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_Num4ActionPerformed

    private void Num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num5ActionPerformed
        Extra.str_num = txbCalc.getText() + Num5.getText();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_Num5ActionPerformed

    private void Num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num6ActionPerformed
        Extra.str_num = txbCalc.getText() + Num6.getText();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_Num6ActionPerformed

    private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num1ActionPerformed
        Extra.str_num = txbCalc.getText() + Num1.getText();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_Num1ActionPerformed

    private void Num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num2ActionPerformed
        Extra.str_num = txbCalc.getText() + Num2.getText();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_Num2ActionPerformed

    private void Num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num3ActionPerformed
        Extra.str_num = txbCalc.getText() + Num3.getText();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_Num3ActionPerformed

    private void Num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num0ActionPerformed
        Extra.str_num = txbCalc.getText() + Num0.getText();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_Num0ActionPerformed

    private void TeclaPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaPontoActionPerformed
        Extra.str_num = txbCalc.getText() + TeclaPonto.getText();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_TeclaPontoActionPerformed

    private void TeclaMaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeclaMaisMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TeclaMaisMouseClicked

    private void TeclaMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaMaisActionPerformed
        Calculadora.setN1(Double.parseDouble(txbCalc.getText()));
        txbCalc.setText("");
        Calculadora.setOperador("+");
    }//GEN-LAST:event_TeclaMaisActionPerformed

    private void TeclaIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaIgualActionPerformed
        Calculadora.setN2(Double.parseDouble(txbCalc.getText()));
        switch (Calculadora.getOperador()){
            case "+":
                CTR_Calculadora.adicao(Calculadora);
                txbCalc.setText(Calculadora.getRespostafinal());            
                break;
            case "-":
                CTR_Calculadora.subtracao(Calculadora);
                txbCalc.setText(Calculadora.getRespostafinal());
                break;
            case "/":
                CTR_Calculadora.divisao(Calculadora);
                txbCalc.setText(Calculadora.getRespostafinal());
                break;
            case "*":
                CTR_Calculadora.multiplicacao(Calculadora);
                txbCalc.setText(Calculadora.getRespostafinal());
                break;
            case "exp":
                CTR_Calculadora.exp(Calculadora);
                txbCalc.setText(Calculadora.getRespostafinal());
        }
    }//GEN-LAST:event_TeclaIgualActionPerformed

    private void TeclaSubtracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeclaSubtracaoMouseClicked

    }//GEN-LAST:event_TeclaSubtracaoMouseClicked

    private void TeclaSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaSubtracaoActionPerformed
        Calculadora.setN1(Double.parseDouble(txbCalc.getText()));
        txbCalc.setText("");
        Calculadora.setOperador("-");
    }//GEN-LAST:event_TeclaSubtracaoActionPerformed

    private void TeclaMcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaMcActionPerformed
        txbMem.setText("");
    }//GEN-LAST:event_TeclaMcActionPerformed

    private void TeclaMrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaMrActionPerformed
        txbCalc.setText(txbMem.getText());
    }//GEN-LAST:event_TeclaMrActionPerformed

    private void TeclaMmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaMmaisActionPerformed

    }//GEN-LAST:event_TeclaMmaisActionPerformed

    private void TeclaSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaSenActionPerformed
       CTR_Calculadora.sin(Calculadora);
       txbCalc.setText("");
       txbCalc.setText(txbCalc.getText() + Calculadora.getResultado());
       Msgbx.infoBox(Extra.str_num,"teste");
    }//GEN-LAST:event_TeclaSenActionPerformed

    private void TeclaMmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaMmenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeclaMmenosActionPerformed

    private void TeclaCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaCosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeclaCosActionPerformed

    private void TeclaACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeclaACMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TeclaACMouseClicked

    private void TeclaACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaACActionPerformed
        Calculadora.ac();
        Extra.str_num = "";
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_TeclaACActionPerformed

    private void TeclaTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaTanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeclaTanActionPerformed

    private void TeclaLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaLogActionPerformed
        Calculadora.setN1(Double.parseDouble(txbCalc.getText()));
        CTR_Calculadora.log(Calculadora);
        txbCalc.setText(Calculadora.getRespostafinal());
    }//GEN-LAST:event_TeclaLogActionPerformed

    private void TeclaEXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaEXPActionPerformed
        Calculadora.setN1(Double.parseDouble(txbCalc.getText()));
        txbCalc.setText("");
        Calculadora.setOperador("exp");
    }//GEN-LAST:event_TeclaEXPActionPerformed

    private void TeclaPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaPiActionPerformed
        Extra.str_num = CTR_Calculadora.PI().toString();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_TeclaPiActionPerformed

    private void txbCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbCalcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbCalcActionPerformed

    private void TeclaEulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaEulActionPerformed
        Extra.str_num = CTR_Calculadora.euler().toString();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_TeclaEulActionPerformed

    private void Num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num7ActionPerformed
        Extra.str_num = txbCalc.getText() + Num7.getText();
        txbCalc.setText(Extra.str_num);
    }//GEN-LAST:event_Num7ActionPerformed

    private void TeclaMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaMultiplicacaoActionPerformed
        Calculadora.setN1(Double.parseDouble(txbCalc.getText()));
        txbCalc.setText("");
        Calculadora.setOperador("*");
    }//GEN-LAST:event_TeclaMultiplicacaoActionPerformed

    private void TeclaDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaDivisaoActionPerformed
        Calculadora.setN1(Double.parseDouble(txbCalc.getText()));
        txbCalc.setText("");
        Calculadora.setOperador("/");
    }//GEN-LAST:event_TeclaDivisaoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Num0;
    private javax.swing.JButton Num1;
    private javax.swing.JButton Num2;
    private javax.swing.JButton Num3;
    private javax.swing.JButton Num4;
    private javax.swing.JButton Num5;
    private javax.swing.JButton Num6;
    private javax.swing.JButton Num7;
    private javax.swing.JButton Num8;
    private javax.swing.JButton Num9;
    private javax.swing.JButton TeclaAC;
    private javax.swing.JButton TeclaCos;
    private javax.swing.JButton TeclaDivisao;
    private javax.swing.JButton TeclaEXP;
    private javax.swing.JButton TeclaEul;
    private javax.swing.JButton TeclaIgual;
    private javax.swing.JButton TeclaLog;
    private javax.swing.JButton TeclaMais;
    private javax.swing.JButton TeclaMc;
    private javax.swing.JButton TeclaMmais;
    private javax.swing.JButton TeclaMmenos;
    private javax.swing.JButton TeclaMr;
    private javax.swing.JButton TeclaMultiplicacao;
    private javax.swing.JButton TeclaPi;
    private javax.swing.JButton TeclaPonto;
    private javax.swing.JButton TeclaSen;
    private javax.swing.JButton TeclaSubtracao;
    private javax.swing.JButton TeclaTan;
    private javax.swing.JLabel memLabel;
    private javax.swing.JTextField txbCalc;
    private javax.swing.JTextField txbMem;
    // End of variables declaration//GEN-END:variables
}