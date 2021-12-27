package com.elasticapi.ElasticAPI.entities;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import com.elasticapi.ElasticAPI.Helper.Index;

@Document(indexName = Index.WORKER_INDEX)
@Setting(settingPath = "static/es-settings.json")
public class Worker extends User {
	

	@Field(type = FieldType.Double)
	private double experience;
	
	public Worker(String id, String name, String address, double experience) {
		super(id, name, address);
		this.experience = experience;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Worker [experience=" + experience + "]";
	}
	
}
