package com.example.uts_10119074;
//NIM : 10119074
//NAMA : HANDRIAN RIVALDI
//KELAS : IF2


public class CatatanHarian {
    private String id;
    private String tanggal;
    private String judul;
    private String kategori;
    private String isiCatatan;

    public CatatanHarian(String id, String tanggal, String judul, String kategori, String isiCatatan) {
        this.id = id;
        this.tanggal = tanggal;
        this.judul = judul;
        this.kategori = kategori;
        this.isiCatatan = isiCatatan;
    }

    public String getId() {
        return id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getJudul() {
        return judul;
    }

    public String getKategori() {
        return kategori;
    }

    public String getIsiCatatan() {
        return isiCatatan;
    }
}
