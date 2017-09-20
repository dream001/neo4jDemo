package com.datafin.neo4j.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.Result;
import org.springframework.stereotype.Service;

import com.datafin.neo4j.dao.GoogleProfileRepository;
import com.datafin.neo4j.node.GoogleProfile;

@Service("googleProfileService")
public class GoogleProfileServiceImpl implements GoogleProfileService {

	
	@Autowired
	private GoogleProfileRepository googleProfileRepository;
	
	
	public GoogleProfile create(GoogleProfile profile) {
		return googleProfileRepository.save(profile);
	}

	public void delete(GoogleProfile profile) {
		googleProfileRepository.delete(profile);
	}

	public GoogleProfile findById(long id) {
		return googleProfileRepository.findOne(id);
	}

	public Result<GoogleProfile> findAll() {
		return googleProfileRepository.findAll();
	}

}
