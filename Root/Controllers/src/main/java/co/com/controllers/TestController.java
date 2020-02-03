package co.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.models.responses.TestResponse;
import co.com.services.TestServices;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private TestServices testServices;
	
	@GetMapping(value = "/getTest")
    public @ResponseBody TestResponse getTest() {
        return testServices.getTest();
    }

}
