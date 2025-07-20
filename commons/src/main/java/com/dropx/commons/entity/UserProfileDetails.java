package com.dropx.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "PROFILE_DETAILS")
public class UserProfileDetails {
    @Column(name = "USER_ID")
    @Id
    private int userId;
    @Column(name = "ADDERS")
    @OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AddressDetails> adders = new ArrayList<>();
}
