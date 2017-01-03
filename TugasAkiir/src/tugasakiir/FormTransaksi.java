
package tugasakiir;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.*;
import java.util.Date;
public class FormTransaksi extends javax.swing.JFrame {

   Connection conec;
   Statement st;
   public String pilih;
   public float biaya=0;
   public float angkabiaya=0;
   public String Fisika="";
   public String Biologi="";
   public float total;
   public String a[] = new String[12];
   public String t[] = new String[12];
   public int counter;
    public FormTransaksi() {
        initComponents();
    }
    public void kosongkanFiskim(){
        txtAlamat.setText("");  txtNohp.setText("");
        txtNama.setText("");    txtKodesampel.setText("");
        txtTanggal.setText(""); txtJenisSam.setText("");
        txtKodelab.setText(""); txtnoPen.setText("");
        txtambil.setText("");
        txtterima.setText("");
        chkBau.setSelected(false); chkBau.setEnabled(true);
        chkTds.setSelected(false); chkTds.setEnabled(true);
        chkKekeruhan.setSelected(false); chkKekeruhan.setEnabled(true);
        chkRasa.setSelected(false);      chkRasa.setEnabled(true);
        chkSuhu.setSelected(false); chkSuhu.setEnabled(true);
        chkWarna.setEnabled(true);  chkWarna.setSelected(false);
        chkNitrat.setEnabled(true);  chkNitrat.setSelected(false);
        chkNitrit.setEnabled(true);  chkNitrit.setSelected(false);
        chkNatrium.setEnabled(true);  chkNatrium.setSelected(false);
        chkSianda.setEnabled(true);   chkSianda.setSelected(false);
        chkAmonia.setEnabled(true);  chkAmonia.setSelected(false);
        chkBesi.setEnabled(true);    chkBesi.setSelected(false);
        chkKesadahan.setEnabled(true); chkKesadahan.setSelected(false);
        chkDetergen.setEnabled(true);  chkDetergen.setSelected(false);
        chkHidrogen.setEnabled(true);  chkHidrogen.setSelected(false);
        chkPH.setEnabled(true);    chkPH.setSelected(false);
        chkSulpat.setEnabled(true);chkSulpat.setSelected(false);
        chkSO2.setEnabled(true);  chkSO2.setSelected(false);
        chkCO.setEnabled(true);   chkCO.setSelected(false);
        chkOzon.setEnabled(true);  chkOzon.setSelected(false);
        chkPB.setEnabled(true);    chkPB.setSelected(false);
        chkKelembapan.setEnabled(true); chkKelembapan.setSelected(false);
        chkKebisngan.setEnabled(true);  chkKebisngan.setSelected(false);
        chkH2S.setEnabled(true);      chkH2S.setSelected(false);
        chkChlorin.setEnabled(true);  chkChlorin.setSelected(false);
        chkJumEcol.setEnabled(true);  chkJumEcol.setSelected(false);
        chkTotCol.setEnabled(true);   chkTotCol.setSelected(false);
    }

