package com.example.khoaservice.controller;


import com.example.khoaservice.entity.Khoa;
import com.example.khoaservice.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/khoa")
public class KhoaController {

    @Autowired
    private KhoaService khoaService;

    @GetMapping("/{id}")
    public Khoa findById(@PathVariable("id") int id){
        return khoaService.findById(id);
    }
    @PostMapping("/")
    public Khoa saveKhoa(@RequestBody Khoa khoa){
        return khoaService.saveKhoa(khoa);
    }
}
