/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
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
public class PanelQLLaiXe extends javax.swing.JPanel {
       String ma;
    /**
     * Creates new form PaneelQLLaiXe
     */
    public PanelQLLaiXe() {
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

        t6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JTextField();
        comboBox_1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnThemDriver = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        lb_anh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Driver = new javax.swing.JTable();
        t4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSuaDriver = new javax.swing.JButton();
        t5 = new javax.swing.JTextField();
        btnXoaDriver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1196, 684));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t6.setEnabled(false);
        add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 294, 230, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Giới tính");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 133, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Đơn giá");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 294, -1, -1));

        t1.setEnabled(false);
        add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 65, 230, -1));

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        comboBox.setEnabled(false);
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 133, 230, -1));

        t2.setEnabled(false);
        add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 99, 230, -1));

        comboBox_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Có", "Không" }));
        comboBox_1.setEnabled(false);
        comboBox_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_1ActionPerformed(evt);
            }
        });
        add(comboBox_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 226, 230, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Tuổi");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 99, -1, -1));

        btnThemDriver.setBackground(new java.awt.Color(51, 204, 255));
        btnThemDriver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemDriver.setForeground(new java.awt.Color(255, 255, 255));
        btnThemDriver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/add.png"))); // NOI18N
        btnThemDriver.setText("Thêm");
        btnThemDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDriverActionPerformed(evt);
            }
        });
        add(btnThemDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 109, 33));

        t3.setEnabled(false);
        add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 164, 230, -1));

        lb_anh.setFont(new java.awt.Font("Segoe UI Emoji", 0, 3)); // NOI18N
        lb_anh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_anh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/unname.jpg"))); // NOI18N
        lb_anh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_anh.setIconTextGap(1);
        lb_anh.setInheritsPopupMenu(false);
        lb_anh.setMaximumSize(new java.awt.Dimension(500, 300));
        lb_anh.setMinimumSize(new java.awt.Dimension(500, 300));
        lb_anh.setPreferredSize(new java.awt.Dimension(500, 300));
        add(lb_anh, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 65, 678, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Công ty");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 164, -1, -1));

        tbl_Driver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ và Tên", "Tuổi", "Giới Tính", "Công Ty", "Hãng Xe", "Có Khách", "Địa Chỉ", "Đơn giá"
            }
        ));
        tbl_Driver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DriverMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_Driver);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 391, 1144, 215));

        t4.setEnabled(false);
        add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 198, 230, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Hãng xe");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 198, -1, -1));

        btnSuaDriver.setBackground(new java.awt.Color(102, 255, 153));
        btnSuaDriver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaDriver.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaDriver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/edit1.png"))); // NOI18N
        btnSuaDriver.setText("Sửa");
        btnSuaDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDriverActionPerformed(evt);
            }
        });
        add(btnSuaDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 338, 109, 35));

        t5.setEnabled(false);
        add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 260, 230, -1));

        btnXoaDriver.setBackground(new java.awt.Color(255, 51, 51));
        btnXoaDriver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaDriver.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaDriver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/trash.png"))); // NOI18N
        btnXoaDriver.setText("Xóa");
        btnXoaDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDriverActionPerformed(evt);
            }
        });
        add(btnXoaDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 338, 120, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Đã Có Khách");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 226, -1, -1));

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/icons/exit.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 338, 129, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ LÁI XE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 1144, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Địa Chỉ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("Họ và  Tên");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 65, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDriverActionPerformed
        // TODO add your handling code here:
        if (btnThemDriver.getText() == "Lưu") {
            DBConnection c = new DBConnection();
            String name = t1.getText();
            String age = t2.getText();
            String gender = (String) comboBox.getSelectedItem();
            String company = t3.getText();
            String brand = t4.getText();
            String available = (String) comboBox_1.getSelectedItem();
            String location = t5.getText();
            String donGia = t6.getText();
            ChucNang.suaDriver(name, age, gender, company, brand, available, location, ma , donGia);
            DefaultTableModel tbl = (DefaultTableModel) tbl_Driver.getModel();
            ChucNang.hienThiDriver(tbl);
            btnSuaDriver.setEnabled(true);
            btnThemDriver.setText("Thêm");
            btnXoaDriver.setText("Xóa");
            t1.setEnabled(false);
            t2.setEnabled(false);
            t3.setEnabled(false);
            t4.setEnabled(false);
            t5.setEnabled(false);
            t6.setEnabled(false);
            comboBox.setEnabled(false);
            comboBox_1.setEnabled(false);
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
        } else {
            btnThemDriver.setEnabled(false);
            btnSuaDriver.setText("Lưu");
            btnXoaDriver.setText("Không Lưu");
            t1.setEnabled(true);
            t2.setEnabled(true);
            t3.setEnabled(true);
            t4.setEnabled(true);
            t5.setEnabled(true);
            t6.setEnabled(true);
            comboBox.setEnabled(true);
            comboBox_1.setEnabled(true);
        }

    }//GEN-LAST:event_btnThemDriverActionPerformed

    private void tbl_DriverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DriverMouseClicked
        // TODO add your handling code here:
        int rowSelect = tbl_Driver.getSelectedRow();
        if (rowSelect > -1) {
            ma = (tbl_Driver.getValueAt(rowSelect, 0).toString());
            t1.setText(tbl_Driver.getValueAt(rowSelect, 1).toString());
            t2.setText(tbl_Driver.getValueAt(rowSelect, 2).toString());
            comboBox.setSelectedItem(tbl_Driver.getValueAt(rowSelect, 3));
            t3.setText(tbl_Driver.getValueAt(rowSelect, 4).toString());
            t4.setText(tbl_Driver.getValueAt(rowSelect, 5).toString());
            comboBox_1.setSelectedItem(tbl_Driver.getValueAt(rowSelect, 6));
            t5.setText(tbl_Driver.getValueAt(rowSelect, 7).toString());
            t6.setText(tbl_Driver.getValueAt(rowSelect, 8).toString());
        }
    }//GEN-LAST:event_tbl_DriverMouseClicked

    private void btnSuaDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDriverActionPerformed
        // TODO add your handling code here:
        if (t1.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Chọn dữ liệu ở dưới trước!!!!");
        } else {
            if (btnSuaDriver.getText() == "Lưu") {
                DBConnection c = new DBConnection();
                String name = t1.getText();
                String age = t2.getText();
                String gender = (String) comboBox.getSelectedItem();
                String company = t3.getText();
                String brand = t4.getText();
                String available = (String) comboBox_1.getSelectedItem();
                String location = t5.getText();
                String donGia = t6.getText();
                ma = this.setMaDri();
                ChucNang.themDriver(ma, name, age, gender, company, brand, available, location, donGia);
                DefaultTableModel tbl = (DefaultTableModel) tbl_Driver.getModel();
                ChucNang.hienThiDriver(tbl);
                btnThemDriver.setEnabled(true);
                btnSuaDriver.setText("Sửa");
                btnXoaDriver.setText("Xóa");
                t1.setEnabled(false);
                t2.setEnabled(false);
                t3.setEnabled(false);
                t4.setEnabled(false);
                t5.setEnabled(false);
                t6.setEnabled(false);
                comboBox.setEnabled(false);
                comboBox_1.setEnabled(false);

            } else {
                btnSuaDriver.setEnabled(false);
                btnThemDriver.setText("Lưu");
                btnXoaDriver.setText("Không Lưu");
                t1.setEnabled(true);
                t2.setEnabled(true);
                t3.setEnabled(true);
                t4.setEnabled(true);
                t5.setEnabled(true);
                t6.setEnabled(true);
                comboBox.setEnabled(true);
                comboBox_1.setEnabled(true);
            }
        }

    }//GEN-LAST:event_btnSuaDriverActionPerformed

    private void btnXoaDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDriverActionPerformed
        // TODO add your handling code here:
        if (btnXoaDriver.getText().equalsIgnoreCase("Không Lưu")) {
            btnSuaDriver.setEnabled(true);
            btnThemDriver.setEnabled(true);
            btnThemDriver.setText("Thêm");
            btnXoaDriver.setText("Xóa");
            btnSuaDriver.setText("Sửa");
            t1.setEnabled(false);
            t2.setEnabled(false);
            t3.setEnabled(false);
            t4.setEnabled(false);
            t5.setEnabled(false);
            t6.setEnabled(false);
            comboBox.setEnabled(false);
            comboBox_1.setEnabled(false);
        } else {
            if (t1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Chọn dữ liệu ở dưới trước!!!!");
            } else {
                int rel = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa", "Xác Nhận Xóa", JOptionPane.YES_NO_OPTION);
                if (rel == JOptionPane.YES_OPTION) {
                    ChucNang.xoaDriver(ma);
                    DefaultTableModel tbl = (DefaultTableModel) tbl_Driver.getModel();
                    ChucNang.hienThiDriver(tbl);
                }
            }
        }
    }//GEN-LAST:event_btnXoaDriverActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void comboBox_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_1ActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActionPerformed
    public String setMaDri() {
        String MaDri;
        if (tbl_Driver.getRowCount() - 1 == -1) {
            MaDri = "Dri01";
        } else {
            String maCuoi = tbl_Driver.getValueAt(tbl_Driver.getRowCount() - 1, 0).toString();
            int STT = Integer.parseInt(maCuoi.substring(3)) + 1;
            if (STT >= 10) {
                MaDri = "Dri" + STT;
            } else {
                MaDri = "Dri0" + STT;
            }
        }
        return MaDri;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaDriver;
    private javax.swing.JButton btnThemDriver;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoaDriver;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JComboBox<String> comboBox_1;
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
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTable tbl_Driver;
    // End of variables declaration//GEN-END:variables
}
