package com.app.aforo255.historical_p.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.aforo255.historical_p.model.entity.Transaction_p;

@Repository
public interface Transaction_pRepository extends MongoRepository<Transaction_p, String>{
	@Query("{'nroprestamo': ?0}")
	public Iterable<Transaction_p> findByPrestamoId(Integer nroprestamo);
}
