/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.danhChoAdmin;

import ConnectDB.OracleConnUtils;
import ConnectDB.TestConnectJDBC;
import Process.city;
import Process.district;
import Process.user;
import Views.logIn_sigIn.dangKy;
import Views.main.imageHelper;
import Views.trangCaNhan.trangCaNhanJPanel_ThongTin;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author giahu
 */
public class danhChoAdminJPanel_QLND extends javax.swing.JPanel {

    //private static String selectedUserId;
    private user user01;
    private int firstFill = 0;
    private String selectedBtn;
    private ArrayList<String> districtIdUser = new ArrayList<String>();
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    /**
     * Creates new form danhChoAdminJPanel
     */
    private boolean isNumeric(String str) {
        if (str == null) return false;
        return pattern.matcher(str).matches();
    }
    
    private void enableAllBtn() {
        if (selectedBtn.equals("")) {
            btnModifyUser.setEnabled(true);
            btnAddUser.setEnabled(true);
            btnDeleteUser.setEnabled(true);
            btnSave.setEnabled(false);

            fieldLastName.setEditable(false);
            fieldFirstName.setEditable(false);
            fieldDateOfBirth.setEnabled(false);
            fieldAddress.setEditable(false);
            cbCity.setEnabled(false);
            cbDistrict.setEnabled(false);
            cbGender.setEnabled(false);
        } else if (selectedBtn.equals("btnAddUser") || selectedBtn.equals("btnModifyUser")) {
            btnModifyUser.setEnabled(false);
            btnAddUser.setEnabled(false);
            btnDeleteUser.setEnabled(false);
            btnSave.setEnabled(true);

            fieldLastName.setEditable(true);
            fieldFirstName.setEditable(true);
            fieldDateOfBirth.setEnabled(true);
            fieldAddress.setEditable(true);
            cbCity.setEnabled(true);
            cbDistrict.setEnabled(true);
            cbGender.setEnabled(true);
            if (selectedBtn.equals("btnAddUser")) {
                clearField();
                fieldFirstName.grabFocus();
                tableUser.setFocusable(false);
                fieldPhone.setEditable(true);
                fieldEmail.setEditable(true);

            } else {

            }

        } //ng?????i d??ng ???n n??t L??u

    }

    private void loadData() {
        
        Connection conn = null;
        try {
            conn = TestConnectJDBC.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query = "";
        synchronized (query) {
            query = "select * from tb_user order by userid";
            if (firstFill == 1) {
                if (isNumeric( fieldSearch.getText()))
                    query = "select * from tb_user where userid = "+ fieldSearch.getText() +" or upper(firstname) like upper('%"+ fieldSearch.getText() +"%') or upper(lastname) like upper('%" + fieldSearch.getText() + "%') order by userid";
                else 
                    query = "select * from tb_user where upper(firstname) like upper('%"+ fieldSearch.getText() +"%') or upper(lastname) like upper('%" + fieldSearch.getText() + "%') order by userid";
            }
        }
        System.out.println("??ang th???c hi???n load data cho qu???n l?? ng?????i d??ng: "+query);
        DefaultTableModel tblModel = (DefaultTableModel) tableUser.getModel();
        tblModel.setRowCount(0);
        try ( Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String row_temp[] = {rs.getString("userid"), rs.getString("lastname"), rs.getString("phone"), rs.getString("score"), rs.getString("roleid").equals("1") ? "Ng?????i d??ng" : "Qu???n tr??? vi??n", rs.getString("isdeleted").equals("0") ? "Kh??? d???ng" : "???? x??a"};
                

                tblModel.addRow(row_temp);
            }
            conn.close();

        } catch (SQLException e) {
            System.out.println("l???i khi truy v???n sql" + e.getMessage().toString());
        }

        tableUser.repaint();
        city.prepareCityFilter(cbCity);
        district.prepareDistrictFilter(cbCity, cbDistrict);

    }

    private void clearField() {
        labelUserId.setText("M??: ");
        labelRole.setText("Vai tr??: ");
        labelScore.setText("??i???m: ");
        labelCreatedOn.setText("Ng??y t???o: ");
        labelStatus.setText("T??nh tr???ng: ");

        fieldLastName.setText("");
        fieldFirstName.setText("");
        fieldDateOfBirth.setDate(null);
        cbGender.setSelectedIndex(0);
        fieldPhone.setText("");
        fieldEmail.setText("");
        fieldAddress.setText("");
    }

