/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appsukamaju;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Al-Ikhlas
 */
public class cMakanan extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    /**
     * Creates new form cMakanan
     */
    public cMakanan() {
        initComponents();
        k.connect();
        refreshTable();
    }
    
    
    //Punya Makanan
    class makanan extends cMakanan {
        //punya makanan
        int idmakanan, harga;
        String nama_makanan, status;
        
        public makanan(){
            this.nama_makanan = txt_nama_makanan.getText();
            this.harga = Integer.parseInt(txt_harga_makanan.getText());
            this.status = combo_status_makanan.getSelectedItem().toString();
        }
    }
    
    // Punya Makanan
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("ID Makanan");
        model.addColumn("Nama Makanan");
        model.addColumn("Harga");
        model.addColumn("Status Makanan");
        tabel_makanan.setModel(model);
        
        try {
            this.stat = k.getCon().prepareStatement("select * from makanan");
            this.rs = this.stat.executeQuery();
            while (rs.next()) {                
                Object[] data = {
                  rs.getInt("idmakanan"),
                  rs.getString("nama_makanan"),
                  rs.getInt("harga"),
                  rs.getString("status")
                
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        txt_id_makanan.setText("");
        txt_nama_makanan.setText("");
        txt_harga_makanan.setText("");
    }
    
    //Punya Minuman 
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nama_makanan = new javax.swing.JTextField();
        txt_id_makanan = new javax.swing.JTextField();
        txt_harga_makanan = new javax.swing.JTextField();
        combo_status_makanan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_makanan = new javax.swing.JTable();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_menu_minuman = new javax.swing.JButton();
        btn_menu_registrasi = new javax.swing.JButton();
        btn_menu_transaksi1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Makanan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 430, 42));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("ID Makanan  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Status");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DAFTAR MAKANAN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 370, 680, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Harga");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txt_nama_makanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_makananActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 419, 38));

        txt_id_makanan.setEnabled(false);
        getContentPane().add(txt_id_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 419, 38));
        getContentPane().add(txt_harga_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 419, 38));

        combo_status_makanan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        combo_status_makanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Habis" }));
        combo_status_makanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_status_makananActionPerformed(evt);
            }
        });
        getContentPane().add(combo_status_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 227, 32));

        tabel_makanan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_makanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_makananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_makanan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 620, 150));

        btn_tambah.setBackground(new java.awt.Color(204, 204, 204));
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.setEnabled(false);
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        btn_hapus.setBackground(new java.awt.Color(204, 204, 204));
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.setEnabled(false);
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        btn_ubah.setBackground(new java.awt.Color(204, 204, 204));
        btn_ubah.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_ubah.setText("Ubah");
        btn_ubah.setEnabled(false);
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_logout.setText("X");
        btn_logout.setEnabled(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Nama Makanan ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btn_menu_minuman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_menu_minuman.setText("Menu Minuman");
        btn_menu_minuman.setEnabled(false);
        btn_menu_minuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_minumanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu_minuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 30));

        btn_menu_registrasi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_menu_registrasi.setText("Menu Registrasi");
        btn_menu_registrasi.setEnabled(false);
        btn_menu_registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_registrasiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu_registrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 30));

        btn_menu_transaksi1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_menu_transaksi1.setText("Menu Transaksi");
        btn_menu_transaksi1.setEnabled(false);
        btn_menu_transaksi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_transaksi1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu_transaksi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nama_makananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_makananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_makananActionPerformed

    private void tabel_makananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_makananMouseClicked
        txt_id_makanan.setText(model.getValueAt(tabel_makanan.getSelectedRow(), 0).toString());
        txt_nama_makanan.setText(model.getValueAt(tabel_makanan.getSelectedRow(), 1).toString());
        txt_harga_makanan.setText(model.getValueAt(tabel_makanan.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tabel_makananMouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        try {
            makanan mkn = new makanan();
            this.stat = k.getCon().prepareStatement("insert into makanan values(?,?,?,?)");
            stat.setInt(1, 0);
            stat.setString(2, mkn.nama_makanan);
            stat.setInt(3, mkn.harga);
            stat.setString(4, mkn.status);
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        try {
            this.stat = k.getCon().prepareStatement("delete from makanan where idmakanan=?");
            stat.setInt(1, Integer.parseInt(txt_id_makanan.getText()));
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        try {
            makanan mkn = new makanan();
            this.stat = k.getCon().prepareStatement("update makanan set nama_makanan=?,"
                + "harga=?,status=? where idmakanan=?");
            stat.setString(1, mkn.nama_makanan);
            stat.setInt(2, mkn.harga);
            stat.setString(3, mkn.status);
            stat.setInt(4, Integer.parseInt(txt_id_makanan.getText()));
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        cLogin l = new cLogin();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_menu_minumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_minumanActionPerformed
        cMinuman mnm = new cMinuman();
        mnm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menu_minumanActionPerformed

    private void btn_menu_registrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_registrasiActionPerformed
        cRegistrasi reg = new cRegistrasi();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menu_registrasiActionPerformed

    private void btn_menu_transaksi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_transaksi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_menu_transaksi1ActionPerformed

    private void combo_status_makananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_status_makananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_status_makananActionPerformed

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
            java.util.logging.Logger.getLogger(cMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_hapus;
    public javax.swing.JButton btn_logout;
    public javax.swing.JButton btn_menu_minuman;
    public javax.swing.JButton btn_menu_registrasi;
    public javax.swing.JButton btn_menu_transaksi1;
    public javax.swing.JButton btn_tambah;
    public javax.swing.JButton btn_ubah;
    private javax.swing.JComboBox<String> combo_status_makanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_makanan;
    private javax.swing.JTextField txt_harga_makanan;
    private javax.swing.JTextField txt_id_makanan;
    private javax.swing.JTextField txt_nama_makanan;
    // End of variables declaration//GEN-END:variables
}