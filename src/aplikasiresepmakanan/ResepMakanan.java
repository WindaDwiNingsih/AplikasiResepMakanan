
package aplikasiresepmakanan;
import controller.ResepController;
import java.io.*;
import model.Resep;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.logging.Level;

//import javax.swing.JFileChooser;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class ResepMakanan extends javax.swing.JFrame {

    private DefaultTableModel model;
    private ResepController controller;
    /**
     * Creates new form ResepMakanan
     */
    public ResepMakanan() {
        initComponents();
    
        controller = new ResepController();
        model = new DefaultTableModel(new String[]

        {"No", "Nama", "Bahan", "Kategori", "Cara Memasak"}, 0);

        tableResep.setModel(model);
        loadData();
    }
//    String id;
//    Connection conn = Koneksi.getKoneksi();
//    PreparedStatement pst;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNamaMakanan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cara = new javax.swing.JTextArea();
        cmbKategori = new javax.swing.JComboBox<>();
        txtBahan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableResep = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        Eksport = new javax.swing.JButton();
        Import = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Aplikasi Resep Makanan");

        jLabel2.setText("Nama Makanan");

        jLabel3.setText("Kategori");

        jLabel4.setText("Bahan");

        jLabel5.setText("Cara Memasak");

        cara.setColumns(20);
        cara.setRows(5);
        jScrollPane1.setViewportView(cara);

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori", "Makanan Utama", "Cemilan ", "Minuman" }));

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Keluar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tableResep.setModel(new javax.swing.table.DefaultTableModel(
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
        tableResep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableResepMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableResep);

        jLabel6.setText("Cari Resep Berdasarkan Nama ");

        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });

        Eksport.setText("Ekspor");
        Eksport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EksportActionPerformed(evt);
            }
        });

        Import.setText("Import");
        Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNamaMakanan)
                                            .addComponent(cmbKategori, 0, 234, Short.MAX_VALUE)
                                            .addComponent(txtBahan))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(16, 16, 16)
                                        .addComponent(jButton2)
                                        .addGap(12, 12, 12)
                                        .addComponent(jButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                        .addComponent(Eksport))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(Import))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamaMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtBahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(Eksport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Import))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addResep();
//    try {
//            if(txtNamaMakanan.getText().isEmpty()||cmbKategori.getSelectedItem().toString().isEmpty()||txtBahan.getText().isEmpty()||cara.getText().isEmpty()){
//                JOptionPane.showMessageDialog(null, "Data resep belum diisi","Gagal ditambah data", 2);
//            }else{
//            String queryTambah = "insert into resep_makanan values (null,?,?,?,?)";
//            pst = conn.prepareStatement(queryTambah);
//            pst.setString(1, txtNamaMakanan.getText());
//            pst.setString(2, cmbKategori.getSelectedItem().toString());
//            pst.setString(3, txtBahan.getText());
//            pst.setString(4, cara.getText());
//            pst.executeUpdate();// TODO add your handling code here:
//            loadData();
//            bersih();
//            JOptionPane.showMessageDialog(null,"Data Berhasil ditambah", "Sukses", 1);}
//        } catch (SQLException ex) {
//            Logger.getLogger(ResepMakanan.class.getName()).log(Level.SEVERE, null, ex);
//        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        editResep();
//        try {
//            if(txtNamaMakanan.getText().isEmpty()||cmbKategori.getSelectedItem().toString().isEmpty()||txtBahan.getText().isEmpty()||cara.getText().isEmpty()){
//                JOptionPane.showMessageDialog(null, "Data Resep belum diisi","Gagal ditambah data", 2);
//            }else{
//            String queryTambah = "update resep_makanan set nama_makanan=?, Kategori=?, bahan=?, cara_masak=? where id=?";
//            pst = conn.prepareStatement(queryTambah);
//            pst.setString(1, txtNamaMakanan.getText());
//            pst.setString(2, cmbKategori.getSelectedItem().toString());
//            pst.setString(3, txtBahan.getText());
//            pst.setString(4, cara.getText());
//            pst.setString(5, id);
//            pst.executeUpdate();// TODO add your handling code here:
//            loadData();
//            bersih();
//            JOptionPane.showMessageDialog(null,"Data Berhasil diubah", "Sukses", 1);}
//        } catch (SQLException ex) {
//            Logger.getLogger(ResepMakanan.class.getName()).log(Level.SEVERE, null, ex);
//        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        deleteResep();
//        try {
//            if(txtNamaMakanan.getText().isEmpty()||cmbKategori.getSelectedItem().toString().isEmpty()||txtBahan.getText().isEmpty()||cara.getText().isEmpty()){
//                JOptionPane.showMessageDialog(null, "Data Resep belum diisi","Gagal ditambah data", 2);
//            }else{
//                int konfirmasi = JOptionPane.showConfirmDialog(null, "Hapus data Resep ini?", "Konfirmasi Hapus",0);
//                if(konfirmasi==0){
//            String queryTambah = "delete from resep_makanan where id=?";
//            pst = conn.prepareStatement(queryTambah);
//                    
//            pst.setString(1, id);
//            pst.executeUpdate();// TODO add your handling code here:
//            loadData();
//            bersih();
//            JOptionPane.showMessageDialog(null,"Data Resep Berhasil dihapus", "Sukses", 1);}}
//        } catch (SQLException ex) {
//            Logger.getLogger(ResepMakanan.class.getName()).log(Level.SEVERE, null, ex);
//        } 

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableResepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableResepMouseClicked

        int selectedRow = tableResep.getSelectedRow();
        if (selectedRow != -1) {
        populateInputFields(selectedRow);
}
//        int row = tableResep.getSelectedRow();
//       id = tableResep.getValueAt(row, 0).toString();
//        txtNamaMakanan.setText(tableResep.getValueAt(row, 1).toString());
//        cmbKategori.setSelectedItem(tableResep.getValueAt(row, 2).toString());
//        txtBahan.setText(tableResep.getValueAt(row, 3).toString());
//        cara.setText(tableResep.getValueAt(row, 4).toString());
//               // TODO add your handling code here:
    }//GEN-LAST:event_tableResepMouseClicked

    private void EksportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EksportActionPerformed
        exportToCSV();
        
