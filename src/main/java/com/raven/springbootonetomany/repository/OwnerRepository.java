package com.raven.springbootonetomany.repository;

import com.raven.springbootonetomany.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Integer> {
}
