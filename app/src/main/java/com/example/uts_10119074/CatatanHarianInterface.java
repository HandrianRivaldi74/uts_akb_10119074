package com.example.uts_10119074;
//NIM : 10119074
//NAMA : HANDRIAN RIVALDI
//KELAS : IF2
import android.database.Cursor;

public interface CatatanHarianInterface {

    public Cursor read();
    public boolean create(CatatanHarian catatanHarian);
    public boolean update(CatatanHarian catatanHarian);
    public boolean delete(String id);
}
