package com.alki.mortaback.data.repositories;

import com.alki.mortaback.data.model.SensitiveApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensitiveAppRepository extends JpaRepository<SensitiveApp, Long> {
}