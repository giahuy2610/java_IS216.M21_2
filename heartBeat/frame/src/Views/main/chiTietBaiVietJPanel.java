/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.main;

import Process.post;
import static Process.postCategory.getCategoryNameFromId;
import static Process.postPurpose.getPurposeNameFromId;
import static Process.postStatus.getStatusNameFromId;
import Process.user;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author giahu
 */
public class chiTietBaiVietJPanel extends javax.swing.JPanel {

    post post01;

    private void loadData() {
        labelImage.setSize(220, 220);
        //nếu người đăng bài cũng là người đang xem bài viết: sửa, xóa, hủy lịch hẹn, hoàn tất
        if (mainFrame.currentUser.getUserId().equals(post01.getOwnerId())) {
            //người dùng có thể kiểm tra lại thông tin liên hệ của bản thân
            btnContact.setVisible(true);
            //bài viết có người đặt hẹn mới có thể xác nhận hoàn thành
            if (post01.getStatusId().equals("2")) {
                //bài viết đang có lịch hẹn nên có thể hủy hoặc xác nhận
                btnConfirmSchedule.setVisible(true);
                btnCancelSchedule.setVisible(true);

                btnSchedule.setVisible(false);//không thể đặt hẹn cho chính mình
                btnModify.setVisible(true);
            } else {
                btnConfirmSchedule.setVisible(false);//không có hẹn nên không thể xác nhận
                btnCancelSchedule.setVisible(false);//không có hẹn nên không thể hủy

                btnSchedule.setVisible(false);//không thể tự đặt hẹn
                btnModify.setVisible(true);
            }
            //bài viết bị xóa rồi thì không thể tiếp tục bị xóa hay sửa bài viết
            if (post01.getIsDeleted().equals("1")) {
                btnDelete.setVisible(false);
                btnModify.setVisible(false);
            } else {
                btnDelete.setVisible(true);
                btnModify.setVisible(true);
            }

        } //người xem bài không phải người đăng bài
        else {
            //không phải chủ bài viết nên thể xóa sửa xác nhận bài viết
            btnDelete.setVisible(false);
            btnModify.setVisible(false);
            btnConfirmSchedule.setVisible(false);
            btnContact.setVisible(false);
            //bài viết đang có hẹn
            if (post01.getStatusId().equals("2")) {
                btnSchedule.setVisible(false);//không thể đặt hẹn vì bài viết có hẹn
                //nếu người đang xem là người có đặt hẹn với bài viết này thì có thể hủy hẹn
                if (mainFrame.currentUser.getUserId().equals(post01.getPartnerId())) {
                    btnCancelSchedule.setVisible(true);
                    btnContact.setVisible(true);
                } else {
                    btnCancelSchedule.setVisible(false);
                    btnContact.setVisible(false);
                }
            } else if (post01.getStatusId().equals("1")) {
                btnSchedule.setVisible(true);//có thể đặt hẹn vì bài viết chưa có hẹn
                btnCancelSchedule.setVisible(false);
            } else {
                btnSchedule.setVisible(false);//có thể đặt hẹn vì bài viết chưa có hẹn
                btnCancelSchedule.setVisible(false);
            }
        }

        labelTitle.setText(post01.getTitle());
        labelContent.setText(post01.getContent());

        labelCreatedOn.setText(post01.getCreatedOn());
        String postPath = "Heartbeat > " + getPurposeNameFromId(post01.getPurposeId()) + " > " + getCategoryNameFromId(post01.getCategoryId()) + " > " + post01.getTitle();
        labelPath.setText(postPath);
        labelStatus.setText(getStatusNameFromId(post01.getStatusId()));

        //load ảnh
        byte[] imagedata = post01.getImagePath();
        if (imagedata != null) {
            ImageIcon format = new ImageIcon(imagedata);
            Image resize = imageHelper.reSize(format.getImage(), 320, 340);
            labelImage.setIcon(new ImageIcon(resize));
        }
    }

