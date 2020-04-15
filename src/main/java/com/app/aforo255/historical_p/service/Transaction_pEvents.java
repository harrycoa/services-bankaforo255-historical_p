package com.app.aforo255.historical_p.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.aforo255.historical_p.model.entity.Transaction_p;
import com.app.aforo255.historical_p.model.repository.Transaction_pRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.*;

@Service
public class Transaction_pEvents {
	
	private Logger log = LoggerFactory.getLogger(Transaction_pEvents.class);
	@Autowired
	private Transaction_pRepository repository;	
	@Autowired
	ObjectMapper objectMapper;

	public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonProcessingException {

		Transaction_p transaction_pEvent = objectMapper.readValue(consumerRecord.value(), Transaction_p.class);
		log.info("transaction_pEvent : {} ", transaction_pEvent);
		repository.save(transaction_pEvent);
		log.info("Successfully Persisted the transaction Event {}", transaction_pEvent);
	}

}
