/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Pasien;

/**
 *
 * @author jarkom
 */
public class TambahAntrianDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel noRMLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JTextField noRMText;
    private JTextField namaText;
    private JTextField alamatText;
    private JButton simpanButton;

    public TambahAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel("Form Tambah Antrian");
        judulLabel.setBounds(85, 25, 200, 20);
        this.add(judulLabel);

        noRMLabel = new JLabel("no RM");
        noRMLabel.setBounds(30, 100, 150, 25);
        this.add(noRMLabel);

        noRMText = new JTextField();
        noRMText.setBounds(125, 100, 150, 25);
        this.add(noRMText);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(30, 150, 150, 25);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(125, 150, 150, 25);
        this.add(namaText);

        alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(30, 200, 150, 25);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(125, 200, 150, 25);
        this.add(alamatText);

        simpanButton = new JButton("Simpan");
        simpanButton.setBounds(125, 300, 100, 30);
        this.add(simpanButton);

        simpanButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == noRMText) {
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            if (cari == null) {
                JOptionPane.showMessageDialog(null, "Data Pasien " + noRMText.getText() + " Tidak Ada");
            } else {
                namaText.setText(cari.getNama());
                alamatText.setText(cari.getAlamat());
            }
        }

        if (e.getSource() == simpanButton) {
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            for (int i = 0; i < Pasien.daftarPasienKlinik.size(); i++) {
                if (cari == Pasien.daftarPasienKlinik.get(i)) {
                    JOptionPane.showMessageDialog(null, "Antrian Berhasil Ditambahkan - Nomor Antrian Anda : " + (i + 1));
                    this.dispose();
                }
            }
        }
    }
}
