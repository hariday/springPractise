package com.app.spring.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.spring.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
