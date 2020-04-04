package com.hackathon.TwojaPomocBackend.controller;

import com.hackathon.TwojaPomocBackend.model.TestRequest;
import com.hackathon.TwojaPomocBackend.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @RequestMapping(path = "/testRequests", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TestRequest>> getAll(){
        List<TestRequest> testRequests =  testService.getAllTestRequests();
        return testRequests.isEmpty()
                ? ResponseEntity.status(HttpStatus.NOT_FOUND).build() : ResponseEntity.ok().body(testRequests);
    }

}
