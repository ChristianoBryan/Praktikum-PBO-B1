package program;

import model.Mahasiswa;
import service.MySQLMahasiswaService;
import javax.swing.*;
import javax.swing.DefaultListModel;

public class JFrameUtama extends javax.swing.JFrame {
    
    private MySQLMahasiswaService service = new MySQLMahasiswaService();
    private DefaultListModel<String> idListModel;
    private DefaultListModel<String> namaListModel;
    
    public JFrameUtama() {
        initComponents();
        initializeService();
        initializeLists();
    }
    
    private void initializeService() {
        service = new MySQLMahasiswaService();
    }

    private void initializeLists() {
        idListModel = new DefaultListModel<>();
        namaListModel = new DefaultListModel<>();
        jList1.setModel(idListModel);
        jList2.setModel(namaListModel);
    }

    private void refreshData() {
        idListModel.clear();
        namaListModel.clear();
        
        for (Mahasiswa mhs : service.getAll()) {
            idListModel.addElement(String.valueOf(mhs.getId()));
            namaListModel.addElement(mhs.getNama());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        labelID = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        ambilSemuaData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        tambahkanTombol = new javax.swing.JButton();
        idEdit = new javax.swing.JTextField();
        idDelete = new javax.swing.JTextField();
        namaEdit = new javax.swing.JTextField();
        namaDelete = new javax.swing.JTextField();
        tombolEdit = new javax.swing.JButton();
        tombolDelete = new javax.swing.JButton();
        resetIndeks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        labelID.setText("ID");

        labelNama.setText("Nama");

        label1.setText("Kelola Data Mahasiswa");

        ambilSemuaData.setText("Ambil Semua Data");
        ambilSemuaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambilSemuaDataActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        tambahkanTombol.setText("Tambahkan");
        tambahkanTombol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahkanTombolActionPerformed(evt);
            }
        });

        idEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEditActionPerformed(evt);
            }
        });

        idDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDeleteActionPerformed(evt);
            }
        });

        namaEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaEditActionPerformed(evt);
            }
        });

        namaDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaDeleteActionPerformed(evt);
            }
        });

        tombolEdit.setText("Edit");
        tombolEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolEditActionPerformed(evt);
            }
        });

        tombolDelete.setText("Delete");
        tombolDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolDeleteActionPerformed(evt);
            }
        });

        resetIndeks.setText("Reset Indeks");
        resetIndeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetIndeksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ambilSemuaData)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(idDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(idEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namaEdit)
                                    .addComponent(namaDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tombolEdit)
                                    .addComponent(tombolDelete)))
                            .addComponent(resetIndeks, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tambahkanTombol, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNama)
                        .addGap(256, 256, 256)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(labelNama)
                    .addComponent(label1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ambilSemuaData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tambahkanTombol)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tombolEdit))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tombolDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetIndeks)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahkanTombolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahkanTombolActionPerformed
        String nama = jTextField1.getText().trim();
        if (!nama.isEmpty()) {
            Mahasiswa mhs = new Mahasiswa(0, nama);
            service.add(mhs);
            refreshData();
            jTextField1.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong.");
        }
    }//GEN-LAST:event_tambahkanTombolActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String nama = jTextField1.getText().trim();
        if (!nama.isEmpty()) {
            Mahasiswa mhs = new Mahasiswa(0, nama);
            service.add(mhs);
            refreshData();
            jTextField1.setText("");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!", 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ambilSemuaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambilSemuaDataActionPerformed
        refreshData();
    }//GEN-LAST:event_ambilSemuaDataActionPerformed

    private void tombolEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolEditActionPerformed
        try {
            int id = Integer.parseInt(idEdit.getText());
            String newName = namaEdit.getText().trim();
            
            if (!newName.isEmpty()) {
                Mahasiswa mhs = new Mahasiswa(id, newName);
                service.update(mhs);
                refreshData();
                idEdit.setText("");
                namaEdit.setText("");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "ID harus berupa angka!");
        }
    }//GEN-LAST:event_tombolEditActionPerformed

    private void tombolDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolDeleteActionPerformed
        try {
            int id = Integer.parseInt(idDelete.getText().trim());
            service.delete(id);
            refreshData();
            idDelete.setText("");
            namaDelete.setText("");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "ID harus berupa angka!");
        }
    }//GEN-LAST:event_tombolDeleteActionPerformed

    private void resetIndeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetIndeksActionPerformed
        service.indexReset();
        refreshData();
    }//GEN-LAST:event_resetIndeksActionPerformed

    private void namaEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaEditActionPerformed
        tombolEditActionPerformed(evt);
    }//GEN-LAST:event_namaEditActionPerformed

    private void namaDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaDeleteActionPerformed
        tombolDeleteActionPerformed(evt);
    }//GEN-LAST:event_namaDeleteActionPerformed

    private void idEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEditActionPerformed
        namaEdit.requestFocus();
    }//GEN-LAST:event_idEditActionPerformed

    private void idDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idDeleteActionPerformed
        namaDelete.requestFocus();
    }//GEN-LAST:event_idDeleteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambilSemuaData;
    private javax.swing.JTextField idDelete;
    private javax.swing.JTextField idEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelNama;
    private javax.swing.JTextField namaDelete;
    private javax.swing.JTextField namaEdit;
    private javax.swing.JButton resetIndeks;
    private javax.swing.JButton tambahkanTombol;
    private javax.swing.JButton tombolDelete;
    private javax.swing.JButton tombolEdit;
    // End of variables declaration//GEN-END:variables
}
