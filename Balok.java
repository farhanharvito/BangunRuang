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
public class Balok extends PersegiPanjang implements hitungRuang {
    double tinggi, volume, luasPermukaan;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    public Balok(double panjang, double lebar) {
        super(panjang, lebar);
    }
    @Override
    public double hitungVolume() {
        volume = this.panjang*this.lebar*this.tinggi;
        return volume;
    }
    @Override
    public double hitungLuasPermukaan() {
        luasPermukaan = 2*(this.panjang*this.lebar+this.panjang*this.tinggi+this.lebar*this.tinggi);
        return luasPermukaan;
    }
}