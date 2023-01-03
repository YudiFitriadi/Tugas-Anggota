/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudifitriadi.peminjamanservice.vo;

import com.yudifitriadi.peminjamanservice.entity.Peminjaman;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {
    private Anggota anggota;
    private Buku buku;
    private Peminjaman peminjaman;

}
