package com.spring.springprojectdemo.repositories;

import com.spring.springprojectdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
