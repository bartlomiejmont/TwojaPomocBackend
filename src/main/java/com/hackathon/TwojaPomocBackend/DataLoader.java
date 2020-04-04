package com.hackathon.TwojaPomocBackend;

import com.hackathon.TwojaPomocBackend.model.Request;
import com.hackathon.TwojaPomocBackend.model.TestRequest;
import com.hackathon.TwojaPomocBackend.repository.RequestRepository;
import com.hackathon.TwojaPomocBackend.repository.TestRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    TestRequestRepository testRequestRepository;

    @Autowired
    RequestRepository requestRepository;

    @Override
    public void run(String... args) throws Exception {
        LoadUsers();
    }

    private void LoadUsers() {
        testRequestRepository.save(new TestRequest("jd"));
        requestRepository.save(new Request(1L,"Gdansk", "Grunwadzka", "123456789", LocalDateTime.now(), "zakupy", true));
    }


}