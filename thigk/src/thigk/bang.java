/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thigk;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class bang extends javax.swing.JFrame {

    /**
     * Creates new form bang
     */
    public bang() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        ATTT = new javax.swing.JRadioButton();
        CNTT = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
        j6 = new javax.swing.JLabel();
        j7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtTen = new javax.swing.JTextField();
        txtNgaysinh = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        doubleDiemtb = new javax.swing.JTextField();
        txtDonvi = new javax.swing.JTextField();
        doubleLuong = new javax.swing.JTextField();
        doubleHocphi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(ATTT);
        ATTT.setText("ATTT");
        ATTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ATTTMouseClicked(evt);
            }
        });

        buttonGroup1.add(CNTT);
        CNTT.setText("CNTT");
        CNTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CNTTMouseClicked(evt);
            }
        });

        jLabel1.setText("ten");

        jLabel2.setText("ngay sinh");

        jLabel3.setText("gioi tinh");

        jLabel4.setText("diem tb");

        j5.setText("don vi");

        j6.setText("luong");

        j7.setText("hoc phi");

        jButton3.setText("Done");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        male.setText("nam");

        female.setText("nu");

        jButton1.setText("Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ATTT, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(CNTT, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTen)
                            .addComponent(txtNgaysinh)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addComponent(doubleDiemtb)
                            .addComponent(txtDonvi)
                            .addComponent(doubleLuong)
                            .addComponent(doubleHocphi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jButton3)
                        .addGap(102, 102, 102)
                        .addComponent(jButton1)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CNTT)
                    .addComponent(ATTT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(doubleDiemtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j5)
                    .addComponent(txtDonvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j6)
                    .addComponent(doubleLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j7)
                    .addComponent(doubleHocphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ATTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ATTTMouseClicked
        // TODO add your handling code here:
        doubleHocphi.setVisible(false);
        j7.setVisible(false);
        j5.setVisible(true);
        j6.setVisible(true);
        txtDonvi.setVisible(true);
        doubleLuong.setVisible(true);
    }//GEN-LAST:event_ATTTMouseClicked

    private void CNTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CNTTMouseClicked
        // TODO add your handling code here:
        j5.setVisible(false);
        j6.setVisible(false);
        txtDonvi.setVisible(false);
        doubleLuong.setVisible(false);
        doubleHocphi.setVisible(true);
        j7.setVisible(true);
    }//GEN-LAST:event_CNTTMouseClicked

    private void reset()
    {
        txtTen.setText("");
        txtNgaysinh.setText("");
        buttonGroup1.clearSelection();
        doubleDiemtb.setText("");
        doubleLuong.setText("");
        txtDonvi.setText("");
        doubleHocphi.setText("");
    }
    private void process()
    {
        if(ATTT.isSelected()==false && CNTT.isSelected()==false)
        {
            JOptionPane.showMessageDialog(null, "chon truoc khi nhap");
            return;
        }
        else
        {
            String name = txtTen.getText();
            String ngaysinh = txtNgaysinh.getText();
            String gioitinh;
            if(male.isSelected())
            {
                gioitinh = "nam";
            }
            else
            {
                gioitinh = "nu";
            }
            double diemtb = Double.parseDouble(doubleDiemtb.getText());
            if (ATTT.isSelected())
            {
                String donvi = txtDonvi.getText();
                double luong = Double.parseDouble(doubleLuong.getText());
                svattt at = new svattt(name,ngaysinh,gioitinh,diemtb,donvi,luong);
                danhsach.sva.add(at);
                File f = new File("C:\\Users\\nguye\\OneDrive\\Desktop\\svattt.txt");
                    try (FileWriter fw = new FileWriter(f); BufferedWriter bw = new BufferedWriter(fw))
                    {
                        for(int i =0;i<danhsach.sva.size();i++)
                        {
                            svattt sa = danhsach.sva.get(i);
                            bw.write(at.toString());
                            bw.newLine();
                            
                        }
                    } catch (IOException ex) 
                    {
                        //Logger.getLogger(bang.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            else if (CNTT.isSelected())
            {
                double hocphi = Double.parseDouble(doubleHocphi.getText());
                svcntt cn = new svcntt(name,ngaysinh,gioitinh,diemtb,hocphi);
                danhsach.svc.add(cn);
                File f = new File("C:\\Users\\nguye\\OneDrive\\Desktop\\svcntt.txt");
                    try (FileWriter fw = new FileWriter(f); BufferedWriter bw = new BufferedWriter(fw))
                    {
                        for(int i =0;i<danhsach.svc.size();i++)
                        {
                            svcntt sc = danhsach.svc.get(i);
                            bw.write(sc.toString());
                            bw.newLine();
                            
                        }
                    } catch (IOException ex) 
                    {
                        //Logger.getLogger(bang.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        process();
        reset();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(bang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ATTT;
    private javax.swing.JRadioButton CNTT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField doubleDiemtb;
    private javax.swing.JTextField doubleHocphi;
    private javax.swing.JTextField doubleLuong;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel j6;
    private javax.swing.JLabel j7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField txtDonvi;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}