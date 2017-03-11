package model;

/**
 * Created by billy on 11-Mar-17.
 */

public class Hoadon {
    private String mahd,makh;
    private  int slban,dongia,datcoc,tongtien;

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public int getSlban() {
        return slban;
    }

    public void setSlban(int slban) {
        this.slban = slban;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getDatcoc() {
        return datcoc;
    }

    public void setDatcoc(int datcoc) {
        this.datcoc = datcoc;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public Hoadon() {

    }

    public Hoadon(String mahd, String makh, int slban, int dongia, int datcoc, int tongtien) {

        this.mahd = mahd;
        this.makh = makh;
        this.slban = slban;
        this.dongia = dongia;
        this.datcoc = datcoc;
        this.tongtien = tongtien;
    }

    @Override
    public String toString() {
        return mahd + makh;
    }
}