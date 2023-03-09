package com.ozan.task.repository;

import com.ozan.task.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<UserDetail,Long> {
    Optional<UserDetail> findByEmail(String email);
    Boolean existsByEmail(String email);
}
