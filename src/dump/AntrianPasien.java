/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dump;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Klinik;
import model.Pasien;

/**
 *
 * @author Martin Paramarta
 */
public class AntrianPasien {

    public static ArrayList<AntrianPasien> daftarAntrian
            = new ArrayList<AntrianPasien>();

    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    /**
     * Konstruktor untuk mendeklarasikan objek AntrianPasien
     */
    public AntrianPasien() {

    }

    /**
     * method getKlinik digunakan untuk mengambil nilai dari variabel klinik
     * dengan pengembalian tipe Klinik
     *
     * @return
     */
    public Klinik getKlinik() {
        return klinik;
    }

    /**
     * method setKlinik digunakan untuk mengatur/set nilai dari variabel klinik
     * yang bertipe String
     *
     * @param klinik
     */
    public void setKlinik(Klinik klinik) {
        // variabel klinik sama dengan variabel lokal klinik
        this.klinik = klinik;
    }

    /**
     * method untuk mengambil nilai dari variabel daftarPasien
     *
     * @return
     */
    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    /**
     * method setDaftarPasien digunakan untuk mengatur/set nilai dari variabel
     * daftarPasien
     *
     * @param daftarPasien
     */
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        // variabel daftarPasien sama dengan variabel lokal daftarPasien
        this.daftarPasien = daftarPasien;
    }

    /**
     * Method untuk menampilkan tanggal dan waktu antrian
     */
    public void TanggalAntrian() {
        // membuat objek baru bernama date dengan tipe data Date
        Date date = new Date();
        // membuat objek bernama format bertipe simpleDateFormat sebagai format tampilan tanggal
        SimpleDateFormat format = new SimpleDateFormat("E dd/MM/yyy 'at' hh:mm:ss");
        // menampilkan objek format dengan format date
        System.out.println(format.format(date));
    }

    /**
     * Method Mendaftar unutk mendaftar pasien baru di nomor antrian dengan
     * parameter pasien bertipe Pasieb
     *
     * @param pasien
     * @throws Exception
     */
    public void Mendaftar(Pasien pasien) {
        // mengisi data variabel daftarPasien dengan variabel lokal daftarPasien 
        daftarPasien.add(pasien);
    }

}
