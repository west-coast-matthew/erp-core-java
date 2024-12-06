package com.thirdgear.example.erp_api_demo.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.core.entity.OperationCode;
import com.thirdgear.example.erp_api_demo.core.repo.OperationCodeRepository;
import com.thirdgear.example.erp_api_demo.core.service.OperationCodeService;

@Service("OperationCodeService")
public class OperationCodeServiceImpl implements OperationCodeService {

    @Autowired
    OperationCodeRepository repo;

    @Override
    public Iterable<OperationCode> getOperationCodes() {
        return repo.findAll();
    }
}