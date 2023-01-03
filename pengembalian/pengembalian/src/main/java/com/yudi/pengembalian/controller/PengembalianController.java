/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.pengembalian.controller;

import com.yudi.pengembalian.entity.Pengembalian;
import com.yudi.pengembalian.service.PengembalianService;
import com.yudi.pengembalian.vo.ResponseTemplateVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("/pengembalian")
public class PengembalianController {
    @Autowired
    private PengembalianService pengembalianService;
    
    @GetMapping("/")
    public List<Pengembalian> getAllPengembalian(){
        return pengembalianService.getAllPengembalian();
    }
    
    @GetMapping("/{id}")
    public ResponseTemplateVO getPengembalianById(@PathVariable("id") Long id){
        return pengembalianService.getPengembalianById(id);
    }
    
    @PostMapping("/")
    public Pengembalian savePengembalian(@RequestBody Pengembalian pengembalian){
        return pengembalianService.savePengembalian(pengembalian);
    }
    
    @PutMapping("/")
    public Pengembalian updatePengembalian(@RequestBody Pengembalian pengembalian){
        return pengembalianService.updatePengembalian(pengembalian);
    }
    
    @DeleteMapping("/{id}")
    public void deletePengembalianById(@PathVariable("Id") Long id){
        pengembalianService.deletePengembalianById(id);
    }
}
