package com.dropx.commons.repository;

import com.dropx.commons.entity.AddressDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDetailsRepository extends JpaRepository<AddressDetails,Long> {
}
