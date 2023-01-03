/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.pengembalian.service;

import com.yudi.pengembalian.entity.Pengembalian;
import com.yudi.pengembalian.repository.PengembalianRepository;
import com.yudi.pengembalian.vo.Peminjaman;
import com.yudi.pengembalian.vo.ResponseTemplateVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author user
 */
@Service
public class PengembalianService {
    @Autowired
    private PengembalianRepository pengembalianRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Pengembalian savePengembalian(Pengembalian pengembalian){
        return pengembalianRepository.save(pengembalian);
    }
    
    public ResponseTemplateVO getPengembalianById(Long id){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Pengembalian pengembalian;
        pengembalian = pengembalianRepository
                .findPengembalianById(id);
        Peminjaman peminjaman = restTemplate
                .getForObject("http://localhost:9000/peminjaman/"+pengembalian
                        .getPeminjamanId(), Peminjaman.class);
        vo.setPengembalian(pengembalian);
        vo.setPeminjaman(peminjaman);
        return vo;
    }
    
    public List<Pengembalian> getAllPengembalian(){
        return pengembalianRepository.findAll();
    }
    
    public Pengembalian updatePengembalian(Pengembalian pengembalian){
        return pengembalianRepository.save(pengembalian);
    }
    
    public void deletePengembalianById(Long id){
        pengembalianRepository.deleteById(id);
    }
}

