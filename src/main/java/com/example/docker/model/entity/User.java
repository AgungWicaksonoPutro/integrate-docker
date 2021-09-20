package com.example.docker.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "biodata")
public class User{
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "user_id")
    private String id;
    private String userName;
    private String name;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date birthDate;
    private Long phoneNumber;
    private String password;
    private Boolean status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
