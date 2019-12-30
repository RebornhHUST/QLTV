/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BillData;
import static controller.BillData.kiemTra;
import controller.Connect;
import controller.UpdateTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Bill;
import model.Book;

/**
 *
 * @author Doan Thien Duc
 */
public class jfTaoPhieu extends javax.swing.JFrame implements ActionListener{
    public static String sql5 = "SELECT * FROM tblBill order by IDBill asc";
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String idBill;
    public String sql10 = "SELECT IDBill FROM tblBill order by IDBill asc";
    public static String ngayMuon1;
    public static String ngayHen1;
    public static String tienCoc;
    /**
     * Creates new form jfTaoPhieu
     */
    public jfTaoPhieu() {
        initComponents();
        setLocationRelativeTo(null);
        
        btnBack.addActionListener(this);
        btnAdd.addActionListener(this);
        btnReset.addActionListener(this);
        htTenBanDoc.setEnabled(false);
        htTenNV.setEnabled(false);
        
        
        UpdateTable.LoadData(sql10, tblIDBill);
        this.setResizable(false);
        JLabel jl = new JLabel();
        add(jl);
        jl.setSize(1100, 600);

        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\Nguye\\Documents\\NetBeansProjects\\Quanlythuvien20173302\\src\\model\\Capture.PNG"));
            int x = jl.getSize().width;
            int y = jl.getSize().height;

            ImageIcon icon = new ImageIcon(image.getScaledInstance(x, y, image.SCALE_SMOOTH));
            jl.setIcon(icon);
        } catch (IOException ex) {

        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNgayMuon = new javax.swing.JTextField();
        txtNgayHen = new javax.swing.JTextField();
        txtTienCoc = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtIDBill = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblIDBill = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        TenBanDoc = new javax.swing.JLabel();
        TenNhanVien = new javax.swing.JLabel();
        cbxIDReader = new javax.swing.JTextField();
        htTenBanDoc = new javax.swing.JButton();
        htTenNV = new javax.swing.JButton();
        cbxIDEmployees = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("TẠO PHIẾU MƯỢN SÁCH");

        jLabel2.setText("Mã phiếu:");

        jLabel3.setText("Mã bạn đọc:");

        jLabel5.setText("Mã nhân viên:");

        jLabel6.setText("Ngày mượn:");

        jLabel7.setText("Ngày hẹn trả:");

        jLabel8.setText("Tiền cọc:");

        txtNgayMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayMuonActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 153, 0));
        btnAdd.setText("Mượn sách");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 153, 0));
        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setText("Làm mới");

        btnBack.setBackground(new java.awt.Color(255, 153, 0));
        btnBack.setText("Back");

        tblIDBill.setBackground(new java.awt.Color(204, 255, 204));
        tblIDBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblIDBill);

        cbxIDReader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxIDReaderMouseClicked(evt);
            }
        });
        cbxIDReader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxIDReaderKeyPressed(evt);
            }
        });

        htTenBanDoc.setBackground(new java.awt.Color(153, 255, 102));
        htTenBanDoc.setText("Tên bạn đọc");
        htTenBanDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htTenBanDocActionPerformed(evt);
            }
        });

        htTenNV.setBackground(new java.awt.Color(153, 255, 153));
        htTenNV.setText("Tên nhân viên");
        htTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htTenNVActionPerformed(evt);
            }
        });

        cbxIDEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxIDEmployeesMouseClicked(evt);
            }
        });
        cbxIDEmployees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxIDEmployeesKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(htTenNV)
                                .addGap(18, 18, 18)
                                .addComponent(TenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(38, 38, 38)
                                .addComponent(btnReset)
                                .addGap(66, 66, 66)
                                .addComponent(btnBack))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTienCoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                .addComponent(txtNgayHen, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNgayMuon, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxIDEmployees, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxIDReader, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(htTenBanDoc)
                                .addGap(33, 33, 33)
                                .addComponent(TenBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIDBill, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(541, 541, 541)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(396, 396, 396))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIDBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxIDReader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(htTenBanDoc)
                            .addComponent(TenBanDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbxIDEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(htTenNV)
                            .addComponent(TenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNgayHen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTienCoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnAdd)
                    .addComponent(btnBack))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtNgayMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayMuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayMuonActionPerformed

    private void htTenBanDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htTenBanDocActionPerformed
        // TODO add your handling code here:
        String tenBanDoc = this.cbxIDReader.getText();
        String sql = " select * from tblReader where IDReader = '"+tenBanDoc+"'";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                this.TenBanDoc.setText(rs.getString("Name"));
            }
            else{
                JOptionPane.showConfirmDialog(rootPane, "Không tồn tại tên bạn đọc");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(rootPane, "Thông báo lỗi");
        }
        
    }//GEN-LAST:event_htTenBanDocActionPerformed

    private void cbxIDReaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxIDReaderMouseClicked

    }//GEN-LAST:event_cbxIDReaderMouseClicked

    private void cbxIDEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxIDEmployeesMouseClicked

    }//GEN-LAST:event_cbxIDEmployeesMouseClicked

    private void htTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htTenNVActionPerformed
        // TODO add your handling code here:
        String tenNV = this.cbxIDEmployees.getText();
        String sql = " select * from tblEmployees where IDEmployees = '"+tenNV+"'";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                this.TenNhanVien.setText(rs.getString("Name"));
            }
            else{
                JOptionPane.showConfirmDialog(rootPane, "Không tồn tại tên nhân viên");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(rootPane, "Thông báo lỗi");
        }
    }//GEN-LAST:event_htTenNVActionPerformed

    private void cbxIDReaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxIDReaderKeyPressed
        // TODO add your handling code here:
        if(this.cbxIDReader.getText().length() != 0){
            this.htTenBanDoc.setEnabled(true);
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.htTenBanDoc.doClick();
        }
    }//GEN-LAST:event_cbxIDReaderKeyPressed

    private void cbxIDEmployeesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxIDEmployeesKeyPressed
        // TODO add your handling code here:
        if(this.cbxIDEmployees.getText().length()!= 0){
            this.htTenNV.setEnabled(true);
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.htTenNV.doClick();
        }
    }//GEN-LAST:event_cbxIDEmployeesKeyPressed

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
            java.util.logging.Logger.getLogger(jfTaoPhieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfTaoPhieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfTaoPhieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfTaoPhieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfTaoPhieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TenBanDoc;
    private javax.swing.JLabel TenNhanVien;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JTextField cbxIDEmployees;
    private javax.swing.JTextField cbxIDReader;
    private javax.swing.JButton htTenBanDoc;
    private javax.swing.JButton htTenNV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable tblIDBill;
    private javax.swing.JTextField txtIDBill;
    private javax.swing.JTextField txtNgayHen;
    private javax.swing.JTextField txtNgayMuon;
    private javax.swing.JTextField txtTienCoc;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnBack))
            btnBackClick();
        if(e.getSource().equals(btnAdd))
            btnAddClick();
        if(e.getSource().equals(btnReset))
            btnResetClick();    
 
    }
    public void btnBackClick(){
        new jfHome().setVisible(true);
        this.dispose();
    }
    
    public void btnResetClick(){
        txtIDBill.setText("");
        txtNgayMuon.setText("");
        txtNgayHen.setText("");
        txtTienCoc.setText("");
    }
    public void btnAddClick(){
        if (this.txtIDBill.getText().length()==0) JOptionPane.showMessageDialog(null, "Mã phiếu không thể bỏ trống", "thông báo", 2);
        else if(this.txtIDBill.getText().length()>10) JOptionPane.showMessageDialog(null, "Mã phiếu không được lớn hơn 10 ký tự", "thông báo", 2);
        else {
            Bill b = new Bill(this.txtIDBill.getText(),this.cbxIDReader.getText(),
                    this.cbxIDEmployees.getText(),this.txtNgayMuon.getText(),this.txtNgayHen.getText(),this.txtTienCoc.getText());
            BillData.addNewBill(b);
            idBill=this.txtIDBill.getText();
            ngayMuon1=txtNgayMuon.getText();
            ngayHen1=txtNgayHen.getText();
            tienCoc=txtTienCoc.getText();
            if(kiemTra){
                new jfMuonSach().setVisible(true);
                this.dispose();
            }
            }
    }
}
