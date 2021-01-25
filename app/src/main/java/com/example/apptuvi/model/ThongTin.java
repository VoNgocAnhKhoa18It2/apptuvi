package com.example.apptuvi.model;

import java.io.Serializable;

public class ThongTin implements Serializable {
    private String ten;
    private String ngay;
    private String thang;
    private String nam;
    private String gio;
    private String phut;
    private String gioiTinh;

    public ThongTin() {
    }

    public ThongTin(String ten, String ngay, String thang, String nam, String gio, String phut, String gioiTinh) {
        this.ten = ten;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.gio = gio;
        this.phut = phut;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }

    public String getPhut() {
        return phut;
    }

    public void setPhut(String phut) {
        this.phut = phut;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return ten + ", " + gioiTinh +
                ", ngày " + ngay +
                "/" + thang +
                "/" + nam + '\'' +
                ", " + gio + "h" +
                ", " + phut + " phút";
    }

    public String convertSolar2Lunar () {
        return ChuyenDuongSangAm.convertSolar2Lunar(Integer.parseInt(ngay),Integer.parseInt(thang),Integer.parseInt(nam),7.0);
    }
}
