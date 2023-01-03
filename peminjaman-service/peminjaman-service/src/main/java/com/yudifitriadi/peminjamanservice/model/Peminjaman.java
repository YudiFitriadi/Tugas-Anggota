/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudifitriadi.peminjamanservice.model;

/**
 *
 * @author user
 */
public class Peminjaman {
    private Long IdAnggota;
    private String IdBuku;
    private String IdPeminjaman;
    private String TglKembali;
    private String TglPinjam;
    private String Tabel;
    

    public Peminjaman (){
        
    }

    public Long getIdAnggota() {
        return IdAnggota;
    }

    public void setIdAnggota(Long IdAnggota) {
        this.IdAnggota = IdAnggota;
    }

    public String getIdBuku() {
        return IdBuku;
    }

    public void setIdBuku(String IdBuku) {
        this.IdBuku = IdBuku;
    }

    public String getIdPeminjaman() {
        return IdPeminjaman;
    }

    public void setIdPeminjaman(String IdPeminjaman) {
        this.IdPeminjaman = IdPeminjaman;
    }

    public String getTglKembali() {
        return TglKembali;
    }

    public void setTglKembali(String TglKembali) {
        this.TglKembali = TglKembali;
    }

    public String getTglPinjam() {
        return TglPinjam;
    }

    public void setTglPinjam(String TglPinjam) {
        this.TglPinjam = TglPinjam;
    }

    public String getTabel() {
        return Tabel;
    }

    public void setTabel(String Tabel) {
        this.Tabel = Tabel;
    }
    
}