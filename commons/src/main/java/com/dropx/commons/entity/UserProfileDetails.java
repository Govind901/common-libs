package com.dropx.commons.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PROFILE_DETAILS")
public class UserProfileDetails {
    @Column(name = "USER_ID")
    @Id
    private int userId;
    @Column(name = "ADDERS")
    @OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AddressDetails> adders;
}
