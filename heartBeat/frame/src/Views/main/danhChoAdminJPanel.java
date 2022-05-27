/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giahu
 */
public class danhChoAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form danhChoAdminJPanel
     */
    public danhChoAdminJPanel() {
        initComponents();
        
        chuyenManHinhAdmin profile = new chuyenManHinhAdmin(jPanel1);
        profile.setView(jbtnQLND);
        
        List<danhMucBean> listItem = new ArrayList<>();
        listItem.add(new danhMucBean("QLND", jbtnQLND));
        listItem.add(new danhMucBean("QLBD", jbtnQLBD));
        listItem.add(new danhMucBean("QLSK", jbtnQLSK));
        listItem.add(new danhMucBean("QLDYT", jbtnQLDYT));
        
        profile.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbtnQLND = new javax.swing.JButton();
        jbtnQLBD = new javax.swing.JButton();
        jbtnQLSK = new javax.swing.JButton();
        jbtnQLDYT = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 600));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jbtnQLND.setBackground(new java.awt.Color(255, 153, 153));
        jbtnQLND.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnQLND.setText("Quản lý người dùng");
        jbtnQLND.setBorder(new javax.swing.border.MatteBorder(null));

        jbtnQLBD.setBackground(new java.awt.Color(204, 204, 255));
        jbtnQLBD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnQLBD.setText("Quản lý bài đăng");
        jbtnQLBD.setBorder(new javax.swing.border.MatteBorder(null));

        jbtnQLSK.setBackground(new java.awt.Color(0, 204, 255));
        jbtnQLSK.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnQLSK.setText("Quản lý sao kê");
        jbtnQLSK.setBorder(new javax.swing.border.MatteBorder(null));

        jbtnQLDYT.setBackground(new java.awt.Color(204, 255, 204));
        jbtnQLDYT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnQLDYT.setText("BXH điểm Yêu thương");
        jbtnQLDYT.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnQLND, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnQLBD, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnQLSK, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnQLDYT, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnQLND, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnQLBD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnQLSK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnQLDYT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnQLBD;
    private javax.swing.JButton jbtnQLDYT;
    private javax.swing.JButton jbtnQLND;
    private javax.swing.JButton jbtnQLSK;
    // End of variables declaration//GEN-END:variables
}
