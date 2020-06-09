package modul6;
/**
 *
 * @author Elysha Fitriana
 */
import javax.swing.*;
import java.awt.event.*;
public class gajikaryawan extends JFrame implements ActionListener {
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
    
    gajikaryawan(){
        super("DATA GAJI KARYAWAN");
        setSize(500,320);
        jpgaji.setLayout(null);
        
        lblnokaryawan.setBounds(15, 20, 150, 25);
        lblnamakaryawan.setBounds(15, 55, 150, 25);
        lblalamatkaryawan.setBounds(15, 90, 150, 25);
        lblpelangganperhari.setBounds(15, 125, 150, 25);
        lblgajiperhari.setBounds(15, 160, 150, 25);
        lblmasukperbulan.setBounds(15, 195, 150, 25);
        lblgajiperbulan.setBounds(15, 230, 150, 25);
        
        txtnokaryawan.setBounds(130, 20, 150, 25);
        txtnamakaryawan.setBounds(130, 55, 150, 25);
        txtalamatkaryawan.setBounds(130, 90, 150, 25);
        txtpelangganperhari.setBounds(130, 125, 150, 25);
        txtgajiperhari.setBounds(130, 160, 150, 25);
        txtmasukperbulan.setBounds(130, 195, 150, 25);
        txtgajiperbulan.setBounds(130, 230, 150, 25);

        btntambah.setBounds(340, 20, 85, 25);
        btnubah.setBounds(340, 55, 85, 25);
        btnhapus.setBounds(340, 90, 85, 25);
        btnbersih.setBounds(340, 125, 85, 25);
        
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

                
        btntambah.addActionListener(this);
        btnubah.addActionListener(this);
        btnhapus.addActionListener(this);
        btnbersih.addActionListener(this);

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
        void Bersih() {
            
        }
        void Tambah() {
            
        }
        void Ubah() {
            
        }
        void Hapus() {
            
        }
    public static void main(String[] args) {
        new gajikaryawan();
    }
}
 
    

