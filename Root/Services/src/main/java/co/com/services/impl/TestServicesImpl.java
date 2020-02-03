package co.com.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.daos.TestRepository;
import co.com.models.entities.Test;
import co.com.models.responses.TestResponse;
import co.com.services.TestServices;

@Service
public class TestServicesImpl implements TestServices {
	
	@Autowired
	private TestRepository testRepository;

	@Override
	public TestResponse getTest() {
		Optional<Test> testOptional = this.testRepository.findById((long) 1);
		TestResponse testResponse = new TestResponse();
		if( testOptional.isPresent() ){
			testResponse.setMessage(testOptional.get().getDescription());
		} else {
			testResponse.setMessage("Register with id 1 in table Test not found.");
		}		
		return testResponse;
	}

}
