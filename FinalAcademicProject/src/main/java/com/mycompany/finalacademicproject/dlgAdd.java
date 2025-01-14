/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.finalacademicproject;

import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class dlgAdd extends javax.swing.JDialog {
    private String action = "back";
    private String name;
    private int year;
    private int month;
    private int day;

    public String getAction() {
        return action;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    /**
     * Creates new form dlgAdd
     */
    public dlgAdd(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);   // center form to screen
        // colors the frame
        Color c = new Color(153,255,153);
        this.getContentPane().setBackground(c);
        
        cboDay.removeAllItems();
        for (int i = 1; i <= 31; i++) {
            cboDay.addItem(i + "");
        }
        cboYear.removeAllItems();
        int cur_year = new Date().getYear() + 1900;
        for (int i = 1900; i <= cur_year; i++) {
            cboYear.addItem(i + "");
        }
    }
    
    private boolean isFilledIn() {
        return (!txtName.getText().isBlank()) &&
                (cboDay.getSelectedIndex() > -1) &&
                (cboMonth.getSelectedIndex() > -1) &&
                (cboYear.getSelectedIndex() > -1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cboMonth = new javax.swing.JComboBox<>();
        cboDay = new javax.swing.JComboBox<>();
        cboYear = new javax.swing.JComboBox<>();
        btnSaveClose = new javax.swing.JButton();
        btnSaveAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setTitle("Add Record");
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Birthday:");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cboMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        cboDay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSaveClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveClose.setText("Save and Go Back");
        btnSaveClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCloseActionPerformed(evt);
            }
        });

        btnSaveAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveAdd.setText("Save and Add Another");
        btnSaveAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAddActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSaveClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDay, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean prepareData() {
        if (!isFilledIn()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields first.",
                    "Save", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {
            name = txtName.getText();
            year = Integer.parseInt(cboYear.getSelectedItem().toString());
            month = cboMonth.getSelectedIndex() + 1;
            day = Integer.parseInt(cboDay.getSelectedItem().toString());
            return true;
        }
    }
    
    private void btnSaveCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCloseActionPerformed
        if (prepareData()) {
            action = "close";
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSaveCloseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.action = "back";
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAddActionPerformed
        if (prepareData()) {
            action = "add";
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSaveAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveAdd;
    private javax.swing.JButton btnSaveClose;
    private javax.swing.JComboBox<String> cboDay;
    private javax.swing.JComboBox<String> cboMonth;
    private javax.swing.JComboBox<String> cboYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
