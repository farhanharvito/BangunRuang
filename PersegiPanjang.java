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
   public class PersegiPanjang implements hitungBidang {
    double panjang, lebar, luas, keliling;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public double hitungLuas() {
        luas = this.panjang*this.lebar;
        return luas;
    }
    @Override
    public double hitungKeliling() {
        keliling = 2*(this.panjang+this.lebar);
        return keliling;
    }
} 