    public void biayaparameter(){
        if(chkBau.isSelected()){ Fisika=Fisika+" "+"Bau"; biaya=biaya+29000;}
        if(chkTds.isSelected()){ Fisika=Fisika+" "+"TDS"; biaya=biaya+29000;}
        if(chkKekeruhan.isSelected()){ Fisika=Fisika+" "+"Kekeruhan"; biaya=biaya+29000;}
        if(chkRasa.isSelected()){ Fisika=Fisika+" "+"Rasa"; biaya=biaya+29000;}
        if(chkSuhu.isSelected()){ Fisika=Fisika+" "+"Suhu"; biaya=biaya+29000;}
        if(chkWarna.isSelected()){ Fisika=Fisika+" "+"Warna"; biaya=biaya+29000;}
        if(chkNitrat.isSelected()){ Fisika=Fisika+" "+"Nitrat"; biaya=biaya+32000;}
        if(chkNitrit.isSelected()){ Fisika=Fisika+" "+"Nitrit"; biaya=biaya+32000;}
        if(chkNatrium.isSelected()){ Fisika=Fisika+" "+"Natrium"; biaya=biaya+32000;}
        if(chkSianda.isSelected()){  Fisika=Fisika+" "+"Sianida"; biaya=biaya+35000;}
        if(chkAmonia.isSelected()){ Fisika=Fisika+" "+"Amonia"; biaya=biaya+35000;}
        if(chkBesi.isSelected()){  Fisika=Fisika+" "+"Besi";  biaya=biaya+35000;}
        if(chkKesadahan.isSelected()){ Fisika=Fisika+" "+"Kesadahan"; biaya=biaya+35000;}
        if(chkDetergen.isSelected()){ Fisika=Fisika+" "+"Detergen"; biaya=biaya+35000;}
        if(chkHidrogen.isSelected()){  Fisika=Fisika+" "+"Hidrogen"; biaya=biaya+35000; }
        if(chkPH.isSelected()){ Fisika=Fisika+" "+"PH"; biaya=biaya+35000;}
        if(chkSulpat.isSelected()){  Fisika=Fisika+" "+"Sulfat";  biaya=biaya+35000;}
        if(chkSO2.isSelected()){ Fisika=Fisika+" "+"SO2"; biaya=biaya+34000;}
        if(chkCO.isSelected()){ Fisika=Fisika+" "+"CO"; biaya=biaya+34000;}
        if(chkOzon.isSelected()){ Fisika=Fisika+" "+"Ozon"; biaya=biaya+34000;}
        if(chkPB.isSelected()){ Fisika=Fisika+" "+"PB"; biaya=biaya+34000;}
        if(chkKelembapan.isSelected()){  Fisika=Fisika+" "+"Kelembapan";  biaya=biaya+34000;}
        if(chkKebisngan.isSelected()){ Fisika=Fisika+" "+"Kebisingan";  biaya=biaya+34000;}
        if(chkH2S.isSelected()){ Fisika=Fisika+" "+"H2S"; biaya=biaya+34000;}
        if(chkChlorin.isSelected()){  Fisika=Fisika+" "+"Clorin";  biaya=biaya+34000;
        }    
        if(chkJumEcol.isSelected()){ Biologi=Biologi+"JumlahEcholi"; biaya=biaya+45000;}
        if(chkTotCol.isSelected()){ Biologi=Biologi+"TotalEcholi"; biaya=biaya+45000;}
        total=biaya;
        txtBiaya.setText(""+total);
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
        txtnoPen = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        txtNohp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtKodesampel = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        txtTanggal = new javax.swing.JTextField();
        txtJenisSam = new javax.swing.JTextField();
        txtKodelab = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtambil = new javax.swing.JTextField();
        txtterima = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chkBau = new javax.swing.JCheckBox();
        chkTds = new javax.swing.JCheckBox();
        chkKekeruhan = new javax.swing.JCheckBox();
        chkRasa = new javax.swing.JCheckBox();
        chkSuhu = new javax.swing.JCheckBox();
        chkWarna = new javax.swing.JCheckBox();
        chkNitrat = new javax.swing.JCheckBox();
        chkNitrit = new javax.swing.JCheckBox();
        chkNatrium = new javax.swing.JCheckBox();
        chkSianda = new javax.swing.JCheckBox();
        chkAmonia = new javax.swing.JCheckBox();
        chkBesi = new javax.swing.JCheckBox();
        chkKesadahan = new javax.swing.JCheckBox();
        chkDetergen = new javax.swing.JCheckBox();
        chkPH = new javax.swing.JCheckBox();
        chkSulpat = new javax.swing.JCheckBox();
        chkChlorin = new javax.swing.JCheckBox();
        chkSO2 = new javax.swing.JCheckBox();
        chkCO = new javax.swing.JCheckBox();
        chkOzon = new javax.swing.JCheckBox();
        chkPB = new javax.swing.JCheckBox();
        chkKelembapan = new javax.swing.JCheckBox();
        chkKebisngan = new javax.swing.JCheckBox();
        chkH2S = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        chkJumEcol = new javax.swing.JCheckBox();
        chkTotCol = new javax.swing.JCheckBox();
        chkHidrogen = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtBiaya = new javax.swing.JTextField();
        btnTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("No Pendaftaran");

        jLabel2.setText("Tanggal Keluaran");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        jLabel5.setText("No Telepon/hp");

        txtnoPen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnoPenKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnoPenKeyReleased(evt);
            }
        });

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jLabel6.setText("Kode Sampel");

        jLabel7.setText("Jenis Sampel");

        jLabel8.setText("Kode No Lab");

        cari.setText("Cari");
        cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cariMouseClicked(evt);
            }
        });
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        jLabel13.setText("Waktu Pengambilan");

        jLabel14.setText("Waktu Terima");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnoPen, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNama)
                    .addComponent(jScrollPane1)
                    .addComponent(txtNohp)
                    .addComponent(txtKodesampel)
                    .addComponent(txtJenisSam)
                    .addComponent(txtKodelab)
                    .addComponent(txtambil)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtterima))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnoPen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNama)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKodesampel)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJenisSam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKodelab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtambil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtterima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setText("PARAMETER");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("FISIKA KIMIA");

        chkBau.setText("Bau");
        chkBau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBauActionPerformed(evt);
            }
        });

        chkTds.setText("TDS");
        chkTds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTdsActionPerformed(evt);
            }
        });

        chkKekeruhan.setText("Kekeruhan");

        chkRasa.setText("Rasa");

        chkSuhu.setText("Suhu");

        chkWarna.setText("Warna");

        chkNitrat.setText("Nitrat");

        chkNitrit.setText("Nitrit");

        chkNatrium.setText("Natrium");

        chkSianda.setText("Sianida");

        chkAmonia.setText("Amonia");

        chkBesi.setText("Besi");

        chkKesadahan.setText("Kesadahan");

        chkDetergen.setText("Detergen");

        chkPH.setText("PH");

        chkSulpat.setText("Sulpat");

        chkChlorin.setText("Chlorine");

        chkSO2.setText("SO2");

        chkCO.setText("CO");

        chkOzon.setText("Ozon");

        chkPB.setText("Pb");

        chkKelembapan.setText("Kelembapan");

        chkKebisngan.setText("Kebisingan");

        chkH2S.setText("H2S");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("BIOLOGI");

        chkJumEcol.setText("Jumlah E Coli");

        chkTotCol.setText("Total Coliform");
        chkTotCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTotColActionPerformed(evt);
            }
        });

        chkHidrogen.setText("Hidrogen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkBau)
                            .addComponent(chkTds)
                            .addComponent(chkKekeruhan)
                            .addComponent(chkRasa)
                            .addComponent(chkSuhu)
                            .addComponent(chkWarna)
                            .addComponent(chkNitrat)
                            .addComponent(chkNitrit)
                            .addComponent(chkNatrium)
                            .addComponent(jLabel10))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chkSulpat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkPH, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkSianda)
                                            .addComponent(chkAmonia)
                                            .addComponent(chkBesi)
                                            .addComponent(chkKesadahan))
                                        .addGap(67, 67, 67)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(chkHidrogen)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkH2S)
                                            .addComponent(chkChlorin)
                                            .addComponent(chkKebisngan)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(chkDetergen)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkSO2)
                                            .addComponent(chkPB)
                                            .addComponent(chkKelembapan)
                                            .addComponent(chkOzon)
                                            .addComponent(chkCO))
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkTotCol)
                                            .addComponent(chkJumEcol)
                                            .addComponent(jLabel11))))
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBau)
                    .addComponent(chkSianda)
                    .addComponent(chkSO2)
                    .addComponent(chkJumEcol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkTds)
                    .addComponent(chkAmonia)
                    .addComponent(chkCO)
                    .addComponent(chkTotCol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkKekeruhan)
                    .addComponent(chkBesi)
                    .addComponent(chkOzon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkRasa)
                    .addComponent(chkKesadahan)
                    .addComponent(chkPB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSuhu)
                    .addComponent(chkDetergen)
                    .addComponent(chkKelembapan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkWarna)
                    .addComponent(chkKebisngan)
                    .addComponent(chkHidrogen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNitrat)
                    .addComponent(chkH2S)
                    .addComponent(chkPH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNitrit)
                    .addComponent(chkChlorin)
                    .addComponent(chkSulpat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkNatrium)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Rp.");

        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTotal)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(txtBiaya)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void chkTdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTdsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTdsActionPerformed

    private void chkBauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkBauActionPerformed

    private void chkTotColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTotColActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTotColActionPerformed

    private void txtnoPenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoPenKeyPressed
        
    }//GEN-LAST:event_txtnoPenKeyPressed

    private void txtnoPenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoPenKeyReleased
       
    }//GEN-LAST:event_txtnoPenKeyReleased

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed

    }//GEN-LAST:event_cariActionPerformed

    private void cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cariMouseClicked
        int i=0;
        try{
            String nameDB="jdbc:odbc:databaseku";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conec = DriverManager.getConnection(nameDB,"admin","admin");
            String carino=txtnoPen.getText();
            Statement st = conec.createStatement();
            String sql="select * from tablePendaftaran where noDaftar like '"+carino+"'";
            ResultSet rs=st.executeQuery(sql); 
            
            
           while(rs.next()){
                i++;
                txtAlamat.setText(rs.getString("alamatDaftar"));
                txtNohp.setText(rs.getString("telpDaftar"));
                txtNama.setText(rs.getString("namaDaftar"));
                txtKodesampel.setText(rs.getString("kodesampelDartar"));
                txtTanggal.setText(rs.getString("tanggalDaftar"));
                txtJenisSam.setText(rs.getString("jenissampeDaftar"));
                txtKodelab.setText(rs.getString("kodelabDaftar"));
                txtambil.setText(rs.getString("pengambilanDaftar"));
                txtterima.setText(rs.getString("penerimaanDaftar"));
                Fisika = rs.getString("parameterfiskimDaftar");
                Biologi = rs.getString("parameterbiologDaftar");
            }
           String[] kata=Fisika.split(" ");
                for(counter = 0; counter<kata.length; counter++){
                a[counter] = kata[counter];
                    if(a[counter].equals("Bau")){ chkBau.setSelected(true);chkBau.setEnabled(false);}
                    if(a[counter].equals("TDS")){ chkTds.setSelected(true);chkTds.setEnabled(false);}
                    if(a[counter].equals("Kekeruhan")){ chkKekeruhan.setSelected(true);chkKekeruhan.setEnabled(false);}
                    if(a[counter].equals("Rasa")){ chkRasa.setSelected(true);chkRasa.setEnabled(false);}
                    if(a[counter].equals("Suhu")){ chkSuhu.setSelected(true);chkSuhu.setEnabled(false);}
                    if(a[counter].equals("Warna")){ chkWarna.setSelected(true);chkWarna.setEnabled(false);}
                    if(a[counter].equals("Nitrat/NO3")){ chkNitrat.setSelected(true);chkNitrat.setEnabled(false);}
                    if(a[counter].equals("Nitrit/NO2")){ chkNitrit.setSelected(true);chkNitrit.setEnabled(false);}
                    if(a[counter].equals("Natrium")){ chkNatrium.setSelected(true);chkNatrium.setEnabled(false);}
                    if(a[counter].equals("Sianida")){ chkSianda.setSelected(true);chkSianda.setEnabled(false);}
                    if(a[counter].equals("Amonia")){ chkAmonia.setSelected(true);chkAmonia.setEnabled(false);}
                    if(a[counter].equals("Besi")){ chkBesi.setSelected(true);chkBesi.setEnabled(false);}
                    if(a[counter].equals("Kesadahan")){ chkKesadahan.setSelected(true);chkKesadahan.setEnabled(false);}
                    if(a[counter].equals("Detergen")){ chkDetergen.setSelected(true);chkDetergen.setEnabled(false);}
                    if(a[counter].equals("PH")){ chkPH.setSelected(true); chkPH.setEnabled(false);}
                    if(a[counter].equals("Sulfat")){ chkSulpat.setSelected(true);chkSulpat.setEnabled(false);}
                    if(a[counter].equals("SO2")){  chkSO2.setSelected(true);chkSO2.setEnabled(false);}
                    if(a[counter].equals("CO")){ chkCO.setSelected(true);chkCO.setEnabled(false);}
                    if(a[counter].equals("Ozon")){  chkOzon.setSelected(true);chkOzon.setEnabled(false);}
                    if(a[counter].equals("PB")){ chkPB.setSelected(true);chkPB.setEnabled(false);}
                    if(a[counter].equals("Kelembapan")){  chkKelembapan.setSelected(true);chkKelembapan.setEnabled(false);}
                    if(a[counter].equals("Kebisingan")){  chkKebisngan.setSelected(true);chkKebisngan.setEnabled(false);}
                    if(a[counter].equals("H2S")){  chkH2S.setSelected(true);chkH2S.setEnabled(false);}
                    if(a[counter].equals("Chlorin")){ chkChlorin.setSelected(true);chkChlorin.setEnabled(false);}
                }
                String[] bi = Biologi.split(" ");
                for(int data = 0; data<bi.length; data++){
                    t[data]=bi[data];
                    if(t[data].equals("JumlahECholi")){
                        chkJumEcol.setSelected(true);
                        chkJumEcol.setEnabled(false);
                    }if(t[data].equals("TotalECholi")){
                        chkTotCol.setSelected(true);
                        chkTotCol.setEnabled(false);
                    }
                }
                if(i==0){
                    JOptionPane.showMessageDialog(this, "Data Tidak ada");
                return;
            }
           st.close();
           conec.close();
           biayaparameter();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Data Tidak ditemukan");
        } 
    }//GEN-LAST:event_cariMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String nopen = txtnoPen.getText();
        String tgl = txtTanggal.getText();
        String nama = txtNama.getText();
        String alm = txtAlamat.getText();
        String hp = txtNohp.getText();
        String ks = txtKodesampel.getText();
        String js = txtJenisSam.getText();
        String kl = txtKodelab.getText();
        String bia = txtBiaya.getText();
        String ambil = txtambil.getText();
        String terima = txtterima.getText();
        angkabiaya = Float.parseFloat(bia);
        try{
            String nameDB="jdbc:odbc:databaseku";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conec = DriverManager.getConnection(nameDB,"admin","admin");
            Statement st = conec.createStatement();
            String sql = "insert into tableTransaksi(noPen,tgl,nm,alm,Telp,kSampel,jSampel,kLab,ambil,terima,fisika,bio,totalbiaya)"+
                        "values('"+nopen+"','"+tgl+"','"+nama+"','"+alm+"','"+hp+"','"+ks+"','"+js+"','"+kl+"','"+ambil+"','"+terima+"','"+Fisika+"','"+Biologi+"','"+angkabiaya+"')";
                st.executeUpdate(sql);
                st.close();
                JOptionPane.showMessageDialog(null,"Data Berhasil Diinput.","Insert Data",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error : "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        }
        kosongkanFiskim();
        
        FormLaporan tampil = new FormLaporan();
        tampil.setVisible(true);
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        biayaparameter();
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton cari;
    private javax.swing.JCheckBox chkAmonia;
    private javax.swing.JCheckBox chkBau;
    private javax.swing.JCheckBox chkBesi;
    private javax.swing.JCheckBox chkCO;
    private javax.swing.JCheckBox chkChlorin;
    private javax.swing.JCheckBox chkDetergen;
    private javax.swing.JCheckBox chkH2S;
    private javax.swing.JCheckBox chkHidrogen;
    private javax.swing.JCheckBox chkJumEcol;
    private javax.swing.JCheckBox chkKebisngan;
    private javax.swing.JCheckBox chkKekeruhan;
    private javax.swing.JCheckBox chkKelembapan;
    private javax.swing.JCheckBox chkKesadahan;
    private javax.swing.JCheckBox chkNatrium;
    private javax.swing.JCheckBox chkNitrat;
    private javax.swing.JCheckBox chkNitrit;
    private javax.swing.JCheckBox chkOzon;
    private javax.swing.JCheckBox chkPB;
    private javax.swing.JCheckBox chkPH;
    private javax.swing.JCheckBox chkRasa;
    private javax.swing.JCheckBox chkSO2;
    private javax.swing.JCheckBox chkSianda;
    private javax.swing.JCheckBox chkSuhu;
    private javax.swing.JCheckBox chkSulpat;
    private javax.swing.JCheckBox chkTds;
    private javax.swing.JCheckBox chkTotCol;
    private javax.swing.JCheckBox chkWarna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtJenisSam;
    private javax.swing.JTextField txtKodelab;
    private javax.swing.JTextField txtKodesampel;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNohp;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtambil;
    private javax.swing.JTextField txtnoPen;
    private javax.swing.JTextField txtterima;
    // End of variables declaration//GEN-END:variables
}
