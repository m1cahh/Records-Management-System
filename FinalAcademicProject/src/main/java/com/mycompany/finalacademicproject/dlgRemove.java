/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.finalacademicproject;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class dlgRemove extends javax.swing.JDialog {

    private String action = "back";
    private String name;
    
    
    public String getAction() {
        return action;
    }

    public String getName() {
        return name;
    }
    /**
     * Creates new form dlgRemove
     */
    public dlgRemove(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);   // center form to screen
        // colors the frame
        Color c = new Color(153,255,153);
        this.getContentPane().setBackground(c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRemoveClose = new javax.swing.JButton();
        btnSaveAnother = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setTitle("Add Record");
        setType(java.awt.Window.Type.UTILITY);

        btnRemoveClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRemoveClose.setText("Remove and Go Back");
        btnRemoveClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveCloseActionPerformed(evt);
            }
        });

        btnSaveAnother.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveAnother.setText("Save and Remove Another");
        btnSaveAnother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAnotherActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Name:");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRemoveClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveAnother)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveAnother, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private boolean isFilledIn() {
        return (!txtName.getText().isBlank());
    }
    
    private boolean prepareData() {
        if (!isFilledIn()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields first.",
                    "Save", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {
            name = txtName.getText();
            return true;
        }
    }
    
    private void btnRemoveCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveCloseActionPerformed
        if (prepareData()) {
            action = "close";
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnRemoveCloseActionPerformed

    private void btnSaveAnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAnotherActionPerformed
        if (prepareData()) {
            action = "add";
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSaveAnotherActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.action = "back";
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveClose;
    private javax.swing.JButton btnSaveAnother;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
