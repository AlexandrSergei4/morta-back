package com.alki.mortaback.api;

import com.alki.mortaback.data.model.SensitiveApp;
import com.alki.mortaback.data.model.ThreatType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/")
public interface MoblieAppController {
    @GetMapping("/morta_apps")
    List<SensitiveApp> getAllSensitiveApp();

    @PostMapping("/morta_apps")
    void addAllSensitiveApp(@RequestBody List<SensitiveApp> apps );

    @GetMapping("/threat_types")
    List<ThreatType> getAllThreatTypes();


    @GetMapping("/version")
    int getVersion();
}