//    try {
//        JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setDialogTitle("Save as TXT File");
//        int userSelection = fileChooser.showSaveDialog(null);
//
//        if (userSelection == JFileChooser.APPROVE_OPTION) {
//            File file = fileChooser.getSelectedFile();
//            if (!file.getName().endsWith(".txt")) {
//                file = new File(file.getAbsolutePath() + ".txt");
//            }
//
//            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//
//            // Tulis header
//            writer.write("ID\tNama Makanan\tKategori\tBahan\tCara Memasak\n");
//
//            // Tulis data dari tabel
//            for (int i = 0; i < tableResep.getRowCount(); i++) {
//                for (int j = 0; j < tableResep.getColumnCount(); j++) {
//                    writer.write(tableResep.getValueAt(i, j).toString());
//                    if (j < tableResep.getColumnCount() - 1) {
//                        writer.write("\t");
//                    }
//                }
//                writer.newLine();
//            }
//
//            writer.close();
//            JOptionPane.showMessageDialog(null, "Data berhasil diekspor!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
//        }
//    } catch (IOException ex) {
//        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengekspor data!", "Error", JOptionPane.ERROR_MESSAGE);
//    }    // TODO add your handling code here:
    }//GEN-LAST:event_EksportActionPerformed

    private void ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportActionPerformed
       importFromCSV();
//        try {
//        JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setDialogTitle("Open TXT File");
//        int userSelection = fileChooser.showOpenDialog(null);
//
//        if (userSelection == JFileChooser.APPROVE_OPTION) {
//            File file = fileChooser.getSelectedFile();
//            BufferedReader reader = new BufferedReader(new FileReader(file));
//            String line;
//
//            // Skip header line
//            reader.readLine();
//
//            DefaultTableModel dtm = (DefaultTableModel) tableResep.getModel();
//            while ((line = reader.readLine()) != null) {
//                String[] data = line.split("\t"); // Memisahkan kolom dengan tab
//                dtm.addRow(data);
//            }
//            reader.close();
//            JOptionPane.showMessageDialog(null, "Data berhasil diimpor!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
//        }
//    } catch (IOException ex) {
//        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengimpor data!", "Error", JOptionPane.ERROR_MESSAGE);
//    }        // TODO add your handling code here:
    }//GEN-LAST:event_ImportActionPerformed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        searchResep();        
    }//GEN-LAST:event_cariKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ResepMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResepMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResepMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResepMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResepMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eksport;
    private javax.swing.JButton Import;
    private javax.swing.JTextArea cara;
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableResep;
    private javax.swing.JTextField txtBahan;
    private javax.swing.JTextField txtNamaMakanan;
    // End of variables declaration//GEN-END:variables

