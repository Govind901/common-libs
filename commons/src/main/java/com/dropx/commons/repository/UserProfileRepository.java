package com.dropx.commons.repository;

import com.dropx.commons.entity.UserProfileDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfileDetails,Integer> {

}
