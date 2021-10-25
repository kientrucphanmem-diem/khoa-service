package com.example.khoaservice.service;

import com.example.khoaservice.entity.Khoa;
import com.example.khoaservice.repository.KhoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhoaService {
    @Autowired
    private KhoaRepository khoaRepository;

    public Khoa saveKhoa(Khoa khoa){
        return khoaRepository.save(khoa);
    }

    public Khoa findById(int id){
        return khoaRepository.findById(id).get();
    }
}
