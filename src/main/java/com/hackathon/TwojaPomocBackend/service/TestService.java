package com.hackathon.TwojaPomocBackend.service;

import com.hackathon.TwojaPomocBackend.model.TestRequest;
import com.hackathon.TwojaPomocBackend.repository.TestRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    @Autowired
    private final TestRequestRepository testRequestRepository;

    public List<TestRequest> getAllTestRequests() {
        return (List<TestRequest>) testRequestRepository.findAll();
    }
}
