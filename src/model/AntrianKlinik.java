/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user only
 */
public class AntrianKlinik {

    public static ArrayList<AntrianKlinik> daftarAntrian
            = new ArrayList<AntrianKlinik>();

    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        // cari antrian dalam list daftarAntri
        if (cariAntrian(tanggal, bulan, tahun, klinik) == null) {
            // tambah dalam list antrian
            daftarAntrian.add(antrian);
        } else {
            System.out.println("Antrian Sudah Ada");
        }
    }

    public static AntrianKlinik cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getTanggalAntrian() == tanggal
                    && daftarAntrian.get(i).getBulanAntrian() == bulan
                    && daftarAntrian.get(i).getTahunAntrian() == tahun
                    && daftarAntrian.get(i).getKlinik().getNamaKlinik().equalsIgnoreCase(klinik.getNamaKlinik())
                    && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())) {
                return daftarAntrian.get(i);
            }
        }
        return null;
    }
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;

    private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();

    public AntrianKlinik() {
    }

    public AntrianKlinik(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
        this.klinik = klinik;
    }

    public void mendaftar(Pasien pasien) {
        getDaftarPasien().add(pasien);
    }

    /**
     * @return the daftarPasienAntri
     */
    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasienAntri;
    }

    /**
     * @param daftarPasien the daftarPasienAntri to set
     */
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasienAntri = daftarPasien;
    }

    /**
     * @return the tanggalAntrian
     */
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    /**
     * @param tanggalAntrian the tanggalAntrian to set
     */
    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    /**
     * @return the bulanAntrian
     */
    public int getBulanAntrian() {
        return bulanAntrian;
    }

    /**
     * @param bulanAntrian the bulanAntrian to set
     */
    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    /**
     * @return the tahunAntrian
     */
    public int getTahunAntrian() {
        return tahunAntrian;
    }

    /**
     * @param tahunAntrian the tahunAntrian to set
     */
    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }

    /**
     * @return the klinik
     */
    public Klinik getKlinik() {
        return klinik;
    }

    /**
     * @param klinik the klinik to set
     */
    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public String toString() {
        return String.valueOf(tahunAntrian)
                + String.valueOf(bulanAntrian)
                + String.valueOf(tanggalAntrian)
                + klinik.getIdKlinik()
                + klinik.getNamaKlinik();
    }

}
