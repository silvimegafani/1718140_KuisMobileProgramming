package com.example.kuismobileprogramming;

import android.graphics.drawable.Drawable;

public class Keluarga {
    private String nama,keterangan;
    public Drawable gambar;

    public Keluarga(Drawable gambar, String nama, String keterangan){
        this.gambar = gambar;
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String K) {
        this.keterangan = keterangan;
    }

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }
}
