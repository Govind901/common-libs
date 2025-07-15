package com.dropx.login.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "USER_DETAILS")
public class UserDetails {
    @Column(name = "USER_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "EMAIL",unique = true)
    private String email;
    @Column(name = "PHONE_NUMBER")
    private String phoneNo;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "OTP")
    private String opt;
    @Column(name = "OTP_EXPIRY")
    private LocalDateTime optExpiry;
    @Column(name = "EMAIL_VERIFIED")
    private boolean emailVerified = false;
}
