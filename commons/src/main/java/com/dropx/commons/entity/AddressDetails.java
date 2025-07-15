package com.dropx.commons.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "ADDRESS_DETAILS")
public class AddressDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "PHNO")
    private String phoneNumber;
    @Column(name = "PINCODE")
    private String pincode;
    @Column(name = "CITY")
    private String city;
    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserProfileDetails userProfile;
}
