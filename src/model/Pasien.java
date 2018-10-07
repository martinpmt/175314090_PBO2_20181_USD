/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Martin Paramarta
 */
public class Pasien {

    private String noRM;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    public static void setDaftarPasienKlinik(ArrayList<Pasien> daftarPasienKlinik) {
        Pasien.daftarPasienKlinik = daftarPasienKlinik;
    }

    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.noRM = nik;
    }

    /**
     * konstruktor untuk mendeklarasikan objek pasien
     */
    public Pasien() {

    }

    /**
     * konstruktor untuk mendeklarasikan objek pasien dengan parameter nama yang
     * bertipe String
     *
     * @param nama
     */
    public Pasien(String nama) {
        // pernyataan bahwa variabel nama sama dengan variabel lokal nama
        this.nama = nama;
    }

    /**
     * method getNoRekamMedis digunakan untuk mengambil nilai dari variabel
 noRM dengan pengembalian tipe String
     *
     * @return
     */
    public String getNoRekamMedis() {
        return noRM;
    }

    /**
     * method setNoRekamMedis digunakan untuk mengatur/set nilai dari variabel
 noRM yang bertipe String
     *
     * @param noRekamMedis
     */
    public void setNoRekamMedis(String noRekamMedis) {
        this.noRM = noRekamMedis;
    }

    /**
     * method getNama digunakan untuk mengambil nilai dari variabel nama dengan
     * pengembalian tipe String
     *
     * @return
     */
    public String getNama() {
        return nama;
    }

    /**
     * method setNama digunakan untuk mengatur/set nilai dari variabel nama yang
     * bertipe String
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * method getAlamat digunakan untuk mengambil nilai dari variabel alamat
     * dengan pengembalian tipe String
     *
     * @return
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * method setAlamat digunakan untuk mengatur/set nilai dari variabel alamat
     * yang bertipe String
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * method getTempatLahir digunakan untuk mengambil nilai dari variabel
     * tempatLahir dengan pengembalian tipe String
     *
     * @return
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * method setTempatLahir digunakan untuk mengatur/set nilai dari variabel
     * tempatLahir yang bertipe String
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    /**
     * method getTanggalLahir digunakan untuk mengambil nilai dari variabel
     * tanggalLahir dengan pengembalian tipe String
     *
     * @return
     */
    public int getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * method setTanggalLahir digunakan untuk mengatur/set nilai dari variabel
     * tanggalLahir yang bertipe int
     *
     * @param tanggalLahir
     * @throws Exception
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        // pengecekan isi dari variabel tanggalLahir harus lebih dari 0
        if (tanggalLahir > 0) {
            // pengecekan isi dari variabel tanggalLahir harus kurang dari 32
            if (tanggalLahir < 32) {
                this.tanggalLahir = tanggalLahir;
            } else {
                // pernyataan apabila isi dari variabel tanggalLahir lebih dari 31
                throw new Exception("Tanggal Salah ===> Lebih dari 31");
            }
        } else {
            // pernyataan apabila isi dari variabel tanggalLahir kurang dari atau sama dengan 0
            throw new Exception("Tanggal Salah ===> Kurang dari atau sama dengan 0");
        }
    }

    /**
     * method getBulanLahir digunakan untuk mengambil nilai dari variabel
     * bulanLahir dengan pengembalian tipe int
     *
     * @return
     */
    public int getBulanLahir() {
        return bulanLahir;
    }

    /**
     * method setBulanLahir digunakan untuk mengatur/set nilai dari variabel
     * bulanLahir yang bertipe int
     *
     * @param bulanLahir
     * @throws Exception
     */
    public void setBulanLahir(int bulanLahir) throws Exception {
        // pengecekan isi dari variabel bulanLahir harus lebih dari 0
        if (bulanLahir > 0) {
            // pengecekan isi dari variabel bulanLahir harus kurang dari 13
            if (bulanLahir < 13) {
                this.bulanLahir = bulanLahir;
            } else {
                // pernyataan apabila isi dari variabel bulanLahir lebih dari 12
                throw new Exception("Bulan Salah ===> Lebih dari 12");
            }
        } else {
            // pernyataan apabila isi dari variabel bulanLahir kurang dari atau sama dengan 0
            throw new Exception("Bulan Salah ===> Kurang dari atau sama dengan 0");
        }

    }

    /**
     * method getTanggalLahir digunakan untuk mengambil nilai dari variabel
     * tanggalLahir dengan pengembalian tipe int
     *
     * @return
     */
    public int getTahunLahir() {
        return tahunLahir;
    }

    /**
     * method setTahunLahir digunakan untuk mengatur/set nilai dari variabel
     * tahunLahir yang bertipe int
     *
     * @param tahunLahir
     * @throws Exception
     */
    public void setTahunLahir(int tahunLahir) throws Exception {
        // pengecekan isi dari variabel tahunLahir harus lebih dari 0
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            // pernyataan apabila isi dari variabel tahunLahir kurang dari atau sama dengan 0
            throw new Exception("Tahun Salah");
        }
    }

    /**
     * method buatNomorRekamMedis digunakan untuk membuat nomor rekam medis yang
     * terdiri dari tanggal pasien masuk ditambah 3 huruf pertama dari nama
     * pasien
     *
     * @return
     */
    public String buatNomorRekamMedis() {
        // deklarasi variabel nomorRekamMedis bertipe String
        String nomorRekamMedis;
        // membuat objek baru bernama date dengan tipe data Date
        Date date = new Date();
        // membuat objek bernama format bertipe simpleDateFormat sebagai format tampilan tanggal
        SimpleDateFormat format = new SimpleDateFormat("yyyMMdd");
        // mendeklarasikan nilai dari variabel nomorRekamMedis yaitu tanggal ditambah 3 huruf pertama dari variabel nama
        nomorRekamMedis = format.format(date) + nama.substring(0, 3);
        // pengembalian nilai variabel nomorRekamMedis
        return nomorRekamMedis;
    }

    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasienKlinik.add(pasien);
    }

    public static Pasien cariPasien(String NoRM) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).noRM.equals(NoRM)) {
                return daftarPasienKlinik.get(i);
            }
        }
        return null;
}

}
