/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mirth.connect.client.ui.editors;

import java.awt.event.ActionListener;

public class BasicModeSettingsPanel extends javax.swing.JPanel {

    /**
     * Creates new form BasicModeSettingsPanel
     */
    public BasicModeSettingsPanel(ActionListener actionListener) {
        initComponents();
        settingsButton.addActionListener(actionListener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(22, 22));
        setMinimumSize(new java.awt.Dimension(22, 22));
        setPreferredSize(new java.awt.Dimension(22, 22));

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mirth/connect/client/ui/images/wrench.png"))); // NOI18N
        settingsButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        settingsButton.setMaximumSize(new java.awt.Dimension(22, 22));
        settingsButton.setMinimumSize(new java.awt.Dimension(22, 22));
        settingsButton.setPreferredSize(new java.awt.Dimension(22, 22));
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed

   }//GEN-LAST:event_settingsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton settingsButton;
    // End of variables declaration//GEN-END:variables
}