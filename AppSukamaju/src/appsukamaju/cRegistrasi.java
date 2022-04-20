/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appsukamaju;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author JON
 */
public class cRegistrasi extends javax.swing.JFrame {
private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    /**
     * Creates new form cMakanan
     */
    public cRegistrasi() {
        initComponents();
        k.connect();
        refreshTable();
    }

    class user extends cRegistrasi {
        int iduser, idlevel;
        String username, password, nama_user;
        
        public user(){
            username = txt_username.getText();
            password = txt_password.getText();
            nama_user = txt_nama_user.getText();
            idlevel = Integer.parseInt(combo_id_level.getSelectedItem().toString());
        }
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("ID User");
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Nama User");
        model.addColumn("ID Level");
        tabel_registrasi.setModel(model);
        
        try {
            this.stat = k.getCon().prepareStatement("select * from user");
            this.rs = this.stat.executeQuery();
            while (rs.next()) {                
                Object[] data ={
                    rs.getString("iduser"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("nama_user"),
                    rs.getString("idlevel")
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        txt_id_user.setText("");
        txt_username.setText("");
        txt_password.setText("");
        txt_nama_user.setText("");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_id_user = new javax.swing.JTextField();
        combo_id_level = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_registrasi = new javax.swing.JTable();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_menu_makanan = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        txt_password = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_nama_user = new javax.swing.JTextField();
        btn_detail_order = new javax.swing.JButton();
        btn_menu_minuman = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Registrasi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 270, 42));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("ID User  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 94, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("ID Level");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 293, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 150, -1, -1));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 143, 350, 38));

        txt_id_user.setEnabled(false);
        getContentPane().add(txt_id_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 93, 350, 38));

        combo_id_level.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        combo_id_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        getContentPane().add(combo_id_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 293, 227, 32));

        tabel_registrasi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_registrasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_registrasiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_registrasi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 393, 590, 110));

        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 343, -1, -1));

        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 343, -1, -1));

        btn_ubah.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 343, -1, -1));

        btn_menu_makanan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_menu_makanan.setText("Menu Makanan");
        btn_menu_makanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_makananActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, 30));

        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_logout.setText("X");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 193, 350, 38));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 201, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Nama user");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 253, -1, -1));
        getContentPane().add(txt_nama_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 243, 350, 38));

        btn_detail_order.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_detail_order.setText("Detail Order");
        btn_detail_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detail_orderActionPerformed(evt);
            }
        });
        getContentPane().add(btn_detail_order, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 30));

        btn_menu_minuman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_menu_minuman.setText("Menu Minuman");
        btn_menu_minuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_minumanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu_minuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabel_registrasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_registrasiMouseClicked
        txt_id_user.setText(model.getValueAt(tabel_registrasi.getSelectedRow(), 0).toString());
        txt_username.setText(model.getValueAt(tabel_registrasi.getSelectedRow(), 1).toString());
        txt_password.setText(model.getValueAt(tabel_registrasi.getSelectedRow(), 2).toString());
        txt_nama_user.setText(model.getValueAt(tabel_registrasi.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tabel_registrasiMouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        try {
            user u = new user();
            this.stat = k.getCon().prepareStatement("insert into user values(?,?,?,?,?)");
            stat.setInt(1, 0);
            stat.setString(2, u.username);
            stat.setString(3, u.password);
            stat.setString(4, u.nama_user);
            stat.setInt(5, u.idlevel);
            stat.executeUpdate(); // dari tabel gui ke mysql
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        try {
            user u = new user();
            this.stat = k.getCon().prepareStatement("delete from user where iduser=?");
            stat.setString(1, txt_id_user.getText());
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        try {
            user u = new user();
            this.stat = k.getCon().prepareStatement("update user set username=?,"
                + "password=?,nama_user=?,idlevel=? where iduser=?");
            stat.setString(1, u.username);
            stat.setString(2, u.password);
            stat.setString(3, u.nama_user);
            stat.setInt(4, u.idlevel);
            stat.setString(5, txt_id_user.getText());
            stat.executeUpdate(); // dari tabel gui ke mysql
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_menu_makananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_makananActionPerformed
        cMakanan mkn = new cMakanan();
        mkn.setVisible(true);
        this.setVisible(false);
        mkn.btn_tambah.setEnabled(true);
        mkn.btn_hapus.setEnabled(true);
        mkn.btn_ubah.setEnabled(true);
        
        mkn.btn_menu_minuman.setEnabled(true);
        mkn.btn_menu_registrasi.setEnabled(true);
        mkn.btn_logout.setEnabled(true);
        
    }//GEN-LAST:event_btn_menu_makananActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        cLogin l = new cLogin();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_detail_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detail_orderActionPerformed
        cOrderDetail ord = new cOrderDetail();
        ord.setVisible(true);
        this.setVisible(false);
//        cMinuman mnm = new cMinuman();
//        mnm.setVisible(true);
//        this.setVisible(false);
//        mnm.btn_tambah.setEnabled(true);
//        mnm.btn_hapus.setEnabled(true);
//        mnm.btn_ubah.setEnabled(true);
//        
//        mnm.btn_menu_makanan.setEnabled(true);
//        mnm.btn_menu_registrasi.setEnabled(true);
//        mnm.btn_logout.setEnabled(true);
    }//GEN-LAST:event_btn_detail_orderActionPerformed

    private void btn_menu_minumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_minumanActionPerformed
        cMinuman mnm = new cMinuman();
        mnm.setVisible(true);
        this.setVisible(false);
        mnm.btn_tambah.setEnabled(true);
        mnm.btn_hapus.setEnabled(true);
        mnm.btn_ubah.setEnabled(true);
        
        mnm.btn_menu_makanan.setEnabled(true);
        mnm.btn_menu_registrasi.setEnabled(true);
        mnm.btn_logout.setEnabled(true);
    }//GEN-LAST:event_btn_menu_minumanActionPerformed

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
            java.util.logging.Logger.getLogger(cRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cRegistrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_detail_order;
    public javax.swing.JButton btn_hapus;
    public javax.swing.JButton btn_logout;
    public javax.swing.JButton btn_menu_makanan;
    public javax.swing.JButton btn_menu_minuman;
    public javax.swing.JButton btn_tambah;
    public javax.swing.JButton btn_ubah;
    private javax.swing.JComboBox<String> combo_id_level;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabel_registrasi;
    private javax.swing.JTextField txt_id_user;
    private javax.swing.JTextField txt_nama_user;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
