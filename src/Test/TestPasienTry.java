/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import model.Dokter;
import model.Pasien;
import java.text.SimpleDateFormat;
import java.util.Date;
import dump.AntrianPasien;
import model.Klinik;

/**
 *
 * @author Martin Paramarta
 */
public class TestPasienTry {

    public static void main(String[] args) {
        Pasien pasien1 = new Pasien("Martin");
        Dokter dokter1 = new Dokter("Dr. Jono");
        AntrianPasien antri = new AntrianPasien();
        Klinik klinik = new Klinik("FARM666", "POLIKLINIK MAJU MUNDUR");

        try {
            pasien1.setAlamat("Klaten");
            pasien1.setTempatLahir("Klaten");
            pasien1.setTanggalLahir(3);
            pasien1.setBulanLahir(11);
            pasien1.setTahunLahir(1999);
            pasien1.setNoRekamMedis(pasien1.buatNomorRekamMedis());
            dokter1.setNoPegawai("696969");
            dokter1.setAlamat("Sleman");
            dokter1.setTempatLahir("Sorong");
            dokter1.setTanggalLahir(16);
            dokter1.setBulanLahir(10);
            dokter1.setTahunLahir(1980);
            antri.setKlinik(klinik);
            antri.Mendaftar(pasien1);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("===========================================");
        System.out.println(antri.getKlinik().getNamaKlinik());
        System.out.println("ID Klinik : " + antri.getKlinik().getIdKlinik());
        System.out.println("===========================================");
        for (int i = 0; i < antri.getDaftarPasien().size(); i++) {
            antri.TanggalAntrian();
            System.out.println("ANTRIAN KE-" + (i + 1));
            System.out.println("===========================================");
            System.out.println("PASIEN");
            System.out.println("===========================================");
            System.out.println("Nama                  : " + antri.getDaftarPasien().get(i).getNama());
            System.out.println("Alamat                : " + antri.getDaftarPasien().get(i).getAlamat());
            System.out.println("Tempat, Tanggal Lahir : " + antri.getDaftarPasien().get(i).getTempatLahir() + ","
                    + antri.getDaftarPasien().get(i).getTanggalLahir() + "/"
                    + antri.getDaftarPasien().get(i).getBulanLahir() + "/"
                    + antri.getDaftarPasien().get(i).getTahunLahir());
            System.out.println("No Rekam Medis        : " + antri.getDaftarPasien().get(i).getNoRekamMedis().toUpperCase());
            System.out.println("");
            System.out.println("===========================================");
            System.out.println("DOKTER");
            System.out.println("===========================================");
            System.out.println("Nama                  : " + dokter1.getNama());
            System.out.println("No Pegawai            : " + dokter1.getNoPegawai());
            System.out.println("Alamat                : " + dokter1.getAlamat());
            System.out.println("Tempat, Tanggal Lahir : " + dokter1.getTempatLahir() + ","
                    + dokter1.getTanggalLahir() + "/" + dokter1.getBulanLahir() + "/" + dokter1.getTahunLahir());
            System.out.println("");
            System.out.println("");
        }

    }
}
