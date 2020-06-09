package modul7;
/**
 *
 * @author Elysha Fitriana
 */
import modul5.MySQL;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class gajikaryawan extends JFrame implements ActionListener {
    private JPanel jpgaji = new JPanel();
    private JLabel lblnokaryawan = new JLabel("No.Karyawan"),lblnamakaryawan = new JLabel("Nama Karyawan"),
            lblalamatkaryawan = new JLabel("Alamat Karyawan"), lblpelangganperhari = new JLabel("Pelanggan Perhari"), 
            lblgajiperhari = new JLabel("Gaji Perhari"),lblmasukperbulan = new JLabel("Masuk Perbulan"),
            lblgajiperbulan = new JLabel("Gaji Perbulan");
    private JTextField txtnokaryawan = new JTextField(),txtnamakaryawan = new JTextField(),txtalamatkaryawan =
            new JTextField(),txtpelangganperhari = new JTextField(),txtgajiperhari = new JTextField(),
            txtmasukperbulan = new JTextField(),txtgajiperbulan = new JTextField();
           
    
    private JButton btntambah = new JButton("Tambah"),btnubah = new JButton("Ubah"),
            btnhapus = new JButton("Hapus"),btnbersih = new JButton("Bersih");
    
    gajikaryawan (){
        super("DATA GAJI KARYAWAN");
        setSize(500,350);
        jpgaji.setLayout(null);
        
        //mengatur letak objek pada container
        lblnokaryawan.setBounds(20, 20, 150, 25);
        lblnamakaryawan.setBounds(20, 55, 150, 25);
        lblalamatkaryawan.setBounds(20, 90, 150, 25);
        lblpelangganperhari.setBounds(20, 125, 150, 25);
        lblgajiperhari.setBounds(20, 160, 150, 25);
        lblmasukperbulan.setBounds(20, 195, 150, 25);
        lblgajiperbulan.setBounds(20, 230, 150, 25);
        
        txtnokaryawan.setBounds(135, 20, 150, 25);
        txtnamakaryawan.setBounds(135, 55, 150, 25);
        txtalamatkaryawan.setBounds(135, 90, 150, 25);
        txtpelangganperhari.setBounds(135, 125, 150, 25);
        txtgajiperhari.setBounds(135, 160, 150, 25);
        txtmasukperbulan.setBounds(135, 195, 150, 25);
        txtgajiperbulan.setBounds(135, 230, 150, 25);
        
        btntambah.setBounds(370, 20, 85, 25);
        btnubah.setBounds(370, 55, 85, 25);
        btnhapus.setBounds(370, 90, 85, 25);
        btnbersih.setBounds(370, 125, 85, 25);
        
        //mengatur/meletakkan objek pada objek panel
        jpgaji.add(lblnokaryawan);
        jpgaji.add(lblnamakaryawan);
        jpgaji.add(lblalamatkaryawan);
        jpgaji.add(lblpelangganperhari);
        jpgaji.add(lblgajiperhari);
        jpgaji.add(lblmasukperbulan);
        jpgaji.add(lblgajiperbulan);
        
        jpgaji.add(txtnokaryawan);
        jpgaji.add(txtnamakaryawan);
        jpgaji.add(txtalamatkaryawan);
        jpgaji.add(txtpelangganperhari);
        jpgaji.add(txtgajiperhari);
        jpgaji.add(txtmasukperbulan);
        jpgaji.add(txtgajiperbulan);
        
        jpgaji.add(btntambah);
        jpgaji.add(btnubah);
        jpgaji.add(btnhapus);
        jpgaji.add(btnbersih);
        
        //mengatur objek agar dapat berinteraksi dengan user
        btntambah.addActionListener(this);
        btnubah.addActionListener(this);
        btnhapus.addActionListener(this);
        btnbersih.addActionListener(this);
        
        //menambahkan objek JPanel pada container frame
        getContentPane().add(jpgaji);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
            if (obj == btntambah){
                Tambah();
            }
            if (obj == btnubah) {
                Ubah();
            }
            if (obj == btnhapus) {
                Hapus();
            }
            Bersih();
        }
    void Bersih(){
        txtnokaryawan.setText("");
        txtnamakaryawan.setText("");
        txtalamatkaryawan.setText("");
        txtpelangganperhari.setText("");
        txtgajiperhari.setText("");
        txtmasukperbulan.setText("");
        txtgajiperbulan.setText("");
        
    }
    void Tambah(){
        try{
            MySQL ObjKoneksi = new MySQL();
            Connection con = ObjKoneksi.bukaKoneksi();
            Statement st = con.createStatement();
            String sql = "INSERT INTO gaji values "
                    + "('"+txtnokaryawan.getText()
                    +"','"+txtnamakaryawan.getText()
                    +"','"+txtalamatkaryawan.getText()
                    +"','"+txtpelangganperhari.getText()
                    +"','"+txtgajiperhari.getText()
                    +"','"+txtmasukperbulan.getText()
                    +"','"+txtgajiperbulan.getText()+"')";
            int row = st.executeUpdate(sql);
            
            if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah ditambahkan ke" +
                        " database","infomasi",JOptionPane.INFORMATION_MESSAGE);
                
                con.close();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Data tidak ditambahkan ke" +
                    " database","infomasi",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    void Ubah(){
       try{
            MySQL ObjKoneksi = new MySQL();
            Connection con = ObjKoneksi.bukaKoneksi();
            Statement st = con.createStatement();
           
            String sql = "UPDATE `gaji` SET `No.Karyawan` = '"+txtnokaryawan.getText()+"',`Nama Karyawan`='"+txtnamakaryawan.getText()+"',`Alamat Karyawan`='"+txtalamatkaryawan.getText()+"',`Pelanggan Perhari`='"+txtpelangganperhari.getText()+
                    "',`Gaji Perhari`='"+txtgajiperhari.getText()+"',`Masuk Perbulan`='"+txtmasukperbulan.getText()+
                    "' WHERE `Gaji Perbulan` ='"+txtgajiperbulan.getText()+"' ";
           
            int row = st.executeUpdate(sql);
            if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah di update ","infomasi",JOptionPane.INFORMATION_MESSAGE);
                con.close();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Data tidak diUbah"+
                    e.getMessage() ,"infomasi",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    void Hapus(){
        try{
            MySQL ObjKoneksi = new MySQL();
            Connection con = ObjKoneksi.bukaKoneksi();
            Statement st = con.createStatement();
            String sql = "DELETE FROM `gaji` WHERE nokaryawan = '"+txtnokaryawan.getText()+"' ";
            int row = st.executeUpdate(sql);
            if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah dihapus dari " +
                        " database","infomasi",JOptionPane.INFORMATION_MESSAGE);
                
                con.close();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Data tidak dihapus","infomasi",JOptionPane.
                    INFORMATION_MESSAGE);
        }
    }
    public static void main (String[] args){
        new gajikaryawan();
    }
}