private void loadData() {
    try {
        model.setRowCount(0);
        List<Resep> reseps = controller.getAllReseps();
        
        int rowNumber = 1;
        for (Resep resep : reseps) {
            model.addRow(new Object[]{
                rowNumber++,
                resep.getNama(),
                resep.getBahan(),
                resep.getKategori(),
                resep.getMasak()
            });
        }
    } catch (SQLException e) {
    showError(e.getMessage());
    }
}
private void showError(String message) {
JOptionPane.showMessageDialog(this, message, "Error",
JOptionPane.ERROR_MESSAGE);
    
}
private void addResep() {
    
    String nama = txtNamaMakanan.getText().trim();
    String bahan = txtBahan.getText().trim();
    String kategori = (String) cmbKategori.getSelectedItem();
    String masak = cara.getText().trim();
    
    try {controller.addResep(nama, bahan, kategori, masak);
        loadData();
        JOptionPane.showMessageDialog(this, "Resep berhasil ditambahkan!");
        clearInputFields();
    } catch (SQLException ex) {
        showError("Gagal menambahkan resep: " + ex.getMessage());
    }
}

private void editResep() {
    int selectedRow = tableResep.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih resep yang ingin diperbarui.", "Kesalahan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    int id = (int) model.getValueAt(selectedRow, 0);
    String nama = txtNamaMakanan.getText().trim();
    String bahan = txtBahan.getText().trim();
    String kategori = (String) cmbKategori.getSelectedItem().toString();
    String masak = cara.getText().trim();
    try {
        controller.updateResep(id, nama, bahan, kategori, masak);
    loadData();
    JOptionPane.showMessageDialog(this, "Resep berhasil diperbarui!");
    clearInputFields(); 
    } catch (SQLException ex) {
        showError("Gagal memperbarui resep: " + ex.getMessage());
    }
}
private void populateInputFields(int selectedRow) {
    // Ambil data dari JTable
    String nama = model.getValueAt(selectedRow, 1).toString();
    String bahan = model.getValueAt(selectedRow, 2).toString();
    String kategori = model.getValueAt(selectedRow, 3).toString();
    String masak = model.getValueAt(selectedRow, 4).toString();
    // Set data ke komponen input
    txtNamaMakanan.setText(nama);
    txtBahan.setText(bahan);
    cmbKategori.setSelectedItem(kategori);
    cara.setText(masak);
}

private void deleteResep() {
    int selectedRow = tableResep.getSelectedRow();
    if (selectedRow != -1) {
        int id = (int) model.getValueAt(selectedRow, 0);
        try {
            controller.deleteResep(id);
            loadData();
            JOptionPane.showMessageDialog(this, "Resep berhasil dihapus!");
            clearInputFields();
        } catch (SQLException e) {
                showError(e.getMessage());
        }
    }
}

private void searchResep() {
    String keyword = cari.getText().trim();
    if (!keyword.isEmpty()) {
        try {
            List<Resep> rsps = controller.searchReseps(keyword);
            model.setRowCount(0); // Bersihkan tabel
            for (Resep rsp : rsps) {
                model.addRow(new Object[]{
                    rsp.getId(),
                    rsp.getNama(),
                    rsp.getBahan(),
                    rsp.getKategori(),
                    rsp.getMasak()
                });
            }
            if (rsps.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tidak ada resep ditemukan.");
            }
        } catch (SQLException ex) {
            showError(ex.getMessage());
        }
    } else {
        loadData();
    }
}

