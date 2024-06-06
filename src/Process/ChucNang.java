/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import Database.DBConnection;
import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kdt09
 */
public class ChucNang {

    public static boolean themDriver(String id, String name, String age, String gender, String company, String brand, String available, String location, String price) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "INSERT INTO driver(`idDriver`, `name`, `age`, `gender`, `company`, `brand`, `available`, `location`, `price`) values( '" + id + "','" + name + "', '" + age + "', '" + gender + "','" + company + "', '" + brand + "', '" + available + "','" + location + "', '" + price + "')";

            stm.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static boolean suaDriver(String name, String age, String gender, String company, String brand, String available, String location, String id, String price) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "update driver set name = '" + name + "', age = '" + age + "', gender = '" + gender + "', company  = '" + company + "',brand = '" + brand + "',available = '" + available + "', location ='" + location + "', price = '" + price + "' where idDriver = '" + id + "'";

            stm.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static boolean xoaDriver(String id) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "delete from driver where idDriver = '" + id + "'";

            stm.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static void hienThiDriver(DefaultTableModel tbl) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from driver";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static boolean themPhong(String maPhong, String loaiPhong, String tinhTrang, String donGia, String dvTinh) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "INSERT INTO room values( '" + maPhong + "', '" + loaiPhong + "', '" + tinhTrang + "','" + donGia + "', '" + dvTinh + "')";

            stm.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static boolean suaPhong(String maPhong, String loaiPhong, String tinhTrang, String donGia, String dvTinh) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "update room set availability = '" + loaiPhong + "', clean_status = '" + tinhTrang + "', price  = '" + donGia + "',bed_Type = '" + dvTinh + "' where  room_number = '" + maPhong + "'";

            stm.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static boolean xoaPhong(String id) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "delete from room where room_number = '" + id + "'";

            stm.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static void hienThiPhong(DefaultTableModel tbl) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from room";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static boolean themNV(String maNV, String tenNV, String tuoi, String gioiTinh, String cV, String luong, String SDT, String diaChi, String email) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "INSERT INTO employee values( '" + maNV + "', '" + tenNV + "', '" + tuoi + "','" + gioiTinh + "', '" + cV + "' , '" + luong + "', '" + SDT + "', '" + diaChi + "', '" + email + "')";

            stm.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static boolean suaNV(String maNV, String tenNV, String tuoi, String gioiTinh, String cV, String luong, String SDT, String diaChi, String email) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "update employee set name = '" + tenNV + "', age = '" + tuoi + "', gender  = '" + gioiTinh + "',job = '" + cV + "' ,salary = '" + luong + "' ,phone = '" + SDT + "' ,address = '" + diaChi + "', email = '" + email + "' where  empID = '" + maNV + "'";

            stm.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static boolean xoaNV(String id) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "delete from employee where empID = '" + id + "'";

            stm.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static void hienThiNV(DefaultTableModel tbl) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from employee";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static ResultSet getMaPhong(String loaiPhong) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select room_number from room where availability = '" + loaiPhong + "' and clean_status = 'Trống'";

