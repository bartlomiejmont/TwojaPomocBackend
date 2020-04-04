package com.hackathon.TwojaPomocBackend;

import com.hackathon.TwojaPomocBackend.model.TestRequest;
import com.hackathon.TwojaPomocBackend.repository.TestRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwojaPomocBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwojaPomocBackendApplication.class, args);
	}

}
