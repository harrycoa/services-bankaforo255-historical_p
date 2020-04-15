package com.app.aforo255.historical_p.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.app.aforo255.historical_p.model.entity.Transaction_p;
import com.app.aforo255.historical_p.service.ITransaction_pService;

@RestController
public class Historical_pController {
	
	@Autowired
	private ITransaction_pService transaction_p;

	@GetMapping("/transaction_p/{nroprestamo}")
	public ResponseEntity<?> obtenerTansacciones(@PathVariable Integer nroprestamo) {
		Iterable<Transaction_p> Itransaction = transaction_p.findByPrestamoId(nroprestamo);
		return ResponseEntity.ok(Itransaction);
	}

	@GetMapping("/listar_p")
	public List<Transaction_p> listar() {
		return (List<Transaction_p>) transaction_p.findAdll();
	}

}
