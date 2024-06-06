/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management.system;

import Database.DBConnection;
import Process.ChucNang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kdt09
 */
public class QLKhachHang extends javax.swing.JFrame {

    String maKH = "";

    /**
     * Creates new form QLKhachHang
     */
    public QLKhachHang() {
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

        jLabel1 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCCCD = new javax.swing.JTextField();
        txtNgayDen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbLoaiPhong = new javax.swing.JComboBox<>();
        txtDiaChi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_KH = new javax.swing.JTable();
        cbGioiTinh = new javax.swing.JComboBox<>();
        btnSuaKH = new javax.swing.JButton();
        btnXoaKH = new javax.swing.JButton();
        btnThemKH = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbMaPhong = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Khách Hàng");
        setBounds(new java.awt.Rectangle(100, 50, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        txtDonGia.setEnabled(false);
        txtDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonGiaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Giới tính");

        txtHoTen.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("Họ và Tên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("CCCD");

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/exit.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setFocusPainted(false);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Ngày đến");

        txtCCCD.setEnabled(false);

        txtNgayDen.setEnabled(false);
        txtNgayDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayDenActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Loại Phòng");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Đơn giá");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Địa chỉ");

        cbLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phòng Đơn", "Phòng Đôi", "Phòng Vip Đơn", "Phòng Vip Đôi", "Phòng Tổng Thống" }));
        cbLoaiPhong.setEnabled(false);
        cbLoaiPhong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLoaiPhongItemStateChanged(evt);
            }
        });
        cbLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiPhongActionPerformed(evt);
            }
        });

        txtDiaChi.setEnabled(false);
        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        tbl_KH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "CCCD", "Tên KH", "Giới tính", "Địa Chỉ", "SĐT"
            }
        ));
        tbl_KH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_KHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbl_KHMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_KH);

        cbGioiTinh.setEditable(true);
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbGioiTinh.setEnabled(false);
        cbGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGioiTinhActionPerformed(evt);
            }
        });

        btnSuaKH.setBackground(new java.awt.Color(102, 255, 153));
        btnSuaKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaKH.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/edit1.png"))); // NOI18N
        btnSuaKH.setText("Sửa");
        btnSuaKH.setFocusPainted(false);
        btnSuaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaKHActionPerformed(evt);
            }
        });

        btnXoaKH.setBackground(new java.awt.Color(255, 51, 51));
        btnXoaKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaKH.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/trash.png"))); // NOI18N
        btnXoaKH.setText("Xóa");
        btnXoaKH.setFocusPainted(false);
        btnXoaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKHActionPerformed(evt);
            }
        });

        btnThemKH.setBackground(new java.awt.Color(50, 204, 255));
        btnThemKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemKH.setForeground(new java.awt.Color(255, 255, 255));
        btnThemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/add.png"))); // NOI18N
        btnThemKH.setText("Thêm");
        btnThemKH.setFocusPainted(false);
        btnThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKHActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Mã Phòng");

        cbMaPhong.setEnabled(false);
        cbMaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaPhongActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("SĐT");

        txtSDT.setEnabled(false);
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(38, 38, 38))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnThemKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSuaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnXoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(291, 291, 291))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbLoaiPhong, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNgayDen, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMaPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(cbMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThemKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnXoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSuaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtNgayDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cbLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiPhongActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:

        cbMaPhong.removeAllItems();
        try {
            ResultSet res = ChucNang.getMaPhong(cbLoaiPhong.getSelectedItem().toString());
            if (res != null) {
                while (res.next()) {
                    String item = res.getString("room_number");
                    cbMaPhong.addItem(item);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Không còn phòng trống!!!!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(QLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cbLoaiPhongActionPerformed

    private void tbl_KHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_KHMouseClicked
        // TODO add your handling code here:
        int rowSelect = tbl_KH.getSelectedRow();
        if (rowSelect > -1) {
            maKH = tbl_KH.getValueAt(rowSelect, 0).toString();
            txtCCCD.setText(tbl_KH.getValueAt(rowSelect, 1).toString());
            txtHoTen.setText(tbl_KH.getValueAt(rowSelect, 2).toString());
            cbGioiTinh.setSelectedItem(tbl_KH.getValueAt(rowSelect, 3));
            txtDiaChi.setText(tbl_KH.getValueAt(rowSelect, 4).toString());
            txtSDT.setText(tbl_KH.getValueAt(rowSelect, 5).toString());
        }
    }//GEN-LAST:event_tbl_KHMouseClicked

    private void tbl_KHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_KHMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_KHMouseEntered

    private void cbGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGioiTinhActionPerformed

    private void btnSuaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaKHActionPerformed
        // TODO add your handling code here:
        String maPhieu = "";

        if (btnSuaKH.getText().equals("Lưu")) {
            DBConnection c = new DBConnection();
            maKH = this.setMaKH();
            maPhieu = this.setMaPhieu();
            String CCCD = txtCCCD.getText();
            String gioiTinh = cbGioiTinh.getSelectedItem().toString();
            String maPhong = cbMaPhong.getSelectedItem().toString();
            String SDT = txtSDT.getText();
            String hoTen = txtHoTen.getText();
            String diaChi = txtDiaChi.getText();
            LocalDate ngayDen = LocalDate.parse(txtNgayDen.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            ChucNang.themKH(maKH, CCCD, hoTen, gioiTinh, SDT, diaChi, maPhieu, maPhong, ngayDen);
            DefaultTableModel tbl = (DefaultTableModel) tbl_KH.getModel();
            ChucNang.hienThiKH(tbl);
            btnThemKH.setEnabled(true);
            btnXoaKH.setText("Xóa");
            btnSuaKH.setText("Sửa");
            txtDonGia.setEnabled(false);
            txtSDT.setEnabled(false);
            txtCCCD.setEnabled(false);
            txtHoTen.setEnabled(false);
            txtDiaChi.setEnabled(false);
            txtNgayDen.setEnabled(false);
            cbLoaiPhong.setEnabled(false);
            cbGioiTinh.setEnabled(false);
            cbMaPhong.setEnabled(false);
            txtDonGia.setText("");
            txtSDT.setText("");
            txtCCCD.setText("");
            txtHoTen.setText("");
            txtDiaChi.setText("");
            txtNgayDen.setText("");

        } else {
            btnSuaKH.setEnabled(false);
            btnThemKH.setText("Lưu");
            btnXoaKH.setText("Không Lưu");
            //txtDonGia.setEnabled(true);
            txtSDT.setEnabled(true);
            cbGioiTinh.setEnabled(true);
            //cbLoaiPhong.setEnabled(true);
            //cbMaPhong.setEnabled(true);
            txtCCCD.setEnabled(true);
            txtHoTen.setEnabled(true);
            txtDiaChi.setEnabled(true);
            //txtNgayDen.setEnabled(true);
            //cbLoaiPhong.setEnabled(true);

        }
    }//GEN-LAST:event_btnSuaKHActionPerformed

    private void btnXoaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKHActionPerformed
        // TODO add your handling code here:
        if (btnXoaKH.getText().equalsIgnoreCase("Không Lưu")) {
            btnThemKH.setEnabled(true);
            btnSuaKH.setEnabled(true);
            btnThemKH.setText("Thêm");
            btnXoaKH.setText("Xóa");
            btnSuaKH.setText("Sửa");
            txtDonGia.setEnabled(false);
            txtSDT.setEnabled(false);
            txtCCCD.setEnabled(false);
            txtHoTen.setEnabled(false);
            txtDiaChi.setEnabled(false);
            txtNgayDen.setEnabled(false);
            cbLoaiPhong.setEnabled(false);
            cbGioiTinh.setEnabled(false);
            cbLoaiPhong.setEnabled(false);
            cbMaPhong.setEnabled(false);
            txtDonGia.setText("");
            txtSDT.setText("");
            txtCCCD.setText("");
            txtHoTen.setText("");
            txtDiaChi.setText("");
            txtNgayDen.setText("");

        } else {
            if (txtCCCD.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Chọn dữ liệu ở dưới trước!!!!");
            } else {
                int rel = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xóa", "Xác Nhận Xóa", JOptionPane.YES_NO_OPTION);
                if (rel == JOptionPane.YES_OPTION) {
                    ChucNang.xoaKH(maKH);
                    DefaultTableModel tbl = (DefaultTableModel) tbl_KH.getModel();
                    ChucNang.hienThiKH(tbl);
                }
            }
        }
    }//GEN-LAST:event_btnXoaKHActionPerformed

    private void btnThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKHActionPerformed
        // TODO add your handling code here:

        if (btnThemKH.getText() == "Lưu") {

            DBConnection c = new DBConnection();
            String CCCD = txtCCCD.getText();
            String gioiTinh = cbGioiTinh.getSelectedItem().toString();
            String SDT = txtSDT.getText();
            String hoTen = txtHoTen.getText();
            String diaChi = txtDiaChi.getText();

            ChucNang.suaKH(maKH, CCCD, hoTen, gioiTinh, SDT, diaChi);
            DefaultTableModel tbl = (DefaultTableModel) tbl_KH.getModel();
            ChucNang.hienThiKH(tbl);
            btnSuaKH.setEnabled(true);
            btnXoaKH.setText("Xóa");
            btnThemKH.setText("Thêm");
            txtDonGia.setEnabled(false);
            txtSDT.setEnabled(false);
            txtCCCD.setEnabled(false);
            txtHoTen.setEnabled(false);
            txtDiaChi.setEnabled(false);
            txtNgayDen.setEnabled(false);
            cbLoaiPhong.setEnabled(false);
            cbGioiTinh.setEnabled(false);
            cbMaPhong.setEnabled(false);
            txtDonGia.setText("");
            txtCCCD.setText("");
            txtHoTen.setText("");
            txtDiaChi.setText("");
            txtNgayDen.setText("");

        } else {
            btnThemKH.setEnabled(false);
            btnSuaKH.setText("Lưu");
            btnXoaKH.setText("Không Lưu");
            txtSDT.setEnabled(false);
            txtCCCD.setEnabled(true);
            txtHoTen.setEnabled(true);
            txtDiaChi.setEnabled(true);
            cbGioiTinh.setEnabled(true);
            txtSDT.setEnabled(true);
            cbLoaiPhong.setEnabled(true);
            cbMaPhong.setEnabled(true);
            txtDonGia.setEnabled(true);
            txtNgayDen.setEnabled(true);
        }
    }//GEN-LAST:event_btnThemKHActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void cbMaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaPhongActionPerformed
        // TODO add your handling code here:
        //txtDonGia.setText(ChucNang.getDonGia(cbMaPhong.getSelectedItem().toString()));
        //cbMaPhong.removeAllItems();
        try {
            ResultSet res = ChucNang.roomChoose(cbMaPhong.getSelectedItem().toString());
            if (res != null) {
                while (res.next()) {
                    String pri = res.getString("price");
                    txtDonGia.setText(pri);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Không còn phòng trống!!!!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(QLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbMaPhongActionPerformed

    private void cbLoaiPhongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLoaiPhongItemStateChanged

    }//GEN-LAST:event_cbLoaiPhongItemStateChanged

    private void txtDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonGiaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtNgayDen.setText(LocalDate.now().toString());

        //cbLoaiPhong.setSelectedIndex(-1);
        DefaultTableModel tbl = (DefaultTableModel) tbl_KH.getModel();
        ChucNang.hienThiKH(tbl);
    }//GEN-LAST:event_formWindowOpened

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtNgayDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayDenActionPerformed

    public String setMaKH() {
        String MaKH;
        if (tbl_KH.getRowCount() - 1 == -1) {
            MaKH = "KH01";
        } else {
            String maCuoi = tbl_KH.getValueAt(tbl_KH.getRowCount() - 1, 0).toString();
            int STT = Integer.parseInt(maCuoi.substring(3)) + 1;
            if (STT >= 10) {
                MaKH = "KH" + STT;
            } else {
                MaKH = "KH0" + STT;
            }
        }
        return MaKH;
    }

    public String setMaPhieu() {
        String MaPhieu;
        if (tbl_KH.getRowCount() - 1 == -1) {
            MaPhieu = "CR01";
        } else {
            String maCuoi = tbl_KH.getValueAt(tbl_KH.getRowCount() - 1, 0).toString();
            int STT = Integer.parseInt(maCuoi.substring(3)) + 1;
            if (STT >= 10) {
                MaPhieu = "CR" + STT;
            } else {
                MaPhieu = "CR0" + STT;
            }
        }
        return MaPhieu;
    }

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
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                //new QLKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaKH;
    private javax.swing.JButton btnThemKH;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoaKH;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JComboBox<String> cbLoaiPhong;
    private javax.swing.JComboBox<String> cbMaPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_KH;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtNgayDen;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
