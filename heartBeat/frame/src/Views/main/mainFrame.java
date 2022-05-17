/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giahu
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        this.setLocationRelativeTo(null); 
        setTitle("HeartBeat - Trang chủ");
        
        chuyenManHinhController controller = new chuyenManHinhController(jpnView);
        controller.setView(jbtnTrangChu);
        
        List<danhMucBean> listItem = new ArrayList<>();
        listItem.add(new danhMucBean("TrangChu", jbtnTrangChu));
        listItem.add(new danhMucBean("ThemBaiViet", jbtnThemBaiViet));
        listItem.add(new danhMucBean("ThongBao", jbtnThongBao));
        listItem.add(new danhMucBean("DanhMuc", jbtnDanhMuc));
        listItem.add(new danhMucBean("TrangCaNhan", jbtnTrangCaNhan));
        listItem.add(new danhMucBean("DanhChoAdmin", jbtnDanhChoAdmin));
        
        controller.setEvent(listItem);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new keeptoo.KGradientPanel();
        jButton6 = new javax.swing.JButton();
        jbtnDanhChoAdmin = new javax.swing.JButton();
        jbtnTrangChu = new javax.swing.JButton();
        jbtnThemBaiViet = new javax.swing.JButton();
        jbtnThongBao = new javax.swing.JButton();
        jbtnDanhMuc = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jbtnTrangCaNhan = new javax.swing.JButton();
        jpnView = new keeptoo.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setPreferredSize(new java.awt.Dimension(1200, 600));

        jpnMenu.setPreferredSize(new java.awt.Dimension(200, 600));

        jButton6.setBackground(new java.awt.Color(238, 190, 190));
        jButton6.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jButton6.setText(" HeartBeat");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jbtnDanhChoAdmin.setBackground(new java.awt.Color(255, 204, 204));
        jbtnDanhChoAdmin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnDanhChoAdmin.setForeground(new java.awt.Color(0, 255, 255));
        jbtnDanhChoAdmin.setText("Dành cho admin");
        jbtnDanhChoAdmin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 204)));
        jbtnDanhChoAdmin.setContentAreaFilled(false);
        jbtnDanhChoAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnDanhChoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDanhChoAdminActionPerformed(evt);
            }
        });

        jbtnTrangChu.setBackground(new java.awt.Color(255, 204, 204));
        jbtnTrangChu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnTrangChu.setForeground(new java.awt.Color(0, 255, 255));
        jbtnTrangChu.setText(" Trang chủ");
        jbtnTrangChu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 204)));
        jbtnTrangChu.setContentAreaFilled(false);
        jbtnTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnTrangChu.setOpaque(true);
        jbtnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTrangChuActionPerformed(evt);
            }
        });

        jbtnThemBaiViet.setBackground(new java.awt.Color(255, 204, 204));
        jbtnThemBaiViet.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnThemBaiViet.setForeground(new java.awt.Color(0, 255, 255));
        jbtnThemBaiViet.setText(" Thêm bài viết");
        jbtnThemBaiViet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 204)));
        jbtnThemBaiViet.setContentAreaFilled(false);
        jbtnThemBaiViet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnThemBaiViet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnThemBaiVietActionPerformed(evt);
            }
        });

        jbtnThongBao.setBackground(new java.awt.Color(255, 204, 204));
        jbtnThongBao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnThongBao.setForeground(new java.awt.Color(0, 255, 255));
        jbtnThongBao.setText("Thông báo");
        jbtnThongBao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 204)));
        jbtnThongBao.setContentAreaFilled(false);
        jbtnThongBao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnThongBaoActionPerformed(evt);
            }
        });

        jbtnDanhMuc.setBackground(new java.awt.Color(255, 204, 204));
        jbtnDanhMuc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnDanhMuc.setForeground(new java.awt.Color(0, 255, 255));
        jbtnDanhMuc.setText("Danh mục");
        jbtnDanhMuc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 204)));
        jbtnDanhMuc.setContentAreaFilled(false);
        jbtnDanhMuc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDanhMucActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 204, 204));
        jButton12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 255, 255));
        jButton12.setText(" Đăng xuất");
        jButton12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 204)));
        jButton12.setContentAreaFilled(false);
        jButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jbtnTrangCaNhan.setBackground(new java.awt.Color(255, 204, 204));
        jbtnTrangCaNhan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnTrangCaNhan.setForeground(new java.awt.Color(0, 255, 255));
        jbtnTrangCaNhan.setText("Trang cá nhân");
        jbtnTrangCaNhan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 204)));
        jbtnTrangCaNhan.setContentAreaFilled(false);
        jbtnTrangCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnTrangCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTrangCaNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnDanhChoAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnThemBaiViet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnDanhMuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnTrangCaNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnTrangChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jbtnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnThemBaiViet, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnTrangCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDanhChoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1004, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jbtnDanhChoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDanhChoAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDanhChoAdminActionPerformed

    private void jbtnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTrangChuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnTrangChuActionPerformed

    private void jbtnThemBaiVietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnThemBaiVietActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnThemBaiVietActionPerformed

    private void jbtnThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnThongBaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnThongBaoActionPerformed

    private void jbtnDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDanhMucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDanhMucActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jbtnTrangCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTrangCaNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnTrangCaNhanActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jbtnDanhChoAdmin;
    private javax.swing.JButton jbtnDanhMuc;
    private javax.swing.JButton jbtnThemBaiViet;
    private javax.swing.JButton jbtnThongBao;
    private javax.swing.JButton jbtnTrangCaNhan;
    private javax.swing.JButton jbtnTrangChu;
    private keeptoo.KGradientPanel jpnMenu;
    private javax.swing.JPanel jpnRoot;
    private keeptoo.KGradientPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
