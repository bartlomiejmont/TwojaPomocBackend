package com.hackathon.TwojaPomocBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestRequest {

    public TestRequest(String s){
        this.description = s;
    }

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    @NotEmpty
    private String description;

}
