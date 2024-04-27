/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora.view;

import calculadora.controller.Calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author antoniositoe
 */
public class Frontend extends javax.swing.JFrame {

    /**
     * Creates new form Frontend
     */
    Calculator calcula = new Calculator();
    double primeiroValor, segundoValor;
    String simbol = ""; // mult/div/sum/sub

    public Frontend() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNponto = new javax.swing.JButton();
        BTNzero = new javax.swing.JButton();
        BTNigual = new javax.swing.JButton();
        BTN1 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        BTN3 = new javax.swing.JButton();
        BTN4 = new javax.swing.JButton();
        BTN5 = new javax.swing.JButton();
        BTN6 = new javax.swing.JButton();
        BTN7 = new javax.swing.JButton();
        BTN8 = new javax.swing.JButton();
        BTN9 = new javax.swing.JButton();
        Mais = new javax.swing.JButton();
        Dividir = new javax.swing.JButton();
        Menos = new javax.swing.JButton();
        Multiplicacao = new javax.swing.JButton();
        BTNDELETE = new javax.swing.JButton();
        Input1 = new javax.swing.JTextField();
        Message = new javax.swing.JLabel();
        BTNDELETE1 = new javax.swing.JButton();
        BTNponto1 = new javax.swing.JButton();
        BTN10 = new javax.swing.JButton();
        BTNponto2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(25, 25, 25));
        setForeground(java.awt.Color.orange);

        BTNponto.setBackground(new java.awt.Color(39, 43, 51));
        BTNponto.setFont(new java.awt.Font("Fira Sans", 0, 14)); // NOI18N
        BTNponto.setForeground(new java.awt.Color(255, 255, 255));
        BTNponto.setText("%");
        BTNponto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNpontoActionPerformed(evt);
            }
        });

        BTNzero.setBackground(new java.awt.Color(39, 43, 51));
        BTNzero.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        BTNzero.setForeground(new java.awt.Color(255, 255, 255));
        BTNzero.setText("0");
        BTNzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNzeroActionPerformed(evt);
            }
        });

        BTNigual.setBackground(new java.awt.Color(39, 43, 51));
        BTNigual.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        BTNigual.setForeground(new java.awt.Color(255, 255, 255));
        BTNigual.setText("=");
        BTNigual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNigualActionPerformed(evt);
            }
        });

        BTN1.setBackground(new java.awt.Color(39, 43, 51));
        BTN1.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        BTN1.setForeground(new java.awt.Color(255, 255, 255));
        BTN1.setText("1");
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });

        BTN2.setBackground(new java.awt.Color(39, 43, 51));
        BTN2.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        BTN2.setForeground(new java.awt.Color(255, 255, 255));
        BTN2.setText("2");
        BTN2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });

        BTN3.setBackground(new java.awt.Color(39, 43, 51));
        BTN3.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        BTN3.setForeground(new java.awt.Color(255, 255, 255));
        BTN3.setText("3");
        BTN3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });

        BTN4.setBackground(new java.awt.Color(39, 43, 51));
        BTN4.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        BTN4.setForeground(new java.awt.Color(255, 255, 255));
        BTN4.setText("4");
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });

        BTN5.setBackground(new java.awt.Color(39, 43, 51));
        BTN5.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        BTN5.setForeground(new java.awt.Color(255, 255, 255));
        BTN5.setText("5");
        BTN5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });

        BTN6.setBackground(new java.awt.Color(39, 43, 51));
        BTN6.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        BTN6.setForeground(new java.awt.Color(255, 255, 255));
        BTN6.setText("6");
        BTN6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });

        BTN7.setBackground(new java.awt.Color(39, 43, 51));
        BTN7.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        BTN7.setForeground(new java.awt.Color(255, 255, 255));
        BTN7.setText("7");
        BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN7ActionPerformed(evt);
            }
        });

        BTN8.setBackground(new java.awt.Color(39, 43, 51));
        BTN8.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        BTN8.setForeground(new java.awt.Color(255, 255, 255));
        BTN8.setText("8");
        BTN8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN8ActionPerformed(evt);
            }
        });

        BTN9.setBackground(new java.awt.Color(39, 43, 51));
        BTN9.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        BTN9.setForeground(new java.awt.Color(255, 255, 255));
        BTN9.setText("9");
        BTN9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN9ActionPerformed(evt);
            }
        });

        Mais.setBackground(new java.awt.Color(39, 43, 51));
        Mais.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        Mais.setForeground(new java.awt.Color(255, 255, 255));
        Mais.setText("+");
        Mais.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaisActionPerformed(evt);
            }
        });

        Dividir.setBackground(new java.awt.Color(39, 43, 51));
        Dividir.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        Dividir.setForeground(new java.awt.Color(255, 255, 255));
        Dividir.setText("/");
        Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividirActionPerformed(evt);
            }
        });

        Menos.setBackground(new java.awt.Color(39, 43, 51));
        Menos.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        Menos.setForeground(new java.awt.Color(255, 255, 255));
        Menos.setText("-");
        Menos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenosActionPerformed(evt);
            }
        });

        Multiplicacao.setBackground(new java.awt.Color(39, 43, 51));
        Multiplicacao.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        Multiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        Multiplicacao.setText("*");
        Multiplicacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacaoActionPerformed(evt);
            }
        });

        BTNDELETE.setBackground(new java.awt.Color(39, 43, 51));
        BTNDELETE.setForeground(new java.awt.Color(255, 255, 255));
        BTNDELETE.setText("Delete");
        BTNDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDELETEActionPerformed(evt);
            }
        });

        Input1.setBackground(new java.awt.Color(25, 25, 25));
        Input1.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        Input1.setForeground(java.awt.Color.lightGray);
        Input1.setCaretColor(java.awt.Color.white);
        Input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input1ActionPerformed(evt);
            }
        });

        Message.setForeground(java.awt.Color.red);
        Message.setText(".");

        BTNDELETE1.setBackground(new java.awt.Color(39, 43, 51));
        BTNDELETE1.setForeground(new java.awt.Color(255, 255, 255));
        BTNDELETE1.setText("H");
        BTNDELETE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDELETE1ActionPerformed(evt);
            }
        });

        BTNponto1.setBackground(new java.awt.Color(39, 43, 51));
        BTNponto1.setFont(new java.awt.Font("Fira Sans", 0, 14)); // NOI18N
        BTNponto1.setForeground(new java.awt.Color(255, 255, 255));
        BTNponto1.setText("Reset");
        BTNponto1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNponto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNponto1ActionPerformed(evt);
            }
        });

        BTN10.setBackground(new java.awt.Color(39, 43, 51));
        BTN10.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        BTN10.setForeground(new java.awt.Color(255, 255, 255));
        BTN10.setText(".");
        BTN10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN10ActionPerformed(evt);
            }
        });

        BTNponto2.setBackground(new java.awt.Color(39, 43, 51));
        BTNponto2.setFont(new java.awt.Font("Fira Sans", 0, 14)); // NOI18N
        BTNponto2.setForeground(new java.awt.Color(255, 255, 255));
        BTNponto2.setText("X^2");
        BTNponto2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNponto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNponto2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Input1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(BTNDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTNDELETE1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Multiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Mais, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(BTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Menos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTNzero, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTNponto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTNponto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNigual, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(BTNponto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Message, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Input1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Message)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNDELETE1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNponto2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTNponto1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Menos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Mais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BTNzero, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BTN10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BTNponto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BTNigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        calcula.difinirValor(Input1, 2);
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        calcula.difinirValor(Input1, 5);        // TODO add your handling code here:
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN8ActionPerformed
        calcula.difinirValor(Input1, 8);        // TODO add your handling code here:
    }//GEN-LAST:event_BTN8ActionPerformed

    private void BTNigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNigualActionPerformed
        Message.setText("");
        var eNumero = Input1.getText();

        try {
            if (calcula.isNumeric(eNumero)) {
                if (simbol.length() > 0) {
                    segundoValor = Double.parseDouble(eNumero);
                    calcula.calcula(Input1, Message, simbol, primeiroValor, segundoValor);
                } else {
                    Message.setText("Selecione um tipo de operacao");
                }

            } else {
                Message.setText("Digite um numero valido");
            }
            //  Block of code to try
        } catch (Exception e) {
            //  Block of code to handle errors
            Message.setText("Digite um numero valido");
            segundoValor = 0;
            primeiroValor = 0;
        }

    }//GEN-LAST:event_BTNigualActionPerformed

    private void Input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input1ActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        // TODO add your handling code here:
        calcula.difinirValor(Input1, 1);
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        calcula.difinirValor(Input1, 3);        // TODO add your handling code here:
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        calcula.difinirValor(Input1, 4);        // TODO add your handling code here:
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        calcula.difinirValor(Input1, 6);        // TODO add your handling code here:
    }//GEN-LAST:event_BTN6ActionPerformed

    private void BTN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN9ActionPerformed
        calcula.difinirValor(Input1, 9);        // TODO add your handling code here:
    }//GEN-LAST:event_BTN9ActionPerformed

    private void BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN7ActionPerformed
        calcula.difinirValor(Input1, 7);        // TODO add your handling code here:
    }//GEN-LAST:event_BTN7ActionPerformed

    private void BTNDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDELETEActionPerformed
        // TODO add your handling code here:
        var value = Input1.getText();
        try {
            calcula.removerUltimoCaractere(Input1, value);
            //  Block of code to try
        } catch (Exception e) {
            //  Block of code to handle errors
            System.out.println("ERRO" + e);
        }


    }//GEN-LAST:event_BTNDELETEActionPerformed

    private void MultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacaoActionPerformed
        // TODO add your handling code here:
        var value = Input1.getText();
        if (calcula.isNumeric(value)) {
            primeiroValor = Double.parseDouble(value);
            simbol = "mult";
            Input1.setText("");
        } else {
            Message.setText("Digite um numero valido");
            Input1.setText("");
        }
    }//GEN-LAST:event_MultiplicacaoActionPerformed

    private void MenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenosActionPerformed
        // TODO add your handling code here:
        var value = Input1.getText();
        if (calcula.isNumeric(value)) {
            primeiroValor = Double.parseDouble(value);
            simbol = "sub";
            Input1.setText("");
        } else {
            Message.setText("Digite um numero valido");
            Input1.setText("");
        }
    }//GEN-LAST:event_MenosActionPerformed

    private void DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividirActionPerformed
        // TODO add your handling code here:
        var value = Input1.getText();
        if (calcula.isNumeric(value)) {
            primeiroValor = Double.parseDouble(value);
            simbol = "div";
            Input1.setText("");
        } else {
            Message.setText("Digite um numero valido");
            Input1.setText("");
        }
    }//GEN-LAST:event_DividirActionPerformed

    private void MaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaisActionPerformed
        var value = Input1.getText();
        if (calcula.isNumeric(value)) {
            primeiroValor = Double.parseDouble(value);
            simbol = "sum";
            Input1.setText("");
        } else {
            Message.setText("Digite um numero valido");
            Input1.setText("");
        }
    }//GEN-LAST:event_MaisActionPerformed

    private void BTNzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNzeroActionPerformed
        calcula.difinirValor(Input1, 0);         // TODO add your handling code here:
    }//GEN-LAST:event_BTNzeroActionPerformed

    private void BTNDELETE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDELETE1ActionPerformed
        // TODO add your handling code here:
        calcula.mostrarLista();
    }//GEN-LAST:event_BTNDELETE1ActionPerformed

    private void BTN10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN10ActionPerformed
        calcula.difinirPonto(Input1, ".");         // TODO add your handling code here:
    }//GEN-LAST:event_BTN10ActionPerformed

    private void BTNpontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNpontoActionPerformed
        var value = Input1.getText();
        if (calcula.isNumeric(value)) {
            primeiroValor = Double.parseDouble(value);
            simbol = "rest";
            Input1.setText("");
        } else {
            Message.setText("Digite um numero valido");
            Input1.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BTNpontoActionPerformed

    private void BTNponto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNponto1ActionPerformed

        try {
            calcula.reset(Input1);
        } catch (Exception e) {
            System.out.println("Erro" + e);
        }

    }//GEN-LAST:event_BTNponto1ActionPerformed

    private void BTNponto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNponto2ActionPerformed
        var value = Input1.getText();
        if (calcula.isNumeric(value)) {
            primeiroValor = Double.parseDouble(value);
            simbol = "exp";
            Input1.setText("");
        } else {
            Message.setText("Digite um numero valido");
            Input1.setText("");
        }
    }//GEN-LAST:event_BTNponto2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frontend().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN10;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN3;
    private javax.swing.JButton BTN4;
    private javax.swing.JButton BTN5;
    private javax.swing.JButton BTN6;
    private javax.swing.JButton BTN7;
    private javax.swing.JButton BTN8;
    private javax.swing.JButton BTN9;
    private javax.swing.JButton BTNDELETE;
    private javax.swing.JButton BTNDELETE1;
    private javax.swing.JButton BTNigual;
    private javax.swing.JButton BTNponto;
    private javax.swing.JButton BTNponto1;
    private javax.swing.JButton BTNponto2;
    private javax.swing.JButton BTNzero;
    private javax.swing.JButton Dividir;
    private javax.swing.JTextField Input1;
    private javax.swing.JButton Mais;
    private javax.swing.JButton Menos;
    private javax.swing.JLabel Message;
    private javax.swing.JButton Multiplicacao;
    // End of variables declaration//GEN-END:variables

}