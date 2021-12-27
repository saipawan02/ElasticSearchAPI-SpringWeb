package com.elasticapi.ElasticAPI.service;

import com.elasticapi.ElasticAPI.entities.User;
import com.elasticapi.ElasticAPI.entities.Worker;

public interface DataService {
	
	public User findById(final String Id);
	void save(Worker worker);
}
