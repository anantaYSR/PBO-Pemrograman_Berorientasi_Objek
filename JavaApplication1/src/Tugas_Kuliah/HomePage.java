package Tugas_Kuliah;

import Tugas_Kuliah.Account_Connetions.Koneksi;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class HomePage extends javax.swing.JFrame {

    Connection conn = null;

    private void hapus() {
        txtNama.setText(null);
        txtMerek.setText(null);
        txtKapasitas.setText(null);
        CBHarga.setSelectedItem(null);
        buttonGroup1.clearSelection();
    }

    private void tampilkanData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nama");
        model.addColumn("Merek");
        model.addColumn("Kapasitas");
        model.addColumn("Harga");
        model.addColumn("Stok");

        String cari = txtCari.getText();
        try {
            String sql = "SELECT * FROM kulkas WHERE nama LIKE '%" + cari + "%'";
            conn = Koneksi.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            int no = 1;
            while (rs.next()) {
                model.addRow(new Object[]{no++, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }
            TabelKulkas.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public HomePage() {
        initComponents();
        tampilkanData();
        hapus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        CBHarga = new javax.swing.JComboBox<>();
        txtNama = new javax.swing.JTextField();
        RBtersedia = new javax.swing.JRadioButton();
        RBtidaktersedia = new javax.swing.JRadioButton();
        txtMerek = new javax.swing.JTextField();
        txtKapasitas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelKulkas = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        idKulkas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 255));

        CBHarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12.000.000", "5.000.000", "10.000.000", "3.000.000" }));
        CBHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBHargaActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBtersedia);
        RBtersedia.setText("Tersedia");
        RBtersedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtersediaActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBtidaktersedia);
        RBtidaktersedia.setText("Tidak Tersedia");

        TabelKulkas.setBackground(new java.awt.Color(102, 204, 255));
        TabelKulkas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Merek", "Kapasitas", "Harga", "Stok"
            }
        ));
        TabelKulkas.setEnabled(false);
        TabelKulkas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelKulkasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelKulkas);

        btnTambah.setBackground(new java.awt.Color(51, 255, 0));
        btnTambah.setText("Tambah Data");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit Data");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setText("Hapus Data");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setText("Merek");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("Nama ");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("kapasitas");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("Harga");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Stok");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setText("Data Stok Kulkas");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Cari");

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("ID Barang :");

        idKulkas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idKulkas.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(182, 182, 182)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RBtersedia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RBtidaktersedia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addGap(23, 23, 23)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CBHarga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtKapasitas)
                            .addComponent(txtMerek)
                            .addComponent(txtNama))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idKulkas)
                                .addGap(74, 74, 74)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(idKulkas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBtersedia)
                        .addGap(7, 7, 7)
                        .addComponent(RBtidaktersedia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed

        String rbStok = "";
        if (RBtersedia.isSelected()) {
            rbStok = RBtersedia.getText();
        } else if (RBtidaktersedia.isSelected()) {
            rbStok = RBtidaktersedia.getText();
        }
        try {
            conn = Koneksi.getConnection();
            String sql = "INSERT INTO kulkas (nama,merek,kapasitas,harga,stok) VALUES (?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, txtNama.getText());
            pstm.setString(2, txtMerek.getText());
            pstm.setString(3, txtKapasitas.getText());
            pstm.setString(4, CBHarga.getSelectedItem().toString());
            pstm.setString(5, rbStok);
            pstm.execute();
            JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
            tampilkanData();
            hapus();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String rbStok = "";
         if (RBtersedia.isSelected()) {
             rbStok = RBtersedia.getText();
         } else if (RBtidaktersedia.isSelected()) {
             rbStok = RBtidaktersedia.getText();
         }
         try {
             conn = Koneksi.getConnection();
             String sql = "UPDATE kulkas SET nama=?, merek=?, kapasitas=?, harga=?, stok=? WHERE id=?";
             PreparedStatement pstm = conn.prepareStatement(sql);
             pstm.setString(1, txtNama.getText());
             pstm.setString(2, txtMerek.getText());
             pstm.setString(3, txtKapasitas.getText());
             pstm.setString(4, CBHarga.getSelectedItem().toString());
             pstm.setString(5, rbStok);
             pstm.setString(6, idKulkas.getText());
             pstm.executeUpdate();
             JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
             tampilkanData();
             hapus();
         } catch (HeadlessException | SQLException e) {
             JOptionPane.showMessageDialog(this, e.getMessage());
         }

    }//GEN-LAST:event_btnEditActionPerformed

    private void TabelKulkasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelKulkasMouseClicked
        int row = TabelKulkas.rowAtPoint(evt.getPoint());
        String id = TabelKulkas.getValueAt(row, 0).toString();
        idKulkas.setText(id);
        String nama = TabelKulkas.getValueAt(row, 1).toString();
        txtNama.setText(nama);
        String merek = TabelKulkas.getValueAt(row, 2).toString();
        txtMerek.setText(merek);
        String kapasitas = TabelKulkas.getValueAt(row, 3).toString();
        txtKapasitas.setText(kapasitas);
        String harga = TabelKulkas.getValueAt(row, 4).toString();
        CBHarga.setSelectedItem(harga);
        String stok = TabelKulkas.getValueAt(row, 5).toString();
        if (stok.equals("Tersedia")) {
            RBtersedia.setSelected(true);
        } else if (stok.equals("Tidak Tersedia")) {
            RBtidaktersedia.setSelected(true);
        }  
    }//GEN-LAST:event_TabelKulkasMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            String sql = "DELETE FROM kulkas WHERE nama=?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, txtNama.getText());
            pstm.execute();
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
            tampilkanData();
            hapus();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        tampilkanData();
    }//GEN-LAST:event_txtCariKeyReleased

    private void CBHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBHargaActionPerformed

    private void RBtersediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtersediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBtersediaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBHarga;
    private javax.swing.JRadioButton RBtersedia;
    private javax.swing.JRadioButton RBtidaktersedia;
    private javax.swing.JTable TabelKulkas;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel idKulkas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKapasitas;
    private javax.swing.JTextField txtMerek;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
