package com.example.rest_v2.repository;

import com.example.rest_v2.entities.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdherentRepository extends JpaRepository<Adherent, Long> {
}
