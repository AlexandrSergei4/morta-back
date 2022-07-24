package com.alki.mortaback.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MobileApp {
    String activityName;
    int severityLevel;
    String description;
    String sensitiveType;
    String email;
    String phone;
    String howBlockInfo;
}
