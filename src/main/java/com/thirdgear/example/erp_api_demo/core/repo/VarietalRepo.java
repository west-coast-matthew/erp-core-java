package com.thirdgear.example.erp_api_demo.core.repo;

import org.springframework.data.repository.CrudRepository;

import com.thirdgear.example.erp_api_demo.core.entity.Tank;
import com.thirdgear.example.erp_api_demo.core.entity.Varietal;

public interface VarietalRepo extends CrudRepository<Varietal, Long>{

}
