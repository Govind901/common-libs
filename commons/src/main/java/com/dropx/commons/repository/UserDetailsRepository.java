package com.dropx.commons.repository;

import com.dropx.commons.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

    @Query("select u from UserDetails u where u.email = :email")
    UserDetails findByEmail(String email);
}
