/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.panel;

import Views.main.chuyenManHinhController;

/**
 *
 * @author giahu
 */
public class danhMucJPanel extends javax.swing.JPanel {

    /**
     * Creates new form danhMucJPanel
     */
    public danhMucJPanel() {
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

        jPanelNhuCau = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_trao_tang = new javax.swing.JButton();
        btn_xin_nhan = new javax.swing.JButton();
        btn_gay_quy = new javax.swing.JButton();
        jPanelDanhMuc = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_thuc_pham = new javax.swing.JButton();
        btn_y_te = new javax.swing.JButton();
        btn_gia_dung = new javax.swing.JButton();
        btn_giao_duc = new javax.swing.JButton();
        btn_bua_an = new javax.swing.JButton();
        btn_khac = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(199, 234, 227));

        jPanelNhuCau.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNhuCau.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nhu cầu");
        jLabel2.setPreferredSize(new java.awt.Dimension(48, 15));

        btn_trao_tang.setBackground(new java.awt.Color(255, 153, 255));
        btn_trao_tang.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_trao_tang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/traoTang.png"))); // NOI18N
        btn_trao_tang.setText("Trao tặng");
        btn_trao_tang.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_trao_tang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trao_tangActionPerformed(evt);
            }
        });

        btn_xin_nhan.setBackground(new java.awt.Color(255, 153, 153));
        btn_xin_nhan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_xin_nhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/xinNhan.png"))); // NOI18N
        btn_xin_nhan.setText("Xin nhận");
        btn_xin_nhan.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_xin_nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xin_nhanActionPerformed(evt);
            }
        });

        btn_gay_quy.setBackground(new java.awt.Color(255, 255, 102));
        btn_gay_quy.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_gay_quy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/gayQuy.png"))); // NOI18N
        btn_gay_quy.setText("Đóng góp quỹ");
        btn_gay_quy.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_gay_quy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gay_quyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNhuCauLayout = new javax.swing.GroupLayout(jPanelNhuCau);
        jPanelNhuCau.setLayout(jPanelNhuCauLayout);
        jPanelNhuCauLayout.setHorizontalGroup(
            jPanelNhuCauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhuCauLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelNhuCauLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btn_trao_tang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btn_xin_nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btn_gay_quy, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNhuCauLayout.setVerticalGroup(
            jPanelNhuCauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhuCauLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanelNhuCauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_trao_tang, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xin_nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gay_quy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanelDanhMuc.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDanhMuc.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Danh mục");
        jLabel3.setPreferredSize(new java.awt.Dimension(48, 15));

        btn_thuc_pham.setBackground(new java.awt.Color(153, 255, 255));
        btn_thuc_pham.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_thuc_pham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/thucPham.png"))); // NOI18N
        btn_thuc_pham.setText("Thực phẩm");
        btn_thuc_pham.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_thuc_pham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thuc_phamActionPerformed(evt);
            }
        });

        btn_y_te.setBackground(new java.awt.Color(204, 255, 204));
        btn_y_te.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_y_te.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/yTe.png"))); // NOI18N
        btn_y_te.setText("Y tế");
        btn_y_te.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_y_te.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_y_teActionPerformed(evt);
            }
        });

        btn_gia_dung.setBackground(new java.awt.Color(204, 204, 255));
        btn_gia_dung.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_gia_dung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/doGiaDung.png"))); // NOI18N
        btn_gia_dung.setText("Đồ gia dụng");
        btn_gia_dung.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_gia_dung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gia_dungActionPerformed(evt);
            }
        });

        btn_giao_duc.setBackground(new java.awt.Color(153, 255, 255));
        btn_giao_duc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_giao_duc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/giaoDuc.png"))); // NOI18N
        btn_giao_duc.setText("Giáo dục");
        btn_giao_duc.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_giao_duc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giao_ducActionPerformed(evt);
            }
        });

        btn_bua_an.setBackground(new java.awt.Color(204, 255, 204));
        btn_bua_an.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_bua_an.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/buaAn.png"))); // NOI18N
        btn_bua_an.setText("Bữa ăn");
        btn_bua_an.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_bua_an.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bua_anActionPerformed(evt);
            }
        });

        btn_khac.setBackground(new java.awt.Color(204, 255, 255));
        btn_khac.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_khac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/more.png"))); // NOI18N
        btn_khac.setText("Khác");
        btn_khac.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_khac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDanhMucLayout = new javax.swing.GroupLayout(jPanelDanhMuc);
        jPanelDanhMuc.setLayout(jPanelDanhMucLayout);
        jPanelDanhMucLayout.setHorizontalGroup(
            jPanelDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDanhMucLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelDanhMucLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanelDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_giao_duc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_thuc_pham, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanelDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_bua_an, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_y_te, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanelDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_khac, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gia_dung, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanelDanhMucLayout.setVerticalGroup(
            jPanelDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDanhMucLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_thuc_pham, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gia_dung, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_y_te, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanelDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_giao_duc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bua_an, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_khac, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(126, 186, 181));
        kGradientPanel2.setkStartColor(new java.awt.Color(126, 186, 181));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH MỤC");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDanhMuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelNhuCau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelNhuCau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanelDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_trao_tangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trao_tangActionPerformed
        chuyenManHinhController.setView(new trangChuJPanel(1,0));
    }//GEN-LAST:event_btn_trao_tangActionPerformed

    private void btn_xin_nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xin_nhanActionPerformed
        chuyenManHinhController.setView(new trangChuJPanel(2,0));
    }//GEN-LAST:event_btn_xin_nhanActionPerformed

    private void btn_gay_quyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gay_quyActionPerformed
        chuyenManHinhController.setView(new trangChuJPanel(3,0));
    }//GEN-LAST:event_btn_gay_quyActionPerformed

    private void btn_thuc_phamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thuc_phamActionPerformed
        chuyenManHinhController.setView(new trangChuJPanel(0, 1));
    }//GEN-LAST:event_btn_thuc_phamActionPerformed

    private void btn_y_teActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_y_teActionPerformed
        chuyenManHinhController.setView(new trangChuJPanel(0, 3));
    }//GEN-LAST:event_btn_y_teActionPerformed

    private void btn_gia_dungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gia_dungActionPerformed
        chuyenManHinhController.setView(new trangChuJPanel(0, 2));
    }//GEN-LAST:event_btn_gia_dungActionPerformed

    private void btn_giao_ducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giao_ducActionPerformed
        chuyenManHinhController.setView(new trangChuJPanel(0, 4));
    }//GEN-LAST:event_btn_giao_ducActionPerformed

    private void btn_bua_anActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bua_anActionPerformed
        chuyenManHinhController.setView(new trangChuJPanel(0, 5));
    }//GEN-LAST:event_btn_bua_anActionPerformed

    private void btn_khacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khacActionPerformed
        chuyenManHinhController.setView(new trangChuJPanel(0, 6));
    }//GEN-LAST:event_btn_khacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bua_an;
    private javax.swing.JButton btn_gay_quy;
    private javax.swing.JButton btn_gia_dung;
    private javax.swing.JButton btn_giao_duc;
    private javax.swing.JButton btn_khac;
    private javax.swing.JButton btn_thuc_pham;
    private javax.swing.JButton btn_trao_tang;
    private javax.swing.JButton btn_xin_nhan;
    private javax.swing.JButton btn_y_te;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelDanhMuc;
    private javax.swing.JPanel jPanelNhuCau;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
