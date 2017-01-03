
package tugasakiir;

public class FormWindows extends javax.swing.JFrame {

    public FormWindows() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lambang1 = new Gambar.Lambang();
        btnCont = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnCont.setBackground(new java.awt.Color(51, 255, 51));
        btnCont.setText("Continue");
        btnCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lambang1Layout = new javax.swing.GroupLayout(lambang1);
        lambang1.setLayout(lambang1Layout);
        lambang1Layout.setHorizontalGroup(
            lambang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lambang1Layout.createSequentialGroup()
                .addGap(0, 413, Short.MAX_VALUE)
                .addComponent(btnCont))
        );
        lambang1Layout.setVerticalGroup(
            lambang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lambang1Layout.createSequentialGroup()
                .addContainerGap(432, Short.MAX_VALUE)
                .addComponent(btnCont))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lambang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lambang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContActionPerformed
        FormMenu open = new FormMenu();
        open.setVisible(true);
    }//GEN-LAST:event_btnContActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormWindows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCont;
    private Gambar.Lambang lambang1;
    // End of variables declaration//GEN-END:variables
}
