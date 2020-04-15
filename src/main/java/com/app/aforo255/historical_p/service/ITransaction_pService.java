package com.app.aforo255.historical_p.service;

import com.app.aforo255.historical_p.model.entity.Transaction_p;

public interface ITransaction_pService {
	
	
	public Transaction_p save (Transaction_p transaction_p);
	public Iterable <Transaction_p> findByPrestamoId(Integer nroprestamo);
	public Iterable<Transaction_p> findAdll();

}