private void exportToCSV() {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Simpan File CSV");
    int userSelection = fileChooser.showSaveDialog(this);
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();
    // Tambahkan ekstensi .csv jika pengguna tidak menambahkannya
        if (!fileToSave.getAbsolutePath().endsWith(".csv")) {
            fileToSave = new File(fileToSave.getAbsolutePath() + ".csv");
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))) {
            writer.write("ID,Nama,Bahan,Kategori,Cara Memasak\n"); // Header CSV
            for (int i = 0; i < model.getRowCount(); i++) {
                writer.write(
                    model.getValueAt(i, 0) + "," +
                    model.getValueAt(i, 1) + "," +
                    model.getValueAt(i, 2) + "," +
                    model.getValueAt(i, 3) + "\n"+
                    model.getValueAt(i, 4) + "\n"
                );
            }
            JOptionPane.showMessageDialog(this, "Data berhasil diekspor ke " + fileToSave.getAbsolutePath());
        } catch (IOException ex) {
            showError("Gagal menulis file: " + ex.getMessage());
        }
    }
}

private void importFromCSV() {
    showCSVGuide();
    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Apakah Anda yakin file CSV yang dipilih sudah sesuai dengan format?",
        "Konfirmasi Impor CSV",
        JOptionPane.YES_NO_OPTION
    );
        if (confirm == JOptionPane.YES_OPTION) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Pilih File CSV");
            int userSelection = fileChooser.showOpenDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToOpen = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new
                FileReader(fileToOpen))) {

                String line = reader.readLine(); // Baca header
                if (!validateCSVHeader(line)) {
                    JOptionPane.showMessageDialog(this, "Format header CSV tidak valid. Pastikan header adalah: ID,Nama,Bahan,Kategori",
                    "Kesalahan CSV", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int rowCount = 0;
                int errorCount = 0;
                int duplicateCount = 0;
                StringBuilder errorLog = new StringBuilder("Baris dengan kesalahan:\n");
                while ((line = reader.readLine()) != null) {
                    rowCount++;
                    String[] data = line.split(",");
                    if (data.length != 5) {
                        errorCount++;
                        errorLog.append("Baris ").append(rowCount +1).append(": Format kolom tidak sesuai.\n");
                    continue;
                }
                String nama = data[1].trim();
                String nomorTelepon = data[2].trim();
                String kategori = data[3].trim();
                String masak = data[3].trim();
                if (nama.isEmpty() || nomorTelepon.isEmpty()) {
                    errorCount++;
                    errorLog.append("Baris ").append(rowCount +
                    1).append(": Nama atau Bahan kosong.\n");
                continue;
                }

                try {
                    controller.addResep(nama, nomorTelepon,
                    kategori, masak);
                } catch (SQLException ex) {
                    errorCount++;
                    errorLog.append("Baris ").append(rowCount +
                    1).append(": Gagal menyimpan ke database -").append(ex.getMessage()).append("\n");
                }
                }
                loadData();
                if (errorCount > 0 || duplicateCount > 0) {
                    errorLog.append("\nTotal baris dengan kesalahan:").append(errorCount).append("\n");errorLog.append("Total baris duplikat:").append(duplicateCount).append("\n");
                    JOptionPane.showMessageDialog(this,
                    errorLog.toString(), "Kesalahan Impor", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Semua data berhasil diimpor.");
                }
                } catch (IOException ex) {
                    showError("Gagal membaca file: " + ex.getMessage());
                }
        }
    }
}
private void showCSVGuide() {
    String guideMessage = "Format CSV untuk impor data:\n" +
    "- Header wajib: ID, Nama, Bahan, Kategori, Cara Memasak\n" +
    "- ID dapat kosong (akan diisi otomatis)\n" +
    "- Nama dan Bahan wajib diisi\n" +
    "- Contoh isi file CSV:\n" +
    " 1, Ayam, Ayamdan bumbu, Makanan Utama,marinasi ayam\n" +
    
    "Pastikan file CSV sesuai format sebelum melakukan impor.";
    JOptionPane.showMessageDialog(this, guideMessage, "Panduan Format CSV", JOptionPane.INFORMATION_MESSAGE);
    }
private boolean validateCSVHeader(String header) {
    return header != null &&
    header.trim().equalsIgnoreCase("ID,Nama,Bahan,Kategori, Cara memasak");
}
private void clearInputFields() {
        txtNamaMakanan.setText("");
        txtBahan.setText("");
        cmbKategori.setSelectedIndex(0);
        cara.setText("");
    }
}
