package com.app.aforo255.historical_p.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.aforo255.historical_p.model.entity.Transaction_p;
import com.app.aforo255.historical_p.model.repository.Transaction_pRepository;

@Service
public class Transaction_pServiceImpl implements ITransaction_pService {
	
	@Autowired
	private Transaction_pRepository repository;
	
	
	@Override
	public Transaction_p save(Transaction_p transaction_p) {
		// TODO Auto-generated method stub
		return repository.save(transaction_p);
	}

	@Override
	public Iterable<Transaction_p> findByPrestamoId(Integer nroprestamo) {
		// TODO Auto-generated method stub
		return repository.findByPrestamoId(nroprestamo);
	}

	@Override
	public Iterable<Transaction_p> findAdll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
