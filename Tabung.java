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
public class Tabung extends Lingkaran implements hitungRuang {
    double tinggi, volume, luasPermukaan;

    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    public Tabung(double jari) {
        super(jari);
    }
    @Override
    public double hitungVolume() {
        volume = 2*Pi*Math.pow(this.jari, 2)*this.tinggi;
        return volume;
    }
    @Override
    public double hitungLuasPermukaan() {
        luasPermukaan = (2*Pi*this.jari*this.tinggi)+(2*Pi*Math.pow(this.jari, 2));
        return luasPermukaan;
    }
}