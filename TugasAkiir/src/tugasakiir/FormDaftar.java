
package tugasakiir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FormDaftar extends javax.swing.JFrame {

    private String Tanggal;
        public String FisKim="";
        public String Biologi="";

    public FormDaftar() {
        initComponents();
        
    }
    
     public boolean isCellEditable(int rowIndex, int columnIndex) { 
         return false; 
     } 
private void clear(){
    noIdentitas.setText("");
    namaPendaftar.setText("");
    telponPendaftar.setText("");
    alamatPendaftar.setText("");
    kodSam.setText("");
    wktAmbil.setText("");
    wktTerima.setText("");
    JenisSam.setSelectedIndex(0);
    KodLab.setSelectedIndex(0);
    
    txttglDaftar.setDate(null);
    
        boxBau.setSelected(false);
        boxTDS.setSelected(false);
        boxKekeruhan.setSelected(false);
        boxRasa.setSelected(false);
        boxSuhu.setSelected(false);
        boxWarna.setSelected(false);
        boxNitrat.setSelected(false);
        boxNitrit.setSelected(false);
        boxNatrium.setSelected(false);
        boxSianida.setSelected(false);
        boxAmmonia.setSelected(false);
        boxBesi.setSelected(false);
        boxKesadahan.setSelected(false);
        boxDetergen.setSelected(false);
        boxHidrogen.setSelected(false);
        boxPH.setSelected(false);
        boxSulfat.setSelected(false);
        boxSO2.setSelected(false);
        boxCO.setSelected(false);
        boxOzon.setSelected(false);
        boxPB.setSelected(false);
        boxKelembapan.setSelected(false);
        boxKebisingan.setSelected(false);
        boxH2S.setSelected(false);
        boxChlorin.setSelected(false);
        
        boxTotalecol.setSelected(false);
        boxJumlahecol.setSelected(false);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        noIdentitas = new javax.swing.JTextField();
        namaPendaftar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatPendaftar = new javax.swing.JTextArea();
        telponPendaftar = new javax.swing.JTextField();
        txttglDaftar = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnCencel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kodSam = new javax.swing.JTextField();
        JenisSam = new javax.swing.JComboBox();
        KodLab = new javax.swing.JComboBox();
        wktAmbil = new javax.swing.JTextField();
        wktTerima = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        boxBau = new javax.swing.JCheckBox();
        boxKekeruhan = new javax.swing.JCheckBox();
        boxRasa = new javax.swing.JCheckBox();
        boxSuhu = new javax.swing.JCheckBox();
        boxWarna = new javax.swing.JCheckBox();
        boxNitrat = new javax.swing.JCheckBox();
        boxNitrit = new javax.swing.JCheckBox();
        boxNatrium = new javax.swing.JCheckBox();
        boxSianida = new javax.swing.JCheckBox();
        boxAmmonia = new javax.swing.JCheckBox();
        boxBesi = new javax.swing.JCheckBox();
        boxKesadahan = new javax.swing.JCheckBox();
        boxDetergen = new javax.swing.JCheckBox();
        boxHidrogen = new javax.swing.JCheckBox();
        boxPH = new javax.swing.JCheckBox();
        boxSulfat = new javax.swing.JCheckBox();
        boxSO2 = new javax.swing.JCheckBox();
        boxCO = new javax.swing.JCheckBox();
        boxOzon = new javax.swing.JCheckBox();
        boxPB = new javax.swing.JCheckBox();
        boxKelembapan = new javax.swing.JCheckBox();
        boxKebisingan = new javax.swing.JCheckBox();
        boxH2S = new javax.swing.JCheckBox();
        boxChlorin = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        boxJumlahecol = new javax.swing.JCheckBox();
        boxTotalecol = new javax.swing.JCheckBox();
        boxTDS = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("IDENTITAS PENDAFTAR");

        jLabel2.setText("No Pendaftaran");

        jLabel3.setText("Hari/Tgl/Bln/Th Masuk");

        jLabel4.setText("Nama");

        jLabel5.setText("Alamat");

        jLabel6.setText("No Telepon/HP");

        noIdentitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noIdentitasActionPerformed(evt);
            }
        });

        alamatPendaftar.setColumns(20);
        alamatPendaftar.setRows(5);
        jScrollPane1.setViewportView(alamatPendaftar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(telponPendaftar)
                    .addComponent(namaPendaftar)
                    .addComponent(noIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttglDaftar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(noIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txttglDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(namaPendaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(telponPendaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnCencel.setText("Cancel");
        btnCencel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCencelActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCencel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCencel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNew))
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No Pendaftaran", "Tanggal", "Nama", "Alamat", "No Telepon", "Kode Sampel", "Jenis Sampel", "Kode Lab", "Pengambilan", "Penerimaan", "Parameter Fisika Kimia", "Parameter Biologi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("IDENTITAS SAMPEL");

        jLabel8.setText("Kode Sampel");

        jLabel9.setText("Jenis Sampel");

        jLabel10.setText("Kode No Lab");

        jLabel11.setText("Waktu Pengambilan Sampel");

        jLabel12.setText("Waktu Penerimaan Sampel");

        kodSam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodSamActionPerformed(evt);
            }
        });

        JenisSam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jenis Sampel", "Air Minum", "Air Bersih", "Udara", "Limbah Cair" }));

        KodLab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kode Lab", "01", "02", "03", "04", "05", "06", "07" }));

        wktTerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wktTerimaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("PARAMETER");

        jLabel15.setText("Fisika Kimia");

        boxBau.setText("Bau");
        boxBau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBauActionPerformed(evt);
            }
        });

        boxKekeruhan.setText("Kekeruhan");
        boxKekeruhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxKekeruhanActionPerformed(evt);
            }
        });

        boxRasa.setText("Rasa");
        boxRasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRasaActionPerformed(evt);
            }
        });

        boxSuhu.setText("Suhu");
        boxSuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSuhuActionPerformed(evt);
            }
        });

        boxWarna.setText("Warna");
        boxWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxWarnaActionPerformed(evt);
            }
        });

        boxNitrat.setText("Nitrat/NO3");
        boxNitrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNitratActionPerformed(evt);
            }
        });

        boxNitrit.setText("Nitrit/NO2");
        boxNitrit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNitritActionPerformed(evt);
            }
        });

        boxNatrium.setText("Natrium");
        boxNatrium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNatriumActionPerformed(evt);
            }
        });

        boxSianida.setText("Sianida");
        boxSianida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSianidaActionPerformed(evt);
            }
        });

        boxAmmonia.setText("Amonia");
        boxAmmonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAmmoniaActionPerformed(evt);
            }
        });

        boxBesi.setText("Besi");
        boxBesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBesiActionPerformed(evt);
            }
        });

        boxKesadahan.setText("Kesadahan");
        boxKesadahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxKesadahanActionPerformed(evt);
            }
        });

        boxDetergen.setText("Detergen");
        boxDetergen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDetergenActionPerformed(evt);
            }
        });

        boxHidrogen.setText("Hidrogen");
        boxHidrogen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxHidrogenActionPerformed(evt);
            }
        });

        boxPH.setText("pH");
        boxPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPHActionPerformed(evt);
            }
        });

        boxSulfat.setText("Sulfat");
        boxSulfat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSulfatActionPerformed(evt);
            }
        });

        boxSO2.setText("SO2");
        boxSO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSO2ActionPerformed(evt);
            }
        });

        boxCO.setText("CO");
        boxCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCOActionPerformed(evt);
            }
        });

        boxOzon.setText("Ozon");
        boxOzon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxOzonActionPerformed(evt);
            }
        });

        boxPB.setText("Pb");
        boxPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPBActionPerformed(evt);
            }
        });

        boxKelembapan.setText("Kelembapan");
        boxKelembapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxKelembapanActionPerformed(evt);
            }
        });

        boxKebisingan.setText("Kebisingan");
        boxKebisingan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxKebisinganActionPerformed(evt);
            }
        });

        boxH2S.setText("H2S");
        boxH2S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxH2SActionPerformed(evt);
            }
        });

        boxChlorin.setText("Chlorin");
        boxChlorin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxChlorinActionPerformed(evt);
            }
        });

        jLabel16.setText("Biologi");

        boxJumlahecol.setText("Jumlah E Col");
        boxJumlahecol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxJumlahecolActionPerformed(evt);
            }
        });

        boxTotalecol.setText("Total Col");
        boxTotalecol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTotalecolActionPerformed(evt);
            }
        });

        boxTDS.setText("TDS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxNatrium)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxRasa)
                                    .addComponent(boxTDS)
                                    .addComponent(boxBau))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boxTotalecol)
                                            .addComponent(boxJumlahecol)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(boxKesadahan)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxKekeruhan)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxNitrit)
                                    .addComponent(boxSuhu)
                                    .addComponent(boxWarna)
                                    .addComponent(boxNitrat))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxDetergen)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boxHidrogen)
                                            .addComponent(boxPH)
                                            .addComponent(boxSulfat))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boxH2S)
                                            .addComponent(boxKebisingan)
                                            .addComponent(boxChlorin)
                                            .addComponent(boxKelembapan)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel15)
                                                .addComponent(boxSianida))
                                            .addComponent(boxAmmonia)
                                            .addComponent(boxBesi))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boxCO)
                                            .addComponent(boxSO2)
                                            .addComponent(boxOzon)
                                            .addComponent(boxPB))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(165, 165, 165))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxBau)
                    .addComponent(boxSianida)
                    .addComponent(boxSO2)
                    .addComponent(boxJumlahecol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxAmmonia)
                    .addComponent(boxCO)
                    .addComponent(boxTotalecol)
                    .addComponent(boxTDS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxKekeruhan)
                    .addComponent(boxBesi)
                    .addComponent(boxOzon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boxRasa)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boxKesadahan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxPB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxSuhu)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxDetergen)
                        .addComponent(boxKelembapan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxWarna)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxHidrogen)
                        .addComponent(boxKebisingan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxH2S)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxNitrat)
                        .addComponent(boxPH)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxNitrit)
                    .addComponent(boxSulfat)
                    .addComponent(boxChlorin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxNatrium))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(110, 110, 110)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kodSam, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JenisSam, javax.swing.GroupLayout.Alignment.TRAILING, 0, 96, Short.MAX_VALUE)
                                        .addComponent(KodLab, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(wktAmbil, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(wktTerima))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(84, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(151, 151, 151)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(kodSam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JenisSam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(KodLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(wktAmbil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(wktTerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel13.setText("Search");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefresh))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void noIdentitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noIdentitasActionPerformed

    }//GEN-LAST:event_noIdentitasActionPerformed

    private void kodSamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodSamActionPerformed

    }//GEN-LAST:event_kodSamActionPerformed

    private void wktTerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wktTerimaActionPerformed

    }//GEN-LAST:event_wktTerimaActionPerformed

    private void boxBauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBauActionPerformed

    }//GEN-LAST:event_boxBauActionPerformed
    public void chekbox(){
        if(boxBau.isSelected()){
            FisKim="Bau";
        }if(boxTDS.isSelected()){
            FisKim=FisKim+" "+"TDS";
        }if(boxKekeruhan.isSelected()){
            FisKim=FisKim+" "+"Kekeruhan";
        }if(boxRasa.isSelected()){
            FisKim=FisKim+" "+"Rasa";
        }if(boxSuhu.isSelected()){
            FisKim=FisKim+", "+"Suhu";
        }if(boxWarna.isSelected()){
            FisKim=FisKim+" "+"Warna";
        }if(boxNitrat.isSelected()){
            FisKim=FisKim+" "+"Nitrat/NO3";
        }if(boxNitrit.isSelected()){
            FisKim=FisKim+" "+"Nitrit/NO2";
        }if(boxNatrium.isSelected()){
            FisKim=FisKim+" "+"Natrium";
        }if(boxSianida.isSelected()){
            FisKim=FisKim+" "+"Sianida";
        }if(boxAmmonia.isSelected()){
            FisKim=FisKim+" "+"Amonia";
        }if(boxBesi.isSelected()){
            FisKim=FisKim+" "+"Besi";
        }if(boxKesadahan.isSelected()){
            FisKim=FisKim+" "+"Kesadahan";
        }if(boxDetergen.isSelected()){
            FisKim=FisKim+" "+"Detergen";
        }if(boxHidrogen.isSelected()){
            FisKim=FisKim+" "+"Hidrogen";
        }if(boxPH.isSelected()){
            FisKim=FisKim+" "+"PH";
        }if(boxSulfat.isSelected()){
            FisKim=FisKim+" "+"Sulfat";
        }if(boxSO2.isSelected()){
            FisKim=FisKim+" "+"SO2";
        }if(boxCO.isSelected()){
            FisKim=FisKim+" "+"CO";
        }if(boxOzon.isSelected()){
            FisKim=FisKim+" "+"Ozon";
        }if(boxPB.isSelected()){
            FisKim=FisKim+" "+"PB";
        }if(boxKelembapan.isSelected()){
            FisKim=FisKim+" "+"Kelembapan";
        }if(boxKebisingan.isSelected()){
            FisKim=FisKim+" "+"Kebisingan";
        }if(boxH2S.isSelected()){
            FisKim=FisKim+" "+"H2S";
        }if(boxChlorin.isSelected()){
            FisKim=FisKim+" "+"Chlorin";
        }
        
        if(boxJumlahecol.isSelected()){
            Biologi="JumlahECholi";
        }if(boxTotalecol.isSelected()){
            Biologi=Biologi+" "+"TotalECholi";
        }
    }
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        String JenisSampel;
        String KodeLab;
        if (txttglDaftar.getDate()!=null){
            SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
            Tanggal = fm.format(txttglDaftar.getDate());
        }
        chekbox();
        String txtId = noIdentitas.getText();
        String txtNama = namaPendaftar.getText();
        String txtAlm = alamatPendaftar.getText();
        String txtTelp = telponPendaftar.getText();
        String txtKodeSam = kodSam.getText();
        JenisSampel = (String)JenisSam.getSelectedItem();
        KodeLab = (String)KodLab.getSelectedItem();
        String txtwktTerima = wktTerima.getText();
        String txtwktAmbil = wktAmbil.getText();

        
        try{
            String nameDB="jdbc:odbc:databaseku";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection(nameDB,"admin","admin");
            Statement st = con.createStatement();
            String sql = "insert into tablePendaftaran(noDaftar,tanggalDaftar,namaDaftar,alamatDaftar,telpDaftar,kodesampelDartar,jenissampeDaftar,kodelabDaftar,pengambilanDaftar,penerimaanDaftar,parameterfiskimDaftar,parameterbiologDaftar)"+
                "values('"+txtId+"','"+Tanggal+"','"+txtNama+"','"+txtAlm+"','"+txtTelp+"','"+txtKodeSam+"','"+JenisSampel+"','"+KodeLab+"','"+txtwktAmbil+"','"+txtwktTerima+"','"+FisKim+"','"+Biologi+"')";

                st.executeUpdate(sql);
                st.close();
                JOptionPane.showMessageDialog(null,"Data Berhasil Diinput.","Insert Data",JOptionPane.INFORMATION_MESSAGE);
                
                noIdentitas.setFocusable(rootPaneCheckingEnabled);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Berhasil Diinput.","Insert Data",JOptionPane.INFORMATION_MESSAGE);
        }
        clear();
        noIdentitas.requestFocus();
    }//GEN-LAST:event_SaveActionPerformed

    private void boxKekeruhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxKekeruhanActionPerformed

    }//GEN-LAST:event_boxKekeruhanActionPerformed
    private void boxRasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRasaActionPerformed

    }//GEN-LAST:event_boxRasaActionPerformed
    private void boxSuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSuhuActionPerformed

    }//GEN-LAST:event_boxSuhuActionPerformed
    private void boxWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxWarnaActionPerformed

    }//GEN-LAST:event_boxWarnaActionPerformed
    private void boxNitratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNitratActionPerformed

    }//GEN-LAST:event_boxNitratActionPerformed
    private void boxNitritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNitritActionPerformed

    }//GEN-LAST:event_boxNitritActionPerformed
    private void boxNatriumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNatriumActionPerformed

    }//GEN-LAST:event_boxNatriumActionPerformed
    private void boxSianidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSianidaActionPerformed

    }//GEN-LAST:event_boxSianidaActionPerformed
    private void boxAmmoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAmmoniaActionPerformed

    }//GEN-LAST:event_boxAmmoniaActionPerformed
    private void boxBesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBesiActionPerformed

    }//GEN-LAST:event_boxBesiActionPerformed
    private void boxKesadahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxKesadahanActionPerformed

    }//GEN-LAST:event_boxKesadahanActionPerformed
    private void boxDetergenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDetergenActionPerformed

    }//GEN-LAST:event_boxDetergenActionPerformed
    private void boxHidrogenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxHidrogenActionPerformed

    }//GEN-LAST:event_boxHidrogenActionPerformed
    private void boxPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPHActionPerformed

    }//GEN-LAST:event_boxPHActionPerformed
    private void boxSulfatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSulfatActionPerformed

    }//GEN-LAST:event_boxSulfatActionPerformed
    private void boxSO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSO2ActionPerformed

    }//GEN-LAST:event_boxSO2ActionPerformed
    private void boxCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCOActionPerformed

    }//GEN-LAST:event_boxCOActionPerformed
    private void boxOzonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxOzonActionPerformed

    }//GEN-LAST:event_boxOzonActionPerformed
    private void boxPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPBActionPerformed

    }//GEN-LAST:event_boxPBActionPerformed
    private void boxKelembapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxKelembapanActionPerformed

    }//GEN-LAST:event_boxKelembapanActionPerformed
    private void boxKebisinganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxKebisinganActionPerformed

    }//GEN-LAST:event_boxKebisinganActionPerformed
    private void boxH2SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxH2SActionPerformed

    }//GEN-LAST:event_boxH2SActionPerformed
    private void boxChlorinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxChlorinActionPerformed

    }//GEN-LAST:event_boxChlorinActionPerformed
    private void boxJumlahecolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxJumlahecolActionPerformed

    }//GEN-LAST:event_boxJumlahecolActionPerformed
    private void boxTotalecolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTotalecolActionPerformed

    }//GEN-LAST:event_boxTotalecolActionPerformed

    private void tanggalDaftarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalDaftarPropertyChange
        
    }//GEN-LAST:event_tanggalDaftarPropertyChange

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clear();
    }//GEN-LAST:event_btnNewActionPerformed
 		
    
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
         DefaultTableModel data = new DefaultTableModel();
         jTable1.isCellEditable(1, 1);
         data.addColumn("No Pendaftaran");
         data.addColumn("Tanggal");
         data.addColumn("Nama");
         data.addColumn("Alamat");
         data.addColumn("No Telepon");
         data.addColumn("Kode Sampel");
         data.addColumn("Jenis Sampel");
         data.addColumn("Kode Lab");
         data.addColumn("Pengambilan");
         data.addColumn("Penerimaan");
         data.addColumn("Parameter Fisika & Kimia");
         data.addColumn("Parameter Biologi");
        try{
           String nameDB="jdbc:odbc:databaseku";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection(nameDB,"admin","admin");
            Statement st = con.createStatement();
            String sql="select * from tablePendaftaran";
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                String k1 = rs.getString(1);
                String k2 = rs.getString(2);
                String k3 = rs.getString(3);
                String k4 = rs.getString(4);
                String k5 = rs.getString(5);
                String k6 = rs.getString(6);
                String k7 = rs.getString(7);
                String k8 = rs.getString(8);
                String k9 = rs.getString(9);
                String k10 = rs.getString(10);
                String k11 = rs.getString(11);
                String k12 = rs.getString(12);
                
                String kolom[] = {k1,k2,k3,k4,k5,k6,k7,k8,k9,k10,k11,k12};
                data.addRow(kolom);
                jTable1.setModel(data);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error :"+e.getMessage());
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnCencelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCencelActionPerformed
        clear();
    }//GEN-LAST:event_btnCencelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Menghapus record ini???", "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
       String nohapus = noIdentitas.getText();
       if (ok==0){
           try{
           String nameDB="jdbc:odbc:databaseku";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection(nameDB,"admin","admin");
            Statement st = con.createStatement();
            String sql="delete from tablePendaftaran where noDaftar like '"+nohapus+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Delete Data Sukses");
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Delete Data Gagal");
           }
       }
       noIdentitas.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
       if(evt.getClickCount()==2){
           String a1 = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            noIdentitas.setText(a1);
       }
    }//GEN-LAST:event_jTable1MousePressed

    private void txttglDaftarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txttglDaftarAncestorAdded
        
    }//GEN-LAST:event_txttglDaftarAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JenisSam;
    private javax.swing.JComboBox KodLab;
    private javax.swing.JButton Save;
    private javax.swing.JTextArea alamatPendaftar;
    private javax.swing.JCheckBox boxAmmonia;
    private javax.swing.JCheckBox boxBau;
    private javax.swing.JCheckBox boxBesi;
    private javax.swing.JCheckBox boxCO;
    private javax.swing.JCheckBox boxChlorin;
    private javax.swing.JCheckBox boxDetergen;
    private javax.swing.JCheckBox boxH2S;
    private javax.swing.JCheckBox boxHidrogen;
    private javax.swing.JCheckBox boxJumlahecol;
    private javax.swing.JCheckBox boxKebisingan;
    private javax.swing.JCheckBox boxKekeruhan;
    private javax.swing.JCheckBox boxKelembapan;
    private javax.swing.JCheckBox boxKesadahan;
    private javax.swing.JCheckBox boxNatrium;
    private javax.swing.JCheckBox boxNitrat;
    private javax.swing.JCheckBox boxNitrit;
    private javax.swing.JCheckBox boxOzon;
    private javax.swing.JCheckBox boxPB;
    private javax.swing.JCheckBox boxPH;
    private javax.swing.JCheckBox boxRasa;
    private javax.swing.JCheckBox boxSO2;
    private javax.swing.JCheckBox boxSianida;
    private javax.swing.JCheckBox boxSuhu;
    private javax.swing.JCheckBox boxSulfat;
    private javax.swing.JCheckBox boxTDS;
    private javax.swing.JCheckBox boxTotalecol;
    private javax.swing.JCheckBox boxWarna;
    private javax.swing.JButton btnCencel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kodSam;
    private javax.swing.JTextField namaPendaftar;
    private javax.swing.JTextField noIdentitas;
    private javax.swing.JTextField telponPendaftar;
    private javax.swing.JTextField txtSearch;
    private com.toedter.calendar.JDateChooser txttglDaftar;
    private javax.swing.JTextField wktAmbil;
    private javax.swing.JTextField wktTerima;
    // End of variables declaration//GEN-END:variables
}
