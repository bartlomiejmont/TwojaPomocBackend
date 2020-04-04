package com.hackathon.TwojaPomocBackend;

import com.hackathon.TwojaPomocBackend.model.TestRequest;
import com.hackathon.TwojaPomocBackend.repository.TestRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    TestRequestRepository testRequestRepository;

    @Override
    public void run(String... args) throws Exception {
        LoadUsers();
    }

    private void LoadUsers() {
        testRequestRepository.save(new TestRequest("jd"));
    }


}