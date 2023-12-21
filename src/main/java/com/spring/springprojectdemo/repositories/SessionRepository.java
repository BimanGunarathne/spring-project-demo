package com.spring.springprojectdemo.repositories;

import com.spring.springprojectdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
