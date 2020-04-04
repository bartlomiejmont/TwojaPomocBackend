package com.hackathon.TwojaPomocBackend.repository;

import com.hackathon.TwojaPomocBackend.model.TestRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRequestRepository extends JpaRepository<TestRequest, Long> {
}
