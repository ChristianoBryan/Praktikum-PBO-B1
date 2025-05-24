import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;

public class SimpleGui extends javax.swing.JFrame {
    
    DefaultListModel<String> dlm;
    List<String> items = new ArrayList<>();
    Set<String> setItems = new HashSet<>();
    Map<String, Integer> mapItems = new HashMap<>();
    String[] datas = {"BUKU", "MEJA", "KURSI", "TAS", "PINTU"};
    
    public SimpleGui() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        this.jListItem.setModel(dlm);
        
        for (String data : datas){
            dlm.addElement(data);
            updateJumDataTersimpan();
            updateJumDataSetTersimpan();
            updateJumDataMapTersimpan();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tombolUpdate = new javax.swing.JButton();
        tombolDelete = new javax.swing.JButton();
        tombolClear = new javax.swing.JButton();
        tombolInsertData = new javax.swing.JButton();
        jumData = new javax.swing.JLabel();
        tombolSave = new javax.swing.JButton();
        saveKeSet = new javax.swing.JButton();
        saveKeMap = new javax.swing.JButton();
        tersimpanSet = new javax.swing.JLabel();
        tersimpanMap = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        insertMap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListItem);

        jLabel1.setText("Nama item :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tombolUpdate.setText("Update");
        tombolUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUpdateActionPerformed(evt);
            }
        });

        tombolDelete.setText("Delete");
        tombolDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolDeleteActionPerformed(evt);
            }
        });

        tombolClear.setText("Clear All");
        tombolClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolClearActionPerformed(evt);
            }
        });

        tombolInsertData.setText("Insert Data ke List");
        tombolInsertData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolInsertDataActionPerformed(evt);
            }
        });

        jumData.setText("jLabel2");

        tombolSave.setText("Save Item ke List");
        tombolSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSaveActionPerformed(evt);
            }
        });

        saveKeSet.setText("Save Item ke Set");
        saveKeSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveKeSetActionPerformed(evt);
            }
        });

        saveKeMap.setText("Save Item ke Map");
        saveKeMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveKeMapActionPerformed(evt);
            }
        });

        tersimpanSet.setText("jLabel2");

        tersimpanMap.setText("jLabel3");

        jButton2.setText("Insert Data ke Set");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        insertMap.setText("Insert Data ke Map");
        insertMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertMapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(tombolUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(saveKeMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(insertMap, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tersimpanSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tombolDelete)
                                        .addGap(18, 18, 18)
                                        .addComponent(tombolClear))
                                    .addComponent(jumData, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tersimpanMap, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tombolSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tombolInsertData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(saveKeSet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(tombolUpdate)
                    .addComponent(tombolDelete)
                    .addComponent(tombolClear))
                .addGap(18, 18, 18)
                .addComponent(tombolInsertData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolSave)
                    .addComponent(jumData))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveKeSet)
                    .addComponent(tersimpanSet))
                .addGap(18, 18, 18)
                .addComponent(insertMap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveKeMap)
                    .addComponent(tersimpanMap))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addItem(String namaItem){
        dlm.addElement(namaItem);
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String namaItem = jTextField1.getText();
        if (!namaItem.isEmpty()) {
            addItem(namaItem);
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tombolUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUpdateActionPerformed
        int index = jListItem.getSelectedIndex();
        String selected = jTextField1.getText();
        dlm.setElementAt(selected, index);
        jTextField1.setText("");
    }//GEN-LAST:event_tombolUpdateActionPerformed

    private void tombolDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolDeleteActionPerformed
        int index = jListItem.getSelectedIndex();
        dlm.removeElementAt(index);
        jTextField1.setText("");
    }//GEN-LAST:event_tombolDeleteActionPerformed

    private void tombolClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolClearActionPerformed
        dlm.clear();
    }//GEN-LAST:event_tombolClearActionPerformed

    private void tombolInsertDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolInsertDataActionPerformed
        String[] items = {"buku", "meja", "kursi", "tas", "pintu"};
        for (String item : items) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_tombolInsertDataActionPerformed

    private void tombolSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSaveActionPerformed
        if (!items.isEmpty()) {
            items.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++) {
            items.add(dlm.getElementAt(i));
        }
        updateJumDataTersimpan();
    }//GEN-LAST:event_tombolSaveActionPerformed

    private void saveKeSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveKeSetActionPerformed
        if (!setItems.isEmpty()) {
            setItems.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++) {
            setItems.add(dlm.getElementAt(i));
        }
        updateJumDataSetTersimpan();
    }//GEN-LAST:event_saveKeSetActionPerformed

    private void saveKeMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveKeMapActionPerformed
        if (!mapItems.isEmpty()) {
            mapItems.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++) {
            mapItems.put(dlm.getElementAt(i),i);
        }
        updateJumDataMapTersimpan();
    }//GEN-LAST:event_saveKeMapActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String[] setItems = {"buku", "meja", "kursi", "tas", "pintu"};
        for (String item : setItems) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void insertMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertMapActionPerformed
        String[] mapItems = {"buku", "meja", "kursi", "tas", "pintu"};
        for (String item : mapItems) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_insertMapActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertMap;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jumData;
    private javax.swing.JButton saveKeMap;
    private javax.swing.JButton saveKeSet;
    private javax.swing.JLabel tersimpanMap;
    private javax.swing.JLabel tersimpanSet;
    private javax.swing.JButton tombolClear;
    private javax.swing.JButton tombolDelete;
    private javax.swing.JButton tombolInsertData;
    private javax.swing.JButton tombolSave;
    private javax.swing.JButton tombolUpdate;
    // End of variables declaration//GEN-END:variables

    private void updateJumDataTersimpan() {
        jumData.setText("Data List Tersimpan = " + items.size());
    }
    
    private void updateJumDataSetTersimpan() {
        tersimpanSet.setText("Data Set Tersimpan = " + setItems.size());
    }
    
    private void updateJumDataMapTersimpan() {
        tersimpanMap.setText("Data Map Tersimpan = " + mapItems.size());
    }
}
