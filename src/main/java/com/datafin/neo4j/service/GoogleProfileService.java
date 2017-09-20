package com.datafin.neo4j.service;

import org.springframework.data.neo4j.conversion.Result;

import com.datafin.neo4j.node.GoogleProfile;

public interface GoogleProfileService {

	GoogleProfile create(GoogleProfile profile);
	void delete(GoogleProfile profile);		
	GoogleProfile findById(long id);		
	Result<GoogleProfile> findAll();
}