    /**
     * Creates new form NewJPanel
     */
    public chiTietBaiVietJPanel(String postId) {
        initComponents();
        post01 = new post(postId);
        loadData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JPanel();
        labelPath = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        labelCreatedOn = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        labelContent = new javax.swing.JTextArea();
        labelImage = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnConfirmSchedule = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnSchedule = new javax.swing.JButton();
        btnCancelSchedule = new javax.swing.JButton();
        btnContact = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 600));

        heading.setBackground(new java.awt.Color(126, 186, 181));
        heading.setMinimumSize(new java.awt.Dimension(957, 56));
        heading.setPreferredSize(new java.awt.Dimension(1000, 60));

        labelPath.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        labelPath.setForeground(new java.awt.Color(0, 51, 153));
        labelPath.setText("Đường dẫn");

        jButton12.setBackground(new java.awt.Color(255, 204, 204));
        jButton12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(51, 51, 51));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/enter.png"))); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.setContentAreaFilled(false);
        jButton12.setHideActionText(true);
        jButton12.setOpaque(true);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        labelCreatedOn.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        labelCreatedOn.setForeground(new java.awt.Color(0, 51, 153));
        labelCreatedOn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCreatedOn.setText("NGÀY TẠO");

        labelStatus.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(0, 51, 153));
        labelStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelStatus.setText("TRẠNG THÁI");

        javax.swing.GroupLayout headingLayout = new javax.swing.GroupLayout(heading);
        heading.setLayout(headingLayout);
        headingLayout.setHorizontalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPath, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCreatedOn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        headingLayout.setVerticalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(labelCreatedOn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(199, 234, 227));
        jPanel7.setPreferredSize(new java.awt.Dimension(1000, 480));

        labelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 51, 153));
        labelTitle.setText("TIÊU ĐỀ");

        labelContent.setEditable(false);
        labelContent.setColumns(20);
        labelContent.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelContent.setRows(5);
        labelContent.setText("test font");
        labelContent.setWrapStyleWord(true);
        labelContent.setOpaque(false);
        labelContent.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(labelContent);

        labelImage.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/size.png"))); // NOI18N
        labelImage.setToolTipText("");
        labelImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        labelImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(31, 31, 31))
        );

        jPanel5.setBackground(new java.awt.Color(126, 186, 181));
        jPanel5.setPreferredSize(new java.awt.Dimension(1000, 60));
        jPanel5.setRequestFocusEnabled(false);

        btnConfirmSchedule.setBackground(new java.awt.Color(255, 230, 236));
        btnConfirmSchedule.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnConfirmSchedule.setForeground(new java.awt.Color(0, 51, 153));
        btnConfirmSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/give.png"))); // NOI18N
        btnConfirmSchedule.setText("Hoàn thành");
        btnConfirmSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmScheduleActionPerformed(evt);
            }
        });
        jPanel5.add(btnConfirmSchedule);

        btnDelete.setBackground(new java.awt.Color(255, 230, 236));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 51, 153));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/paper.png"))); // NOI18N
        btnDelete.setText("XÓA BÀI VIẾT");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btnDelete);

        btnModify.setBackground(new java.awt.Color(255, 230, 236));
        btnModify.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnModify.setForeground(new java.awt.Color(0, 51, 153));
        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/studying.png"))); // NOI18N
        btnModify.setText("SỬA BÀI VIẾT");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel5.add(btnModify);

        btnSchedule.setBackground(new java.awt.Color(255, 230, 236));
        btnSchedule.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnSchedule.setForeground(new java.awt.Color(0, 51, 153));
        btnSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/send.png"))); // NOI18N
        btnSchedule.setText("ĐẶT LỊCH HẸN");
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });
        jPanel5.add(btnSchedule);

        btnCancelSchedule.setBackground(new java.awt.Color(255, 230, 236));
        btnCancelSchedule.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnCancelSchedule.setForeground(new java.awt.Color(0, 51, 153));
        btnCancelSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/fundraiser.png"))); // NOI18N
        btnCancelSchedule.setText("HỦY LỊCH HẸN");
        btnCancelSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelScheduleActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancelSchedule);

        btnContact.setBackground(new java.awt.Color(255, 230, 236));
        btnContact.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnContact.setForeground(new java.awt.Color(0, 51, 153));
        btnContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/girl.png"))); // NOI18N
        btnContact.setText("LIÊN HỆ");
        btnContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactActionPerformed(evt);
            }
        });
        jPanel5.add(btnContact);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(heading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String[] options = {"Xóa", "Hủy"};
        int output = JOptionPane.showOptionDialog(this,
                "Bạn thực sự muốn xóa bài viết", "Xóa bài viết",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.YES_NO_OPTION, null, options, options[0]);
        if (output == JOptionPane.YES_OPTION) {
            try {
                post01.deletedPost();
            } catch (SQLException ex) {
                Logger.getLogger(chiTietBaiVietJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(chiTietBaiVietJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            chuyenManHinhController.setView(new trangChuJPanel());
        } else if (output == JOptionPane.NO_OPTION) {
            System.out.println("No selected.");
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnConfirmScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmScheduleActionPerformed
        String[] options = {"Xác nhận", "Hủy"};
        int output = JOptionPane.showOptionDialog(this,
                "Bạn muốn hoàn tất bài viết?", "Hoàn tất",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (output == JOptionPane.YES_OPTION) {
            try {
                post01.confirmSchedulePost();
            } catch (SQLException ex) {
                Logger.getLogger(chiTietBaiVietJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(chiTietBaiVietJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Hoàn tất bài viết!");
        } else if (output == JOptionPane.NO_OPTION) {
            System.out.println("No selected.");
        }
    }//GEN-LAST:event_btnConfirmScheduleActionPerformed

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        String[] options = {"Xác nhận", "Hủy"};
        int output = JOptionPane.showOptionDialog(this,
                "Bạn muốn đặt hẹn với chủ bài viết?", "Đặt hẹn",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (output == JOptionPane.YES_OPTION) {
            try {
                post01.schedulePost();
                new thongTinDatHen(new user(post01.getOwnerId())).setVisible(true);
                chuyenManHinhController.setView(new chiTietBaiVietJPanel(post01.getPostId()));
            } catch (SQLException ex) {

                if (ex.getErrorCode() == 20000) {
                    System.out.println("lỗi với trigger: quá số lần đặt hẹn ");
                    JOptionPane.showMessageDialog(this, "Đã quá số lần đặt hẹn trong tuần",
                            "Báo lỗi", JOptionPane.ERROR_MESSAGE);
                }
                Logger.getLogger(chiTietBaiVietJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(chiTietBaiVietJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (output == JOptionPane.NO_OPTION) {
            System.out.println("No selected.");
        }
    }//GEN-LAST:event_btnScheduleActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        String[] options = {"Xác nhận", "Hủy"};
        int output = JOptionPane.showOptionDialog(this,
                "Bạn muốn sửa bài viết này?", "Sửa bài viết",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (output == JOptionPane.YES_OPTION) {
            chuyenManHinhController.setView(new suaBaiVietJPanel(post01));
        } else if (output == JOptionPane.NO_OPTION) {
            System.out.println("No selected.");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        chuyenManHinhController.setView(new trangChuJPanel());
    }//GEN-LAST:event_jButton12ActionPerformed

    private void labelImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImageMouseClicked

    }//GEN-LAST:event_labelImageMouseClicked

    private void btnCancelScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelScheduleActionPerformed
        String[] options = {"Xác nhận", "Hủy"};
        int output = JOptionPane.showOptionDialog(this,
                "Bạn muốn hủy hẹn với chủ bài viết?", "Hủy hẹn",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (output == JOptionPane.YES_OPTION) {
            try {
                post01.cancelSchedulingPost();
                chuyenManHinhController.setView(new trangChuJPanel());
            } catch (SQLException ex) {
                Logger.getLogger(chiTietBaiVietJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(chiTietBaiVietJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Hủy hẹn thành công!");
        } else if (output == JOptionPane.NO_OPTION) {
            System.out.println("No selected.");
        }
    }//GEN-LAST:event_btnCancelScheduleActionPerformed

    private void btnContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactActionPerformed
        //chủ bài viết coi thông tin người đặt hẹn
        if (post01.getOwnerId().equals(mainFrame.currentUser.getUserId())) {
            try {
                new thongTinDatHen(new user(post01.getPartnerId())).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(chiTietBaiVietJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(chiTietBaiVietJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } //người đặt hẹn coi được thông tin chủ bài viết
        else {
            try {
                new thongTinDatHen(new user(post01.getOwnerId())).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(chiTietBaiVietJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(chiTietBaiVietJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnContactActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelSchedule;
    private javax.swing.JButton btnConfirmSchedule;
    private javax.swing.JButton btnContact;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JPanel heading;
    private javax.swing.JButton jButton12;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea labelContent;
    private javax.swing.JLabel labelCreatedOn;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelPath;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelTitle;
    // End of variables declaration//GEN-END:variables
}
