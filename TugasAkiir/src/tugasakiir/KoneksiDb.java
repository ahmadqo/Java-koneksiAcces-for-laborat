
package tugasakiir;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.*;
import java.sql.*;
import javax.swing.*;
public class KoneksiDb {
    public Connection con;
    public Statement st;

public void koneksidb(){
    try{
        String nameDB="jdbc:odbc:databaseku";
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection(nameDB,"admin","admin");
        JOptionPane.showMessageDialog(null,"Koneksi Berhasil","Koneksi",JOptionPane.INFORMATION_MESSAGE);

    }catch(Exception e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,"Error : "+e," Gagal ",JOptionPane.WARNING_MESSAGE);
    }
}
public static void main(String args[]) {
    KoneksiDb konek = new KoneksiDb();
    konek.koneksidb();
}
}


