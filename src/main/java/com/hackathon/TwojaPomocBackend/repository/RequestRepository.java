package com.hackathon.TwojaPomocBackend.repository;

import com.hackathon.TwojaPomocBackend.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request,Long> {
}
