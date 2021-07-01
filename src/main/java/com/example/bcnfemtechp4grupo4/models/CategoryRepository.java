package com.example.bcnfemtechp4grupo4.models;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository <Category, Long> { }
