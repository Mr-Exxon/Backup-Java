/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasSelasa;

import javax.swing.JOptionPane;

/**
 *
 * @author Fadhal
 */
public class Calculator extends javax.swing.JFrame {
    float first, second, result;
    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        btn_tambah = new javax.swing.JRadioButton();
        btn_kurang = new javax.swing.JRadioButton();
        btn_kali = new javax.swing.JRadioButton();
        btn_bagi = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_first = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_second = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_plus = new javax.swing.JButton();
        txt_minus = new javax.swing.JButton();
        txt_multi = new javax.swing.JButton();
        txt_divide = new javax.swing.JButton();
        txt_area = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        btn_tambah.setText("+");

        btn_kurang.setText(" -");

        btn_kali.setText(" x");

        btn_bagi.setText(" /");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(188, 186, 190));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Best Calculator in the World");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("First Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Second Number");

        jLabel4.setText("******************************");

        txt_plus.setBackground(new java.awt.Color(25, 149, 173));
        txt_plus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_plus.setText("+");
        txt_plus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txt_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_plusActionPerformed(evt);
            }
        });

        txt_minus.setBackground(new java.awt.Color(25, 149, 173));
        txt_minus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_minus.setText("-");
        txt_minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txt_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_minusActionPerformed(evt);
            }
        });

        txt_multi.setBackground(new java.awt.Color(25, 149, 173));
        txt_multi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_multi.setText("*");
        txt_multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txt_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_multiActionPerformed(evt);
            }
        });

        txt_divide.setBackground(new java.awt.Color(25, 149, 173));
        txt_divide.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_divide.setText("/");
        txt_divide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txt_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_divideActionPerformed(evt);
            }
        });

        txt_area.setBackground(new java.awt.Color(188, 186, 190));
        txt_area.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txt_area.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_areaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(241, 241, 242));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_first, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_second, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_multi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txt_first, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txt_second, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_plus))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txt_minus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_multi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_divide))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_areaActionPerformed

    private void txt_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_divideActionPerformed
        // TODO add your handling code here:
        first=Integer.parseInt(txt_first.getText());
        second=Integer.parseInt(txt_second.getText());
        result=first/second;
        txt_area.setText(""+result);
    }//GEN-LAST:event_txt_divideActionPerformed

    private void txt_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_multiActionPerformed
        // TODO add your handling code here:
        first=Integer.parseInt(txt_first.getText());
        second=Integer.parseInt(txt_second.getText());
        result=first*second;
        txt_area.setText(""+result);
    }//GEN-LAST:event_txt_multiActionPerformed

    private void txt_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_minusActionPerformed
        // TODO add your handling code here:
        first=Integer.parseInt(txt_first.getText());
        second=Integer.parseInt(txt_second.getText());
        result=first-second;
        txt_area.setText(""+result);
    }//GEN-LAST:event_txt_minusActionPerformed

    private void txt_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_plusActionPerformed
        // TODO add your handling code here:
        first=Integer.parseInt(txt_first.getText());
        second=Integer.parseInt(txt_second.getText());
        result=first+second;
        txt_area.setText(""+result);
    }//GEN-LAST:event_txt_plusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // keluar
        int answer = JOptionPane.showConfirmDialog(null,"EXIT THIS APPLICATION ?", "WARNING !!!", JOptionPane.OK_OPTION);
        if (answer==JOptionPane.OK_OPTION){
            this.dispose();
            Utama utama = new Utama();
            utama.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_bagi;
    private javax.swing.JRadioButton btn_kali;
    private javax.swing.JRadioButton btn_kurang;
    private javax.swing.JRadioButton btn_tambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_area;
    private javax.swing.JButton txt_divide;
    private javax.swing.JTextField txt_first;
    private javax.swing.JButton txt_minus;
    private javax.swing.JButton txt_multi;
    private javax.swing.JButton txt_plus;
    private javax.swing.JTextField txt_second;
    // End of variables declaration//GEN-END:variables
}
