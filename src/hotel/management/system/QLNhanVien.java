/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management.system;

import Database.DBConnection;
import Process.ChucNang;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kdt09
 */
public class QLNhanVien extends javax.swing.JFrame {
     String MaNV;   
    /**
     * Creates new form QLNhanVien
     */
    public QLNhanVien() {
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

        lb_anh = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_NV = new javax.swing.JTable();
        btnSuaNV = new javax.swing.JButton();
        btnXoaNV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        txtHoTen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbCV = new javax.swing.JComboBox<>();
        txtLuong = new javax.swing.JTextField();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnThemNV = new javax.swing.JButton();
        txtSDT = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lb_anh.setFont(new java.awt.Font("Segoe UI Emoji", 0, 3)); // NOI18N
        lb_anh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_anh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/eleven.jpg"))); // NOI18N
        lb_anh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_anh.setIconTextGap(1);
        lb_anh.setInheritsPopupMenu(false);
        lb_anh.setMaximumSize(new java.awt.Dimension(500, 300));
        lb_anh.setMinimumSize(new java.awt.Dimension(500, 300));
        lb_anh.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("SĐT");

        tbl_NV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Tuổi", "Giới tính", "Công Việc", "Lương", "SĐT", "Địa chỉ", "Email"
            }
        ));
        tbl_NV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbl_NVMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_NV);
        if (tbl_NV.getColumnModel().getColumnCount() > 0) {
            tbl_NV.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbl_NV.getColumnModel().getColumn(0).setMaxWidth(50);
            tbl_NV.getColumnModel().getColumn(8).setResizable(false);
        }

        btnSuaNV.setBackground(new java.awt.Color(102, 255, 153));
        btnSuaNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaNV.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/edit1.png"))); // NOI18N
        btnSuaNV.setText("Sửa");
        btnSuaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNVActionPerformed(evt);
            }
        });

        btnXoaNV.setBackground(new java.awt.Color(255, 51, 51));
        btnXoaNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaNV.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/trash.png"))); // NOI18N
        btnXoaNV.setText("Xóa");
        btnXoaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNVActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Quản Lý Phòng");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Giới tính");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("Họ và Tên");

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/exit.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Công việc");

        cbCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lễ Tân", "Phục Vụ", "Dọn Phòng", "Nhân viên bếp", "Quản lý" }));
        cbCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCVActionPerformed(evt);
            }
        });

        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGioiTinhActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Lương");

        btnThemNV.setBackground(new java.awt.Color(51, 204, 255));
        btnThemNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemNV.setForeground(new java.awt.Color(255, 255, 255));
        btnThemNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/add.png"))); // NOI18N
        btnThemNV.setText("Thêm");
        btnThemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNVActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("Tuổi");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Email");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Địa chỉ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSuaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnThoat))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel9))
                                            .addGap(19, 19, 19))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbCV, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(54, 54, 54)
                                            .addComponent(lb_anh, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addComponent(lb_anh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThemNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSuaNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_NVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NVMouseClicked
        // TODO add your handling code here:
        int rowSelect = tbl_NV.getSelectedRow();
        if(rowSelect > -1){
            MaNV= tbl_NV.getValueAt(rowSelect, 0).toString();
            txtHoTen.setText(tbl_NV.getValueAt(rowSelect, 1).toString());
            txtTuoi.setText(tbl_NV.getValueAt(rowSelect, 2).toString());
            cbGioiTinh.setSelectedItem(tbl_NV.getValueAt(rowSelect, 3));
            cbCV.setSelectedItem(tbl_NV.getValueAt(rowSelect, 4));
               txtLuong.setText(tbl_NV.getValueAt(rowSelect, 5).toString());
                  txtSDT.setText(tbl_NV.getValueAt(rowSelect, 6).toString());  
                   txtDiaChi.setText(tbl_NV.getValueAt(rowSelect, 7).toString());
                  txtEmail.setText(tbl_NV.getValueAt(rowSelect, 8).toString());

        }
    }//GEN-LAST:event_tbl_NVMouseClicked

    private void btnSuaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNVActionPerformed
        // TODO add your handling code here:
        if (txtSDT.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Chọn dữ liệu ở dưới trước!!!!");
        } else {
            if (btnSuaNV.getText() == "Lưu") {
                DBConnection c = new DBConnection();
                MaNV = setMNV();
                String hoTen = txtHoTen.getText();
                String gioiTinh = cbGioiTinh.getSelectedItem().toString();
                String cV = (String) cbCV.getSelectedItem();
                String luong = txtLuong.getText();
                String SDT = txtSDT.getText();
                String tuoi = txtTuoi.getText();
                String diaChi = txtDiaChi.getText();
                String email =txtEmail.getText();

                ChucNang.themNV( MaNV, hoTen, tuoi, gioiTinh, cV, luong, SDT, diaChi, email);
                DefaultTableModel tbl = (DefaultTableModel) tbl_NV.getModel();
                ChucNang.hienThiDriver(tbl);
                btnThemNV.setEnabled(true);
                btnXoaNV.setText("Xóa");
                btnSuaNV.setText("Sửa");
                txtSDT.setEnabled(false);
                txtLuong.setEnabled(false);
                txtHoTen.setEnabled(false);
                txtTuoi.setEnabled(false);
                txtDiaChi.setEnabled(false);
                txtEmail.setEnabled(false);
                cbCV.setEnabled(false);
                cbGioiTinh.setEnabled(false);
                txtSDT.setText("");
                txtLuong.setText("");
                txtHoTen.setText("");
                txtTuoi.setText("");
                txtDiaChi.setText("");
                txtEmail.setText("");

            } else {
                btnSuaNV.setEnabled(false);
                btnThemNV.setText("Lưu");
                btnXoaNV.setText("Không Lưu");
                txtSDT.setEnabled(true);
                txtLuong.setEnabled(true);
                txtHoTen.setEnabled(true);
                txtTuoi.setEnabled(true);
                txtDiaChi.setEnabled(true);
                txtEmail.setEnabled(true);
                cbCV.setEnabled(true);
                cbGioiTinh.setEnabled(true);

            }
        }
    }//GEN-LAST:event_btnSuaNVActionPerformed

    private void btnXoaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNVActionPerformed
        // TODO add your handling code here:
        if (btnXoaNV.getText().equalsIgnoreCase("Không Lưu")) {
                txtSDT.setEnabled(false);
                txtLuong.setEnabled(false);
                txtHoTen.setEnabled(false);
                txtTuoi.setEnabled(false);
                txtDiaChi.setEnabled(false);
                txtEmail.setEnabled(false);
                cbCV.setEnabled(false);
                cbGioiTinh.setEnabled(false);
                txtSDT.setText("");
                txtLuong.setText("");
                txtHoTen.setText("");
                txtTuoi.setText("");
                txtDiaChi.setText("");
                txtEmail.setText("");

        } else {
            if (txtSDT.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Chọn dữ liệu ở dưới trước!!!!");
            } else {
                int rel = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xóa", "Xác Nhận Xóa", JOptionPane.YES_NO_OPTION);
                if (rel == JOptionPane.YES_OPTION) {
                    ChucNang.xoaPhong(MaNV);
                }
            }
        }
    }//GEN-LAST:event_btnXoaNVActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cbCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCVActionPerformed

    private void cbGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGioiTinhActionPerformed
    public String setMNV(){
        String MaNV;
        if(tbl_NV.getRowCount() - 1 == -1){
            MaNV = "NV01";
        }
        else{
                   String maCuoi = tbl_NV.getValueAt(tbl_NV.getRowCount() - 1, 0).toString();
        int STT = Integer.parseInt(maCuoi.substring(3)) + 1; 
        if(STT >= 10){
               MaNV = "NV" + STT;
        }
        else{
            MaNV = "NV0" + STT;
        }
        }
        return MaNV;
    }
    private void btnThemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNVActionPerformed
        // TODO add your handling code here:
        
        if (btnThemNV.getText() == "Lưu") {
            
            DBConnection c = new DBConnection();
                String hoTen = txtHoTen.getText();
                String gioiTinh = cbGioiTinh.getSelectedItem().toString();
                String cV = (String) cbCV.getSelectedItem();
                String luong = txtLuong.getText();
                String SDT = txtSDT.getText();
                String tuoi = txtTuoi.getText();
                String diaChi = txtDiaChi.getText();
                String email =txtEmail.getText();

                ChucNang.suaNV( MaNV, hoTen, tuoi, gioiTinh, cV, luong, SDT, diaChi, email);
                DefaultTableModel tbl = (DefaultTableModel) tbl_NV.getModel();
                ChucNang.hienThiDriver(tbl);
                btnSuaNV.setEnabled(true);
                btnXoaNV.setText("Xóa");
                btnThemNV.setText("Thêm");
                txtSDT.setEnabled(false);
                txtLuong.setEnabled(false);
                txtHoTen.setEnabled(false);
                txtTuoi.setEnabled(false);
                txtDiaChi.setEnabled(false);
                txtEmail.setEnabled(false);
                cbCV.setEnabled(false);
                cbGioiTinh.setEnabled(false);
                txtSDT.setText("");
                txtLuong.setText("");
                txtHoTen.setText("");
                txtTuoi.setText("");
                txtDiaChi.setText("");
                txtEmail.setText("");

        } else {
            btnThemNV.setEnabled(false);
            btnSuaNV.setText("Lưu");
            btnXoaNV.setText("Không Lưu");
                txtSDT.setEnabled(true);
                txtLuong.setEnabled(true);
                txtHoTen.setEnabled(true);
                txtTuoi.setEnabled(true);
                txtDiaChi.setEnabled(true);
                txtEmail.setEnabled(true);
                cbCV.setEnabled(true);
                cbGioiTinh.setEnabled(true);

        }

    }//GEN-LAST:event_btnThemNVActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        DefaultTableModel tbl = (DefaultTableModel) tbl_NV.getModel();
            ChucNang.hienThiNV(tbl);
    }//GEN-LAST:event_formWindowOpened

    private void tbl_NVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NVMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_NVMouseEntered

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
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaNV;
    private javax.swing.JButton btnThemNV;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoaNV;
    private javax.swing.JComboBox<String> cbCV;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_anh;
    private javax.swing.JTable tbl_NV;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
