package com.alki.mortaback.data.repositories;

import com.alki.mortaback.data.model.ThreatType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThreatTypeRepository extends JpaRepository<ThreatType, Long> {
}