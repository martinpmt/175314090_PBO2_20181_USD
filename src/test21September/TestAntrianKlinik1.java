/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test21September;

import model.Pasien;

/**
 *
 * @author user only
 */
public class TestAntrianKlinik1 {

    public static void main(String[] args) {
        try {
            Pasien test = new Pasien();
            test.setNama("Puspa");
            test.setAlamat("klaten");
            Pasien test1 = new Pasien();
            test1.setNama("Adi");
            test1.setAlamat("klaten");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

