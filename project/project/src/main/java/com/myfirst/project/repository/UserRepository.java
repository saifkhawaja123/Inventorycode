package com.myfirst.project.repository;


import com.myfirst.project.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Every operation related to database is performed through repository
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
