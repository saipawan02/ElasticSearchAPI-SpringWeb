package com.elasticapi.ElasticAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elasticapi.ElasticAPI.entities.Worker;
import com.elasticapi.ElasticAPI.service.WorkerService;

@RestController
@RequestMapping("/worker")
public class WorkerController {
	
	private final WorkerService service;
	
	@Autowired
	public WorkerController(WorkerService service) {
		this.service = service;
	}
	
	@PostMapping
	public void save(@RequestBody final Worker worker) {
		System.out.println("this is a post request to worker index");
		service.save(worker);
	}
	
	@GetMapping("/{Id}")
	public Worker findById(@PathVariable final String Id) {
		return service.findById(Id);
	}
	
	@GetMapping("/info")
	public String info() {
		System.out.println("this is a get request to info end point");
		return "This is an index which store the information regarding workers!!!";
	}
	
	
}