            ResultSet res = stm.executeQuery(str);
            //if(res.next()){
            return res;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return null;

    }

    public static String getDonGia(String maPhong) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select price from room where room_number = '" + maPhong + "'";

            ResultSet res = stm.executeQuery(str);
            if (res.next()) {
                return res.getString(1);
            } else {
                return null;
            }
        } catch (Exception ee) {
            System.out.println(ee);
        }
        return null;

    }

    public static ResultSet roomChoose(String maPhong) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select price from room where room_number = '" + maPhong + "'";

            ResultSet res = stm.executeQuery(str);
            //if(res.next()){
            return res;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return null;

    }

    public static boolean themKH(String maKH, String CCCD, String hoTen, String gioiTinh, String SDT, String diaChi, String maPhieu, String maPhong, LocalDate ngayDen) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            Statement stm1 = conn.createStatement();
            Statement stm2 = conn.createStatement();
            String str = "INSERT INTO customer(`id`, `number`, `name`, `gender`, `country`, `phone_number`) values( '" + maKH + "', '" + CCCD + "', '" + hoTen + "','" + gioiTinh + "', '" + diaChi + "' , '" + SDT + "')";
            String str2 = "update room set clean_status = 'Có Khách' where room_number = '" + maPhong + "'";
            String str1 = "INSERT INTO check_room(`id`, `room_number`, `id_customer`, `checkin_date`, `total`) values( '" + maPhieu + "', '" + maPhong + "', '" + maKH + "','" + ngayDen + "', NULL)";
            stm.executeUpdate(str);
            stm1.executeUpdate(str1);
            stm2.executeUpdate(str2);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static boolean suaKH(String maKH, String CCCD, String hoTen, String gioiTinh, String SDT, String diaChi) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "update customer set number = '" + CCCD + "', name = '" + hoTen + "', gender  = '" + gioiTinh + "',country = '" + diaChi + "' ,phone_number = '" + SDT + "'  where  id = '" + maKH + "'";
            stm.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static boolean xoaKH(String id) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            Statement stm1 = conn.createStatement();
            String str = "delete from customer where id = '" + id + "'";
            String str1 = "delete from check_room where id_customer = '" + id + "'";
            stm1.executeUpdate(str1);
            stm.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static void hienThiKH(DefaultTableModel tbl) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from customer";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static ResultSet getTTKH(String maPhong) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select customer.*, check_room.id, check_room.checkin_date, check_room.checkout_date, check_room.total, room.price, room.bed_type from check_room inner join customer on customer.id = check_room.id_customer inner join room on room.room_number = check_room.room_number where check_room.room_number = '" + maPhong + "' and check_room.total is null";
            ResultSet res = stm.executeQuery(str);
            return res;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return null;
    }

    public static boolean suaPhieuThue(String ngayDi, long tongTien, String maPhieu, String maPhong) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            Statement stm1 = conn.createStatement();
            String str = "update check_room set checkout_date = '" + ngayDi + "', total = '" + tongTien + "' where id = '" + maPhieu + "'";
            String str1 = "update room set clean_status = 'Trống' where room_number = '" + maPhong + "'";
            stm.executeUpdate(str);
            stm1.executeUpdate(str1);

            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static void hienThiKHbyMa(DefaultTableModel tbl, String ma) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from customer where maKhachHang = '" + ma + "'";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static void hienThiKHbyTen(DefaultTableModel tbl, String ma) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from customer where hoTen = '" + ma + "'";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static void hienThiKHbyCCCD(DefaultTableModel tbl, String ma) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from customer where CCCD = '" + ma + "'";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static void hienThiNVbyCV(DefaultTableModel tbl, String ma) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from employee where job = '" + ma + "'";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static void hienThiNVbyMa(DefaultTableModel tbl, String ma) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from employee where empID = '" + ma + "'";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static void hienThiPhongbyTinhTrang(DefaultTableModel tbl, String ma) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from room where clean_status = '" + ma + "'";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static void hienThiPhongbyMa(DefaultTableModel tbl, String ma) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from room where room_number = '" + ma + "'";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static void hienThiPhongbyloaiPhong(DefaultTableModel tbl, String ma) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from room where availability = '" + ma + "' and availability = 'không'";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static void hienThiDriverbyLocation(DefaultTableModel tbl, String location) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();
            String str = "select * from driver where location = '" + location + "'";
            tbl.setRowCount(0);
            ResultSet res = stm.executeQuery(str);
            while (res.next()) {
                Object obj[] = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9)};
                tbl.addRow(obj);
            }

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public static boolean themPhieuThueXe(String maPhieu, String maKH, String maLaiXe, String soGio, int tongTien) {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();

            String str = "INSERT INTO check_ser values( '" + maPhieu + "', '" + maLaiXe + "', '" + maKH + "','" + soGio + "', '" + tongTien + "' )";
            String str1 = "update driver set available = 'Có Khách' where idDriver = '"+maLaiXe+"'";
            stm.executeUpdate(str);
            stm.executeUpdate(str1);
            JOptionPane.showMessageDialog(null, "Thuê thành công");
            return true;

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return false;
    }

    public static String getMaPhieuXe() {
        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();

            String str = "Select id from check_ser ORDER BY CAST(SUBSTRING(id, 2) AS UNSIGNED) DESC limit 1";

            ResultSet res = stm.executeQuery(str);
            String ma = "";
            while (res.next()) {
                ma = res.getString(1);
            }
            return ma;
        } catch (Exception ee) {
            System.out.println(ee);
        }
        return null;
    }

    public static String getMaKH(String cccd) {

        try {
            Connection conn = DBConnection.connectDB();
            Statement stm = conn.createStatement();

            String sql = "select id from customer where number = '" + cccd + "'";

            ResultSet res = stm.executeQuery(sql);

            String ma = "";
            while (res.next()) {
                ma = res.getString(1);
            }
            return ma;
        } catch (SQLException ex) {
            Logger.getLogger(ChucNang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