    public danhChoAdminJPanel_QLND() {
        initComponents();
        selectedBtn = "";
        this.enableAllBtn();
        this.loadData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        fieldFirstName = new javax.swing.JTextField();
        fieldLastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldPhone = new javax.swing.JTextField();
        labelUserId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbDistrict = new javax.swing.JComboBox<>();
        fieldAddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        labelRole = new javax.swing.JLabel();
        labelScore = new javax.swing.JLabel();
        labelCreatedOn = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        cbCity = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        fieldDateOfBirth = new com.toedter.calendar.JDateChooser();
        labelImage = new javax.swing.JLabel();
        labelCountPost = new javax.swing.JLabel();
        labelCountPostComplete = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        fieldSearch = new javax.swing.JTextField();
        btnModifyUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1000, 550));

        jPanel2.setBackground(new java.awt.Color(199, 234, 227));

        fieldFirstName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fieldFirstName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFirstNameActionPerformed(evt);
            }
        });

        fieldLastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fieldLastName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldLastNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("T??n");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("H???");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("S??? ??i???n tho???i");

        fieldPhone.setEditable(false);
        fieldPhone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fieldPhone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fieldPhoneMousePressed(evt);
            }
        });
        fieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPhoneActionPerformed(evt);
            }
        });

        labelUserId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelUserId.setText("M??");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Email");

        fieldEmail.setEditable(false);
        fieldEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fieldEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fieldEmailMousePressed(evt);
            }
        });
        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Qu???n");

        cbDistrict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "N???", "Kh??c" }));
        cbDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDistrictActionPerformed(evt);
            }
        });

        fieldAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fieldAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAddressActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Gi???i t??nh");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Ng??y sinh");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        labelRole.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelRole.setText("Vai tr??");

        labelScore.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelScore.setText("??i???m");

        labelCreatedOn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelCreatedOn.setText("Ng??y t???o");

        labelStatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelStatus.setText("T??nh tr???ng");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "N???", "Kh??c" }));

        cbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "N???", "Kh??c" }));
        cbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCityActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("Th??nh ph???");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setText("?????a ch???");

        fieldDateOfBirth.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fieldDateOfBirthAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        fieldDateOfBirth.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fieldDateOfBirthPropertyChange(evt);
            }
        });

        labelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/size.png"))); // NOI18N
        labelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        labelCountPost.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelCountPost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCountPost.setText("S??? b??i vi???t: 0");

        labelCountPostComplete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelCountPostComplete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCountPostComplete.setText("S??? b??i vi???t th??nh c??ng: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCreatedOn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelCountPostComplete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(51, 51, 51)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(fieldAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(cbGender, 0, 200, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(fieldDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(labelCountPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel14)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCountPost)
                            .addComponent(labelCountPostComplete))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelUserId)
                        .addGap(11, 11, 11)
                        .addComponent(labelRole)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelScore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelCreatedOn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelStatus))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel20)
                                .addGap(11, 11, 11)
                                .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jPanel1.setBackground(new java.awt.Color(199, 234, 227));

        tableUser.setAutoCreateRowSorter(true);
        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M??", "T??n", "??i???n tho???i", "??i???m", "Vai tr??", "T??nh tr???ng"
            }
        ));
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableUserMousePressed(evt);
            }
        });
        tableUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableUserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableUserKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tableUser);
        if (tableUser.getColumnModel().getColumnCount() > 0) {
            tableUser.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(199, 234, 227));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 51, 153));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/paper.png"))); // NOI18N
        btnSave.setText("L??u thay ?????i");
        btnSave.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/search_1.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnAddUser.setBackground(new java.awt.Color(255, 255, 255));
        btnAddUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(0, 51, 153));
        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/studying.png"))); // NOI18N
        btnAddUser.setText("Th??m");
        btnAddUser.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnAddUser.setMaximumSize(new java.awt.Dimension(163, 40));
        btnAddUser.setMinimumSize(new java.awt.Dimension(163, 40));
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        fieldSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fieldSearch.setForeground(new java.awt.Color(204, 204, 204));
        fieldSearch.setText("T??m ki???m ng?????i d??ng");
        fieldSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 153)));
        fieldSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fieldSearchMousePressed(evt);
            }
        });
        fieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSearchActionPerformed(evt);
            }
        });

        btnModifyUser.setBackground(new java.awt.Color(255, 255, 255));
        btnModifyUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnModifyUser.setForeground(new java.awt.Color(0, 51, 153));
        btnModifyUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/studying.png"))); // NOI18N
        btnModifyUser.setText("S???a");
        btnModifyUser.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnModifyUser.setMaximumSize(new java.awt.Dimension(163, 40));
        btnModifyUser.setMinimumSize(new java.awt.Dimension(163, 40));
        btnModifyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyUserActionPerformed(evt);
            }
        });

        btnDeleteUser.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDeleteUser.setForeground(new java.awt.Color(0, 51, 153));
        btnDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/images/paper.png"))); // NOI18N
        btnDeleteUser.setText("X??a");
        btnDeleteUser.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(12, 12, 12))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnDeleteUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModifyUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldSearch)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModifyUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldFirstNameActionPerformed

    private void fieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldLastNameActionPerformed

    private void fieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPhoneActionPerformed

    }//GEN-LAST:event_fieldPhoneActionPerformed

    private void fieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailActionPerformed

    }//GEN-LAST:event_fieldEmailActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        if (user01.getIsDeleted().equals("0")) {
            selectedBtn = "btnDeleteUser";
            String[] options = {"?????ng ??", "H???y"};
            int output = JOptionPane.showOptionDialog(this,
                    "B???n ??ang X??a ng?????i d??ng", "X??c nh???n",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if (output == JOptionPane.YES_OPTION) {
                try {
                    user01.deletedUser();
                    JOptionPane.showMessageDialog(this, "X??a ng?????i d??ng th??nh c??ng!");
                    this.loadData();

                } catch (SQLException ex) {
                    Logger.getLogger(trangCaNhanJPanel_ThongTin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(trangCaNhanJPanel_ThongTin.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (output == JOptionPane.NO_OPTION) {
                System.out.println("No selected.");
            }
        } else {
            selectedBtn = "btnDeleteUser";
            String[] options = {"?????ng ??", "H???y"};
            int output = JOptionPane.showOptionDialog(this,
                    "B???n ??ang kh??i ph???c l???i t??i kho???n", "X??c nh???n",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if (output == JOptionPane.YES_OPTION) {
                try {
                    user01.recoveryUser();
                    JOptionPane.showMessageDialog(this, "Kh??i ph???c th??nh c??ng!");
                    this.loadData();
                } catch (SQLException ex) {
                    Logger.getLogger(trangCaNhanJPanel_ThongTin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(trangCaNhanJPanel_ThongTin.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (output == JOptionPane.NO_OPTION) {
                System.out.println("No selected.");
            }
        }

    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.loadData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void fieldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAddressActionPerformed

    private void cbDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDistrictActionPerformed

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableUserMouseClicked

    private void tableUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMousePressed
        selectedBtn = "";
        enableAllBtn();

        DefaultTableModel tblModel = (DefaultTableModel) tableUser.getModel();

        String selectedUser = tblModel.getValueAt(tableUser.getSelectedRow(), 0).toString();//s??? 0 l?? s??? th??? t??? c???t
        user01 = new user(selectedUser);
        labelUserId.setText("M??: " + user01.getUserId());
        labelRole.setText("Vai tr??: " + (user01.getRoleId().equals("1") ? "Ng?????i d??ng" : "Qu???n tr??? vi??n"));
        labelScore.setText("??i???m: " + user01.getScore());
        labelCreatedOn.setText("Ng??y t???o: " + user01.getCreatedOn());
        labelStatus.setText("T??nh tr???ng: " + (user01.getIsDeleted().equals("0") ? "Kh??? d???ng" : "???? x??a"));

        Statement stmt;
        try {
            stmt = OracleConnUtils.getOracleConnection().createStatement();
            ResultSet rs = stmt.executeQuery("select count(postid) as countP from tb_post where ownerid = " + user01.getUserId());
            while (rs.next()) {
                labelCountPost.setText("S??? b??i vi???t: " + rs.getString("countP"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            stmt = OracleConnUtils.getOracleConnection().createStatement();
            ResultSet rs = stmt.executeQuery("select count(postid) as countP from tb_post where statusid = 3 and ownerid = " + user01.getUserId());
            while (rs.next()) {
                labelCountPostComplete.setText("S??? b??i vi???t th??nh c??ng: " + rs.getString("countP"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
        }

        fieldLastName.setText(user01.getLastName());

        fieldFirstName.setText(user01.getFirstName());
        fieldDateOfBirth.setDateFormatString("dd/MM/yyyy");
        fieldDateOfBirth.setDate(user01.getDateOfBirth());
        fieldPhone.setText(user01.getPhone());
        fieldEmail.setText(user01.getEmail());

        //load ???nh
        byte[] imagedata = user01.getAvatar();
        if (imagedata != null) {
            ImageIcon format = new ImageIcon(imagedata);
            Image resize = imageHelper.reSize(format.getImage(), 130, 130);
            labelImage.setIcon(new ImageIcon(resize));
        } else {
            labelImage.setIcon(new ImageIcon(getClass().getResource("/Resource/images/size.png")));
        }

        cbGender.setSelectedIndex(Integer.parseInt(user01.getGender()) - 1);

        if (fieldAddress != null) {
            fieldAddress.setText(user01.getAddress());
        }
        if (user01.getCity() != null) {
            cbCity.setSelectedIndex(Integer.parseInt(user01.getCity()));
        } else {
            cbCity.setSelectedIndex(0);
        }
        if (user01.getDistrict() != null) {
            districtIdUser = district.prepareDistrictFilter(cbCity, cbDistrict);
            cbDistrict.setSelectedIndex(districtIdUser.indexOf(user01.getDistrict()));
        } else {
            cbDistrict.setSelectedIndex(0);
        }

        //n???u ng?????i d??ng ???? b??? x??a t??i kho???n th?? c?? th??? kh??i ph???c l???i
        if (user01.getIsDeleted().equals("1")) {
            btnDeleteUser.setText("Kh??i ph???c");
        } else {
            btnDeleteUser.setText("X??a");
        }

    }//GEN-LAST:event_tableUserMousePressed

    private void fieldDateOfBirthAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_fieldDateOfBirthAncestorAdded

    }//GEN-LAST:event_fieldDateOfBirthAncestorAdded

    private void fieldDateOfBirthPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fieldDateOfBirthPropertyChange

    }//GEN-LAST:event_fieldDateOfBirthPropertyChange

    private void btnModifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyUserActionPerformed

        selectedBtn = "btnModifyUser";
        enableAllBtn();
        //this.loadData();

    }//GEN-LAST:event_btnModifyUserActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        switch (selectedBtn) {
            //ng?????i d??ng ???? ???n n??t s???a tr?????c ????
            case "btnModifyUser": {
                String[] options = {"?????ng ??", "H???y"};
                int output = JOptionPane.showOptionDialog(this,
                        "B???n ??ang thay ?????i th??ng tin ng?????i d??ng", "X??c nh???n",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (output == JOptionPane.YES_OPTION) {
                    try {
                        System.out.println(new java.sql.Date(fieldDateOfBirth.getDate().getTime()));
                        user01.modifiedUser(fieldFirstName.getText(), fieldLastName.getText(), Integer.toString(cbGender.getSelectedIndex() + 1), new java.sql.Date(fieldDateOfBirth.getDate().getTime()), Integer.toString(cbCity.getSelectedIndex()), districtIdUser.get(cbDistrict.getSelectedIndex()), fieldAddress.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "C???p nh???t th??nh c??ng!");
                }
                break;
            }

            //ng?????i d??ng ???? ???n n??t th??m tr?????c ????
            case "btnAddUser": {
                String[] options = {"?????ng ??", "H???y"};
                int output = JOptionPane.showOptionDialog(this,
                        "B???n ??ang th??m m???i th??ng tin ng?????i d??ng", "X??c nh???n",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (output == JOptionPane.YES_OPTION) {
                    try {
                        user.addNewUser(fieldFirstName.getText(), fieldLastName.getText(), Integer.toString(cbGender.getSelectedIndex()), fieldPhone.getText(), new java.sql.Date(fieldDateOfBirth.getDate().getTime()), fieldEmail.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "Th??m m???i th??nh c??ng!");
                } else if (output == JOptionPane.NO_OPTION) {
                    System.out.println("No selected.");
                }
                break;
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        new dangKy().setVisible(true);
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void fieldPhoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldPhoneMousePressed
        if (!selectedBtn.equals("btnAddUser"))
            JOptionPane.showMessageDialog(this, "Kh??ng th??? thay ?????i s??? ??i???n tho???i!");
    }//GEN-LAST:event_fieldPhoneMousePressed

    private void fieldEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldEmailMousePressed
        if (!selectedBtn.equals("btnAddUser"))
            JOptionPane.showMessageDialog(this, "Kh??ng th??? thay ?????i Email!");
    }//GEN-LAST:event_fieldEmailMousePressed

    private void fieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSearchActionPerformed

    }//GEN-LAST:event_fieldSearchActionPerformed

    private void fieldSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldSearchMousePressed
        if (firstFill == 0) {
            fieldSearch.setText("");
            firstFill = 1;
        }
    }//GEN-LAST:event_fieldSearchMousePressed

    private void cbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCityActionPerformed
        if (cbCity.getSelectedIndex() > 0)
            districtIdUser = district.prepareDistrictFilter(cbCity, cbDistrict);
    }//GEN-LAST:event_cbCityActionPerformed

    private void tableUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableUserKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableUserKeyPressed

    private void tableUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableUserKeyReleased
        selectedBtn = "";
        enableAllBtn();

        DefaultTableModel tblModel = (DefaultTableModel) tableUser.getModel();

        String selectedUser = tblModel.getValueAt(tableUser.getSelectedRow(), 0).toString();//s??? 0 l?? s??? th??? t??? c???t
        user01 = new user(selectedUser);
        labelUserId.setText("M??: " + user01.getUserId());
        labelRole.setText("Vai tr??: " + (user01.getRoleId().equals("1") ? "Ng?????i d??ng" : "Qu???n tr??? vi??n"));
        labelScore.setText("??i???m: " + user01.getScore());
        labelCreatedOn.setText("Ng??y t???o: " + user01.getCreatedOn());
        labelStatus.setText("T??nh tr???ng: " + (user01.getIsDeleted().equals("0") ? "Kh??? d???ng" : "???? x??a"));

        Statement stmt;
        try {
            stmt = OracleConnUtils.getOracleConnection().createStatement();
            ResultSet rs = stmt.executeQuery("select count(postid) as countP from tb_post where ownerid = " + user01.getUserId());
            while (rs.next()) {
                labelCountPost.setText("S??? b??i vi???t: " + rs.getString("countP"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            stmt = OracleConnUtils.getOracleConnection().createStatement();
            ResultSet rs = stmt.executeQuery("select count(postid) as countP from tb_post where statusid = 3 and ownerid = " + user01.getUserId());
            while (rs.next()) {
                labelCountPostComplete.setText("S??? b??i vi???t th??nh c??ng: " + rs.getString("countP"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(danhChoAdminJPanel_QLND.class.getName()).log(Level.SEVERE, null, ex);
        }

        fieldLastName.setText(user01.getLastName());

        fieldFirstName.setText(user01.getFirstName());
        fieldDateOfBirth.setDateFormatString("dd/MM/yyyy");
        fieldDateOfBirth.setDate(user01.getDateOfBirth());
        fieldPhone.setText(user01.getPhone());
        fieldEmail.setText(user01.getEmail());

        //load ???nh
        byte[] imagedata = user01.getAvatar();
        if (imagedata != null) {
            ImageIcon format = new ImageIcon(imagedata);
            Image resize = imageHelper.reSize(format.getImage(), 130, 130);
            labelImage.setIcon(new ImageIcon(resize));
        } else {
            labelImage.setIcon(new ImageIcon(getClass().getResource("/Resource/images/size.png")));
        }

        cbGender.setSelectedIndex(Integer.parseInt(user01.getGender()) - 1);

        if (fieldAddress != null) {
            fieldAddress.setText(user01.getAddress());
        }
        if (user01.getCity() != null) {
            cbCity.setSelectedIndex(Integer.parseInt(user01.getCity()));
        } else {
            cbCity.setSelectedIndex(0);
        }
        if (user01.getDistrict() != null) {
            districtIdUser = district.prepareDistrictFilter(cbCity, cbDistrict);
            cbDistrict.setSelectedIndex(districtIdUser.indexOf(user01.getDistrict()));
        } else {
            cbDistrict.setSelectedIndex(0);
        }

        //n???u ng?????i d??ng ???? b??? x??a t??i kho???n th?? c?? th??? kh??i ph???c l???i
        if (user01.getIsDeleted().equals("1")) {
            btnDeleteUser.setText("Kh??i ph???c");
        } else {
            btnDeleteUser.setText("X??a");
        }

    }//GEN-LAST:event_tableUserKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnModifyUser;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbCity;
    private javax.swing.JComboBox<String> cbDistrict;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JTextField fieldAddress;
    private com.toedter.calendar.JDateChooser fieldDateOfBirth;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldFirstName;
    private javax.swing.JTextField fieldLastName;
    private javax.swing.JTextField fieldPhone;
    private javax.swing.JTextField fieldSearch;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCountPost;
    private javax.swing.JLabel labelCountPostComplete;
    private javax.swing.JLabel labelCreatedOn;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelRole;
    private javax.swing.JLabel labelScore;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelUserId;
    private javax.swing.JTable tableUser;
    // End of variables declaration//GEN-END:variables
}
