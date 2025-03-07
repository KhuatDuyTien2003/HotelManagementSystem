/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {

    //JLabel l1;
    //JButton b1;

    HotelManagementSystem() {
        super("Hotel Management System");
        setSize(1366, 425);          // setContentPane(300,300,1366,390);   frame size
        setLayout(null);
        setLocation(300, 300);

        JLabel l1 = new JLabel("");
        JButton b1 = new JButton("Next");

        b1.setFont(new Font("serif", Font.BOLD, 16));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setFocusPainted(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1366, 390, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        l1 = new JLabel(i2);

        JLabel lid = new JLabel("HỆ THỐNG QUẢN LÝ KHÁCH SẠN 365");
        lid.setBounds(30, 300, 1500, 100);
        lid.setFont(new Font("serif", Font.PLAIN, 60));
        lid.setForeground(Color.red);
        l1.add(lid);

        b1.setBounds(1170, 325, 150, 50);
        l1.setBounds(0, 0, 1366, 390);

        l1.add(b1);
        add(l1);

        b1.addActionListener(this);
        setVisible(true);
        setLocation(100, 200);

        while (true) {
            lid.setVisible(false); // lid =  j label
            try {
                Thread.sleep(500); //1000 = 1 second
            } catch (Exception e) {
            }
            lid.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }

    public void actionPerformed(ActionEvent ae) {
            new Login().setVisible(true);
            this.setVisible(false);
    }

    public static void main(String[] args) {
        HotelManagementSystem window = new HotelManagementSystem();
        window.setVisible(true);
    }
}
