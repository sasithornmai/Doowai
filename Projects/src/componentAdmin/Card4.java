/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package componentAdmin;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sasimai
 */
public class Card4 extends javax.swing.JPanel {

    /**
     * Creates new form Card4
     */
    public Card4() {
        initComponents();
        adminBut32.getPanelRound1().setBackground(new Color(245,115,115));
        adminBut32.getjLabel1().setText("Delete");
    }

    public AdminBut3 getAdminBut31() {
        return adminBut31;
    }

    public void setAdminBut31(AdminBut3 adminBut31) {
        this.adminBut31 = adminBut31;
    }

    public AdminBut3 getAdminBut32() {
        return adminBut32;
    }

    public void setAdminBut32(AdminBut3 adminBut32) {
        this.adminBut32 = adminBut32;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public PanelRound getPanelRound1() {
        return panelRound1;
    }

    public void setPanelRound1(PanelRound panelRound1) {
        this.panelRound1 = panelRound1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new componentAdmin.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        adminBut31 = new componentAdmin.AdminBut3();
        adminBut32 = new componentAdmin.AdminBut3();
        jLabel2 = new javax.swing.JLabel();

        panelRound1.setPreferredSize(new java.awt.Dimension(200, 2));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("รูปการ์ตูน");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 275));

        adminBut31.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.add(adminBut31);

        adminBut32.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.add(adminBut32);

        panelRound1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 50));

        jLabel2.setText("#1");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentAdmin.AdminBut3 adminBut31;
    private componentAdmin.AdminBut3 adminBut32;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private componentAdmin.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}