/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tryfp;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author REINAKIKY
 */
public class NonPortable extends javax.swing.JFrame {

    LinkedList daftarMatkul = new LinkedList();
    LinkedList daftarPokokBahasan = new LinkedList();
    LinkedList<Pertanyaan> listSoal = new LinkedList<Pertanyaan>();
    LinkedList<Pertanyaan> soalTerfilter;
    int btnOKhandler;
    private static int index = 0;
    public Connection conn;
    public Statement cn;
    public PreparedStatement pstmt;
    LinkedList<Pertanyaan> datapenuh1 = new LinkedList<Pertanyaan>();

    public NonPortable(int myIndex) {
        initComponents();
        cbMatkul();
        cbPokbas();
        //listSoal();
    }

    public void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "");
            cn = (Statement) conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database tdk bs Diakses");
            System.out.println(e.getMessage());
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

        jDialogMKPB = new javax.swing.JDialog();
        btnOK = new javax.swing.JButton();
        tfMKPB = new javax.swing.JTextField();
        lblMKPB = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelBuatSoal = new javax.swing.JPanel();
        jPanelMatkulPokokBahasan = new javax.swing.JPanel();
        cbMatkul = new javax.swing.JComboBox();
        jPanelMatkulPokokBahasan1 = new javax.swing.JPanel();
        cbPokbas = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        bImport = new javax.swing.JButton();
        bExport = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaTampil = new javax.swing.JTextArea();
        bListSoal = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmiFileBaru = new javax.swing.JMenuItem();
        jmiFileBuka = new javax.swing.JMenuItem();
        jmiFileSimpan = new javax.swing.JMenuItem();
        jmiFileKeluar = new javax.swing.JMenuItem();
        jmEdit = new javax.swing.JMenu();
        jmHelp = new javax.swing.JMenu();
        jmiHelpUserGuide = new javax.swing.JMenuItem();
        jmiHelpTentang = new javax.swing.JMenuItem();

        jDialogMKPB.setMinimumSize(new java.awt.Dimension(400, 150));

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        tfMKPB.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMKPB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMKPB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMKPB.setText("Nama Matakuliah atau Pokok Bahasan");

        javax.swing.GroupLayout jDialogMKPBLayout = new javax.swing.GroupLayout(jDialogMKPB.getContentPane());
        jDialogMKPB.getContentPane().setLayout(jDialogMKPBLayout);
        jDialogMKPBLayout.setHorizontalGroup(
            jDialogMKPBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogMKPBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogMKPBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfMKPB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMKPB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDialogMKPBLayout.setVerticalGroup(
            jDialogMKPBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogMKPBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMKPB, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMKPB, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setToolTipText("Buat Soal");
        jTabbedPane1.setName("Buat Soal"); // NOI18N

        jPanelMatkulPokokBahasan.setBorder(javax.swing.BorderFactory.createTitledBorder("List Seluruh Mata Kuliah"));
        jPanelMatkulPokokBahasan.setPreferredSize(new java.awt.Dimension(220, 220));

        cbMatkul.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None" }));
        cbMatkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMatkulMouseClicked(evt);
            }
        });
        cbMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMatkulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMatkulPokokBahasanLayout = new javax.swing.GroupLayout(jPanelMatkulPokokBahasan);
        jPanelMatkulPokokBahasan.setLayout(jPanelMatkulPokokBahasanLayout);
        jPanelMatkulPokokBahasanLayout.setHorizontalGroup(
            jPanelMatkulPokokBahasanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMatkulPokokBahasanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbMatkul, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMatkulPokokBahasanLayout.setVerticalGroup(
            jPanelMatkulPokokBahasanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMatkulPokokBahasanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanelMatkulPokokBahasan1.setBorder(javax.swing.BorderFactory.createTitledBorder("List Seluruh Pokok Bahasan"));
        jPanelMatkulPokokBahasan1.setPreferredSize(new java.awt.Dimension(220, 220));

        cbPokbas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None" }));
        cbPokbas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPokbasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMatkulPokokBahasan1Layout = new javax.swing.GroupLayout(jPanelMatkulPokokBahasan1);
        jPanelMatkulPokokBahasan1.setLayout(jPanelMatkulPokokBahasan1Layout);
        jPanelMatkulPokokBahasan1Layout.setHorizontalGroup(
            jPanelMatkulPokokBahasan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMatkulPokokBahasan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbPokbas, 0, 283, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMatkulPokokBahasan1Layout.setVerticalGroup(
            jPanelMatkulPokokBahasan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMatkulPokokBahasan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbPokbas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Import & Export"));

        bImport.setText("Import");
        bImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImportActionPerformed(evt);
            }
        });

        bExport.setText("Export");
        bExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bExport, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(bImport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bImport)
                .addGap(18, 18, 18)
                .addComponent(bExport)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("List Soal Berdasarkan Mata Kuliah"));

        AreaTampil.setColumns(20);
        AreaTampil.setRows(5);
        jScrollPane3.setViewportView(AreaTampil);

        bListSoal.setText("Tampilkan List Soal");
        bListSoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListSoalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(bListSoal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bListSoal)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanelBuatSoalLayout = new javax.swing.GroupLayout(jPanelBuatSoal);
        jPanelBuatSoal.setLayout(jPanelBuatSoalLayout);
        jPanelBuatSoalLayout.setHorizontalGroup(
            jPanelBuatSoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBuatSoalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuatSoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelMatkulPokokBahasan, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(jPanelMatkulPokokBahasan1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBuatSoalLayout.setVerticalGroup(
            jPanelBuatSoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuatSoalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuatSoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuatSoalLayout.createSequentialGroup()
                        .addComponent(jPanelMatkulPokokBahasan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMatkulPokokBahasan1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buat Soal", jPanelBuatSoal);

        jmFile.setText("File");

        jmiFileBaru.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmiFileBaru.setText("Baru..");
        jmiFileBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFileBaruActionPerformed(evt);
            }
        });
        jmFile.add(jmiFileBaru);

        jmiFileBuka.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jmiFileBuka.setText("Buka..");
        jmiFileBuka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFileBukaActionPerformed(evt);
            }
        });
        jmFile.add(jmiFileBuka);

        jmiFileSimpan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jmiFileSimpan.setText("Simpan..");
        jmiFileSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFileSimpanActionPerformed(evt);
            }
        });
        jmFile.add(jmiFileSimpan);

        jmiFileKeluar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmiFileKeluar.setText("Keluar");
        jmiFileKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFileKeluarActionPerformed(evt);
            }
        });
        jmFile.add(jmiFileKeluar);

        jMenuBar1.add(jmFile);

        jmEdit.setText("Edit");
        jMenuBar1.add(jmEdit);

        jmHelp.setText("Help");

        jmiHelpUserGuide.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiHelpUserGuide.setText("User Guide");
        jmHelp.add(jmiHelpUserGuide);

        jmiHelpTentang.setText("Tentang Aplikasi");
        jmHelp.add(jmiHelpTentang);

        jMenuBar1.add(jmHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
    }//GEN-LAST:event_btnOKActionPerformed

    private void jmiFileBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFileBaruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiFileBaruActionPerformed

    private void jmiFileBukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFileBukaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiFileBukaActionPerformed

    private void jmiFileSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFileSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiFileSimpanActionPerformed

    private void cbMatkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMatkulMouseClicked

    }//GEN-LAST:event_cbMatkulMouseClicked

    private void cbMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMatkulActionPerformed
    }//GEN-LAST:event_cbMatkulActionPerformed

    public void cbMatkul() {
        try {
            koneksi();
            String query = "SELECT * FROM matkul";
            ResultSet rs = cn.executeQuery(query);

            while (rs.next()) {
                cbMatkul.addItem(rs.getString("matkul"));
            }

            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();

        } catch (SQLException e) {
        }
    }

    private void bImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImportActionPerformed
        try {
            String temporaryPath = searchOpenPath();
            if (temporaryPath.equalsIgnoreCase("")) {
                return;
            }
            try {
                currentPlainFile = new File(temporaryPath);
            } catch (Exception e) {
            }

            String path = temporaryPath;

            koneksi();
            String sql = "LOAD DATA LOCAL INFILE '" + path + "' INTO TABLE banksoal "
                    + " FIELDS TERMINATED BY \',\' ENCLOSED BY \'\"'"
                    + " LINES TERMINATED BY '\r\n'";
            cn.executeUpdate(sql);
            conn.close();
            JOptionPane.showMessageDialog(null, "File berhasil di Import!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File gagal di Import!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bImportActionPerformed

    private void bExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExportActionPerformed
//        try{
//            koneksi();
//            String sql = "SELECT matkul, pokbas, soal, A, B, C, D, E "
//                    + "INTO OUTFILE 'bismillah.txt' "
//                    + "FIELDS TERMINATED BY ',' ENCLOSED BY '|' LINES TERMINATED BY '\r\n' "
//                    + "FROM banksoal";
//            cn.executeUpdate(sql);
//            JOptionPane.showMessageDialog(null, "File berhasil di Import!");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Gagal");
//            System.out.println(e.getMessage());
//        }    
        String textcbMatkul = "";
        textcbMatkul = (String) cbMatkul.getSelectedItem();
        
        if (textcbMatkul.equals("None")) {
            JOptionPane.showMessageDialog(null, "Pilih Mata Kuliah yang ingin di Export!");
        } else {
            JFileChooser chooser = new JFileChooser();
            chooser.showSaveDialog(this);
            File f = chooser.getSelectedFile();
            String filename3 = f.getAbsolutePath();

            try {
                FileWriter writer;
                writer = new FileWriter(filename3 + ".txt");
                BufferedWriter bw = new BufferedWriter(writer);
                AreaTampil.write(bw);
                bw.close();
                AreaTampil.setText("");
                AreaTampil.requestFocus();

                JOptionPane.showMessageDialog(null, "Penyimpanan Berhasil!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Penyimpanan Gagal!");
            }
        }
    }//GEN-LAST:event_bExportActionPerformed

    private void cbPokbasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPokbasActionPerformed
    }//GEN-LAST:event_cbPokbasActionPerformed

    private void bListSoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListSoalActionPerformed

        StringBuffer strBfr = new StringBuffer();

        String textcbMatkul = "";
        textcbMatkul = (String) cbMatkul.getSelectedItem();
        /*
         * memasukan nilai text1 ke dalam String hasil dari combobox harus di
         * convert ke string dengan kode (String), karena tipe dari combobox itu
         * adalah object (bisa string, integer, double, dll)
         *
         */
        //jika stringnya equals kosong -&gt;(" ") artinya kosong
        if (textcbMatkul.equals("None")) {
            //langsung kasih dialog
            JOptionPane.showMessageDialog(null, "Silahkan pilih Mata Kuliah terlebih dahulu!");
        } //jika tidak maka langsung set area_hasil dengan string yang diambil
        else {
            try {
                koneksi();
                ResultSet rss = null;
                String sql = "select distinct matkul, pokbas, soal, a, b, c, d, e from banksoal where matkul='" + textcbMatkul + "'";
                PreparedStatement ps = conn.prepareStatement(sql);
                rss = ps.executeQuery();

                int a = 1;
                while (rss.next()) {
                    strBfr.append("-- Pokok Bahasan : " + rss.getString("pokbas") + " --\n");
                    strBfr.append(a + " . " + rss.getString("soal") + "\n");
                    strBfr.append("\tA. " + rss.getString("a") + "\n");
                    strBfr.append("\tB . " + rss.getString("b") + "\n");
                    strBfr.append("\tC. " + rss.getString("c") + "\n");
                    strBfr.append("\tD. " + rss.getString("d") + "\n");
                    strBfr.append("\tE. " + rss.getString("e") + "\n");
                    strBfr.append("\n");
                    a++;
                }

                AreaTampil.setText(strBfr.toString());

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }

    }//GEN-LAST:event_bListSoalActionPerformed

    private void jmiFileKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFileKeluarActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jmiFileKeluarActionPerformed

    public void cbPokbas() {
        try {
            koneksi();
            String query = "SELECT distinct pokbas FROM pokbas";
            ResultSet rs = cn.executeQuery(query);

            while (rs.next()) {
                cbPokbas.addItem(rs.getString("pokbas"));
            }

            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();

        } catch (SQLException e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NonPortable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NonPortable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NonPortable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NonPortable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NonPortable(0).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTampil;
    private javax.swing.JButton bExport;
    private javax.swing.JButton bImport;
    private javax.swing.JButton bListSoal;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox cbMatkul;
    private javax.swing.JComboBox cbPokbas;
    private javax.swing.JDialog jDialogMKPB;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBuatSoal;
    private javax.swing.JPanel jPanelMatkulPokokBahasan;
    private javax.swing.JPanel jPanelMatkulPokokBahasan1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenu jmEdit;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenu jmHelp;
    private javax.swing.JMenuItem jmiFileBaru;
    private javax.swing.JMenuItem jmiFileBuka;
    private javax.swing.JMenuItem jmiFileKeluar;
    private javax.swing.JMenuItem jmiFileSimpan;
    private javax.swing.JMenuItem jmiHelpTentang;
    private javax.swing.JMenuItem jmiHelpUserGuide;
    private javax.swing.JLabel lblMKPB;
    private javax.swing.JTextField tfMKPB;
    // End of variables declaration//GEN-END:variables
    private JFileChooser jfc = new JFileChooser();
    private JFrame jf = new JFrame();
    private FileNameExtensionFilter textfilter = new FileNameExtensionFilter("Text", "txt", "TXT");
    private File currentCipherFile = new File(System.getProperty("user.dir"));
    private File currentPlainFile = new File(System.getProperty("user.dir"));

    private String searchOpenPath() {
        jfc.addChoosableFileFilter(textfilter);
        if (jfc.showOpenDialog(jf) == JFileChooser.APPROVE_OPTION) {
            return jfc.getSelectedFile().getPath();
        }
        return "";
    }
        
}