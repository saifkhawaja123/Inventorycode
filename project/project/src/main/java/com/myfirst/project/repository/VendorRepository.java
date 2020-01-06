package com.myfirst.project.repository;

import com.myfirst.project.domain.User;
import com.myfirst.project.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository  extends JpaRepository<Vendor,Long> {
}
