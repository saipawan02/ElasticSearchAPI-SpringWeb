package com.elasticapi.ElasticAPI.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.elasticapi.ElasticAPI.entities.Worker;

public interface WorkerRepository extends ElasticsearchRepository<Worker, String>{

}
