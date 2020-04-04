package com.hackathon.TwojaPomocBackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import net.bytebuddy.implementation.bind.annotation.Default;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @NonNull
    private String city;

    @NotEmpty
    @NonNull
    private String street;

    @NotEmpty
    @NonNull
    private String phone;

    @NonNull
    private LocalDateTime publishDate;

    @NotEmpty
    @NonNull
    private String description;

    @NonNull
    private Boolean isActive;

}
