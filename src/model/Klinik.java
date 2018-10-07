/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jarkom
 */
public class Klinik {

    public static ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();

        public static void tambahKlinik(Klinik klinik){
        daftarKlinik.add(klinik);
    }
    
    public static Klinik cariKlinik(String namaKlinik){
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if(daftarKlinik.get(i).
                    getNamaKlinik().equalsIgnoreCase(namaKlinik))
            {
                return daftarKlinik.get(i);
            }
        }
        return null;
    }
    
    private String idKlinik, namaKlinik;

    /**
     * konstruktor untuk mendeklarasikan objek pasien dengan parameter lokal
     *
     * @param idKlinik
     * @param nama
     */
    public Klinik(String idKlinik, String namaKlinik) {
        // pernyataan bahwa variabel idKlinik sama dengan variabel lokal idKlinik
        this.idKlinik = idKlinik;
        // pernyataan bahwa variabel namaKlinik sama dengan variabel lokal namaKlinik
        this.namaKlinik = namaKlinik;
    }

    /**
     * method getIdKlinik digunakan untuk mengambil nilai dari variabel idKlinik
     * dengan pengembalian tipe String
     *
     * @return
     */
    public String getIdKlinik() {
        return idKlinik;
    }

    /**
     * method setIdKlinik digunakan untuk mengatur/set nilai dari variabel
     * idKlinik yang bertipe String
     *
     * @param idKlinik
     */
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    /**
     * method getNama digunakan untuk mengambil nilai dari variabel namaKlinik
     * dengan pengembalian tipe String
     *
     * @return
     */
    public String getNamaKlinik() {
        return namaKlinik;
    }

    /**
     * method setNama digunakan untuk mengatur/set nilai dari variabel
     * namaKlinik yang bertipe String
     *
     * @param nama
     */
    public void setNamaKlinik(String namaKlinik) {
        this.namaKlinik = namaKlinik;
    }

    /**
     * Konstruktor untuk mendeklarasikan objek pasien
     */
    public Klinik() {
    }

}
