package com.hopu.service;

import com.hopu.dao.CheweiDao;
import com.hopu.entity.Chewei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheweiService {

    @Autowired
    private CheweiDao dao;

    public List<Chewei> cheweiList() {
        return dao.cheweiList();
    }

    public int addChewei(Chewei chewei) {
        return dao.addChewei(chewei);
    }
}
