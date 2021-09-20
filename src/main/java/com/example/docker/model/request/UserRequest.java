package com.example.docker.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String name;
    private String userName;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date birthDate;
    private Long phoneNumber;
    private String password;
}
