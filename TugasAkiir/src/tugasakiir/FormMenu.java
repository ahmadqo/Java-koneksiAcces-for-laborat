
package tugasakiir;
import com.sun.jndi.ldap.Connection;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FormMenu extends javax.swing.JFrame {

String hakakses;
Connection con;
Koneksi getCon = new Koneksi();
private Dimension dmn = Toolkit.getDefaultToolkit().getScreenSize();

private void ceklogin(){
    String nameDB="jdbc:odbc:databaseku";
    java.sql.Connection conn = null;
    try{
        String akses="";
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             java.sql.Connection con = DriverManager.getConnection(nameDB,"admin","admin");

             String sql = "SELECT * from dbLogin WHERE userName='"+txtUsername.getText().replaceAll("","") +"' and Password='"+txtPassword.getText().replaceAll("", "") +"'";
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql);
               
             while(rs.next()){
                hakakses = rs.getString(1);
             }
             if(hakakses.equals("")){
                 JOptionPane.showMessageDialog(null,"Terjadi Kesalahan!!!!.","Gagal Login",JOptionPane.INFORMATION_MESSAGE);
                 txtPassword.setText("");
                 txtUsername.setText("");
                 dispose();
            }else{
                 setMenulogin();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan Login!!!!.","Gagal Login",JOptionPane.INFORMATION_MESSAGE);
            txtPassword.setText("");
            txtUsername.setText("");
            dispose();
        }
}
private void setMenulogin(){
        if(hakakses.equals("admin")){
            mnLogin.setEnabled(true);
            Login.setEnabled(false);
            mnLogout.setEnabled(true);
            Exit.setEnabled(true);
            mnPendaftaran.setEnabled(true);
            mnTransaksi.setEnabled(true);
            mnLaporan.setEnabled(true);
        }else if(hakakses.equals("user")){
            mnLogin.setEnabled(true);
            Login.setEnabled(false);
            mnLogout.setEnabled(true);
            Exit.setEnabled(true);
            mnPendaftaran.setEnabled(false);
            mnTransaksi.setEnabled(false);
            mnLaporan.setEnabled(false);
        }
}
private void setMenuLogout(){
    mnLogin.setEnabled(true);
    Login.setEnabled(true);
    mnLogout.setEnabled(false);
    Exit.setEnabled(true);
    mnPendaftaran.setEnabled(false);
    mnTransaksi.setEnabled(false);
    mnLaporan.setEnabled(false);
}
    public FormMenu() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        dLOGIN.setPreferredSize(new Dimension(600,600));
        dLOGIN.setMinimumSize(new Dimension(288,350));
        dLOGIN.setMaximumSize(new Dimension(288,350));
        setMenuLogout();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dLOGIN = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backgr1 = new Gambar.Backgr();
        latar1 = new Gambar.Latar();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnLogin = new javax.swing.JMenu();
        Login = new javax.swing.JMenuItem();
        mnLogout = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        mnPendaftaran = new javax.swing.JMenu();
        mnDaftar = new javax.swing.JMenuItem();
        mnTransaksi = new javax.swing.JMenu();
        OpnTransaksi = new javax.swing.JMenuItem();
        mnLaporan = new javax.swing.JMenu();
        OpnLaporan = new javax.swing.JMenuItem();

        dLOGIN.setAlwaysOnTop(true);
        dLOGIN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnCancel))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("SILAHKAN LOGIN");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("SEBAGAI \"ADMIN\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout dLOGINLayout = new javax.swing.GroupLayout(dLOGIN.getContentPane());
        dLOGIN.getContentPane().setLayout(dLOGINLayout);
        dLOGINLayout.setHorizontalGroup(
            dLOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dLOGINLayout.createSequentialGroup()
                .addGroup(dLOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dLOGINLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dLOGINLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dLOGINLayout.setVerticalGroup(
            dLOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dLOGINLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout backgr1Layout = new javax.swing.GroupLayout(backgr1);
        backgr1.setLayout(backgr1Layout);
        backgr1Layout.setHorizontalGroup(
            backgr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        backgr1Layout.setVerticalGroup(
            backgr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout latar1Layout = new javax.swing.GroupLayout(latar1);
        latar1.setLayout(latar1Layout);
        latar1Layout.setHorizontalGroup(
            latar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        latar1Layout.setVerticalGroup(
            latar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        mnLogin.setText("File");

        Login.setText("Log In");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        mnLogin.add(Login);

        mnLogout.setText("Log Out");
        mnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLogoutActionPerformed(evt);
            }
        });
        mnLogin.add(mnLogout);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        mnLogin.add(Exit);

        jMenuBar1.add(mnLogin);

        mnPendaftaran.setText("Pendaftaran");
        mnPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPendaftaranActionPerformed(evt);
            }
        });

        mnDaftar.setText("Daftar");
        mnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDaftarActionPerformed(evt);
            }
        });
        mnPendaftaran.add(mnDaftar);

        jMenuBar1.add(mnPendaftaran);

        mnTransaksi.setText("Transaksi");
        mnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTransaksiActionPerformed(evt);
            }
        });

        OpnTransaksi.setText("Transaksi");
        OpnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpnTransaksiActionPerformed(evt);
            }
        });
        mnTransaksi.add(OpnTransaksi);

        jMenuBar1.add(mnTransaksi);

        mnLaporan.setText("Laporan");
        mnLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLaporanActionPerformed(evt);
            }
        });

        OpnLaporan.setText("Hasil Pengujian");
        OpnLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpnLaporanActionPerformed(evt);
            }
        });
        mnLaporan.add(OpnLaporan);

        jMenuBar1.add(mnLaporan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(latar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backgr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(latar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        txtUsername.setText("");
        txtPassword.setText("");
        dLOGIN.setVisible(true);
    }//GEN-LAST:event_LoginActionPerformed

    private void mnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDaftarActionPerformed
        FormDaftar tampil = new FormDaftar();
        tampil.setVisible(true);
    }//GEN-LAST:event_mnDaftarActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void mnPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPendaftaranActionPerformed
        FormDaftar tampil = new FormDaftar();
        tampil.setVisible(true);
    }//GEN-LAST:event_mnPendaftaranActionPerformed

    private void mnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLogoutActionPerformed
        this.setMenuLogout();
        this.setTitle("SILAHKAN LOGIN TERLEBIH DAHULU");
    }//GEN-LAST:event_mnLogoutActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dLOGIN.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        ceklogin();
        dLOGIN.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void mnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTransaksiActionPerformed
        
    }//GEN-LAST:event_mnTransaksiActionPerformed

    private void mnLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLaporanActionPerformed
        
    }//GEN-LAST:event_mnLaporanActionPerformed

    private void OpnLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpnLaporanActionPerformed
        FormLaporan open = new FormLaporan();
        open.setVisible(true);
    }//GEN-LAST:event_OpnLaporanActionPerformed

    private void OpnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpnTransaksiActionPerformed
        FormTransaksi open = new FormTransaksi();
        open.setVisible(true);
    }//GEN-LAST:event_OpnTransaksiActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        ceklogin();
        dLOGIN.setVisible(false);
    }//GEN-LAST:event_btnLoginKeyPressed

   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Login;
    private javax.swing.JMenuItem OpnLaporan;
    private javax.swing.JMenuItem OpnTransaksi;
    private Gambar.Backgr backgr1;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JDialog dLOGIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private Gambar.Latar latar1;
    private javax.swing.JMenuItem mnDaftar;
    private javax.swing.JMenu mnLaporan;
    private javax.swing.JMenu mnLogin;
    private javax.swing.JMenuItem mnLogout;
    private javax.swing.JMenu mnPendaftaran;
    private javax.swing.JMenu mnTransaksi;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
