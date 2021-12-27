package com.elasticapi.ElasticAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elasticapi.ElasticAPI.entities.Worker;
import com.elasticapi.ElasticAPI.repository.WorkerRepository;

@Service
public class WorkerService implements DataService{
	
	private final WorkerRepository repository;
	
	@Autowired
	public WorkerService(WorkerRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void save(final Worker worker) {
		repository.save(worker);
	}
	
	@Override
	public Worker findById(final String Id) {
		return repository.findById(Id).orElse(null);
	}
	
}
