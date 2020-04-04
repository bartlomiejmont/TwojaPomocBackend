package com.hackathon.TwojaPomocBackend.service;

import com.hackathon.TwojaPomocBackend.model.Request;
import com.hackathon.TwojaPomocBackend.model.TestRequest;
import com.hackathon.TwojaPomocBackend.repository.RequestRepository;
import com.hackathon.TwojaPomocBackend.repository.TestRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestService {

    @Autowired
    private final RequestRepository requestRepository;

    public Request create(Request request) {
        return requestRepository.save(request);
    }

    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }
}
