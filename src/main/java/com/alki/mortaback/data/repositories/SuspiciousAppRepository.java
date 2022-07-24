package com.alki.mortaback.data.repositories;

import com.alki.mortaback.data.model.SuspiciousApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuspiciousAppRepository extends JpaRepository<SuspiciousApp, Long> {
}