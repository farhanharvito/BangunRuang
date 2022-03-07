/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author User
 */
public class Lingkaran implements hitungBidang {
    double jari, luas, keliling;

    public Lingkaran(double jari) {
        this.jari = jari;
    }
    @Override
    public double hitungLuas() {
        luas = Pi*Math.pow(this.jari, 2);
        return luas;
    }
    @Override
    public double hitungKeliling() {
        keliling = 2*Pi*this.jari;
        return keliling;
    }
}