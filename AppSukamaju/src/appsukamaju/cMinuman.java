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
 * @author JON
 */
public class cMinuman extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    /**
     * Creates new form cMinuman
     */
    public cMinuman() {
        initComponents();
        k.connect();
        refreshTable();
    }
    
     class minuman extends cMinuman {
        int idminuman, harga_minuman;
        String nama_minuman, status_minuman;
        
        public minuman(){
            this.nama_minuman = txt_nama_minuman.getText();
            this.harga_minuman = Integer.parseInt(txt_harga_minuman.getText());
            this.status_minuman = combo_status_minuman.getSelectedItem().toString();
        }
    }
    
    
     public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("ID Minuman");
        model.addColumn("Nama Minuman");
        model.addColumn("Harga");
        model.addColumn("Status Minuman");
        tabel_minuman.setModel(model);
        
        try {
            this.stat = k.getCon().prepareStatement("select * from minuman");
            this.rs = this.stat.executeQuery();
            while (rs.next()) {                
                Object[] data = {
                  rs.getInt("idminuman"),
                  rs.getString("nama_minuman"),
                  rs.getInt("harga_minuman"),
                  rs.getString("status_minuman")
                
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        txt_id_minuman.setText("");
        txt_nama_minuman.setText("");
        txt_harga_minuman.setText("");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_menu_registrasi = new javax.swing.JButton();
        btn_menu_makanan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_nama_minuman = new javax.swing.JTextField();
        txt_id_minuman = new javax.swing.JTextField();
        txt_harga_minuman = new javax.swing.JTextField();
        combo_status_minuman = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_minuman = new javax.swing.JTable();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_menu_transaksi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menu_registrasi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_menu_registrasi.setText("Menu Registrasi");
        btn_menu_registrasi.setEnabled(false);
        btn_menu_registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_registrasiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu_registrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, 30));

        btn_menu_makanan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_menu_makanan.setText("Menu Makanan");
        btn_menu_makanan.setEnabled(false);
        btn_menu_makanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_makananActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("ID Minuman");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Status");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DAFTAR MINUMAN");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 680, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Harga");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txt_nama_minuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_minumanActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama_minuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 419, 38));

        txt_id_minuman.setEnabled(false);
        txt_id_minuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_minumanActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id_minuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 419, 38));
        getContentPane().add(txt_harga_minuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 419, 38));

        combo_status_minuman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        combo_status_minuman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Habis" }));
        getContentPane().add(combo_status_minuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 227, 32));

        tabel_minuman.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_minuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_minumanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_minuman);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 600, 150));

        btn_tambah.setBackground(new java.awt.Color(204, 204, 204));
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.setEnabled(false);
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        btn_hapus.setBackground(new java.awt.Color(204, 204, 204));
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.setEnabled(false);
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        btn_ubah.setBackground(new java.awt.Color(204, 204, 204));
        btn_ubah.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_ubah.setText("Ubah");
        btn_ubah.setEnabled(false);
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("Nama Minuman ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_logout.setText("X");
        btn_logout.setEnabled(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Minuman");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 10, 440, 42));

        btn_menu_transaksi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_menu_transaksi.setText("Menu Transaksi");
        btn_menu_transaksi.setEnabled(false);
        btn_menu_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menu_registrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_registrasiActionPerformed
        cRegistrasi reg = new cRegistrasi();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menu_registrasiActionPerformed

    private void btn_menu_makananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_makananActionPerformed
        cMakanan mkn = new cMakanan();
        mkn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menu_makananActionPerformed

    private void txt_nama_minumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_minumanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_minumanActionPerformed

    private void txt_id_minumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_minumanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_minumanActionPerformed

    private void tabel_minumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_minumanMouseClicked
        txt_id_minuman.setText(model.getValueAt(tabel_minuman.getSelectedRow(), 0).toString());
        txt_nama_minuman.setText(model.getValueAt(tabel_minuman.getSelectedRow(), 1).toString());
        txt_harga_minuman.setText(model.getValueAt(tabel_minuman.getSelectedRow(), 2).toString());

    }//GEN-LAST:event_tabel_minumanMouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        try {
            minuman mnm = new minuman();
            this.stat = k.getCon().prepareStatement("insert into minuman values(?,?,?,?)");
            stat.setInt(1, 0);
            stat.setString(2, mnm.nama_minuman);
            stat.setInt(3, mnm.harga_minuman);
            stat.setString(4, mnm.status_minuman);
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        try {
            this.stat = k.getCon().prepareStatement("delete from minuman where idminuman=?");
            stat.setInt(1, Integer.parseInt(txt_id_minuman.getText()));
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        try {
            minuman mnm = new minuman();
            this.stat = k.getCon().prepareStatement("update minuman set nama_minuman=?,"
                + "harga_minuman=?,status_minuman=? where idminuman=?");
            stat.setString(1, mnm.nama_minuman);
            stat.setInt(2, mnm.harga_minuman);
            stat.setString(3, mnm.status_minuman);
            stat.setInt(4, Integer.parseInt(txt_id_minuman.getText()));
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

    private void btn_menu_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_menu_transaksiActionPerformed

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
            java.util.logging.Logger.getLogger(cMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cMinuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_hapus;
    public javax.swing.JButton btn_logout;
    public javax.swing.JButton btn_menu_makanan;
    public javax.swing.JButton btn_menu_registrasi;
    public javax.swing.JButton btn_menu_transaksi;
    public javax.swing.JButton btn_tambah;
    public javax.swing.JButton btn_ubah;
    private javax.swing.JComboBox<String> combo_status_minuman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel_minuman;
    private javax.swing.JTextField txt_harga_minuman;
    private javax.swing.JTextField txt_id_minuman;
    private javax.swing.JTextField txt_nama_minuman;
    // End of variables declaration//GEN-END:variables
}