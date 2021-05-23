package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.Entity.Country;

@CrossOrigin("*")
//@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
public interface CountryRepository extends JpaRepository<Country, Integer> {
   
//	Page<Country> findAll(@RequestParam("name") String name, Pageable pageable);
//		Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
}
