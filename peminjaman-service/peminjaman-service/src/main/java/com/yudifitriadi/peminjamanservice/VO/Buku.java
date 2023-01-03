/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudifitriadi.peminjamanservice.vo;

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
public class Buku {
    private Long id;
    private String kodeBuku;
    private String judul;
    private String penerbit;
    private String tahunTerbit;
}
