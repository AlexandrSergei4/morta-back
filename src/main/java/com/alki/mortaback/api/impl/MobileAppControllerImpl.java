package com.alki.mortaback.api.impl;

import com.alki.mortaback.api.MoblieAppController;
import com.alki.mortaback.data.model.SensitiveApp;
import com.alki.mortaback.data.model.ThreatType;
import com.alki.mortaback.data.repositories.SensitiveAppRepository;
import com.alki.mortaback.data.repositories.ThreatTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MobileAppControllerImpl implements MoblieAppController {
    private final SensitiveAppRepository sensitiveAppRepository;
    private final ThreatTypeRepository threatTypeRepository;
    @Override
    public List<SensitiveApp> getAllSensitiveApp() {
        return sensitiveAppRepository.findAll();
    }

    @Override
    public void addAllSensitiveApp(List<SensitiveApp> apps) {
        sensitiveAppRepository.saveAll(apps);
    }

    @Override
    public List<ThreatType> getAllThreatTypes() {
        return threatTypeRepository.findAll();
    }

    @Override
    public int getVersion() {
        return 3;
    }
}
