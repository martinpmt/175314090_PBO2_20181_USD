/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Pasien;

/**
 *
 * @author jarkom
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel kelaminLabel;
    private JLabel tanggalLahirLabel;
    private JLabel alamatLabel;
    private JLabel nikLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField nikText;
    private JRadioButton lakiRadio;
    private JRadioButton perempuanRadio;
    private JComboBox tanggalCombo;
    private JComboBox bulanCombo;
    private JComboBox tahunCombo;
    private JButton saveButton;
    private JButton simpanButton;
    private final String larikTanggal[] = {"Tanggal", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27",
        "28", "29", "30", "31"};
    private final String larikBulan[] = {"Bulan", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12"};
    private final String larikTahun[] = {"Tahun", "1960", "1961", "1962", "1963", "1964", "1965",
        "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975",
        "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985",
        "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994",
        "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002"};

    public TambahPasienBaruDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel("Form Tambah Pasien");
        judulLabel.setBounds(180, 25, 200, 20);
        this.add(judulLabel);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(30, 80, 150, 25);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(125, 80, 230, 25);
        this.add(namaText);

        kelaminLabel = new JLabel("Jenis Kelamin");
        kelaminLabel.setBounds(30, 120, 150, 25);
        this.add(kelaminLabel);

        lakiRadio = new JRadioButton("Laki-laki");
        lakiRadio.setBounds(125, 120, 150, 20);
        this.add(lakiRadio);

        perempuanRadio = new JRadioButton("Perempuan");
        perempuanRadio.setBounds(125, 140, 150, 20);
        this.add(perempuanRadio);

        ButtonGroup KelaminButonGroup = new ButtonGroup();
        KelaminButonGroup.add(lakiRadio);
        KelaminButonGroup.add(perempuanRadio);

        tanggalLahirLabel = new JLabel("Tanggal Lahir");
        tanggalLahirLabel.setBounds(30, 180, 80, 20);
        this.add(tanggalLahirLabel);

        tanggalCombo = new JComboBox(larikTanggal);
        tanggalCombo.setBounds(125, 180, 80, 20);
        this.add(tanggalCombo);

        bulanCombo = new JComboBox(larikBulan);
        bulanCombo.setBounds(225, 180, 80, 20);
        this.add(bulanCombo);

        tahunCombo = new JComboBox(larikTahun);
        tahunCombo.setBounds(325, 180, 80, 20);
        this.add(tahunCombo);

        alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(30, 220, 150, 25);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(125, 220, 230, 25);
        this.add(alamatText);

        nikLabel = new JLabel("NIK");
        nikLabel.setBounds(30, 260, 150, 25);
        this.add(nikLabel);

        nikText = new JTextField();
        nikText.setBounds(125, 260, 230, 25);
        this.add(nikText);

        simpanButton = new JButton("Simpan");
        simpanButton.setBounds(125, 300, 100, 30);
        this.add(simpanButton);
        simpanButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == simpanButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            baru.setNoRekamMedis(nikText.getText());
            Pasien.tambahPasienBaru(baru);
            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");
            this.dispose();
        }
    }
}
